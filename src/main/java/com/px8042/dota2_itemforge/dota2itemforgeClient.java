package com.px8042.dota2_itemforge;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = dota2itemforge.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = dota2itemforge.MODID, value = Dist.CLIENT)
public class dota2itemforgeClient {
    public dota2itemforgeClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        dota2itemforge.LOGGER.info("Initializing Dota 2 Item Forge client");
        dota2itemforge.LOGGER.info("Dota 2 Item Forge client player: {}", Minecraft.getInstance().getUser().getName());
    }
}
