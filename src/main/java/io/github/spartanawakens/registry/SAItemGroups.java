package io.github.spartanawakens.registry;

import com.oblivioussp.spartanweaponry.init.ModItems;
import io.github.chaosawakens.common.registry.CABlocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.PiercingEnchantment;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class SAItemGroups {

    public static ItemGroup spartanAwakensCAMatsItemGroup = new ItemGroup("spartanawakens.ca_mats_item_group") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SAItems.lances.ultimate);
        }
    };
}
