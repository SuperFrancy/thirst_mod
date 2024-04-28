package net.mcreator.thirstmod.procedures;

import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.thirstmod.network.ThirstModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CausaMetriProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
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
		}.checkGamemode(entity)) && entity.isSwimming()) {
			if (entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tickSwim < 20) {
				{
					ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
					_vars.tickSwim = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tickSwim + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
					_vars.tickSwim = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tickSwim + 0.01;
					_vars.syncPlayerVariables(entity);
				}
			}
		} else if ((new Object() {
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
		}.checkGamemode(entity)) && entity.isSprinting()) {
			if (entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tickSprint < 20) {
				{
					ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
					_vars.tickSprint = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tickSprint + 1;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
					_vars.tickSprint = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).tickSprint + 0.1;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
