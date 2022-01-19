package io.github.spartanawakens.registry;

import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.WeaponTrait;
import io.github.chaosawakens.common.enums.CAItemTier;
import io.github.chaosawakens.data.CATagProvider;
import io.github.spartanawakens.SpartanAwakens;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.HashSet;
import java.util.Set;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SAItems {
    public static WeaponMaterial materialTigersEye = new WeaponMaterial("tigers_eye", SpartanAwakens.MODID, 0, 0, 3, 1600, 10.0F, 8.0F, 20, new ResourceLocation("chaosawakens:tigers_eye"));
    public static WeaponMaterial materialAmethyst = new WeaponMaterial("amethyst", SpartanAwakens.MODID, 0, 0, 3, 2000, 9.0F, 11.0F, 18, new ResourceLocation("chaosawakens:amethyst"));

    public static Item daggerTigersEye;
    public static Item longswordTigersEye;
    public static Item katanaTigersEye;
    public static Item saberTigersEye;
    public static Item rapierTigersEye;
    public static Item greatswordTigersEye;
    public static Item warhammerTigersEye;
    public static Item spearTigersEye;
    public static Item halberdTigersEye;
    public static Item pikeTigersEye;
    public static Item lanceTigersEye;
    public static Item throwingKnifeTigersEye;
    public static Item javelinTigersEye;
    public static Item battleaxeTigersEye;
    public static Item boomerangTigersEye;
    public static Item glaiveTigersEye;
    public static Item quarterstaffTigersEye;

    public static Item daggerAmethyst;
    public static Item longswordAmethyst;
    public static Item katanaAmethyst;
    public static Item saberAmethyst;
    public static Item rapierAmethyst;
    public static Item greatswordAmethyst;
    public static Item warhammerAmethyst;
    public static Item spearAmethyst;
    public static Item halberdAmethyst;
    public static Item pikeAmethyst;
    public static Item lanceAmethyst;
    public static Item throwingKnifeAmethyst;
    public static Item javelinAmethyst;
    public static Item battleaxeAmethyst;
    public static Item boomerangAmethyst;
    public static Item glaiveAmethyst;
    public static Item quarterstaffAmethyst;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> reg = event.getRegistry();

        daggerTigersEye = SpartanWeaponryAPI.createDagger(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(daggerTigersEye);
        longswordTigersEye = SpartanWeaponryAPI.createLongsword(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(longswordTigersEye);
        katanaTigersEye = SpartanWeaponryAPI.createKatana(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(katanaTigersEye);
        saberTigersEye = SpartanWeaponryAPI.createSaber(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(saberTigersEye);
        rapierTigersEye = SpartanWeaponryAPI.createRapier(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(rapierTigersEye);
        greatswordTigersEye = SpartanWeaponryAPI.createGreatsword(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(greatswordTigersEye);
        warhammerTigersEye = SpartanWeaponryAPI.createWarhammer(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(warhammerTigersEye);
        spearTigersEye = SpartanWeaponryAPI.createSpear(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(spearTigersEye);
        halberdTigersEye = SpartanWeaponryAPI.createHalberd(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(halberdTigersEye);
        pikeTigersEye = SpartanWeaponryAPI.createPike(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(pikeTigersEye);
        lanceTigersEye = SpartanWeaponryAPI.createLance(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(lanceTigersEye);
        throwingKnifeTigersEye = SpartanWeaponryAPI.createThrowingKnife(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(throwingKnifeTigersEye);
        javelinTigersEye = SpartanWeaponryAPI.createJavelin(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(javelinTigersEye);
        battleaxeTigersEye = SpartanWeaponryAPI.createBattleaxe(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(battleaxeTigersEye);
        boomerangTigersEye = SpartanWeaponryAPI.createBoomerang(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(boomerangTigersEye);
        glaiveTigersEye = SpartanWeaponryAPI.createGlaive(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(glaiveTigersEye);
        quarterstaffTigersEye = SpartanWeaponryAPI.createQuarterstaff(materialTigersEye, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(quarterstaffTigersEye);

        daggerAmethyst = SpartanWeaponryAPI.createDagger(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(daggerAmethyst);
        longswordAmethyst = SpartanWeaponryAPI.createLongsword(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(longswordAmethyst);
        katanaAmethyst = SpartanWeaponryAPI.createKatana(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(katanaAmethyst);
        saberAmethyst = SpartanWeaponryAPI.createSaber(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(saberAmethyst);
        rapierAmethyst = SpartanWeaponryAPI.createRapier(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(rapierAmethyst);
        greatswordAmethyst = SpartanWeaponryAPI.createGreatsword(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(greatswordAmethyst);
        warhammerAmethyst = SpartanWeaponryAPI.createWarhammer(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(warhammerAmethyst);
        spearAmethyst = SpartanWeaponryAPI.createSpear(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(spearAmethyst);
        halberdAmethyst = SpartanWeaponryAPI.createHalberd(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(halberdAmethyst);
        pikeAmethyst = SpartanWeaponryAPI.createPike(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(pikeAmethyst);
        lanceAmethyst = SpartanWeaponryAPI.createLance(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(lanceAmethyst);
        throwingKnifeAmethyst = SpartanWeaponryAPI.createThrowingKnife(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(throwingKnifeAmethyst);
        javelinAmethyst = SpartanWeaponryAPI.createJavelin(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(javelinAmethyst);
        battleaxeAmethyst = SpartanWeaponryAPI.createBattleaxe(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(battleaxeAmethyst);
        boomerangAmethyst = SpartanWeaponryAPI.createBoomerang(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(boomerangAmethyst);
        glaiveAmethyst = SpartanWeaponryAPI.createGlaive(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(glaiveAmethyst);
        quarterstaffAmethyst = SpartanWeaponryAPI.createQuarterstaff(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        reg.register(quarterstaffAmethyst);
    }
}
