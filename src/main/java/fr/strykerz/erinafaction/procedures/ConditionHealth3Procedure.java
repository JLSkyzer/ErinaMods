package fr.strykerz.erinafaction.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import fr.strykerz.erinafaction.ErinafactionModElements;
import fr.strykerz.erinafaction.ErinafactionMod;

@ErinafactionModElements.ModElement.Tag
public class ConditionHealth3Procedure extends ErinafactionModElements.ModElement {
	public ConditionHealth3Procedure(ErinafactionModElements instance) {
		super(instance, 34);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency entity for procedure ConditionHealth3!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) == 5)
				|| (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) == 6));
	}
}
