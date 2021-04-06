
package fr.strykerz.erinafaction.gui;

import org.lwjgl.opengl.GL11;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import fr.strykerz.erinafaction.procedures.Tablealphacondition0Procedure;
import fr.strykerz.erinafaction.procedures.TableAlphaCondition9Procedure;
import fr.strykerz.erinafaction.procedures.TableAlphaCondition8Procedure;
import fr.strykerz.erinafaction.procedures.TableAlphaCondition7Procedure;
import fr.strykerz.erinafaction.procedures.TableAlphaCondition6Procedure;
import fr.strykerz.erinafaction.procedures.TableAlphaCondition5Procedure;
import fr.strykerz.erinafaction.procedures.TableAlphaCondition4Procedure;
import fr.strykerz.erinafaction.procedures.TableAlphaCondition3Procedure;
import fr.strykerz.erinafaction.procedures.TableAlphaCondition2Procedure;
import fr.strykerz.erinafaction.procedures.TableAlphaCondition1Procedure;
import fr.strykerz.erinafaction.procedures.TableAlphaCondition10Procedure;
import fr.strykerz.erinafaction.ErinafactionMod;

import com.mojang.blaze3d.matrix.MatrixStack;

import com.google.common.collect.ImmutableMap;

@OnlyIn(Dist.CLIENT)
public class GuiBloodesiumTableAlphaGuiWindow extends ContainerScreen<GuiBloodesiumTableAlphaGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public GuiBloodesiumTableAlphaGuiWindow(GuiBloodesiumTableAlphaGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 235;
	}
	private static final ResourceLocation texture = new ResourceLocation("erinafaction:textures/gui_bloodesium_table_alpha.png");
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
		if (Tablealphacondition0Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/0_-_10.png"));
			this.blit(ms, this.guiLeft + 4, this.guiTop + 41, 0, 0, 8, 51, 8, 51);
		}
		if (TableAlphaCondition1Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/1_-_10.png"));
			this.blit(ms, this.guiLeft + 4, this.guiTop + 41, 0, 0, 8, 51, 8, 51);
		}
		if (TableAlphaCondition2Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/2_-_10.png"));
			this.blit(ms, this.guiLeft + 4, this.guiTop + 41, 0, 0, 8, 51, 8, 51);
		}
		if (TableAlphaCondition3Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/3_-_10.png"));
			this.blit(ms, this.guiLeft + 4, this.guiTop + 41, 0, 0, 8, 51, 8, 51);
		}
		if (TableAlphaCondition4Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/4_-_10.png"));
			this.blit(ms, this.guiLeft + 4, this.guiTop + 41, 0, 0, 8, 51, 8, 51);
		}
		if (TableAlphaCondition5Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/5_-_10.png"));
			this.blit(ms, this.guiLeft + 4, this.guiTop + 41, 0, 0, 8, 51, 8, 51);
		}
		if (TableAlphaCondition6Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/6_-_10.png"));
			this.blit(ms, this.guiLeft + 4, this.guiTop + 41, 0, 0, 8, 51, 8, 51);
		}
		if (TableAlphaCondition7Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/7_-_10.png"));
			this.blit(ms, this.guiLeft + 4, this.guiTop + 41, 0, 0, 8, 51, 8, 51);
		}
		if (TableAlphaCondition8Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/8_-_10.png"));
			this.blit(ms, this.guiLeft + 4, this.guiTop + 41, 0, 0, 8, 51, 8, 51);
		}
		if (TableAlphaCondition9Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/9_-_10.png"));
			this.blit(ms, this.guiLeft + 4, this.guiTop + 41, 0, 0, 8, 51, 8, 51);
		}
		if (TableAlphaCondition10Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("erinafaction:textures/10_-_10.png"));
			this.blit(ms, this.guiLeft + 4, this.guiTop + 41, 0, 0, 8, 51, 8, 51);
		}
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
		this.font.drawString(ms, "" + (new Object() {
			public String getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getString(tag);
				return "";
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "alert")) + "", 4, 5, -12829636);
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
		this.addButton(new Button(this.guiLeft + -99, this.guiTop + 4, 95, 20, new StringTextComponent("Destroy Blocks"), e -> {
			ErinafactionMod.PACKET_HANDLER.sendToServer(new GuiBloodesiumTableAlphaGui.ButtonPressedMessage(0, x, y, z));
			GuiBloodesiumTableAlphaGui.handleButtonAction(entity, 0, x, y, z);
		}));
		this.addButton(new Button(this.guiLeft + 110, this.guiTop + 128, 55, 20, new StringTextComponent("Fusion"), e -> {
			ErinafactionMod.PACKET_HANDLER.sendToServer(new GuiBloodesiumTableAlphaGui.ButtonPressedMessage(1, x, y, z));
			GuiBloodesiumTableAlphaGui.handleButtonAction(entity, 1, x, y, z);
		}));
	}
}
