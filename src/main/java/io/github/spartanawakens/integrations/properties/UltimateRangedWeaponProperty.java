package io.github.spartanawakens.integrations.properties;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.RangedCallbackWeaponTrait;
import com.oblivioussp.spartanweaponry.item.LongbowItem;
import net.minecraft.entity.projectile.AbstractArrowEntity;

public class UltimateRangedWeaponProperty extends RangedCallbackWeaponTrait {

    public UltimateRangedWeaponProperty(String propType, String propModId) {
        super(propType, propModId, TraitQuality.POSITIVE);
    }

    @Override
    public float modifyLongbowDrawTime(WeaponMaterial material, float baseDraw) {
        baseDraw = 0.25F;
        return 0.25F;
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
        projectile.setBaseDamage(projectile.getBaseDamage() + 5.0D);
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
