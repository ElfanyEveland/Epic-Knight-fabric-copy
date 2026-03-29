package com.magistuarmory.item.crafting;

import net.minecraft.world.item.crafting.RecipeSerializer;

public class HeraldryRecipeImpl {
	public static RecipeSerializer<HeraldryRecipe> getSerializerInstance() {
		return com.magistuarmory.item.crafting.fabric.HeraldryRecipeImpl.getSerializerInstance();
	}
}
