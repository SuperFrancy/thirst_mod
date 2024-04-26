
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

import net.mcreator.thirstmod.procedures.ShowWProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ThirstBarWOverlay {
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
		if (ShowWProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_20.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_19.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_18.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_17.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_16.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_15.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_14.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_13.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_12.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_11.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_10.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_09.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_08.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_07.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_06.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_05.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_04.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_03.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_02.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("thirst_mod:textures/screens/thirst_bar_01.png"), w / 2 + 11, h - 59, 0, 0, 79, 9, 79, 9);

		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
