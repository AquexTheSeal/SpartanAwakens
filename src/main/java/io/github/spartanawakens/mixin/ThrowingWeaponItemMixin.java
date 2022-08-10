package io.github.spartanawakens.mixin;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.IMeleeTraitCallback;
import com.oblivioussp.spartanweaponry.api.trait.IThrowingTraitCallback;
import com.oblivioussp.spartanweaponry.api.trait.WeaponTrait;
import com.oblivioussp.spartanweaponry.init.ModEnchantments;
import com.oblivioussp.spartanweaponry.item.ThrowingWeaponItem;
import io.github.chaosawakens.api.IAutoEnchantable;
import io.github.chaosawakens.common.config.CACommonConfig;
import io.github.spartanawakens.SpartanAwakens;
import io.github.spartanawakens.integrations.utilities.SAMaterial;
import io.github.spartanawakens.registry.SAAutoEnchantments;
import io.github.spartanawakens.registry.SAItems;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.*;
import net.minecraft.util.NonNullList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Iterator;
import java.util.List;

@Mixin(ThrowingWeaponItem.class)
public abstract class ThrowingWeaponItemMixin extends Item implements IAutoEnchantable {
    @Shadow protected WeaponMaterial material;
    @Shadow protected List<WeaponTrait> traits;

    @Shadow protected abstract void initNBT(ItemStack stack, boolean initUUID);

    private EnchantmentData[] enchantments;

    // Dummy constructor
    public ThrowingWeaponItemMixin(Properties p_i48522_1_) {
        super(p_i48522_1_);
    }

    @Inject(at = @At("TAIL"), method = "<init>(Ljava/lang/String;Lnet/minecraft/item/Item$Properties;Lcom/oblivioussp/spartanweaponry/api/WeaponMaterial;FFFIIZ[Lcom/oblivioussp/spartanweaponry/api/trait/WeaponTrait;)V")
    public void init1(String regName, Properties prop, WeaponMaterial material, float weaponBaseDamage, float weaponDamageMultiplier, float weaponSpeed, int maxAmmoCapacity, int chargeTicks, boolean usingDeferredRegister, WeaponTrait[] traits, CallbackInfo ci) {
        enchantments = SAAutoEnchantments.enchant(this, material);
        if (material instanceof SAMaterial) {
            this.setRegistryName(SpartanAwakens.MODID, regName);
        }
    }

    @Inject(at = @At("TAIL"), method = "<init>(Ljava/lang/String;Lnet/minecraft/item/Item$Properties;Lcom/oblivioussp/spartanweaponry/api/WeaponMaterial;FFFIILjava/lang/String;Z[Lcom/oblivioussp/spartanweaponry/api/trait/WeaponTrait;)V")
    public void init2(String regName, Properties prop, WeaponMaterial material, float weaponBaseDamage, float weaponDamageMultiplier, float weaponSpeed, int maxAmmoCapacity, int chargeTicks, String customDisplayName, boolean usingDeferredRegister, WeaponTrait[] weaponTraits, CallbackInfo ci) {
        enchantments = SAAutoEnchantments.enchant(this, material);
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        if (material == SAItems.materialUltimateMelee || material == SAItems.materialUltimateRanged) {
            return Rarity.EPIC;
        } else {
            return super.getRarity(stack);
        }
    }

    /**
     * @author ObliviousSpartan
     * @reason To make it auto-enchantable for Ultimate Weapons
     */
    @Overwrite
    public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> items) {

        if (this.allowdedIn(group)) {
            ItemStack stack = new ItemStack(this);
            Iterator var4 = this.traits.iterator();

            if (CACommonConfig.COMMON.enableAutoEnchanting.get()) {
                for (EnchantmentData enchant : this.enchantments) {
                    stack.enchant(enchant.enchantment, enchant.level);
                }
            }

            WeaponTrait trait;
            IMeleeTraitCallback callback;
            while(var4.hasNext()) {
                trait = (WeaponTrait)var4.next();
                callback = trait.getMeleeCallback();
                if (callback != null) {
                    callback.onCreateItem(this.material, stack);
                }
            }

            var4 = this.material.getAllWeaponTraits().iterator();

            while(var4.hasNext()) {
                trait = (WeaponTrait)var4.next();
                callback = trait.getMeleeCallback();
                if (callback != null) {
                    callback.onCreateItem(this.material, stack);
                }
            }

            this.initNBT(stack, false);
            items.add(stack);
        }
    }

    public boolean isFoil(ItemStack stack) {
        return (CACommonConfig.COMMON.enableAutoEnchanting.get() && enchantments.length > 0) || super.isFoil(stack);
    }

    @Override
    public EnchantmentData[] enchantments() {
        return enchantments;
    }
}
