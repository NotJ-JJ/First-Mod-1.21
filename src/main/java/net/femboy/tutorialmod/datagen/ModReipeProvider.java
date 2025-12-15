package net.femboy.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.femboy.tutorialmod.block.ModBlocks;
import net.femboy.tutorialmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModReipeProvider extends FabricRecipeProvider {
    public ModReipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.FEMINITE,RecipeCategory.MISC, ModBlocks.FEMINITE_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModBlocks.MAGIC_BLOCK)
                .input(ModItems.TESTOSORITE,1).input(ModItems.CAULIFLOWER,1).input(ModItems.FEMINITE,1)
                .criterion(hasItem(ModItems.FEMINITE),conditionsFromItem(ModItems.FEMINITE)).offerTo(recipeExporter);
    }
}
