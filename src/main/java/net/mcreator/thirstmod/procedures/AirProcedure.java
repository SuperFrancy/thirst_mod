package net.mcreator.thirstmod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class AirProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		double air = 0;
		return "Ossigeno:" + entity.getAirSupply() + "Fame" + (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0);
	}
}
