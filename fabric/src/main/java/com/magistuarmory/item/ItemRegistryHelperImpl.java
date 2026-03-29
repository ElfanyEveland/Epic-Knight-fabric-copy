package com.magistuarmory.item;

import com.magistuarmory.block.PaviseBlock;
import com.magistuarmory.item.armor.*;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ItemRegistryHelperImpl {
	@SuppressWarnings("unchecked")
	public static RegistrySupplier<KnightItem> registerKnightItem(DeferredRegister<Item> items, String id, ArmorType material, net.minecraft.world.item.equipment.ArmorType type, Item.Properties properties) {
		return (RegistrySupplier<KnightItem>) (RegistrySupplier<?>) com.magistuarmory.item.fabric.ItemRegistryHelperImpl.registerKnightItem(items, id, material, type, properties);
	}

	public static RegistrySupplier<MedievalArmorItem> registerJoustingItem(DeferredRegister<Item> items, String id, ArmorType material, net.minecraft.world.item.equipment.ArmorType type, Item.Properties properties) {
		return (RegistrySupplier<MedievalArmorItem>) (RegistrySupplier<?>) com.magistuarmory.item.fabric.ItemRegistryHelperImpl.registerJoustingItem(items, id, material, type, properties);
	}

	@SuppressWarnings("unchecked")
	public static RegistrySupplier<DyeableMedievalArmorItem> registerDyeableMedievalArmorItem(DeferredRegister<Item> items, String id, ArmorType material, net.minecraft.world.item.equipment.ArmorType type, Item.Properties properties, int defaultcolor) {
		return (RegistrySupplier<DyeableMedievalArmorItem>) (RegistrySupplier<?>) com.magistuarmory.item.fabric.ItemRegistryHelperImpl.registerDyeableMedievalArmorItem(items, id, material, type, properties, defaultcolor);
	}

	public static RegistrySupplier<MedievalArmorItem> registerMedievalArmorItem(DeferredRegister<Item> items, String id, ArmorType material, net.minecraft.world.item.equipment.ArmorType type, Item.Properties properties) {
		return (RegistrySupplier<MedievalArmorItem>) (RegistrySupplier<?>) com.magistuarmory.item.fabric.ItemRegistryHelperImpl.registerMedievalArmorItem(items, id, material, type, properties);
	}

	@SuppressWarnings("unchecked")
	public static RegistrySupplier<WearableArmorDecorationItem> registerWearableArmorDecorationItem(DeferredRegister<Item> items, String id, ArmorType material, net.minecraft.world.item.equipment.ArmorType type, Item.Properties properties) {
		return (RegistrySupplier<WearableArmorDecorationItem>) (RegistrySupplier<?>) com.magistuarmory.item.fabric.ItemRegistryHelperImpl.registerWearableArmorDecorationItem(items, id, material, type, properties);
	}

	@SuppressWarnings("unchecked")
	public static RegistrySupplier<DyeableWearableArmorDecorationItem> registerDyeableWearableArmorDecorationItem(DeferredRegister<Item> items, String id, ArmorType material, net.minecraft.world.item.equipment.ArmorType type, Item.Properties properties, int defaultcolor) {
		return (RegistrySupplier<DyeableWearableArmorDecorationItem>) (RegistrySupplier<?>) com.magistuarmory.item.fabric.ItemRegistryHelperImpl.registerDyeableWearableArmorDecorationItem(items, id, material, type, properties, defaultcolor);
	}

	public static RegistrySupplier<MedievalWeaponItem> registerMedievalWeaponItem(DeferredRegister<Item> items, String id, Item.Properties properties, ModItemTier material, WeaponType type) {
		return com.magistuarmory.item.fabric.ItemRegistryHelperImpl.registerMedievalWeaponItem(items, id, properties, material, type);
	}

	public static RegistrySupplier<MedievalWeaponItem> registerLanceItem(DeferredRegister<Item> items, String id, Item.Properties properties, ModItemTier material, WeaponType type) {
		return com.magistuarmory.item.fabric.ItemRegistryHelperImpl.registerLanceItem(items, id, properties, material, type);
	}

	public static RegistrySupplier<MedievalShieldItem> registerMedievalShieldItem(DeferredRegister<Item> items, String id, ResourceLocation location, Item.Properties properties, ModItemTier material, boolean paintable, boolean is3d, ShieldType type) {
		return com.magistuarmory.item.fabric.ItemRegistryHelperImpl.registerMedievalShieldItem(items, id, location, properties, material, paintable, is3d, type);
	}

	public static RegistrySupplier<MedievalShieldItem> registerPaviseItem(DeferredRegister<Item> items, String id, ResourceLocation location, Item.Properties properties, ModItemTier material, boolean paintable, boolean is3d, ShieldType type, Supplier<PaviseBlock> block) {
		return com.magistuarmory.item.fabric.ItemRegistryHelperImpl.registerPaviseItem(items, id, location, properties, material, paintable, is3d, type, block);
	}
}
