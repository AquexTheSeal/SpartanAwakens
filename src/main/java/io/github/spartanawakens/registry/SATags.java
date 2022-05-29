package io.github.spartanawakens.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.ITag.INamedTag;

public class SATags {

    public static class Items {
        public static final INamedTag<Item> CRYSTAL_WOOD = tag("crystal_wood");
        public static final INamedTag<Item> KYANITE = tag("kyanite");
        public static final INamedTag<Item> PINK_TOURMALINE = tag("pink_tourmaline");
        public static final INamedTag<Item> CATS_EYE = tag("cats_eye");

        public static final INamedTag<Item> EMERALD = tag("emerald");
        public static final INamedTag<Item> TIGERS_EYE = tag("tigers_eye");
        public static final INamedTag<Item> AMETHYST = tag("amethyst");
        public static final INamedTag<Item> RUBY = tag("ruby");
        public static final INamedTag<Item> ULTIMATE = tag("ultimate");

        public Items() {
        }

        public static INamedTag<Item> tag(String name) {
            return ItemTags.bind("spartanawakens:" + name);
        }
    }

    public static class Blocks {

        public Blocks() {
        }

        public static INamedTag<Block> tag(String name) {
            return BlockTags.bind("spartanawakens:" + name);
        }
    }
}
