package fr.strykerz.erinafaction.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import fr.strykerz.erinafaction.ErinafactionModElements;
import fr.strykerz.erinafaction.ErinafactionMod;

@ErinafactionModElements.ModElement.Tag
public class MobCapturerLivingEntityIsHitWithItemProcedure extends ErinafactionModElements.ModElement {
	public MobCapturerLivingEntityIsHitWithItemProcedure(ErinafactionModElements instance) {
		super(instance, 68);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency entity for procedure MobCapturerLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency sourceentity for procedure MobCapturerLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency itemstack for procedure MobCapturerLivingEntityIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((entity instanceof SkeletonEntity)) {
			if (!entity.world.isRemote())
				entity.remove();
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(
						new StringTextComponent(
								(("\u00A7aAdded \u00A76") + "" + ((entity.getDisplayName().getString())) + "" + (" \u00A7aOn the mob capturer"))),
						(false));
			}
			(itemstack).getOrCreateTag().putString("mob", "skeleton");
		} else if ((entity instanceof CreeperEntity)) {
			if (!entity.world.isRemote())
				entity.remove();
			if (sourceentity instanceof PlayerEntity && !sourceentity.world.isRemote()) {
				((PlayerEntity) sourceentity).sendStatusMessage(
						new StringTextComponent(
								(("\u00A7aAdded \u00A76") + "" + ((entity.getDisplayName().getString())) + "" + (" \u00A7aOn the mob capturer"))),
						(false));
			}
			(itemstack).getOrCreateTag().putString("mob", "creeper");
		}
	}
}
