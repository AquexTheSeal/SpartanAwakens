package io.github.spartanawakens;

import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import io.github.chaosawakens.ChaosAwakens;
import io.github.spartanawakens.data.SAItemModelGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.example.GeckoLibMod;
import software.bernie.geckolib3.GeckoLib;

@Mod(SpartanAwakens.MODID)
public class SpartanAwakens {
    public static final String MODID = "spartanawakens";
    public static final String MODNAME = "Spartan Awakens";
    private static final Logger LOGGER = LogManager.getLogger();

    public SpartanAwakens() {
        GeckoLibMod.DISABLE_IN_DEV = true;
        GeckoLib.initialize();

        LOGGER.debug(MODNAME + " is an Addon for: " + ChaosAwakens.MODNAME + " and Spartan Weaponry!");
        LOGGER.debug("The Mod ID of " + MODNAME + " is: " + MODID);
        LOGGER.debug("The Mod ID of " + ChaosAwakens.MODNAME + " is: " + ChaosAwakens.MODID);
        LOGGER.debug("The Mod ID of Spartan Weaponry is: " + SpartanWeaponryAPI.MOD_ID);

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::gatherData);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void gatherData(final GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        final ExistingFileHelper existing = event.getExistingFileHelper();

        if (event.includeClient()) {
            dataGenerator.addProvider(new SAItemModelGenerator(dataGenerator, existing));
        }
    }
}