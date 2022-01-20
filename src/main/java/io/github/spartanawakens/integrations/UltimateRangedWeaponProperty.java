package io.github.spartanawakens.integrations;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.RangedCallbackWeaponTrait;
import net.minecraft.entity.projectile.AbstractArrowEntity;

public class UltimateRangedWeaponProperty extends RangedCallbackWeaponTrait {

    public UltimateRangedWeaponProperty(String propType, String propModId) {
        super(propType, propModId, TraitQuality.POSITIVE);
    }

    @Override
    public float modifyLongbowDrawTime(WeaponMaterial material, float baseDraw) {
        return 0.1F;
    }

    @Override
    public int modifyHeavyCrossbowLoadTime(WeaponMaterial material, int baseLoad) {
        return 2;
    }

    @Override
    public int modifyHeavyCrossbowAimTime(WeaponMaterial material, int baseAim) {
        return 2;
    }

    @Override
    public void onProjectileSpawn(WeaponMaterial material, AbstractArrowEntity projectile) {
        projectile.setBaseDamage(5.0D);
    }

    @Override
    public boolean isMeleeTrait() {
        return false;
    }

    @Override
    public boolean isRangedTrait() {
        return true;
    }
}
