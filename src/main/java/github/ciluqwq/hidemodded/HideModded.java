package github.ciluqwq.hidemodded;

import com.mojang.logging.LogUtils;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import org.slf4j.Logger;

@Mod(value = HideModded.MODID, dist = Dist.CLIENT)
public class HideModded {
    public static final String MODID = "hidemodded";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HideModded(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("HideModded initializing for NeoForge 1.21.1");

        // Register client configuration
        modContainer.registerConfig(ModConfig.Type.CLIENT, Config.SPEC);

        // Register config screen for Mods menu in NeoForge
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }
}
