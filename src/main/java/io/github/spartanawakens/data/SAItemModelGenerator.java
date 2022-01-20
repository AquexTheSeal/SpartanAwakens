package io.github.spartanawakens.data;

import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
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
        List<String> materials = new ArrayList<>();
        materials.add("tigers_eye");
        materials.add("amethyst");

        List<String> meleeWeaponType = new ArrayList<>();
        meleeWeaponType.add("dagger");
        meleeWeaponType.add("longsword");
        meleeWeaponType.add("katana");
        meleeWeaponType.add("saber");
        meleeWeaponType.add("rapier");
        meleeWeaponType.add("greatsword");
        meleeWeaponType.add("hammer");
        meleeWeaponType.add("warhammer");
        meleeWeaponType.add("spear");
        meleeWeaponType.add("halberd");
        meleeWeaponType.add("pike");
        meleeWeaponType.add("lance");
        meleeWeaponType.add("longbow");
        meleeWeaponType.add("heavy_crossbow");
        meleeWeaponType.add("throwing_knife");
        meleeWeaponType.add("tomahawk");
        meleeWeaponType.add("javelin");
        meleeWeaponType.add("boomerang");
        meleeWeaponType.add("battleaxe");
        meleeWeaponType.add("flanged_mace");
        meleeWeaponType.add("glaive");
        meleeWeaponType.add("quarterstaff");

        List<String> rangedWeaponType = new ArrayList<>();
        rangedWeaponType.add("longbow");
        rangedWeaponType.add("heavy_crossbow");

        for (String weapon : meleeWeaponType) {
            for (String material : materials) {
                createMeelee(weapon, material);
            }
        }

        for (String weapon : rangedWeaponType) {
            for (String material : materials) {
                createRanged(weapon, material);
            }
        }
    }

    private void createMeelee(String weapon, String material) {
        String path = "item/" + weapon + "_" + material;
        getBuilder(path)
                .parent(getExistingFile(modLoc("spartanweaponry:item/" + weapon + "_wood")))
                .texture("0", modLoc(path));
    }

    private void createRanged(String weapon, String material) {
        String path = "item/" + weapon + "_" + material;

        getBuilder(path)
                .parent(getExistingFile(modLoc("spartanweaponry:item/" + weapon + "_wood")))
                .texture("0", modLoc(path + "_standby"))
                .override().predicate(new ResourceLocation("pulling"), 1).model(getExistingFile(modLoc(path + "_pulling_0")))
                .predicate(new ResourceLocation("pull"), (float) 0.65).predicate(new ResourceLocation("pulling"), 1).model(getExistingFile(modLoc(path + "_pulling_2")))
                .predicate(new ResourceLocation("pull"), 1).predicate(new ResourceLocation("pulling"), 0).model(getExistingFile(modLoc(path + "_loaded")))
                .predicate(new ResourceLocation("pull"), 1).predicate(new ResourceLocation("pulling"), 1).model(getExistingFile(modLoc(path + "_firing")));

        getBuilder(path + "_firing")
                .parent(getExistingFile(modLoc("spartanweaponry:item/" + weapon + "_wood_pulling_0")))
                .texture("0", modLoc(path + "_loaded"));

        getBuilder(path + "_loaded")
                .parent(getExistingFile(modLoc("spartanweaponry:item/" + weapon + "_wood")))
                .texture("0", modLoc(path + "_loaded"));

        getBuilder(path + "_pulling_0")
                .parent(getExistingFile(modLoc("spartanweaponry:item/" + weapon + "_wood_pulling_0")))
                .texture("0", modLoc(path + "_pulling_0"));

        getBuilder(path + "_pulling_1")
                .parent(getExistingFile(modLoc("spartanweaponry:item/" + weapon + "_wood_pulling_0")))
                .texture("0", modLoc(path + "_pulling_1"));

        getBuilder(path + "_pulling_2")
                .parent(getExistingFile(modLoc("spartanweaponry:item/" + weapon + "_wood_pulling_0")))
                .texture("0", modLoc(path + "_pulling_2"));
    }

    /*@Override
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
                name = name.substring(name.indexOf("_") + 1);*/

            /*
             *  Skip elements that have no texture at assets/chaosawakens/textures/item
             *  or already have an existing model at assets/chaosawakens/models/item
             */
            /*if (!existingFileHelper.exists(new ResourceLocation(ChaosAwakens.MODID, "item/" + name), TEXTURE) || existingFileHelper.exists(new ResourceLocation(ChaosAwakens.MODID, "item/" + name), MODEL))
                continue;

            ChaosAwakens.LOGGER.info(item.getId());

            getBuilder(item.getId().getPath()).parent(item.get().getMaxDamage(ItemStack.EMPTY) > 0 && !(item.get() instanceof ArmorItem) ? parentHandheld : parentGenerated).texture("layer0", ItemModelProvider.ITEM_FOLDER + "/" + name);
        }
    }*/
}
