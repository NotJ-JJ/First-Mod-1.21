package net.femboy.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.femboy.tutorialmod.block.ModBlocks;
import net.femboy.tutorialmod.item.ModItemGroups;
import net.femboy.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static void InitialiseFuel() {
		FuelRegistry.INSTANCE.add(ModItems.STAR_ESSENCE,5000);
	}

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		InitialiseFuel();
	}
}