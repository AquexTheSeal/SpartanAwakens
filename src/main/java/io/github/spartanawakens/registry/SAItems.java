package io.github.spartanawakens.registry;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.item.BasicItem;
import com.oblivioussp.spartanweaponry.util.WeaponFactory;
import io.github.spartanawakens.SpartanAwakens;
import io.github.spartanawakens.integrations.properties.UltimateMeeleeWeaponProperty;
import io.github.spartanawakens.integrations.properties.UltimateRangedWeaponProperty;
import io.github.spartanawakens.item.SABasicItem;
import io.github.spartanawakens.registry.weapontypes.SARangedWeapons;
import io.github.spartanawakens.registry.weapontypes.SAStandardWeapons;
import io.github.spartanawakens.registry.weapontypes.SAThrowingWeapons;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SAItems {
    public static WeaponMaterial materialCrystalWood = new WeaponMaterial("crystal_wood", SpartanAwakens.MODID, 0, 0, 3, 1600, 10.0F, 8.0F, 20, SATags.Items.CRYSTAL_WOOD.getName());
    public static WeaponMaterial materialKyanite = new WeaponMaterial("kyanite", SpartanAwakens.MODID, 0, 0, 3, 1600, 10.0F, 8.0F, 20, SATags.Items.KYANITE.getName());
    public static WeaponMaterial materialPinkTourmaline = new WeaponMaterial("pink_tourmaline", SpartanAwakens.MODID, 0, 0, 3, 1600, 10.0F, 8.0F, 20, SATags.Items.PINK_TOURMALINE.getName());
    public static WeaponMaterial materialCatsEye = new WeaponMaterial("cats_eye", SpartanAwakens.MODID, 0, 0, 3, 1600, 10.0F, 8.0F, 20, SATags.Items.CATS_EYE.getName());

    public static WeaponMaterial materialEmerald = new WeaponMaterial("emerald", SpartanAwakens.MODID, 0, 0, 3, 1300, 8.0F, 6.0F, 24, SATags.Items.EMERALD.getName());
    public static WeaponMaterial materialTigersEye = new WeaponMaterial("tigers_eye", SpartanAwakens.MODID, 0, 0, 3, 1600, 10.0F, 8.0F, 20, SATags.Items.TIGERS_EYE.getName());
    public static WeaponMaterial materialAmethyst = new WeaponMaterial("amethyst", SpartanAwakens.MODID, 0, 0, 3, 2000, 9.0F, 11.0F, 18, SATags.Items.AMETHYST.getName());
    public static WeaponMaterial materialRuby = new WeaponMaterial("ruby", SpartanAwakens.MODID, 0, 0, 4, 1800, 10.0F, 16.0F, 22, SATags.Items.RUBY.getName());
    public static WeaponMaterial materialUltimateMelee = new WeaponMaterial("ultimate", SpartanAwakens.MODID, 0, 0, 5, 3000, 15.0F, 36.0F, 64, SATags.Items.ULTIMATE.getName(), new UltimateMeeleeWeaponProperty("ultimate_melee", SpartanAwakens.MODID));
    public static WeaponMaterial materialUltimateRanged = new WeaponMaterial("ultimate", SpartanAwakens.MODID, 0, 0, 5, 3000, 15.0F, 36.0F, 64, SATags.Items.ULTIMATE.getName(), new UltimateRangedWeaponProperty("ultimate_ranged", SpartanAwakens.MODID));

    public static Item crystalWoodHandle;
    public static Item crystalWoodPole;
    public static Item ultimateHandle;
    public static Item ultimatePole;
    public static SAStandardWeapons daggers;
    public static SAStandardWeapons parryingDaggers;
    public static SAStandardWeapons longswords;
    public static SAStandardWeapons katanas;
    public static SAStandardWeapons sabers;
    public static SAStandardWeapons rapiers;
    public static SAStandardWeapons greatswords;
    public static SAStandardWeapons battleHammers;
    public static SAStandardWeapons warhammers;
    public static SAStandardWeapons spears;
    public static SAStandardWeapons halberds;
    public static SAStandardWeapons pikes;
    public static SAStandardWeapons lances;
    public static SARangedWeapons longbows;
    public static SARangedWeapons heavyCrossbows;
    public static SAThrowingWeapons throwingKnives;
    public static SAThrowingWeapons tomahawks;
    public static SAThrowingWeapons javelins;
    public static SAThrowingWeapons boomerangs;
    public static SAStandardWeapons battleaxes;
    public static SAStandardWeapons flangedMaces;
    public static SAStandardWeapons glaives;
    public static SAStandardWeapons quarterstaves;
    public static SAStandardWeapons scythes;

    static {
        Item.Properties prop = (new Item.Properties()).tab(SAItemGroups.spartanAwakensCAMatsItemGroup);
        crystalWoodHandle = new SABasicItem("crystal_wood_handle", prop);
        crystalWoodPole = new SABasicItem("crystal_wood_pole", prop);
        ultimateHandle = new SABasicItem("ultimate_handle", prop);
        ultimatePole = new SABasicItem("ultimate_pole", prop);

        daggers = new SAStandardWeapons(WeaponFactory.DAGGER);
        parryingDaggers = new SAStandardWeapons(WeaponFactory.PARRYING_DAGGER);
        longswords = new SAStandardWeapons(WeaponFactory.LONGSWORD);
        katanas = new SAStandardWeapons(WeaponFactory.KATANA);
        sabers = new SAStandardWeapons(WeaponFactory.SABER);
        rapiers = new SAStandardWeapons(WeaponFactory.RAPIER);
        greatswords = new SAStandardWeapons(WeaponFactory.GREATSWORD);
        battleHammers = new SAStandardWeapons(WeaponFactory.BATTLE_HAMMER);
        warhammers = new SAStandardWeapons(WeaponFactory.WARHAMMER);
        spears = new SAStandardWeapons(WeaponFactory.SPEAR);
        halberds = new SAStandardWeapons(WeaponFactory.HALBERD);
        pikes = new SAStandardWeapons(WeaponFactory.PIKE);
        lances = new SAStandardWeapons(WeaponFactory.LANCE);
        longbows = new SARangedWeapons(WeaponFactory.LONGBOW);
        heavyCrossbows = new SARangedWeapons(WeaponFactory.HEAVY_CROSSBOW);
        throwingKnives = new SAThrowingWeapons(WeaponFactory.THROWING_KNIFE);
        tomahawks = new SAThrowingWeapons(WeaponFactory.TOMAHAWK);
        javelins = new SAThrowingWeapons(WeaponFactory.JAVELIN);
        boomerangs = new SAThrowingWeapons(WeaponFactory.BOOMERANG);
        battleaxes = new SAStandardWeapons(WeaponFactory.BATTLEAXE);
        flangedMaces = new SAStandardWeapons(WeaponFactory.FLANGED_MACE);
        glaives = new SAStandardWeapons(WeaponFactory.GLAIVE);
        quarterstaves = new SAStandardWeapons(WeaponFactory.QUARTERSTAFF);
        scythes = new SAStandardWeapons(WeaponFactory.SCYTHE);
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> reg = event.getRegistry();

        reg.registerAll(crystalWoodHandle, crystalWoodPole, ultimateHandle, ultimatePole);

        daggers.registerItems(reg);
        parryingDaggers.registerItems(reg);
        longswords.registerItems(reg);
        katanas.registerItems(reg);
        sabers.registerItems(reg);
        rapiers.registerItems(reg);
        greatswords.registerItems(reg);
        battleHammers.registerItems(reg);
        warhammers.registerItems(reg);
        spears.registerItems(reg);
        halberds.registerItems(reg);
        pikes.registerItems(reg);
        lances.registerItems(reg);
        longbows.registerItems(reg);
        heavyCrossbows.registerItems(reg);
        throwingKnives.registerItems(reg);
        tomahawks.registerItems(reg);
        javelins.registerItems(reg);
        boomerangs.registerItems(reg);
        battleaxes.registerItems(reg);
        flangedMaces.registerItems(reg);
        glaives.registerItems(reg);
        quarterstaves.registerItems(reg);
        scythes.registerItems(reg);
    }
}
