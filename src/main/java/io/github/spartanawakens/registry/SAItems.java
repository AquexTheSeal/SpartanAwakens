package io.github.spartanawakens.registry;

import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.WeaponTrait;
import com.oblivioussp.spartanweaponry.item.BasicItem;
import com.oblivioussp.spartanweaponry.util.WeaponFactory;
import io.github.chaosawakens.common.enums.CAItemTier;
import io.github.chaosawakens.data.CATagProvider;
import io.github.spartanawakens.SpartanAwakens;
import io.github.spartanawakens.integrations.UltimateMeeleeWeaponProperty;
import io.github.spartanawakens.integrations.UltimateRangedWeaponProperty;
import io.github.spartanawakens.registry.weapontypes.SARangedWeapons;
import io.github.spartanawakens.registry.weapontypes.SAStandardWeapons;
import io.github.spartanawakens.registry.weapontypes.SAThrowingWeapons;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SAItems {
    public static WeaponMaterial materialAmethyst = new WeaponMaterial("amethyst", SpartanAwakens.MODID, 0, 0, 3, 2000, 9.0F, 11.0F, 18, new ResourceLocation("chaosawakens:amethyst"));
    public static WeaponMaterial materialRuby = new WeaponMaterial("ruby", SpartanAwakens.MODID, 0, 0, 4, 1800, 10.0F, 16.0F, 22, new ResourceLocation("chaosawakens:ruby"));
    public static WeaponMaterial materialUltimate = new WeaponMaterial("ultimate", SpartanAwakens.MODID, 0, 0, 5, 3000, 15.0F, 36.0F, 64, new ResourceLocation("chaosawakens:titanium_ingot"), new UltimateRangedWeaponProperty("ultimate_ranged", SpartanAwakens.MODID), new UltimateMeeleeWeaponProperty("ultimate_meelee", SpartanAwakens.MODID));

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
