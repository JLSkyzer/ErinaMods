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
import net.minecraft.block.Blocks;

import java.util.Map;
import java.util.HashMap;

import fr.strykerz.erinafaction.item.NyphractusIngotItem;
import fr.strykerz.erinafaction.block.NiphractusOreBlock;
import fr.strykerz.erinafaction.ErinafactionModVariables;
import fr.strykerz.erinafaction.ErinafactionModElements;
import fr.strykerz.erinafaction.ErinafactionMod;

@ErinafactionModElements.ModElement.Tag
public class OnSmeltProcedure extends ErinafactionModElements.ModElement {
	public OnSmeltProcedure(ErinafactionModElements instance) {
		super(instance, 23);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency entity for procedure OnSmelt!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency itemstack for procedure OnSmelt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((itemstack).getItem() == new ItemStack(NyphractusIngotItem.block, (int) (1)).getItem())) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity)
						.sendStatusMessage(new StringTextComponent((("\u00A7a+") + "" + (((((itemstack)).getCount()) * 150)) + "" + (" xp ") + ""
								+ ("\u00A7e(Smelt \u00A76") + "" + ((new ItemStack(NiphractusOreBlock.block, (int) (1)).getDisplayName().getString()))
								+ "" + ("\u00A7e) \u00A75X") + "" + ((((itemstack)).getCount())))), (false));
			}
			{
				double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ErinafactionModVariables.PlayerVariables())).xp) + ((((itemstack)).getCount()) * 150));
				entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((itemstack).getItem() == new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem())) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("\u00A7a+") + "" + (((((itemstack)).getCount()) * 65)) + ""
						+ (" xp ") + "" + ("\u00A7e(Smelt \u00A76") + "" + ((new ItemStack(Blocks.GOLD_ORE, (int) (1)).getDisplayName().getString()))
						+ "" + ("\u00A7e) \u00A75X") + "" + ((((itemstack)).getCount())))), (false));
			}
			{
				double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ErinafactionModVariables.PlayerVariables())).xp) + ((((itemstack)).getCount()) * 65));
				entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((itemstack).getItem() == new ItemStack(Items.IRON_INGOT, (int) (1)).getItem())) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("\u00A7a+") + "" + (((((itemstack)).getCount()) * 45)) + ""
						+ (" xp ") + "" + ("\u00A7e(Smelt \u00A76") + "" + ((new ItemStack(Blocks.IRON_ORE, (int) (1)).getDisplayName().getString()))
						+ "" + ("\u00A7e) \u00A75X") + "" + ((((itemstack)).getCount())))), (false));
			}
			{
				double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ErinafactionModVariables.PlayerVariables())).xp) + ((((itemstack)).getCount()) * 45));
				entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}

	@SubscribeEvent
	public void onItemSmelted(PlayerEvent.ItemSmeltedEvent event) {
		Entity entity = event.getPlayer();
		World world = entity.world;
		double i = entity.getPosX();
		double j = entity.getPosY();
		double k = entity.getPosZ();
		ItemStack itemStack = event.getSmelting();
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
