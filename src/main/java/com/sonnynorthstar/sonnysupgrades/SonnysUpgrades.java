package com.sonnynorthstar.sonnysupgrades;

import com.sonnynorthstar.sonnysupgrades.item.ModItems;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(SonnysUpgrades.MODID)
public class SonnysUpgrades {
    public static final String MODID = "sonnysupgrades";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SonnysUpgrades(IEventBus modEventBus, ModContainer modContainer) {
        // Register our item registry
        ModItems.register(modEventBus);

        // Setup common mod initialization
        modEventBus.addListener(this::commonSetup);

        // Handle adding items to creative tabs
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Sonnys Upgrades: Common Setup Initialized");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.OBSIDIAN_SWORD);
            event.accept(ModItems.OBSIDIAN_ARROW);
        }
    }


}