package io.github.spartanawakens;

import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import io.github.chaosawakens.ChaosAwakens;
import io.github.chaosawakens.common.registry.CAItems;
import io.github.spartanawakens.data.SAItemModelGenerator;
import io.github.spartanawakens.data.SALanguageProvider;
import io.github.spartanawakens.data.SARecipeProvider;
import io.github.spartanawakens.data.SATagsProvider;
import io.github.spartanawakens.registry.SAItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.example.GeckoLibMod;
import software.bernie.geckolib3.GeckoLib;

import java.sql.Ref;

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

        if (event.includeServer()) {
            dataGenerator.addProvider(new SARecipeProvider(dataGenerator));
            dataGenerator.addProvider(new SALanguageProvider(dataGenerator, MODID, "en_us"));
            dataGenerator.addProvider(new SAItemModelGenerator(dataGenerator, existing));

            dataGenerator.addProvider(new SATagsProvider.SABlockTagProvider(dataGenerator, existing));
            dataGenerator.addProvider(new SATagsProvider.SAItemTagProvider(dataGenerator, existing));
        }
    }
}
