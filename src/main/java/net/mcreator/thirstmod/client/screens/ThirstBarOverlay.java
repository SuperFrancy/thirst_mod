
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

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 73, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 64, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 55, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 46, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 37, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 28, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 19, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 10, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_empty.png"), w / 2 + 1, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 82, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 73, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 64, h - 49, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/drink_full.png"), w / 2 + 55, h - 49, 0, 0, 9, 9, 9, 9);

		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
