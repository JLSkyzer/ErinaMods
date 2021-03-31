package fr.strykerz.erinafaction.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

import fr.strykerz.erinafaction.ErinafactionModVariables;
import fr.strykerz.erinafaction.ErinafactionModElements;
import fr.strykerz.erinafaction.ErinafactionMod;

@ErinafactionModElements.ModElement.Tag
public class UpgradeLvlProcedure extends ErinafactionModElements.ModElement {
	public UpgradeLvlProcedure(ErinafactionModElements instance) {
		super(instance, 16);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency entity for procedure UpgradeLvl!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ErinafactionModVariables.PlayerVariables())).xp) >= 10000)) {
			{
				double _setval = (double) 0;
				entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ErinafactionModVariables.PlayerVariables())).Lvl) + 1);
				entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Lvl = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(
						new StringTextComponent((("\u00A7c[\u00A74ERINA FACTION\u00A7c] \u00A7eGG, Vous \u00EAtes passer niveau \u00A7b") + ""
								+ ((new java.text.DecimalFormat("##")
										.format(((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ErinafactionModVariables.PlayerVariables())).Lvl)))))),
						(false));
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
