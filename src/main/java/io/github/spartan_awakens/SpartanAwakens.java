package io.github.spartan_awakens;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SpartanAwakens.MOD_ID)
public class SpartanAwakens {

    public static SpartanAwakens instance;

    public static final String MOD_ID = "spartan_awakens";
    public static final String MOD_NAME = "Spartan Awakens";
    private static final Logger LOGGER = LogManager.getLogger();

    public SpartanAwakens() {
        instance = this;

        /* NOTE 1a: so that we won't have to redundantly refer to getting the mod event bus,
         * we need to make this object, such that we can refer to THIS one later on instead of
         * `FMLJavaModLoadingContext.get().getModEventBus()` every single time
         **/

        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // NOTE 1b: final step of registering elements like Items, Entities, etc. by passing their deferred register onto the bus

        /*SpartanAwakensItems.ITEMS.register(bus);*/

        // NOTE 1c: add listeners for everything else
        bus.addListener(this::setup);


        // NOTE 1d: register this class through the Minecraft Forge Event Bus
        MinecraftForge.EVENT_BUS.register(this);

        /*ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SpartanAwakensConfig.COMMON_SPEC);*/
    }

    // NOTE 2a: do some things during the setup phase of this mod, most preferably sending logs or whatever
    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("[" + MOD_NAME + "] - no.");
        LOGGER.info("Cool weaponry mod. Yes.");
    }

    public static SpartanAwakens getInstance() {
        return instance;
    }
}
