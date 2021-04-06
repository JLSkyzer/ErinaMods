package fr.strykerz.erinafaction.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import java.util.Map;

import fr.strykerz.erinafaction.ErinafactionModElements;
import fr.strykerz.erinafaction.ErinafactionMod;

@ErinafactionModElements.ModElement.Tag
public class BloodesiumStationDeletBlocksProcedure extends ErinafactionModElements.ModElement {
	public BloodesiumStationDeletBlocksProcedure(ErinafactionModElements instance) {
		super(instance, 65);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency x for procedure BloodesiumStationDeletBlocks!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency y for procedure BloodesiumStationDeletBlocks!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency z for procedure BloodesiumStationDeletBlocks!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency world for procedure BloodesiumStationDeletBlocks!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world, new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
		world.setBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
	}
}
