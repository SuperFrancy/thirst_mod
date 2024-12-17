
package net.mcreator.thirstmod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.thirstmod.procedures.ThirstEffectTickProcedure;

public class ThirstMobEffect extends MobEffect {
	public ThirstMobEffect() {
		super(MobEffectCategory.HARMFUL, -256);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		ThirstEffectTickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
