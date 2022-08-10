package io.github.spartanawakens.integrations.utilities;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.WeaponTrait;
import net.minecraft.item.IItemTier;
import net.minecraft.util.ResourceLocation;

public class SAMaterial extends WeaponMaterial {

    public SAMaterial(String unlocName, String modId, int colourPrimary, int colourSecondary, int harvestLevel, int maxUses, float efficiency, float baseDamage, int enchantability, ResourceLocation tagName, WeaponTrait... traits) {
        super(unlocName, modId, colourPrimary, colourSecondary, harvestLevel, maxUses, efficiency, baseDamage, enchantability, tagName, traits);
    }

    public SAMaterial(String unlocName, int harvestLevel, int maxUses, float efficiency, float baseDamage, int enchantability, ResourceLocation tagName) {
        super(unlocName, harvestLevel, maxUses, efficiency, baseDamage, enchantability, tagName);
    }

    public SAMaterial(String unlocName, String modId, IItemTier itemTier, ResourceLocation tagName) {
        super(unlocName, modId, itemTier, tagName);
    }

    public SAMaterial(String unlocName, IItemTier itemTier, ResourceLocation tagName, WeaponTrait... traits) {
        super(unlocName, itemTier, tagName, traits);
    }
}
