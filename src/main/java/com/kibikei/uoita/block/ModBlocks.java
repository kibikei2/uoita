package com.kibikei.uoita.block;

import com.kibikei.uoita.Uoita;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block EDITING_TABLE=registerBlocks(new Block(FabricBlockSettings.copyOf(Blocks.ENCHANTING_TABLE)));

    private static Block registerBlocks(Block block){
        registerBlockItems(block);
        return Registry.register(Registries.BLOCK,new Identifier(Uoita.MOD_ID, "editing_table"),block);
    }

    private static void registerBlockItems(Block block) {
        Registry.register(Registries.ITEM, new Identifier(Uoita.MOD_ID, "editing_table"),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {

    }
}
