package net.mcreator.thirstmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.thirstmod.network.ThirstModModVariables;

public class ValuePProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		return "Ossigeno:" + entity.getAirSupply() + " Fame:" + (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + " Sete:" + entity.getData(ThirstModModVariables.PLAYER_VARIABLES).Thirst + " Tick:"
				+ entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tick + " Diff:" + ThirstModModVariables.MapVariables.get(world).diff + " Esa:" + entity.getData(ThirstModModVariables.PLAYER_VARIABLES).Esa;
	}
}
