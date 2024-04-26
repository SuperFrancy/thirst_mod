package net.mcreator.thirstmod.procedures;

import net.neoforged.neoforge.event.entity.living.LivingAttackEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.thirstmod.network.ThirstModModVariables;
import net.mcreator.thirstmod.init.ThirstModModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HuskProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Player && sourceentity instanceof Husk) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ThirstModModMobEffects.THIRST.get(), (int) (20 * 7 * entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tick), 1));
		}
	}
}
