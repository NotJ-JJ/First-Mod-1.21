package net.femboy.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.femboy.tutorialmod.TutorialMod;
import net.femboy.tutorialmod.item.custom.ChisellItem;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item FEMINITE = registerItem("feminite",new Item(new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().maxCount(16)));
    public static final Item TESTOSORITE = registerItem("testosorite",new Item(new Item.Settings()));
    public static final Item STAR_ESSENCE = registerItem("star_essence", new Item(new Item.Settings()));

    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)));

    public static final Item CHISEL = registerItem("chisel",new ChisellItem(new Item.Settings().maxDamage(64)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID,name),item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for"+TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(FEMINITE);
            fabricItemGroupEntries.add(TESTOSORITE);
        });
    }
}