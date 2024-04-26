package net.mcreator.thirstmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.thirstmod.network.ThirstModModVariables;
import net.mcreator.thirstmod.init.ThirstModModMobEffects;

public class ThirstEffectTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		while (entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tick < (40 * 20)
				/ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ThirstModModMobEffects.THIRST.get()) ? _livEnt.getEffect(ThirstModModMobEffects.THIRST.get()).getAmplifier() : 0)) {
			{
				ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
				_vars.tick = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tick + 1;
				_vars.syncPlayerVariables(entity);
			}
		}
		{
			ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
			_vars.Thirst = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).Thirst - 1;
			_vars.syncPlayerVariables(entity);
		}
		{
			ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
			_vars.tick = 0;
			_vars.syncPlayerVariables(entity);
		}
	}
}
