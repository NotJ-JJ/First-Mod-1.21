package net.femboy.tutorialmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(4).saturationModifier(0.65f).statusEffect(
            new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,250,2),1f).build();
}
