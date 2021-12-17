package io.github.spartanawakens.data;

import io.github.chaosawakens.ChaosAwakens;
import io.github.chaosawakens.common.registry.CABlocks;
import io.github.chaosawakens.common.registry.CAItems;
import io.github.spartanawakens.SpartanAwakens;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SAItemModelGenerator extends ItemModelProvider {

    public SAItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, SpartanAwakens.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        generate(CAItems.ITEMS.getEntries());
    }

    @Nonnull
    @Override
    public String getName() {
        return ChaosAwakens.MODNAME + " Item models";
    }

    private void generate(final Collection<RegistryObject<Item>> items) {
        final ModelFile parentGenerated = getExistingFile(mcLoc("item/generated"));
        final ModelFile.ExistingModelFile parentHandheld = getExistingFile(mcLoc("item/handheld"));

        for (RegistryObject<Item> item : items) {
            String name = item.getId().getPath();

            if (name.startsWith("enchanted"))
                name = name.substring(name.indexOf("_") + 1);

            /*
             *  Skip elements that have no texture at assets/chaosawakens/textures/item
             *  or already have an existing model at assets/chaosawakens/models/item
             */
            if (!existingFileHelper.exists(new ResourceLocation(ChaosAwakens.MODID, "item/" + name), TEXTURE) || existingFileHelper.exists(new ResourceLocation(ChaosAwakens.MODID, "item/" + name), MODEL))
                continue;

            ChaosAwakens.LOGGER.info(item.getId());

            getBuilder(item.getId().getPath()).parent(item.get().getMaxDamage(ItemStack.EMPTY) > 0 && !(item.get() instanceof ArmorItem) ? parentHandheld : parentGenerated).texture("layer0", ItemModelProvider.ITEM_FOLDER + "/" + name);
        }
    }
}
