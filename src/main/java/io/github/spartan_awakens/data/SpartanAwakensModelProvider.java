package io.github.spartan_awakens.data;

import io.github.spartan_awakens.SpartanAwakens;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SpartanAwakensModelProvider extends ItemModelProvider {

    public SpartanAwakensModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, SpartanAwakens.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
    }
}
