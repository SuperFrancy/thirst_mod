
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thirstmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.thirstmod.item.PurifiedWaterBottleItem;
import net.mcreator.thirstmod.ThirstModMod;

public class ThirstModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, ThirstModMod.MODID);
	public static final DeferredHolder<Item, Item> PURIFIED_WATER_BOTTLE = REGISTRY.register("purified_water_bottle", () -> new PurifiedWaterBottleItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}
}
