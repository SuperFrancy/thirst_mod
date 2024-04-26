package net.mcreator.thirstmod.procedures;

import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.Difficulty;

import net.mcreator.thirstmod.network.ThirstModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DiffProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level());
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world.getDifficulty() == Difficulty.PEACEFUL) {
			ThirstModModVariables.MapVariables.get(world).diff = 0;
			ThirstModModVariables.MapVariables.get(world).syncData(world);
		} else if (world.getDifficulty() == Difficulty.EASY) {
			ThirstModModVariables.MapVariables.get(world).diff = 1;
			ThirstModModVariables.MapVariables.get(world).syncData(world);
		} else if (world.getDifficulty() == Difficulty.NORMAL) {
			ThirstModModVariables.MapVariables.get(world).diff = 2;
			ThirstModModVariables.MapVariables.get(world).syncData(world);
		} else if (world.getDifficulty() == Difficulty.HARD) {
			ThirstModModVariables.MapVariables.get(world).diff = 3;
			ThirstModModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
