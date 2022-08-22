package io.github.spartanawakens.data;

import com.blackout.chaosadditions.registry.CADItems;
import io.github.chaosawakens.common.registry.CABlocks;
import io.github.chaosawakens.common.registry.CAItems;
import io.github.spartanawakens.SpartanAwakens;
import io.github.spartanawakens.registry.SATags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.nio.file.Path;

public class SATagsProvider extends BlockTagsProvider {
    public SATagsProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, SpartanAwakens.MODID, existingFileHelper);
    }

    public static class SAItemTagProvider extends ItemTagsProvider {
        public SAItemTagProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
            super(gen, new SATagsProvider.SABlockTagProvider(gen, existingFileHelper), SpartanAwakens.MODID, existingFileHelper);
        }

        protected Path getPath(ResourceLocation resourceLocation) {
            return this.generator.getOutputFolder().resolve("data/" + resourceLocation.getNamespace() + "/tags/items/" + resourceLocation.getPath() + ".json");
        }

        public String getName() {
            return "Spartan Awakens: Item Tags";
        }

        protected void addTags() {
            tag(SATags.Items.CRYSTAL_WOOD).add(CABlocks.CRYSTAL_PLANKS.get().asItem());
            tag(SATags.Items.KYANITE).add(CABlocks.KYANITE.get().asItem());
            tag(SATags.Items.PINK_TOURMALINE).add(CAItems.PINK_TOURMALINE_INGOT.get());
            tag(SATags.Items.CATS_EYE).add(CAItems.CATS_EYE_INGOT.get());

            tag(SATags.Items.EMERALD).add(Items.EMERALD);
            tag(SATags.Items.TIGERS_EYE).add(CAItems.TIGERS_EYE.get());
            tag(SATags.Items.AMETHYST).add(CAItems.AMETHYST.get());
            tag(SATags.Items.RUBY).add(CAItems.RUBY.get());
            tag(SATags.Items.ULTIMATE).add(CAItems.TITANIUM_INGOT.get());

            tag(SATags.Items.SAPPHIRE).addOptional(CADItems.SAPPHIRE.get().getRegistryName());
        }
    }

    public static class SABlockTagProvider extends BlockTagsProvider {
        public SABlockTagProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
            super(gen, SpartanAwakens.MODID, existingFileHelper);
        }

        protected Path getPath(ResourceLocation resourceLocation) {
            return this.generator.getOutputFolder().resolve("data/" + resourceLocation.getNamespace() + "/tags/items/" + resourceLocation.getPath() + ".json");
        }

        public String getName() {
            return "Spartan Awakens: Item Tags";
        }

        protected void addTags() {
        }
    }
}
