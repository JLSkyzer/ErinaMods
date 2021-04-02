
package fr.strykerz.erinafaction.gui.overlay;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import fr.strykerz.erinafaction.procedures.ConditionHealth9Procedure;
import fr.strykerz.erinafaction.procedures.ConditionHealth8Procedure;
import fr.strykerz.erinafaction.procedures.ConditionHealth7Procedure;
import fr.strykerz.erinafaction.procedures.ConditionHealth6Procedure;
import fr.strykerz.erinafaction.procedures.ConditionHealth5Procedure;
import fr.strykerz.erinafaction.procedures.ConditionHealth4Procedure;
import fr.strykerz.erinafaction.procedures.ConditionHealth3Procedure;
import fr.strykerz.erinafaction.procedures.ConditionHealth2Procedure;
import fr.strykerz.erinafaction.procedures.ConditionHealth1Procedure;
import fr.strykerz.erinafaction.procedures.ConditionHealth10Procedure;
import fr.strykerz.erinafaction.procedures.ConditionHealth0Procedure;
import fr.strykerz.erinafaction.ErinafactionModVariables;
import fr.strykerz.erinafaction.ErinafactionModElements;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

import com.google.common.collect.ImmutableMap;

@ErinafactionModElements.ModElement.Tag
public class BasicOverlayOverlay extends ErinafactionModElements.ModElement {
	public BasicOverlayOverlay(ErinafactionModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGH)
	public void eventHandler(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int posX = (event.getWindow().getScaledWidth()) / 2;
			int posY = (event.getWindow().getScaledHeight()) / 2;
			PlayerEntity entity = Minecraft.getInstance().player;
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			if (true) {
				if (ConditionHealth0Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre_0_-_10.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -212, posY + -119, 0, 0, 100, 6, 100, 6);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (ConditionHealth1Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre_1_-_10.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -212, posY + -119, 0, 0, 100, 6, 100, 6);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (ConditionHealth2Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre_2_-_10.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -212, posY + -119, 0, 0, 100, 6, 100, 6);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (ConditionHealth3Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre_3_-_10.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -212, posY + -119, 0, 0, 100, 6, 100, 6);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (ConditionHealth4Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre_4_-_10.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -212, posY + -119, 0, 0, 100, 6, 100, 6);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (ConditionHealth5Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre_5_-_10.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -212, posY + -119, 0, 0, 100, 6, 100, 6);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (ConditionHealth6Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre_6_-_10.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -212, posY + -119, 0, 0, 100, 6, 100, 6);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (ConditionHealth7Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre_7_-_10.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -212, posY + -119, 0, 0, 100, 6, 100, 6);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (ConditionHealth8Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre_8_-_10.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -212, posY + -119, 0, 0, 100, 6, 100, 6);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (ConditionHealth9Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre_9_-_10.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -212, posY + -119, 0, 0, 100, 6, 100, 6);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (ConditionHealth10Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre_10_-_10.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -212, posY + -119, 0, 0, 100, 6, 100, 6);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				Minecraft.getInstance().fontRenderer
						.drawString(event.getMatrixStack(),
								"" + ((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ErinafactionModVariables.PlayerVariables())).PlayerHealth) + "",
								posX + -113, posY + -119, -7077888);
			}
		}
	}
}
