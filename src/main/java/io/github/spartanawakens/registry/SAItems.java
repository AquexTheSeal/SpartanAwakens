package io.github.spartanawakens.registry;

import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import io.github.spartanawakens.SpartanAwakens;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashSet;
import java.util.Set;

@Mod.EventBusSubscriber
public class SAItems {
    public static WeaponMaterial materialAmethyst = new WeaponMaterial("amethyst", SpartanAwakens.MODID, 0, 0, 4, 2048, 7.5f, 8.0f, 18, new ResourceLocation("chaosawakens:amethyst"));


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        Set<Item> itemSet = new HashSet<>();
        //for (BWMMatConverter mat : MATERIALS_TO_REGISTER){

        Item dagger = SpartanWeaponryAPI.createDagger(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(dagger);

        Item longsword = SpartanWeaponryAPI.createLongsword(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(longsword);

        Item katana = SpartanWeaponryAPI.createKatana(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(katana);

        Item saber = SpartanWeaponryAPI.createSaber(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(saber);

        Item rapier = SpartanWeaponryAPI.createRapier(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(rapier);

        Item greatsword = SpartanWeaponryAPI.createGreatsword(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(greatsword);

        Item warhammer = SpartanWeaponryAPI.createWarhammer(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(warhammer);

        Item spear = SpartanWeaponryAPI.createSpear(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(spear);

        Item halberd = SpartanWeaponryAPI.createHalberd(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(halberd);

        Item pike = SpartanWeaponryAPI.createPike(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(pike);

        Item lance = SpartanWeaponryAPI.createLance(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(lance);

        Item throwingKnife = SpartanWeaponryAPI.createThrowingKnife(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(throwingKnife);

        Item javelin = SpartanWeaponryAPI.createJavelin(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(javelin);

        Item battleaxe = SpartanWeaponryAPI.createBattleaxe(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(battleaxe);

        Item boomerang = SpartanWeaponryAPI.createBoomerang(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(boomerang);

        Item glaive = SpartanWeaponryAPI.createGlaive(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(glaive);

        Item quarterstaff = SpartanWeaponryAPI.createQuarterstaff(materialAmethyst, SAItemGroups.spartanAwakensCAMatsItemGroup);
        itemSet.add(quarterstaff);
            

        for (Item it : itemSet)
        {
            if(it != null)
                event.getRegistry().register(it);
        }
    }
}
