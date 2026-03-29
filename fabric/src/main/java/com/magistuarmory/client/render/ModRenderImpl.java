package com.magistuarmory.client.render;

import com.magistuarmory.api.item.ModItemsProvider;

public class ModRenderImpl {
	public static void setupPlatform(ModItemsProvider content) {
		com.magistuarmory.client.render.fabric.ModRenderImpl.setupPlatform(content);
	}

	public static void registerModelsLoadListener(ModItemsProvider content) {
		com.magistuarmory.client.render.fabric.ModRenderImpl.registerModelsLoadListener(content);
	}

	public static Object createHeraldryItemStackRenderer(String id, net.minecraft.resources.ResourceLocation location) {
		return com.magistuarmory.client.render.fabric.ModRenderImpl.createHeraldryItemStackRenderer(id, location);
	}
}
