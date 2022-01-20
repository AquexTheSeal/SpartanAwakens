package io.github.spartanawakens.integrations;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.MeleeCallbackWeaponTrait;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public class UltimateMeeleeWeaponProperty extends MeleeCallbackWeaponTrait {

    public UltimateMeeleeWeaponProperty(String propType, String propModId) {
        super(propType, propModId, TraitQuality.POSITIVE);
    }

    public void onHitEntity(WeaponMaterial material, ItemStack stack, LivingEntity target, LivingEntity attacker, Entity projectile) {
    }

    @Override
    public boolean isMeleeTrait() {
        return true;
    }

    @Override
    public boolean isRangedTrait() {
        return false;
    }
}
