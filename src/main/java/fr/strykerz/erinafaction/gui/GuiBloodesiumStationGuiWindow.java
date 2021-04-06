
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
public class GuiBloodesiumStationGuiWindow extends ContainerScreen<GuiBloodesiumStationGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public GuiBloodesiumStationGuiWindow(GuiBloodesiumStationGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 230;
	}
	private static final ResourceLocation texture = new ResourceLocation("erinafaction:textures/gui_bloodesium_station.png");
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
		this.font.drawString(ms, "Bloodesium \u00A7eStation", 42, 3, -6881280);
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
		this.addButton(new Button(this.guiLeft + 41, this.guiTop + 15, 99, 20, new StringTextComponent("Charge Fusion"), e -> {
			ErinafactionMod.PACKET_HANDLER.sendToServer(new GuiBloodesiumStationGui.ButtonPressedMessage(0, x, y, z));
			GuiBloodesiumStationGui.handleButtonAction(entity, 0, x, y, z);
		}));
		this.addButton(new Button(this.guiLeft + -88, this.guiTop + 8, 85, 20, new StringTextComponent("Destroy Blocks"), e -> {
			ErinafactionMod.PACKET_HANDLER.sendToServer(new GuiBloodesiumStationGui.ButtonPressedMessage(1, x, y, z));
			GuiBloodesiumStationGui.handleButtonAction(entity, 1, x, y, z);
		}));
	}
}
