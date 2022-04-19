package io.github.spartanawakens.registry.weapontypes;

import com.google.common.collect.ImmutableList;
import com.oblivioussp.spartanweaponry.item.ThrowingWeaponItem;
import com.oblivioussp.spartanweaponry.util.WeaponFactory;
import io.github.spartanawakens.registry.SAItemGroups;
import io.github.spartanawakens.registry.SAItems;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class SAThrowingWeapons {

    public ThrowingWeaponItem amethyst, ruby, ultimate;

    public SAThrowingWeapons(WeaponFactory.WeaponFunction<ThrowingWeaponItem> factory) {
        Item.Properties swGroup = (new Item.Properties()).tab(SAItemGroups.spartanAwakensCAMatsItemGroup);
        this.amethyst = factory.create(SAItems.materialAmethyst, swGroup, false);
        this.ruby = factory.create(SAItems.materialRuby, swGroup, false);
        this.ultimate = factory.create(SAItems.materialUltimate, swGroup, false);
    }

    public void registerItems(IForgeRegistry<Item> reg) {
        reg.registerAll(new Item[]{this.amethyst, this.ruby, this.ultimate});
    }

    public ImmutableList<ThrowingWeaponItem> getAsList() {
        return ImmutableList.of(this.amethyst, this.ruby, this.ultimate);
    }
}
