package com.magistuarmory.item.crafting;

import net.minecraft.world.item.crafting.RecipeSerializer;

public class ArmorDecorationRecipeImpl {
	public static RecipeSerializer<ArmorDecorationRecipe> getSerializerInstance() {
		return com.magistuarmory.item.crafting.fabric.ArmorDecorationRecipeImpl.getSerializerInstance();
	}
}
