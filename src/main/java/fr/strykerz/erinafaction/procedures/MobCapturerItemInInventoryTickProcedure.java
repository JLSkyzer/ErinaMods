package fr.strykerz.erinafaction.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;

import java.util.Map;

import fr.strykerz.erinafaction.item.MobCapturerItem;
import fr.strykerz.erinafaction.ErinafactionModElements;
import fr.strykerz.erinafaction.ErinafactionMod;

@ErinafactionModElements.ModElement.Tag
public class MobCapturerItemInInventoryTickProcedure extends ErinafactionModElements.ModElement {
	public MobCapturerItemInInventoryTickProcedure(ErinafactionModElements instance) {
		super(instance, 69);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency itemstack for procedure MobCapturerItemInInventoryTick!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).setDisplayName(new StringTextComponent((((new ItemStack(MobCapturerItem.block, (int) (1)).getDisplayName().getString())) + ""
				+ (" \u00A7e\u00A7l") + "" + (((itemstack).getOrCreateTag().getString("mob"))))));
	}
}
