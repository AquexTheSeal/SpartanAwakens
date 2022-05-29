package io.github.spartanawakens.mixin;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.WeaponTrait;
import com.oblivioussp.spartanweaponry.item.LongbowItem;
import com.oblivioussp.spartanweaponry.item.ThrowingWeaponItem;
import io.github.chaosawakens.api.IAutoEnchantable;
import io.github.chaosawakens.common.config.CAConfig;
import io.github.spartanawakens.registry.SAAutoEnchantments;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ThrowingWeaponItem.class)
public class ThrowingWeaponItemMixin extends Item implements IAutoEnchantable {
    private EnchantmentData[] enchantments;

    // Dummy constructor
    public ThrowingWeaponItemMixin(Properties p_i48522_1_) {
        super(p_i48522_1_);
    }

    @Inject(at = @At("TAIL"), method = "<init>(Ljava/lang/String;Lnet/minecraft/item/Item$Properties;Lcom/oblivioussp/spartanweaponry/api/WeaponMaterial;FFFIIZ[Lcom/oblivioussp/spartanweaponry/api/trait/WeaponTrait;)V")
    public void init1(String regName, Properties prop, WeaponMaterial material, float weaponBaseDamage, float weaponDamageMultiplier, float weaponSpeed, int maxAmmoCapacity, int chargeTicks, boolean usingDeferredRegister, WeaponTrait[] traits, CallbackInfo ci) {
        enchantments = SAAutoEnchantments.enchant(this, material);
    }

    @Inject(at = @At("TAIL"), method = "<init>(Ljava/lang/String;Lnet/minecraft/item/Item$Properties;Lcom/oblivioussp/spartanweaponry/api/WeaponMaterial;FFFIILjava/lang/String;Z[Lcom/oblivioussp/spartanweaponry/api/trait/WeaponTrait;)V")
    public void init2(String regName, Properties prop, WeaponMaterial material, float weaponBaseDamage, float weaponDamageMultiplier, float weaponSpeed, int maxAmmoCapacity, int chargeTicks, String customDisplayName, boolean usingDeferredRegister, WeaponTrait[] weaponTraits, CallbackInfo ci) {
        enchantments = SAAutoEnchantments.enchant(this, material);
    }

    @Override
    public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> items) {
        if (this.allowdedIn(group)) {
            ItemStack stack = new ItemStack(this);
            if (CAConfig.COMMON.enableAutoEnchanting.get()) {
                for (EnchantmentData enchant : this.enchantments) {
                    stack.enchant(enchant.enchantment, enchant.level);
                }
            }

            items.add(stack);
        }
    }

    public boolean isFoil(ItemStack stack) {
        return (CAConfig.COMMON.enableAutoEnchanting.get() && enchantments.length > 0) || super.isFoil(stack);
    }

    @Override
    public EnchantmentData[] enchantments() {
        return enchantments;
    }
}
