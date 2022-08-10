package io.github.spartanawakens.registry.weapontypes;

import com.google.common.collect.ImmutableList;
import com.oblivioussp.spartanweaponry.item.SwordBaseItem;
import com.oblivioussp.spartanweaponry.util.WeaponFactory;
import io.github.spartanawakens.registry.SAItemGroups;
import io.github.spartanawakens.registry.SAItems;
import net.minecraft.item.Item;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.IForgeRegistry;

public class SARangedWeapons {

    // Base Materials
    public Item crystalWood, kyanite, pinkTourmaline, catsEye, emerald, tigersEye, amethyst, ruby, ultimate;
    // CA Addon Support
    public Item sapphire;

    public SARangedWeapons(WeaponFactory.WeaponFunction<? extends Item> factory) {
        Item.Properties swGroup = (new Item.Properties()).tab(SAItemGroups.spartanAwakensCAMatsItemGroup);
        this.crystalWood = factory.create(SAItems.materialCrystalWood, swGroup, true);
        this.kyanite = factory.create(SAItems.materialKyanite, swGroup, true);
        this.pinkTourmaline = factory.create(SAItems.materialPinkTourmaline, swGroup, true);
        this.catsEye = factory.create(SAItems.materialCatsEye, swGroup, true);

        this.emerald = factory.create(SAItems.materialEmerald, swGroup, true);
        this.tigersEye = factory.create(SAItems.materialTigersEye, swGroup, true);
        this.amethyst = factory.create(SAItems.materialAmethyst, swGroup, true);
        this.ruby = factory.create(SAItems.materialRuby, swGroup, true);
        this.ultimate = factory.create(SAItems.materialUltimateRanged, swGroup, true);

        this.sapphire = factory.create(SAItems.materialSapphire, swGroup, true);
    }

    public void registerItems(IForgeRegistry<Item> reg) {
        reg.registerAll(crystalWood, kyanite, pinkTourmaline, catsEye, emerald, tigersEye, amethyst, ruby, ultimate);

        if (ModList.get().isLoaded("chaosadditions")) {
            reg.registerAll(sapphire);
        }
    }

    public ImmutableList<Item> getAsList() {
        return ImmutableList.of(crystalWood, kyanite, pinkTourmaline, catsEye, emerald, tigersEye, amethyst, ruby, ultimate, sapphire);
    }
}
