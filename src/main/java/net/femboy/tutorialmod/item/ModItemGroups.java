package net.femboy.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.femboy.tutorialmod.TutorialMod;
import net.femboy.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FEMINITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "feminite_items_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FEMINITE))
                    .displayName(Text.translatable("itemgroup.tutorialmod.femboy_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.FEMINITE);
                        entries.add(ModItems.TESTOSORITE);
                        entries.add(ModBlocks.FEMINITE_BLOCK);
                        entries.add(ModBlocks.TESTOSORITE_BLOCK);
                    })
                    .build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for" + TutorialMod.MOD_ID);
    }
}
