
package net.mcreator.thirstmod.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.thirstmod.procedures.T20Procedure;
import net.mcreator.thirstmod.procedures.T19Procedure;
import net.mcreator.thirstmod.procedures.T18Procedure;
import net.mcreator.thirstmod.procedures.T17Procedure;
import net.mcreator.thirstmod.procedures.T16Procedure;
import net.mcreator.thirstmod.procedures.T15Procedure;
import net.mcreator.thirstmod.procedures.T14Procedure;
import net.mcreator.thirstmod.procedures.T13Procedure;
import net.mcreator.thirstmod.procedures.T12Procedure;
import net.mcreator.thirstmod.procedures.T11Procedure;
import net.mcreator.thirstmod.procedures.T10Procedure;
import net.mcreator.thirstmod.procedures.T09Procedure;
import net.mcreator.thirstmod.procedures.T08Procedure;
import net.mcreator.thirstmod.procedures.T07Procedure;
import net.mcreator.thirstmod.procedures.T06Procedure;
import net.mcreator.thirstmod.procedures.T05Procedure;
import net.mcreator.thirstmod.procedures.T04Procedure;
import net.mcreator.thirstmod.procedures.T03Procedure;
import net.mcreator.thirstmod.procedures.T02Procedure;
import net.mcreator.thirstmod.procedures.T01Procedure;
import net.mcreator.thirstmod.procedures.ShowProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ThirstBarOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (ShowProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 82, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 74, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 66, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 58, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 50, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 42, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 34, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 26, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 18, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 10, h - 49, 0, 0, 9, 9, 9, 9);

			if (T02Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 82, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T04Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 74, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T06Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 66, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T08Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 58, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 50, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T12Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 42, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T14Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 34, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T16Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 26, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T18Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 18, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T20Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 10, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T01Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_half.png"), w / 2 + 82, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T03Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_half.png"), w / 2 + 74, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T05Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_half.png"), w / 2 + 66, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T07Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_half.png"), w / 2 + 58, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T09Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_half.png"), w / 2 + 50, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T11Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_half.png"), w / 2 + 42, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T13Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_half.png"), w / 2 + 34, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T15Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_half.png"), w / 2 + 26, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T17Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_half.png"), w / 2 + 18, h - 49, 0, 0, 9, 9, 9, 9);
			}
			if (T19Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_half.png"), w / 2 + 10, h - 49, 0, 0, 9, 9, 9, 9);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
