package net.femboy.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.femboy.tutorialmod.block.ModBlocks;
import net.femboy.tutorialmod.item.ModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TESTOSORITE_BLOCK);
        addDrop(ModBlocks.MAGIC_BLOCK);
        addDrop(ModBlocks.FEMINITE_BLOCK,oreDrops(ModBlocks.FEMINITE_BLOCK,ModItems.FEMINITE));
    }
}
