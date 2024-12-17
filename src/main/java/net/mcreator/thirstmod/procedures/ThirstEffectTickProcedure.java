package net.mcreator.thirstmod.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.thirstmod.network.ThirstModModVariables;
import net.mcreator.thirstmod.init.ThirstModModMobEffects;

public class ThirstEffectTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
			_vars.tick = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tick + 1;
			_vars.syncPlayerVariables(entity);
		}
		{
			ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
			_vars.tickEsa = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tickEsa + 1;
			_vars.syncPlayerVariables(entity);
		}
		if ((new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity) || new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
				}
				return false;
			}
		}.checkGamemode(entity)) && entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tick == 800
				/ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ThirstModModMobEffects.THIRST) ? _livEnt.getEffect(ThirstModModMobEffects.THIRST).getAmplifier() : 0)) {
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
		if ((new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity) || new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
				}
				return false;
			}
		}.checkGamemode(entity)) && entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tickEsa == 20) {
			{
				ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
				_vars.Thirst = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).Thirst - 1;
				_vars.syncPlayerVariables(entity);
			}
			{
				ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
				_vars.tickEsa = 0.5;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
