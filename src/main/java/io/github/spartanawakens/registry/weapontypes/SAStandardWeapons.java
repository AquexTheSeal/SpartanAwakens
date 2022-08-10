package io.github.spartanawakens.registry.weapontypes;

import com.google.common.collect.ImmutableList;
import com.oblivioussp.spartanweaponry.item.SwordBaseItem;
import com.oblivioussp.spartanweaponry.item.ThrowingWeaponItem;
import com.oblivioussp.spartanweaponry.util.WeaponFactory;
import io.github.spartanawakens.SpartanAwakens;
import io.github.spartanawakens.registry.SAItemGroups;
import io.github.spartanawakens.registry.SAItems;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.IForgeRegistry;

public class SAStandardWeapons {

    // Base Materials
    public SwordBaseItem crystalWood, kyanite, pinkTourmaline, catsEye, emerald, tigersEye, amethyst, ruby, ultimate;
    // CA Addon Support
    public SwordBaseItem sapphire;

    public SAStandardWeapons(WeaponFactory.WeaponFunction<SwordBaseItem> factory) {
        Item.Properties swGroup = (new Item.Properties()).tab(SAItemGroups.spartanAwakensCAMatsItemGroup);
        this.crystalWood = factory.create(SAItems.materialCrystalWood, swGroup, true);
        this.kyanite = factory.create(SAItems.materialKyanite, swGroup, true);
        this.pinkTourmaline = factory.create(SAItems.materialPinkTourmaline, swGroup, true);
        this.catsEye = factory.create(SAItems.materialCatsEye, swGroup, true);

        this.emerald = factory.create(SAItems.materialEmerald, swGroup, true);
        this.tigersEye = factory.create(SAItems.materialTigersEye, swGroup, true);
        this.amethyst = factory.create(SAItems.materialAmethyst, swGroup, true);
        this.ruby = factory.create(SAItems.materialRuby, swGroup, true);
        this.ultimate = factory.create(SAItems.materialUltimateMelee, swGroup, true);

        this.sapphire = factory.create(SAItems.materialSapphire, swGroup, true);
    }

    public void registerItems(IForgeRegistry<Item> reg) {
        reg.registerAll(crystalWood, kyanite, pinkTourmaline, catsEye, emerald, tigersEye, amethyst, ruby, ultimate);

        if (ModList.get().isLoaded("chaosadditions")) {
            reg.registerAll(sapphire);
        }
    }

    public ImmutableList<SwordBaseItem> getAsList() {
        return ImmutableList.of(crystalWood, kyanite, pinkTourmaline, catsEye, emerald, tigersEye, amethyst, ruby, ultimate, sapphire);
    }
}
