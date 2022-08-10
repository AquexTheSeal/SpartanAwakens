package io.github.spartanawakens.registry;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.item.BasicItem;
import com.oblivioussp.spartanweaponry.util.WeaponFactory;
import io.github.spartanawakens.SpartanAwakens;
import io.github.spartanawakens.integrations.properties.UltimateMeeleeWeaponProperty;
import io.github.spartanawakens.integrations.properties.UltimateRangedWeaponProperty;
import io.github.spartanawakens.integrations.utilities.SAMaterial;
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
    public static WeaponMaterial materialCrystalWood = new SAMaterial("crystal_wood", SpartanAwakens.MODID, 0, 0, 3, 1600, 10.0F, 8.0F, 20, SATags.Items.CRYSTAL_WOOD.getName());
    public static WeaponMaterial materialKyanite = new SAMaterial("kyanite", SpartanAwakens.MODID, 0, 0, 3, 1600, 10.0F, 8.0F, 20, SATags.Items.KYANITE.getName());
    public static WeaponMaterial materialPinkTourmaline = new SAMaterial("pink_tourmaline", SpartanAwakens.MODID, 0, 0, 3, 1600, 10.0F, 8.0F, 20, SATags.Items.PINK_TOURMALINE.getName());
    public static WeaponMaterial materialCatsEye = new SAMaterial("cats_eye", SpartanAwakens.MODID, 0, 0, 3, 1600, 10.0F, 8.0F, 20, SATags.Items.CATS_EYE.getName());

    public static WeaponMaterial materialEmerald = new SAMaterial("emerald", SpartanAwakens.MODID, 0, 0, 3, 1300, 8.0F, 6.0F, 24, SATags.Items.EMERALD.getName());
    public static WeaponMaterial materialTigersEye = new SAMaterial("tigers_eye", SpartanAwakens.MODID, 0, 0, 3, 1600, 10.0F, 8.0F, 20, SATags.Items.TIGERS_EYE.getName());
    public static WeaponMaterial materialAmethyst = new SAMaterial("amethyst", SpartanAwakens.MODID, 0, 0, 3, 2000, 9.0F, 11.0F, 18, SATags.Items.AMETHYST.getName());
    public static WeaponMaterial materialRuby = new SAMaterial("ruby", SpartanAwakens.MODID, 0, 0, 4, 1800, 10.0F, 16.0F, 22, SATags.Items.RUBY.getName());
    public static WeaponMaterial materialUltimateMelee = new SAMaterial("ultimate", SpartanAwakens.MODID, 0, 0, 5, 3000, 15.0F, 36.0F, 64, SATags.Items.ULTIMATE.getName(), new UltimateMeeleeWeaponProperty("ultimate_melee", SpartanAwakens.MODID));
    public static WeaponMaterial materialUltimateRanged = new SAMaterial("ultimate", SpartanAwakens.MODID, 0, 0, 5, 3000, 15.0F, 36.0F, 64, SATags.Items.ULTIMATE.getName(), new UltimateRangedWeaponProperty("ultimate_ranged", SpartanAwakens.MODID));

    public static WeaponMaterial materialSapphire = new SAMaterial("sapphire", SpartanAwakens.MODID, 0, 0, 3, 1300, 8.0F, 6.0F, 24, SATags.Items.SAPPHIRE.getName());

    // Crafting Necessities
    public static Item crystalWoodHandle, crystalWoodPole, ultimateHandle, ultimatePole;
    // Melee Weapons pt. I
    public static SAStandardWeapons daggers, parryingDaggers, longswords, katanas, sabers, rapiers, greatswords, battleHammers, warhammers, spears, halberds, pikes, lances;
    // Ranged Weapons
    public static SARangedWeapons longbows, heavyCrossbows;
    // Throwing Weapons
    public static SAThrowingWeapons throwingKnives, tomahawks, javelins, boomerangs;
    // Melee Weapons pt. II
    public static SAStandardWeapons battleaxes, flangedMaces, glaives, quarterstaves, scythes;

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
