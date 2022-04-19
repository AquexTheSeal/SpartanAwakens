package io.github.spartanawakens.registry.weapontypes;

import com.google.common.collect.ImmutableList;
import com.oblivioussp.spartanweaponry.item.ThrowingWeaponItem;
import com.oblivioussp.spartanweaponry.util.WeaponFactory;
import io.github.spartanawakens.registry.SAItemGroups;
import io.github.spartanawakens.registry.SAItems;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class SAThrowingWeapons {

    public ThrowingWeaponItem crystalWood, kyanite, pinkTourmaline, catsEye, emerald, tigersEye, amethyst, ruby, ultimate;

    public SAThrowingWeapons(WeaponFactory.WeaponFunction<ThrowingWeaponItem> factory) {
        Item.Properties swGroup = (new Item.Properties()).tab(SAItemGroups.spartanAwakensCAMatsItemGroup);
        this.crystalWood = factory.create(SAItems.materialCrystalWood, swGroup, false);
        this.kyanite = factory.create(SAItems.materialKyanite, swGroup, false);
        this.pinkTourmaline = factory.create(SAItems.materialPinkTourmaline, swGroup, false);
        this.catsEye = factory.create(SAItems.materialCatsEye, swGroup, false);

        this.emerald = factory.create(SAItems.materialEmerald, swGroup, false);
        this.tigersEye = factory.create(SAItems.materialTigersEye, swGroup, false);
        this.amethyst = factory.create(SAItems.materialAmethyst, swGroup, false);
        this.ruby = factory.create(SAItems.materialRuby, swGroup, false);
        this.ultimate = factory.create(SAItems.materialUltimate, swGroup, false);
    }

    public void registerItems(IForgeRegistry<Item> reg) {
        reg.registerAll(new Item[]{crystalWood, kyanite, pinkTourmaline, catsEye, emerald, tigersEye, amethyst, ruby, ultimate});
    }

    public ImmutableList<ThrowingWeaponItem> getAsList() {
        return ImmutableList.of(crystalWood, kyanite, pinkTourmaline, catsEye, emerald, tigersEye, amethyst, ruby, ultimate);
    }
}
