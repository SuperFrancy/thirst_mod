package net.mcreator.thirstmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.thirstmod.network.ThirstModModVariables;

public class T02Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(ThirstModModVariables.PLAYER_VARIABLES).Thirst >= 2) {
			return true;
		}
		return false;
	}
}
