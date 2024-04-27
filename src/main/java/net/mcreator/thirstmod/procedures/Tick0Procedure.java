package net.mcreator.thirstmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.thirstmod.network.ThirstModModVariables;

public class Tick0Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
			_vars.tick = 0;
			_vars.syncPlayerVariables(entity);
		}
	}
}
