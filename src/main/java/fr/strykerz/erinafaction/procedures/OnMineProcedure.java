package fr.strykerz.erinafaction.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.Blocks;

import java.util.Map;
import java.util.HashMap;

import fr.strykerz.erinafaction.block.AuraOreBlock;
import fr.strykerz.erinafaction.ErinafactionModVariables;
import fr.strykerz.erinafaction.ErinafactionModElements;
import fr.strykerz.erinafaction.ErinafactionMod;

@ErinafactionModElements.ModElement.Tag
public class OnMineProcedure extends ErinafactionModElements.ModElement {
	public OnMineProcedure(ErinafactionModElements instance) {
		super(instance, 55);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency entity for procedure OnMine!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency x for procedure OnMine!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency y for procedure OnMine!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency z for procedure OnMine!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency world for procedure OnMine!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!(((EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0))
				|| ((EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH,
						((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)) != 0))))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.STONE.getDefaultState().getBlock())) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7a+10 xp \u00A76| \u00A7eMine Stone"), (false));
				}
				{
					double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ErinafactionModVariables.PlayerVariables())).xp) + 10);
					entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.xp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == AuraOreBlock.block.getDefaultState()
					.getBlock())) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7a+25 xp \u00A76| \u00A7eMine Aura Ore"), (false));
				}
				{
					double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ErinafactionModVariables.PlayerVariables())).xp) + 25);
					entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.xp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.COAL_ORE.getDefaultState().getBlock())) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7a+15 xp \u00A76| \u00A7eMine Coal Ore"), (false));
				}
				{
					double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ErinafactionModVariables.PlayerVariables())).xp) + 15);
					entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.xp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.REDSTONE_ORE.getDefaultState()
					.getBlock())
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.REDSTONE_ORE.getDefaultState()
							.getBlock()))) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7a+10 xp \u00A76| \u00A7eMine Redstone Ore"), (false));
				}
				{
					double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ErinafactionModVariables.PlayerVariables())).xp) + 10);
					entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.xp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.DIAMOND_ORE.getDefaultState()
					.getBlock())) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7a+120 xp \u00A76| \u00A7eMine Diamond Ore"), (false));
				}
				{
					double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ErinafactionModVariables.PlayerVariables())).xp) + 120);
					entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.xp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.EMERALD_ORE.getDefaultState()
					.getBlock())) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7a+180 xp \u00A76| \u00A7eMine Emerald Ore"), (false));
				}
				{
					double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ErinafactionModVariables.PlayerVariables())).xp) + 180);
					entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.xp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}

	@SubscribeEvent
	public void onBlockBreak(BlockEvent.BreakEvent event) {
		Entity entity = event.getPlayer();
		IWorld world = event.getWorld();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("xpAmount", event.getExpToDrop());
		dependencies.put("x", event.getPos().getX());
		dependencies.put("y", event.getPos().getY());
		dependencies.put("z", event.getPos().getZ());
		dependencies.put("px", entity.getPosX());
		dependencies.put("py", entity.getPosY());
		dependencies.put("pz", entity.getPosZ());
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
