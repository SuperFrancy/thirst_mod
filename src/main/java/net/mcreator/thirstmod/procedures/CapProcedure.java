package net.mcreator.thirstmod.procedures;

import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.mcreator.thirstmod.network.ThirstModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CapProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(ThirstModModVariables.PLAYER_VARIABLES).Thirst > 20) {
			{
				ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
				_vars.Thirst = 20;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity.getData(ThirstModModVariables.PLAYER_VARIABLES).Thirst < 0) {
			{
				ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
				_vars.Thirst = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
