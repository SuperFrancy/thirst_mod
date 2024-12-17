
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thirstmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.thirstmod.item.PurifiedWaterBottleItem;
import net.mcreator.thirstmod.ThirstModMod;

public class ThirstModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ThirstModMod.MODID);
	public static final DeferredItem<Item> PURIFIED_WATER_BOTTLE = REGISTRY.register("purified_water_bottle", PurifiedWaterBottleItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
