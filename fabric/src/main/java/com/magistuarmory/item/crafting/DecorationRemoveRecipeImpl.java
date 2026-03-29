package com.magistuarmory.item.crafting;

import net.minecraft.world.item.crafting.RecipeSerializer;

public class DecorationRemoveRecipeImpl {
	public static RecipeSerializer<DecorationRemoveRecipe> getSerializerInstance() {
		return com.magistuarmory.item.crafting.fabric.DecorationRemoveRecipeImpl.getSerializerInstance();
	}
}
