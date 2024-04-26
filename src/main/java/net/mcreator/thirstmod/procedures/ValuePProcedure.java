package net.mcreator.thirstmod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class ValuePProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Ossigeno:" + entity.getAirSupply() + "Cibo:" + (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0);
	}
}
