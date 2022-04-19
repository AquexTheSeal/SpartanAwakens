package io.github.spartanawakens.data;

import com.oblivioussp.spartanweaponry.api.data.RecipeProviderHelper;
import com.oblivioussp.spartanweaponry.init.ModItems;
import io.github.chaosawakens.ChaosAwakens;
import io.github.chaosawakens.common.registry.CAItems;
import io.github.chaosawakens.common.registry.CATags;
import io.github.chaosawakens.data.CARecipeProvider;
import io.github.spartanawakens.SpartanAwakens;
import io.github.spartanawakens.registry.SAItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.data.RecipeProvider;
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

        /*
        registerMaterial(consumer, "cats_eye", getForgeTag("ingots/cats_eye"), ModItems.handle, ModItems.pole,
                SAItems.daggers.catsEye, SAItems.parryingDaggers.catsEye, SAItems.longswords.catsEye, SAItems.katanas.catsEye,
                SAItems.sabers.catsEye, SAItems.rapiers.catsEye, SAItems.greatswords.catsEye, SAItems.battleHammers.catsEye,
                SAItems.warhammers.catsEye, SAItems.spears.catsEye, SAItems.halberds.catsEye, SAItems.pikes.catsEye,
                SAItems.lances.catsEye, SAItems.longbows.catsEye, SAItems.heavyCrossbows.catsEye, SAItems.throwingKnives.catsEye,
                SAItems.tomahawks.catsEye, SAItems.javelins.catsEye, SAItems.boomerangs.catsEye, SAItems.battleaxes.catsEye,
                SAItems.flangedMaces.catsEye, SAItems.glaives.catsEye, SAItems.quarterstaves.catsEye, SAItems.scythes.catsEye
        );
         */
        
        registerMaterial(consumer, "emerald", Tags.Items.GEMS_EMERALD, ModItems.handle, ModItems.pole,
                SAItems.daggers.emerald, SAItems.parryingDaggers.emerald, SAItems.longswords.emerald, SAItems.katanas.emerald,
                SAItems.sabers.emerald, SAItems.rapiers.emerald, SAItems.greatswords.emerald, SAItems.battleHammers.emerald,
                SAItems.warhammers.emerald, SAItems.spears.emerald, SAItems.halberds.emerald, SAItems.pikes.emerald,
                SAItems.lances.emerald, SAItems.longbows.emerald, SAItems.heavyCrossbows.emerald, SAItems.throwingKnives.emerald,
                SAItems.tomahawks.emerald, SAItems.javelins.emerald, SAItems.boomerangs.emerald, SAItems.battleaxes.emerald,
                SAItems.flangedMaces.emerald, SAItems.glaives.emerald, SAItems.quarterstaves.emerald, SAItems.scythes.emerald
        );
        
        registerMaterial(consumer, "tigers_eye", getForgeTag("gems/tigers_eye"), ModItems.handle, ModItems.pole,
                SAItems.daggers.tigersEye, SAItems.parryingDaggers.tigersEye, SAItems.longswords.tigersEye, SAItems.katanas.tigersEye,
                SAItems.sabers.tigersEye, SAItems.rapiers.tigersEye, SAItems.greatswords.tigersEye, SAItems.battleHammers.tigersEye,
                SAItems.warhammers.tigersEye, SAItems.spears.tigersEye, SAItems.halberds.tigersEye, SAItems.pikes.tigersEye,
                SAItems.lances.tigersEye, SAItems.longbows.tigersEye, SAItems.heavyCrossbows.tigersEye, SAItems.throwingKnives.tigersEye,
                SAItems.tomahawks.tigersEye, SAItems.javelins.tigersEye, SAItems.boomerangs.tigersEye, SAItems.battleaxes.tigersEye,
                SAItems.flangedMaces.tigersEye, SAItems.glaives.tigersEye, SAItems.quarterstaves.tigersEye, SAItems.scythes.tigersEye
        );
        
        registerMaterial(consumer, "amethyst", getForgeTag("gems/amethyst"), ModItems.handle, ModItems.pole,
                SAItems.daggers.amethyst, SAItems.parryingDaggers.amethyst, SAItems.longswords.amethyst, SAItems.katanas.amethyst,
                SAItems.sabers.amethyst, SAItems.rapiers.amethyst, SAItems.greatswords.amethyst, SAItems.battleHammers.amethyst, 
                SAItems.warhammers.amethyst, SAItems.spears.amethyst, SAItems.halberds.amethyst, SAItems.pikes.amethyst,
                SAItems.lances.amethyst, SAItems.longbows.amethyst, SAItems.heavyCrossbows.amethyst, SAItems.throwingKnives.amethyst,
                SAItems.tomahawks.amethyst, SAItems.javelins.amethyst, SAItems.boomerangs.amethyst, SAItems.battleaxes.amethyst,
                SAItems.flangedMaces.amethyst, SAItems.glaives.amethyst, SAItems.quarterstaves.amethyst, SAItems.scythes.amethyst
        );

        registerMaterial(consumer, "ruby", getForgeTag("gems/ruby"), ModItems.handle, ModItems.pole,
                SAItems.daggers.ruby, SAItems.parryingDaggers.ruby, SAItems.longswords.ruby, SAItems.katanas.ruby,
                SAItems.sabers.ruby, SAItems.rapiers.ruby, SAItems.greatswords.ruby, SAItems.battleHammers.ruby,
                SAItems.warhammers.ruby, SAItems.spears.ruby, SAItems.halberds.ruby, SAItems.pikes.ruby,
                SAItems.lances.ruby, SAItems.longbows.ruby, SAItems.heavyCrossbows.ruby, SAItems.throwingKnives.ruby,
                SAItems.tomahawks.ruby, SAItems.javelins.ruby, SAItems.boomerangs.ruby, SAItems.battleaxes.ruby,
                SAItems.flangedMaces.ruby, SAItems.glaives.ruby, SAItems.quarterstaves.ruby, SAItems.scythes.ruby
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
