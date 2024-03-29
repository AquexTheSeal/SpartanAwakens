package io.github.spartanawakens.mixin;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.WeaponTrait;
import com.oblivioussp.spartanweaponry.item.SwordBaseItem;
import io.github.chaosawakens.api.IAutoEnchantable;
import io.github.chaosawakens.common.config.CACommonConfig;
import io.github.spartanawakens.SpartanAwakens;
import io.github.spartanawakens.integrations.utilities.SAMaterial;
import io.github.spartanawakens.registry.SAAutoEnchantments;
import io.github.spartanawakens.registry.SAItems;
import io.github.spartanawakens.registry.weapontypes.SAStandardWeapons;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.item.*;
import net.minecraft.util.NonNullList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SwordBaseItem.class)
public class SwordBaseItemMixin extends SwordItem implements IAutoEnchantable {
    @Shadow protected WeaponMaterial material;
    private EnchantmentData[] enchantments;

    // Dummy constructor
    public SwordBaseItemMixin(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
        super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
    }

    @Inject(at = @At("TAIL"), method = "<init>(Ljava/lang/String;Lnet/minecraft/item/Item$Properties;Lcom/oblivioussp/spartanweaponry/api/WeaponMaterial;FFDLjava/lang/String;Z[Lcom/oblivioussp/spartanweaponry/api/trait/WeaponTrait;)V")
    public void init1(String regName, Properties prop, WeaponMaterial material, float weaponBaseDamage, float weaponDamageMultiplier, double weaponSpeed, String customDisplayName, boolean usingDeferredRegister, WeaponTrait[] weaponTraits, CallbackInfo ci) {
        enchantments = SAAutoEnchantments.enchant(this, material);
        if (material instanceof SAMaterial) {
            this.setRegistryName(SpartanAwakens.MODID, regName);
        }
    }

    @Inject(at = @At("TAIL"), method = "<init>(Ljava/lang/String;Lnet/minecraft/item/Item$Properties;Lcom/oblivioussp/spartanweaponry/api/WeaponMaterial;FFDZ[Lcom/oblivioussp/spartanweaponry/api/trait/WeaponTrait;)V")
    public void init2(String regName, Properties prop, WeaponMaterial material, float weaponBaseDamage, float weaponDamageMultiplier, double weaponSpeed, boolean usingDeferredRegister, WeaponTrait[] weaponTraits, CallbackInfo ci) {
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

    @Override
    public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> items) {
        if (this.allowdedIn(group)) {
            ItemStack stack = new ItemStack(this);
            if (CACommonConfig.COMMON.enableAutoEnchanting.get()) {
                for (EnchantmentData enchant : this.enchantments) {
                    stack.enchant(enchant.enchantment, enchant.level);
                }
            }

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
