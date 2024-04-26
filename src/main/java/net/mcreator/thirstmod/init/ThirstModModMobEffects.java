
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thirstmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.thirstmod.potion.ThirstMobEffect;
import net.mcreator.thirstmod.ThirstModMod;

public class ThirstModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, ThirstModMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> THIRST = REGISTRY.register("thirst", () -> new ThirstMobEffect());
}
