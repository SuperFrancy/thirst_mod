package net.mcreator.thirstmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.thirstmod.network.ThirstModModVariables;

public class CapProcedure {
	public static void execute(Entity entity) {
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
