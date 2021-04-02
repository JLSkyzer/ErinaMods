
package fr.strykerz.erinafaction.gui.overlay;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import fr.strykerz.erinafaction.ErinafactionModElements;

@ErinafactionModElements.ModElement.Tag
public class DeleteDefaultOverlayOverlay extends ErinafactionModElements.ModElement {
	public DeleteDefaultOverlayOverlay(ErinafactionModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.LOW)
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
			}
		}
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.LOW)
	public void EventHandler(RenderGameOverlayEvent event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.HEALTH){event.setCanceled(true);}
		if (event.getType() == RenderGameOverlayEvent.ElementType.FOOD){event.setCanceled(true);}
		if (event.getType() == RenderGameOverlayEvent.ElementType.AIR){event.setCanceled(true);}
		if (event.getType() == RenderGameOverlayEvent.ElementType.HEALTHMOUNT){event.setCanceled(true);}
		if (event.getType() == RenderGameOverlayEvent.ElementType.JUMPBAR){event.setCanceled(true);}
		}
}
