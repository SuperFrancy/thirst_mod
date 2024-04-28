package net.mcreator.thirstmod.procedures;

import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.thirstmod.network.ThirstModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CausaSaltoProcedure {
	@SubscribeEvent
	public static void onEntityJump(LivingEvent.LivingJumpEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (entity.isSprinting()) {
				{
					ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
					_vars.Esa = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).Esa + 0.2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
					_vars.Esa = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).Esa + 0.05;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
