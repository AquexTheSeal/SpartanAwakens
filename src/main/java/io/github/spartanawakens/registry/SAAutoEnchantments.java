package io.github.spartanawakens.registry;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.init.ModEnchantments;
import com.oblivioussp.spartanweaponry.item.SwordBaseItem;
import com.oblivioussp.spartanweaponry.item.ThrowingWeaponItem;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;

public class SAAutoEnchantments {

    public static EnchantmentData[] enchant(Item item, WeaponMaterial material) {
        if (material == SAItems.materialUltimateMelee || material == SAItems.materialUltimateRanged) {
            if (item instanceof SwordBaseItem) {
                return new EnchantmentData[]{
                        new EnchantmentData(Enchantments.SHARPNESS, 4),
                        new EnchantmentData(Enchantments.KNOCKBACK, 1),
                        new EnchantmentData(Enchantments.FIRE_ASPECT, 2)
                };
            } else if (item instanceof ThrowingWeaponItem) {
                return new EnchantmentData[]{
                        new EnchantmentData(ModEnchantments.THROWING_CHARGE, 4),
                        new EnchantmentData(ModEnchantments.THROWING_RANGE, 2),
                        new EnchantmentData(ModEnchantments.THROWING_AMMO, 2),
                        new EnchantmentData(ModEnchantments.THROWING_DAMAGE, 4)
                };
            } else if (item instanceof BowItem) {
                return new EnchantmentData[]{
                        new EnchantmentData(Enchantments.POWER_ARROWS, 4),
                        new EnchantmentData(Enchantments.INFINITY_ARROWS, 1),
                        new EnchantmentData(Enchantments.PUNCH_ARROWS, 2),
                        new EnchantmentData(Enchantments.FLAMING_ARROWS, 1)
                };
            } else if (item instanceof CrossbowItem) {
                return new EnchantmentData[]{
                        new EnchantmentData(Enchantments.MULTISHOT, 1),
                        new EnchantmentData(Enchantments.QUICK_CHARGE, 2)
                };
            }
        }

        return new EnchantmentData[]{};
    }
}
