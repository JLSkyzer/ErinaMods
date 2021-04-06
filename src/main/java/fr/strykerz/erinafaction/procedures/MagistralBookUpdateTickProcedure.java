package fr.strykerz.erinafaction.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;

import java.util.Map;

import fr.strykerz.erinafaction.ErinafactionModElements;
import fr.strykerz.erinafaction.ErinafactionMod;

@ErinafactionModElements.ModElement.Tag
public class MagistralBookUpdateTickProcedure extends ErinafactionModElements.ModElement {
	public MagistralBookUpdateTickProcedure(ErinafactionModElements instance) {
		super(instance, 98);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency itemstack for procedure MagistralBookUpdateTick!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).setDisplayName(new StringTextComponent(
				(("\u00A71\u00A7l") + "" + (((itemstack).getOrCreateTag().getString("spell"))) + "" + (" \u00A7f| \u00A7eMagistral Book"))));
	}
}
