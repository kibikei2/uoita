package com.kibikei.uoita.item;

import com.kibikei.uoita.Uoita;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WAND = registerItems(new Item(new FabricItemSettings()));

    private static void addItemsToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(WAND);
    }
    private static Item registerItems(Item item){
        return Registry.register(Registries.ITEM,new Identifier(Uoita.MOD_ID, "wand"),item);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIG);
    }
}
