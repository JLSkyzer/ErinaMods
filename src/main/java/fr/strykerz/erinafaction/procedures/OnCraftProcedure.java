package fr.strykerz.erinafaction.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

import fr.strykerz.erinafaction.item.AuraDiamondItem;
import fr.strykerz.erinafaction.ErinafactionModVariables;
import fr.strykerz.erinafaction.ErinafactionModElements;
import fr.strykerz.erinafaction.ErinafactionMod;

@ErinafactionModElements.ModElement.Tag
public class OnCraftProcedure extends ErinafactionModElements.ModElement {
	public OnCraftProcedure(ErinafactionModElements instance) {
		super(instance, 24);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency entity for procedure OnCraft!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency itemstack for procedure OnCraft!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((ItemStack.EMPTY).getItem() == new ItemStack(AuraDiamondItem.block, (int) (1)).getItem())) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("\u00A7a+") + "" + (((((itemstack)).getCount()) * 200)) + ""
						+ (" Xp \u00A7e(Craft \u00A75X") + "" + ((((itemstack)).getCount())) + "" + (" \u00A76") + ""
						+ (((itemstack).getDisplayName().getString())) + "" + (" \u00A7e)"))), (false));
			}
			{
				double _setval = (double) ((((itemstack)).getCount()) * 200);
				entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((ItemStack.EMPTY).getItem() == new ItemStack(Items.GOLDEN_APPLE, (int) (1)).getItem())) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("\u00A7a+") + "" + (((((itemstack)).getCount()) * 120)) + ""
						+ (" Xp \u00A7e(Craft \u00A75X") + "" + ((((itemstack)).getCount())) + "" + (" \u00A76") + ""
						+ (((itemstack).getDisplayName().getString())) + "" + (" \u00A7e)"))), (false));
			}
			{
				double _setval = (double) ((((itemstack)).getCount()) * 120);
				entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((ItemStack.EMPTY).getItem() == new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, (int) (1)).getItem())) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("\u00A7a+") + "" + (((((itemstack)).getCount()) * 180)) + ""
						+ (" Xp \u00A7e(Craft \u00A75X") + "" + ((((itemstack)).getCount())) + "" + (" \u00A76") + ""
						+ (((itemstack).getDisplayName().getString())) + "" + (" \u00A7e)"))), (false));
			}
			{
				double _setval = (double) ((((itemstack)).getCount()) * 180);
				entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}

	@SubscribeEvent
	public void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		Entity entity = event.getPlayer();
		World world = entity.world;
		double i = entity.getPosX();
		double j = entity.getPosY();
		double k = entity.getPosZ();
		ItemStack itemStack = event.getCrafting();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("itemstack", itemStack);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
