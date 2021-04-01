package fr.strykerz.erinafaction.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import fr.strykerz.erinafaction.ErinafactionModVariables;
import fr.strykerz.erinafaction.ErinafactionModElements;
import fr.strykerz.erinafaction.ErinafactionMod;

@ErinafactionModElements.ModElement.Tag
public class LvlProcedureProcedure extends ErinafactionModElements.ModElement {
	public LvlProcedureProcedure(ErinafactionModElements instance) {
		super(instance, 18);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency entity for procedure LvlProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A76===== \u00A7cERINA FACTION \u00A7aLVL \u00A76====="), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity)
					.sendStatusMessage(new StringTextComponent((("\u00A7eVous \u00EAtes niveau \u00A7b") + ""
							+ ((new java.text.DecimalFormat("##").format(((entity
									.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ErinafactionModVariables.PlayerVariables())).Lvl))))
							+ "" + (" \u00A7aEt votre XP est de \u00A72") + ""
							+ ((new java.text.DecimalFormat("##")
									.format(((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new ErinafactionModVariables.PlayerVariables())).xp))))
							+ "" + (" \u00A7a( \u00A72") + ""
							+ ((new java.text.DecimalFormat("##")
									.format(((((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new ErinafactionModVariables.PlayerVariables())).xp) * 100) / 10000))))
							+ "" + (" % \u00A7a)"))), (false));
		}
	}
}
