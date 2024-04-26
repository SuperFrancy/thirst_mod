package net.mcreator.thirstmod.procedures;

import net.neoforged.neoforge.event.entity.living.LivingAttackEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.Difficulty;

import net.mcreator.thirstmod.init.ThirstModModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HuskProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double diff = 0;
		if (world.getDifficulty() == Difficulty.PEACEFUL) {
			diff = 0;
		} else if (world.getDifficulty() == Difficulty.PEACEFUL) {
			diff = 1;
		} else if (world.getDifficulty() == Difficulty.PEACEFUL) {
			diff = 2;
		} else if (world.getDifficulty() == Difficulty.PEACEFUL) {
			diff = 3;
		}
		if (entity instanceof Player && entity instanceof Husk) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ThirstModModMobEffects.THIRST.get(), (int) (7 + diff), 1));
		}
	}
}
