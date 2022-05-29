package io.github.spartanawakens.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class SABasicItem extends Item {
    public SABasicItem(String regName, Properties properties) {
        super(properties);
        this.setRegistryName(new ResourceLocation("spartanawakens", regName));
    }

    public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add((new TranslationTextComponent(String.format("tooltip.%s.%s.desc", "spartanweaponry", this.getRegistryName().getPath()))).withStyle(TextFormatting.GRAY));
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
