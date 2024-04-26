package net.mcreator.thirstmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.thirstmod.network.ThirstModModVariables;
import net.mcreator.thirstmod.init.ThirstModModMobEffects;

public class ThirstEffectTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double tick = 0;
		tick = 0;
		while (tick < 40 / (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ThirstModModMobEffects.THIRST.get()) ? _livEnt.getEffect(ThirstModModMobEffects.THIRST.get()).getAmplifier() : 0)) {
			tick = tick + 1;
		}
		{
			ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
			_vars.Thirst = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).Thirst - 1;
			_vars.syncPlayerVariables(entity);
		}
		tick = 0;
	}
}
