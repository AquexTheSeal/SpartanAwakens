package io.github.spartanawakens.data;

import com.oblivioussp.spartanweaponry.api.data.RecipeProviderHelper;
import com.oblivioussp.spartanweaponry.init.ModItems;
import io.github.chaosawakens.ChaosAwakens;
import io.github.chaosawakens.common.registry.CAItems;
import io.github.chaosawakens.common.registry.CATags;
import io.github.chaosawakens.data.CARecipeProvider;
import io.github.spartanawakens.SpartanAwakens;
import io.github.spartanawakens.registry.SAItems;
import io.github.spartanawakens.registry.SATags;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ForgeItemTagsProvider;

import java.util.function.Consumer;

public class SARecipeProvider extends RecipeProvider {

    public SARecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return SpartanAwakens.MODNAME + ": Recipes";
    }

    /**
     * Todo in {@link SAItems}
     */
    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {

        registerMaterial(consumer, "crystal_wood", SATags.Items.CRYSTAL_WOOD, SAItems.crystalWoodHandle, SAItems.crystalWoodPole,
                SAItems.daggers.crystalWood, SAItems.parryingDaggers.crystalWood, SAItems.longswords.crystalWood, SAItems.katanas.crystalWood,
                SAItems.sabers.crystalWood, SAItems.rapiers.crystalWood, SAItems.greatswords.crystalWood, SAItems.battleHammers.crystalWood,
                SAItems.warhammers.crystalWood, SAItems.spears.crystalWood, SAItems.halberds.crystalWood, SAItems.pikes.crystalWood,
                SAItems.lances.crystalWood, SAItems.longbows.crystalWood, SAItems.heavyCrossbows.crystalWood, SAItems.throwingKnives.crystalWood,
                SAItems.tomahawks.crystalWood, SAItems.javelins.crystalWood, SAItems.boomerangs.crystalWood, SAItems.battleaxes.crystalWood,
                SAItems.flangedMaces.crystalWood, SAItems.glaives.crystalWood, SAItems.quarterstaves.crystalWood, SAItems.scythes.crystalWood
        );

        registerMaterial(consumer, "kyanite", SATags.Items.KYANITE, SAItems.crystalWoodHandle, SAItems.crystalWoodPole,
                SAItems.daggers.kyanite, SAItems.parryingDaggers.kyanite, SAItems.longswords.kyanite, SAItems.katanas.kyanite,
                SAItems.sabers.kyanite, SAItems.rapiers.kyanite, SAItems.greatswords.kyanite, SAItems.battleHammers.kyanite,
                SAItems.warhammers.kyanite, SAItems.spears.kyanite, SAItems.halberds.kyanite, SAItems.pikes.kyanite,
                SAItems.lances.kyanite, SAItems.longbows.kyanite, SAItems.heavyCrossbows.kyanite, SAItems.throwingKnives.kyanite,
                SAItems.tomahawks.kyanite, SAItems.javelins.kyanite, SAItems.boomerangs.kyanite, SAItems.battleaxes.kyanite,
                SAItems.flangedMaces.kyanite, SAItems.glaives.kyanite, SAItems.quarterstaves.kyanite, SAItems.scythes.kyanite
        );

        registerMaterial(consumer, "pink_tourmaline", SATags.Items.PINK_TOURMALINE, SAItems.crystalWoodHandle, SAItems.crystalWoodPole,
                SAItems.daggers.pinkTourmaline, SAItems.parryingDaggers.pinkTourmaline, SAItems.longswords.pinkTourmaline, SAItems.katanas.pinkTourmaline,
                SAItems.sabers.pinkTourmaline, SAItems.rapiers.pinkTourmaline, SAItems.greatswords.pinkTourmaline, SAItems.battleHammers.pinkTourmaline,
                SAItems.warhammers.pinkTourmaline, SAItems.spears.pinkTourmaline, SAItems.halberds.pinkTourmaline, SAItems.pikes.pinkTourmaline,
                SAItems.lances.pinkTourmaline, SAItems.longbows.pinkTourmaline, SAItems.heavyCrossbows.pinkTourmaline, SAItems.throwingKnives.pinkTourmaline,
                SAItems.tomahawks.pinkTourmaline, SAItems.javelins.pinkTourmaline, SAItems.boomerangs.pinkTourmaline, SAItems.battleaxes.pinkTourmaline,
                SAItems.flangedMaces.pinkTourmaline, SAItems.glaives.pinkTourmaline, SAItems.quarterstaves.pinkTourmaline, SAItems.scythes.pinkTourmaline
        );
        
        registerMaterial(consumer, "cats_eye", SATags.Items.CATS_EYE, SAItems.crystalWoodHandle, SAItems.crystalWoodPole,
                SAItems.daggers.catsEye, SAItems.parryingDaggers.catsEye, SAItems.longswords.catsEye, SAItems.katanas.catsEye,
                SAItems.sabers.catsEye, SAItems.rapiers.catsEye, SAItems.greatswords.catsEye, SAItems.battleHammers.catsEye,
                SAItems.warhammers.catsEye, SAItems.spears.catsEye, SAItems.halberds.catsEye, SAItems.pikes.catsEye,
                SAItems.lances.catsEye, SAItems.longbows.catsEye, SAItems.heavyCrossbows.catsEye, SAItems.throwingKnives.catsEye,
                SAItems.tomahawks.catsEye, SAItems.javelins.catsEye, SAItems.boomerangs.catsEye, SAItems.battleaxes.catsEye,
                SAItems.flangedMaces.catsEye, SAItems.glaives.catsEye, SAItems.quarterstaves.catsEye, SAItems.scythes.catsEye
        );
        
        registerMaterial(consumer, "emerald", SATags.Items.EMERALD, ModItems.handle, ModItems.pole,
                SAItems.daggers.emerald, SAItems.parryingDaggers.emerald, SAItems.longswords.emerald, SAItems.katanas.emerald,
                SAItems.sabers.emerald, SAItems.rapiers.emerald, SAItems.greatswords.emerald, SAItems.battleHammers.emerald,
                SAItems.warhammers.emerald, SAItems.spears.emerald, SAItems.halberds.emerald, SAItems.pikes.emerald,
                SAItems.lances.emerald, SAItems.longbows.emerald, SAItems.heavyCrossbows.emerald, SAItems.throwingKnives.emerald,
                SAItems.tomahawks.emerald, SAItems.javelins.emerald, SAItems.boomerangs.emerald, SAItems.battleaxes.emerald,
                SAItems.flangedMaces.emerald, SAItems.glaives.emerald, SAItems.quarterstaves.emerald, SAItems.scythes.emerald
        );
        
        registerMaterial(consumer, "tigers_eye", SATags.Items.TIGERS_EYE, ModItems.handle, ModItems.pole,
                SAItems.daggers.tigersEye, SAItems.parryingDaggers.tigersEye, SAItems.longswords.tigersEye, SAItems.katanas.tigersEye,
                SAItems.sabers.tigersEye, SAItems.rapiers.tigersEye, SAItems.greatswords.tigersEye, SAItems.battleHammers.tigersEye,
                SAItems.warhammers.tigersEye, SAItems.spears.tigersEye, SAItems.halberds.tigersEye, SAItems.pikes.tigersEye,
                SAItems.lances.tigersEye, SAItems.longbows.tigersEye, SAItems.heavyCrossbows.tigersEye, SAItems.throwingKnives.tigersEye,
                SAItems.tomahawks.tigersEye, SAItems.javelins.tigersEye, SAItems.boomerangs.tigersEye, SAItems.battleaxes.tigersEye,
                SAItems.flangedMaces.tigersEye, SAItems.glaives.tigersEye, SAItems.quarterstaves.tigersEye, SAItems.scythes.tigersEye
        );
        
        registerMaterial(consumer, "amethyst", SATags.Items.AMETHYST, ModItems.handle, ModItems.pole,
                SAItems.daggers.amethyst, SAItems.parryingDaggers.amethyst, SAItems.longswords.amethyst, SAItems.katanas.amethyst,
                SAItems.sabers.amethyst, SAItems.rapiers.amethyst, SAItems.greatswords.amethyst, SAItems.battleHammers.amethyst, 
                SAItems.warhammers.amethyst, SAItems.spears.amethyst, SAItems.halberds.amethyst, SAItems.pikes.amethyst,
                SAItems.lances.amethyst, SAItems.longbows.amethyst, SAItems.heavyCrossbows.amethyst, SAItems.throwingKnives.amethyst,
                SAItems.tomahawks.amethyst, SAItems.javelins.amethyst, SAItems.boomerangs.amethyst, SAItems.battleaxes.amethyst,
                SAItems.flangedMaces.amethyst, SAItems.glaives.amethyst, SAItems.quarterstaves.amethyst, SAItems.scythes.amethyst
        );

        registerMaterial(consumer, "ruby", SATags.Items.RUBY, ModItems.handle, ModItems.pole,
                SAItems.daggers.ruby, SAItems.parryingDaggers.ruby, SAItems.longswords.ruby, SAItems.katanas.ruby,
                SAItems.sabers.ruby, SAItems.rapiers.ruby, SAItems.greatswords.ruby, SAItems.battleHammers.ruby,
                SAItems.warhammers.ruby, SAItems.spears.ruby, SAItems.halberds.ruby, SAItems.pikes.ruby,
                SAItems.lances.ruby, SAItems.longbows.ruby, SAItems.heavyCrossbows.ruby, SAItems.throwingKnives.ruby,
                SAItems.tomahawks.ruby, SAItems.javelins.ruby, SAItems.boomerangs.ruby, SAItems.battleaxes.ruby,
                SAItems.flangedMaces.ruby, SAItems.glaives.ruby, SAItems.quarterstaves.ruby, SAItems.scythes.ruby
        );

        registerMaterial(consumer, "ultimate", SATags.Items.ULTIMATE, SAItems.ultimateHandle, SAItems.ultimatePole,
                SAItems.daggers.ultimate, SAItems.parryingDaggers.ultimate, SAItems.longswords.ultimate, SAItems.katanas.ultimate,
                SAItems.sabers.ultimate, SAItems.rapiers.ultimate, SAItems.greatswords.ultimate, SAItems.battleHammers.ultimate,
                SAItems.warhammers.ultimate, SAItems.spears.ultimate, SAItems.halberds.ultimate, SAItems.pikes.ultimate,
                SAItems.lances.ultimate, SAItems.longbows.ultimate, SAItems.heavyCrossbows.ultimate, SAItems.throwingKnives.ultimate,
                SAItems.tomahawks.ultimate, SAItems.javelins.ultimate, SAItems.boomerangs.ultimate, SAItems.battleaxes.ultimate,
                SAItems.flangedMaces.ultimate, SAItems.glaives.ultimate, SAItems.quarterstaves.ultimate, SAItems.scythes.ultimate
        );

        registerMaterial(consumer, "sapphire", SATags.Items.SAPPHIRE, ModItems.handle, ModItems.pole,
                SAItems.daggers.sapphire, SAItems.parryingDaggers.sapphire, SAItems.longswords.sapphire, SAItems.katanas.sapphire,
                SAItems.sabers.sapphire, SAItems.rapiers.sapphire, SAItems.greatswords.sapphire, SAItems.battleHammers.sapphire,
                SAItems.warhammers.sapphire, SAItems.spears.sapphire, SAItems.halberds.sapphire, SAItems.pikes.sapphire,
                SAItems.lances.sapphire, SAItems.longbows.sapphire, SAItems.heavyCrossbows.sapphire, SAItems.throwingKnives.sapphire,
                SAItems.tomahawks.sapphire, SAItems.javelins.sapphire, SAItems.boomerangs.sapphire, SAItems.battleaxes.sapphire,
                SAItems.flangedMaces.sapphire, SAItems.glaives.sapphire, SAItems.quarterstaves.sapphire, SAItems.scythes.sapphire
        );
    }

    public void registerMaterial(Consumer<IFinishedRecipe> consumer, String materialName, ITag<Item> materialTag, IItemProvider handle, IItemProvider pole,
                                 IItemProvider dagger, IItemProvider parryingDagger, IItemProvider longsword, IItemProvider katana,
                                 IItemProvider saber, IItemProvider rapier, IItemProvider greatsword, IItemProvider battleHammer,
                                 IItemProvider warhammer, IItemProvider spear, IItemProvider halberd, IItemProvider pike,
                                 IItemProvider lance, IItemProvider longbow, IItemProvider heavyCrossbow, IItemProvider throwingKnife,
                                 IItemProvider tomahawk, IItemProvider javelin, IItemProvider boomerang, IItemProvider battleaxe,
                                 IItemProvider flangedMace, IItemProvider glaive, IItemProvider quarterstaff, IItemProvider scythe
    )
    {
        RecipeProviderHelper.recipeDagger(consumer, handle, materialTag, dagger, "has_" + materialName + "_dagger");
        RecipeProviderHelper.recipeParryingDagger(consumer, handle, materialTag, parryingDagger, "has_" + materialName + "_parrying_dagger");
        RecipeProviderHelper.recipeLongsword(consumer, handle, materialTag, longsword, "has_" + materialName + "_longsword");
        RecipeProviderHelper.recipeKatana(consumer, handle, materialTag, katana, "has_" + materialName + "_katana");
        RecipeProviderHelper.recipeSaber(consumer, handle, materialTag, saber, "has_" + materialName + "_saber");
        RecipeProviderHelper.recipeRapier(consumer, handle, materialTag, rapier, "has_" + materialName + "_rapier");
        RecipeProviderHelper.recipeGreatsword(consumer, handle, materialTag, greatsword, "has_" + materialName + "_greatsword");
        RecipeProviderHelper.recipeBattleHammer(consumer, handle, materialTag, battleHammer, "has_" + materialName + "_battle_hammer");

        RecipeProviderHelper.recipeWarhammer(consumer, handle, materialTag, warhammer, "has_" + materialName + "_warhammer");
        RecipeProviderHelper.recipeSpear(consumer, pole, materialTag, spear, "has_" + materialName + "_spear");
        RecipeProviderHelper.recipeHalberd(consumer, pole, materialTag, halberd, "has_" + materialName + "_halberd");
        RecipeProviderHelper.recipePike(consumer, pole, materialTag, pike, "has_" + materialName + "_pike");
        RecipeProviderHelper.recipeLance(consumer, handle, pole, materialTag, lance, "has_" + materialName + "_lance");

        RecipeProviderHelper.recipeLongbow(consumer, Tags.Items.RODS, Tags.Items.STRING, handle, materialTag, longbow, "has_" + materialName + "_longbow");
        RecipeProviderHelper.recipeHeavyCrossbow(consumer, ItemTags.PLANKS, Items.BOW, handle, materialTag, heavyCrossbow, "has_" + materialName + "_heavy_crossbow");
        RecipeProviderHelper.recipeThrowingKnife(consumer, handle, materialTag, throwingKnife, "has_" + materialName + "_throwing_knife");
        RecipeProviderHelper.recipeTomahawk(consumer, handle, materialTag, tomahawk, "has_" + materialName + "_tomahawk");
        RecipeProviderHelper.recipeJavelin(consumer, handle, materialTag, javelin, "has_" + materialName + "_javelin");
        RecipeProviderHelper.recipeBoomerang(consumer, ItemTags.PLANKS, materialTag, boomerang, "has_" + materialName + "_boomerang");
        RecipeProviderHelper.recipeBattleaxe(consumer, Tags.Items.RODS, handle, materialTag, battleaxe, "has_" + materialName + "_battleaxe");
        RecipeProviderHelper.recipeFlangedMace(consumer, Tags.Items.RODS, handle, materialTag, flangedMace, "has_" + materialName + "_flanged_mace");
        RecipeProviderHelper.recipeGlaive(consumer, handle, materialTag, glaive, "has_" + materialName + "_glaive");
        RecipeProviderHelper.recipeQuarterstaff(consumer, handle, materialTag, quarterstaff, "has_" + materialName + "_quarterstaff");
        RecipeProviderHelper.recipeScythe(consumer, handle, materialTag, scythe, "has_" + materialName + "_scythe");

    }

    protected ITag<Item> getForgeTag(String tag) {
        return ItemTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge", tag));
    }

    protected ITag<Item> getCATag(String tag) {
        return ItemTags.getAllTags().getTagOrEmpty(new ResourceLocation(ChaosAwakens.MODID, tag));
    }
}
