package com.sonnynorthstar.sonnysupgrades.item;

import com.sonnynorthstar.sonnysupgrades.SonnysUpgrades;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SonnysUpgrades.MODID);

    // Obsidian Sword
    public static final DeferredItem<Item> OBSIDIAN_SWORD = ITEMS.registerSimpleItem("obsidian_sword",
            p -> p);

    // Obsidian Arrow
    public static final DeferredItem<Item> OBSIDIAN_ARROW = ITEMS.registerSimpleItem("obsidian_arrow",
            p -> p);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
