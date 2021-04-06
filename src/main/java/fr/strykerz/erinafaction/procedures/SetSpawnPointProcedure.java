package fr.strykerz.erinafaction.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import fr.strykerz.erinafaction.ErinafactionModVariables;
import fr.strykerz.erinafaction.ErinafactionModElements;
import fr.strykerz.erinafaction.ErinafactionMod;

@ErinafactionModElements.ModElement.Tag
public class SetSpawnPointProcedure extends ErinafactionModElements.ModElement {
	public SetSpawnPointProcedure(ErinafactionModElements instance) {
		super(instance, 81);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency entity for procedure SetSpawnPoint!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ErinafactionModVariables.spiritium_planet_x = (double) (entity.getPosX());
		ErinafactionModVariables.spiritium_planet_y = (double) (entity.getPosY());
		ErinafactionModVariables.spiritium_planet_z = (double) (entity.getPosZ());
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent("\u00A7aLe spawn dans la planet \u00A7bSpiritium \u00A7aa bien \u00E9t\u00E9 mis"), (false));
		}
	}
}
