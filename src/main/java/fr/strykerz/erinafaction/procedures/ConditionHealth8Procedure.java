package fr.strykerz.erinafaction.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import fr.strykerz.erinafaction.ErinafactionModElements;
import fr.strykerz.erinafaction.ErinafactionMod;

@ErinafactionModElements.ModElement.Tag
public class ConditionHealth8Procedure extends ErinafactionModElements.ModElement {
	public ConditionHealth8Procedure(ErinafactionModElements instance) {
		super(instance, 48);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency entity for procedure ConditionHealth8!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) == 15)
				|| (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) == 16));
	}
}
