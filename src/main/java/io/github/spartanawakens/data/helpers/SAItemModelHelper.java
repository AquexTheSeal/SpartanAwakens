package io.github.spartanawakens.data.helpers;

import com.oblivioussp.spartanweaponry.api.data.BaseModels;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;

public class SAItemModelHelper {

    protected final ItemModelProvider itemModelProvider;

    public SAItemModelHelper(ItemModelProvider itemModelProviderIn) {
        this.itemModelProvider = itemModelProviderIn;
    }

    public ModelFile.UncheckedModelFile getUncheckedFile(ResourceLocation parent) {
        return new ModelFile.UncheckedModelFile(parent);
    }

    public ItemModelBuilder withUncheckedParent(String name, ResourceLocation parent) {
        return itemModelProvider.getBuilder(name).parent(getUncheckedFile(parent));
    }

    public ResourceLocation createSimpleModel(Item item) {
        String itemPath = item.getRegistryName().getPath();
        return withUncheckedParent(itemPath, this.itemModelProvider.mcLoc("item/generated")).texture("layer0", "item/" + itemPath).getLocation();
    }

    public ResourceLocation createSimpleModel(Item item, ResourceLocation parent) {
        String itemPath = item.getRegistryName().getPath();
        return withUncheckedParent(itemPath, parent).texture("layer0", "item/" + itemPath).getLocation();
    }

    public ResourceLocation createDaggerModels(Item item) {
        String itemPath = item.getRegistryName().getPath();
        ResourceLocation throwingModel = withUncheckedParent(itemPath + "_throwing", BaseModels.baseDaggerThrowing).texture("layer0", "item/" + itemPath).getLocation();
        return withUncheckedParent(itemPath, BaseModels.baseDagger).texture("layer0", "item/" + itemPath).override().predicate(new ResourceLocation("throwing"), 1.0F).model(new ModelFile.UncheckedModelFile(throwingModel)).end().getLocation();
    }

    public ResourceLocation createParryingDaggerModels(Item item) {
        String itemPath = item.getRegistryName().getPath();
        ResourceLocation blockingModel = withUncheckedParent(itemPath + "_blocking", BaseModels.baseParryingDaggerBlocking).texture("layer0", "item/" + itemPath).getLocation();
        return withUncheckedParent(itemPath, BaseModels.baseParryingDagger).texture("layer0", "item/" + itemPath).override().predicate(new ResourceLocation("blocking"), 1.0F).model(new ModelFile.UncheckedModelFile(blockingModel)).end().getLocation();
    }

    public ResourceLocation createLongswordModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseLongsword);
    }

    public ResourceLocation createKatanaModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseKatana);
    }

    public ResourceLocation createSaberModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseSaber);
    }

    public ResourceLocation createRapierModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseRapier);
    }

    public ResourceLocation createGreatswordModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseGreatsword);
    }

    public ResourceLocation createClubModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseClub);
    }

    public ResourceLocation createCestusModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseCestus);
    }

    public ResourceLocation createBattleHammerModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseBattleHammer);
    }

    public ResourceLocation createWarhammerModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseWarhammer);
    }

    public ResourceLocation createSpearModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseSpear);
    }

    public ResourceLocation createHalberdModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseHalberd);
    }

    public ResourceLocation createPikeModel(Item item) {
        return this.createSimpleModel(item, BaseModels.basePike);
    }

    public ResourceLocation createLanceModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseLance);
    }

    public ResourceLocation createLongbowModels(Item item) {
        String itemPath = item.getRegistryName().getPath();
        ResourceLocation pulling0 = withUncheckedParent(itemPath + "_pulling_0", BaseModels.baseLongbowPulling).texture("layer0", "item/" + itemPath + "_pulling_0").getLocation();
        ResourceLocation pulling1 = withUncheckedParent(itemPath + "_pulling_1", BaseModels.baseLongbowPulling).texture("layer0", "item/" + itemPath + "_pulling_1").getLocation();
        ResourceLocation pulling2 = withUncheckedParent(itemPath + "_pulling_2", BaseModels.baseLongbowPulling).texture("layer0", "item/" + itemPath + "_pulling_2").getLocation();
        return withUncheckedParent(itemPath, BaseModels.baseLongbow).texture("layer0", "item/" + itemPath + "_standby").override().predicate(new ResourceLocation("pulling"), 1.0F).model(new ModelFile.UncheckedModelFile(pulling0)).end().override().predicate(new ResourceLocation("pulling"), 1.0F).predicate(new ResourceLocation("pull"), 0.65F).model(new ModelFile.UncheckedModelFile(pulling1)).end().override().predicate(new ResourceLocation("pulling"), 1.0F).predicate(new ResourceLocation("pull"), 0.9F).model(new ModelFile.UncheckedModelFile(pulling2)).end().getLocation();
    }

    public ResourceLocation createHeavyCrossbowModels(Item item) {
        String itemPath = item.getRegistryName().getPath();
        ResourceLocation pulling0 = withUncheckedParent(itemPath + "_pulling_0", BaseModels.baseHeavyCrossbowPulling).texture("layer0", "item/" + itemPath + "_pulling_0").getLocation();
        ResourceLocation pulling1 = withUncheckedParent(itemPath + "_pulling_1", BaseModels.baseHeavyCrossbowPulling).texture("layer0", "item/" + itemPath + "_pulling_1").getLocation();
        ResourceLocation pulling2 = withUncheckedParent(itemPath + "_pulling_2", BaseModels.baseHeavyCrossbowPulling).texture("layer0", "item/" + itemPath + "_pulling_2").getLocation();
        ResourceLocation loaded = withUncheckedParent(itemPath + "_loaded", BaseModels.baseHeavyCrossbowLoaded).texture("layer0", "item/" + itemPath + "_loaded").getLocation();
        ResourceLocation firing = withUncheckedParent(itemPath + "_firing", BaseModels.baseHeavyCrossbowFiring).texture("layer0", "item/" + itemPath + "_loaded").getLocation();
        return withUncheckedParent(itemPath, BaseModels.baseHeavyCrossbow).texture("layer0", "item/" + itemPath + "_standby").override().predicate(new ResourceLocation("pulling"), 1.0F).model(new ModelFile.UncheckedModelFile(pulling0)).end().override().predicate(new ResourceLocation("pulling"), 1.0F).predicate(new ResourceLocation("pull"), 0.65F).model(new ModelFile.UncheckedModelFile(pulling1)).end().override().predicate(new ResourceLocation("pulling"), 1.0F).predicate(new ResourceLocation("pull"), 1.0F).model(new ModelFile.UncheckedModelFile(pulling2)).end().override().predicate(new ResourceLocation("charged"), 1.0F).model(new ModelFile.UncheckedModelFile(loaded)).end().override().predicate(new ResourceLocation("pulling"), 1.0F).predicate(new ResourceLocation("charged"), 1.0F).model(new ModelFile.UncheckedModelFile(firing)).end().getLocation();
    }

    public ResourceLocation createThrowingKnifeModels(Item item) {
        String itemPath = item.getRegistryName().getPath();
        ResourceLocation throwingModel = withUncheckedParent(itemPath + "_throwing", BaseModels.baseThrowingKnifeThrowing).texture("layer0", "item/" + itemPath).getLocation();
        return withUncheckedParent(itemPath, BaseModels.baseThrowingKnife).texture("layer0", "item/" + itemPath).override().predicate(new ResourceLocation("throwing"), 1.0F).predicate(new ResourceLocation("empty"), 0.0F).model(new ModelFile.UncheckedModelFile(throwingModel)).end().override().predicate(new ResourceLocation("empty"), 1.0F).model(new ModelFile.UncheckedModelFile(BaseModels.baseThrowingKnifeEmpty)).end().getLocation();
    }

    public ResourceLocation createTomahawkModels(Item item) {
        String itemPath = item.getRegistryName().getPath();
        ResourceLocation throwingModel = withUncheckedParent(itemPath + "_throwing", BaseModels.baseTomahawkThrowing).texture("layer0", "item/" + itemPath).getLocation();
        return withUncheckedParent(itemPath, BaseModels.baseTomahawk).texture("layer0", "item/" + itemPath).override().predicate(new ResourceLocation("throwing"), 1.0F).predicate(new ResourceLocation("empty"), 0.0F).model(new ModelFile.UncheckedModelFile(throwingModel)).end().override().predicate(new ResourceLocation("empty"), 1.0F).model(new ModelFile.UncheckedModelFile(BaseModels.baseTomahawkEmpty)).end().getLocation();
    }

    public ResourceLocation createJavelinModels(Item item) {
        String itemPath = item.getRegistryName().getPath();
        ResourceLocation throwingModel = withUncheckedParent(itemPath + "_throwing", BaseModels.baseJavelinThrowing).texture("layer0", "item/" + itemPath).getLocation();
        return withUncheckedParent(itemPath, BaseModels.baseJavelin).texture("layer0", "item/" + itemPath).override().predicate(new ResourceLocation("throwing"), 1.0F).predicate(new ResourceLocation("empty"), 0.0F).model(new ModelFile.UncheckedModelFile(throwingModel)).end().override().predicate(new ResourceLocation("empty"), 1.0F).model(new ModelFile.UncheckedModelFile(BaseModels.baseJavelinEmpty)).end().getLocation();
    }

    public ResourceLocation createBoomerangModels(Item item) {
        String itemPath = item.getRegistryName().getPath();
        ResourceLocation throwingModel = withUncheckedParent(itemPath + "_throwing", BaseModels.baseBoomerangThrowing).texture("layer0", "item/" + itemPath).getLocation();
        return withUncheckedParent(itemPath, BaseModels.baseBoomerang).texture("layer0", "item/" + itemPath).override().predicate(new ResourceLocation("throwing"), 1.0F).predicate(new ResourceLocation("empty"), 0.0F).model(new ModelFile.UncheckedModelFile(throwingModel)).end().override().predicate(new ResourceLocation("empty"), 1.0F).model(new ModelFile.UncheckedModelFile(BaseModels.baseBoomerangEmpty)).end().getLocation();
    }

    public ResourceLocation createBattleaxeModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseBattleaxe);
    }

    public ResourceLocation createFlangedMaceModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseFlangedMace);
    }

    public ResourceLocation createGlaiveModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseGlaive);
    }

    public ResourceLocation createQuarterstaffModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseQuarterstaff);
    }

    public ResourceLocation createScytheModel(Item item) {
        return this.createSimpleModel(item, BaseModels.baseScythe);
    }
}
