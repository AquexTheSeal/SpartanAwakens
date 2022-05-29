package io.github.spartanawakens.data;

import io.github.chaosawakens.common.registry.CABlocks;
import io.github.spartanawakens.SpartanAwakens;
import io.github.spartanawakens.data.helpers.SAItemModelHelper;
import io.github.spartanawakens.registry.SAItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;

public class SAItemModelGenerator extends ItemModelProvider {

    public final SAItemModelHelper customItemModels;

    public SAItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, SpartanAwakens.MODID, existingFileHelper);
        customItemModels = new SAItemModelHelper(this);
    }

    @Override
    protected void registerModels() {

        customItemModels.createHandleModel(SAItems.crystalWoodHandle);
        customItemModels.createPoleModel(SAItems.crystalWoodPole);
        customItemModels.createHandleModel(SAItems.ultimateHandle);
        customItemModels.createPoleModel(SAItems.ultimatePole);

        for (Item item : SAItems.daggers.getAsList()) customItemModels.createThrowingKnifeModels(item);
        for (Item item : SAItems.parryingDaggers.getAsList()) customItemModels.createParryingDaggerModels(item);
        for (Item item : SAItems.longswords.getAsList()) customItemModels.createLongswordModel(item);
        for (Item item : SAItems.katanas.getAsList()) customItemModels.createKatanaModel(item);
        for (Item item : SAItems.sabers.getAsList()) customItemModels.createSaberModel(item);
        for (Item item : SAItems.rapiers.getAsList()) customItemModels.createRapierModel(item);
        for (Item item : SAItems.greatswords.getAsList()) customItemModels.createGreatswordModel(item);
        for (Item item : SAItems.battleHammers.getAsList()) customItemModels.createBattleHammerModel(item);
        for (Item item : SAItems.warhammers.getAsList()) customItemModels.createWarhammerModel(item);
        for (Item item : SAItems.spears.getAsList()) customItemModels.createSpearModel(item);
        for (Item item : SAItems.halberds.getAsList()) customItemModels.createHalberdModel(item);
        for (Item item : SAItems.pikes.getAsList()) customItemModels.createPikeModel(item);
        for (Item item : SAItems.lances.getAsList()) customItemModels.createLanceModel(item);

        for (Item item : SAItems.longbows.getAsList()) customItemModels.createLongbowModels(item);
        for (Item item : SAItems.heavyCrossbows.getAsList()) customItemModels.createHeavyCrossbowModels(item);

        for (Item item : SAItems.throwingKnives.getAsList()) customItemModels.createThrowingKnifeModels(item);
        for (Item item : SAItems.tomahawks.getAsList()) customItemModels.createTomahawkModels(item);
        for (Item item : SAItems.javelins.getAsList()) customItemModels.createJavelinModels(item);
        for (Item item : SAItems.boomerangs.getAsList()) customItemModels.createBoomerangModels(item);

        for (Item item : SAItems.battleaxes.getAsList()) customItemModels.createBattleaxeModel(item);
        for (Item item : SAItems.flangedMaces.getAsList()) customItemModels.createFlangedMaceModel(item);
        for (Item item : SAItems.glaives.getAsList()) customItemModels.createGlaiveModel(item);
        for (Item item : SAItems.quarterstaves.getAsList()) customItemModels.createQuarterstaffModel(item);
        for (Item item : SAItems.scythes.getAsList()) customItemModels.createScytheModel(item);
    }

    @Nonnull
    @Override
    public String getName() {
        return SpartanAwakens.MODNAME + " Item models";
    }
}
