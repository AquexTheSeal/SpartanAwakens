package io.github.spartanawakens.mixin;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.item.HeavyCrossbowItem;
import com.oblivioussp.spartanweaponry.item.LongbowItem;
import io.github.chaosawakens.api.IAutoEnchantable;
import io.github.chaosawakens.common.config.CAConfig;
import io.github.spartanawakens.registry.SAAutoEnchantments;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HeavyCrossbowItem.class)
public class HeavyCrossbowItemMixin extends CrossbowItem implements IAutoEnchantable {
    private EnchantmentData[] enchantments;

    // Dummy constructor
    public HeavyCrossbowItemMixin(Properties p_i48522_1_) {
        super(p_i48522_1_);
    }

    @Inject(at = @At("TAIL"), method = "<init>(Ljava/lang/String;Lnet/minecraft/item/Item$Properties;Lcom/oblivioussp/spartanweaponry/api/WeaponMaterial;Z)V")
    public void init1(String unlocName, Properties prop, WeaponMaterial material, boolean usingDeferredRegister, CallbackInfo ci) {
        enchantments = SAAutoEnchantments.enchant(this, material);
    }

    @Inject(at = @At("TAIL"), method = "<init>(Ljava/lang/String;Lnet/minecraft/item/Item$Properties;Lcom/oblivioussp/spartanweaponry/api/WeaponMaterial;Ljava/lang/String;Z)V")
    public void init2(String regName, Properties prop, WeaponMaterial material, String customDisplayName, boolean usingDeferredRegister, CallbackInfo ci) {
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
