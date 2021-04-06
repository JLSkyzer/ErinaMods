
package fr.strykerz.erinafaction.gui;

import org.lwjgl.opengl.GL11;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import fr.strykerz.erinafaction.ErinafactionMod;

import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GuiWikiBloodesiumStationGuiWindow extends ContainerScreen<GuiWikiBloodesiumStationGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public GuiWikiBloodesiumStationGuiWindow(GuiWikiBloodesiumStationGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 280;
		this.ySize = 170;
	}
	private static final ResourceLocation texture = new ResourceLocation("erinafaction:textures/gui_wiki_bloodesium_station.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float par1, int par2, int par3) {
		GL11.glColor4f(1, 1, 1, 1);
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/bloodesium_station.png"));
		this.blit(ms, this.guiLeft + -1, this.guiTop + 0, 0, 0, 282, 172, 282, 172);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/bloodesiumarmor.png"));
		this.blit(ms, this.guiLeft + 7, this.guiTop + 18, 0, 0, 28, 28, 28, 28);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre.png"));
		this.blit(ms, this.guiLeft + 43, this.guiTop + 18, 0, 0, 8, 30, 8, 30);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre.png"));
		this.blit(ms, this.guiLeft + 43, this.guiTop + 49, 0, 0, 8, 30, 8, 30);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/barre.png"));
		this.blit(ms, this.guiLeft + 43, this.guiTop + 81, 0, 0, 8, 30, 8, 30);
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 7, this.guiTop + 49, 27, 20, new StringTextComponent("|-|"), e -> {
			ErinafactionMod.PACKET_HANDLER.sendToServer(new GuiWikiBloodesiumStationGui.ButtonPressedMessage(0, x, y, z));
			GuiWikiBloodesiumStationGui.handleButtonAction(entity, 0, x, y, z);
		}));
		this.addButton(new Button(this.guiLeft + 232, this.guiTop + 0, 36, 20, new StringTextComponent("Retour"), e -> {
			ErinafactionMod.PACKET_HANDLER.sendToServer(new GuiWikiBloodesiumStationGui.ButtonPressedMessage(1, x, y, z));
			GuiWikiBloodesiumStationGui.handleButtonAction(entity, 1, x, y, z);
		}));
	}
}
