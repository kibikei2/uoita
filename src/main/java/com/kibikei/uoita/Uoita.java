package com.kibikei.uoita;

import com.kibikei.uoita.block.ModBlocks;
import com.kibikei.uoita.item.ModItemGroup;
import com.kibikei.uoita.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Uoita implements ModInitializer {

	public static final String MOD_ID = "uoita";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModItemGroup.registerModItemGroup();
		ModBlocks.registerModBlocks();
	}
}