package net.mcreator.thirstmod.procedures;

import net.neoforged.neoforge.event.entity.living.LivingEvent;
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
public class CausaSaltoProcedure {
	@SubscribeEvent
	public static void onEntityJump(LivingEvent.LivingJumpEvent event) {
		execute(event, event.getEntity());
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
		}.checkGamemode(entity)) && entity instanceof Player) {
			if (entity.isSprinting()) {
				{
					ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
					_vars.Esa = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).Esa + 0.2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					ThirstModModVariables.PlayerVariables _vars = entity.getData(ThirstModModVariables.PLAYER_VARIABLES);
					_vars.Esa = entity.getData(ThirstModModVariables.PLAYER_VARIABLES).Esa + 0.05;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
