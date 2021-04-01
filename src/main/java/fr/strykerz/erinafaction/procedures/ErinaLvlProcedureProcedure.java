package fr.strykerz.erinafaction.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

import fr.strykerz.erinafaction.ErinafactionModVariables;
import fr.strykerz.erinafaction.ErinafactionModElements;
import fr.strykerz.erinafaction.ErinafactionMod;

@ErinafactionModElements.ModElement.Tag
public class ErinaLvlProcedureProcedure extends ErinafactionModElements.ModElement {
	public ErinaLvlProcedureProcedure(ErinafactionModElements instance) {
		super(instance, 20);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency entity for procedure ErinaLvlProcedure!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			if (!dependencies.containsKey("cmdparams"))
				ErinafactionMod.LOGGER.warn("Failed to load dependency cmdparams for procedure ErinaLvlProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		if (((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("help")) || (((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("")))) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A76===== \u00A7c\u00A7lErinaLvl Help \u00A7r\u00A76====="),
						(false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7a\u00A7lListe des commandes:"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity)
						.sendStatusMessage(new StringTextComponent("\u00A73- /erinalvl help \u00A7c(pour avoir la liste des commandes)"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A73- /erinalvl givexp \u00A7c(pour se give de l'xp)"),
						(false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A73- /erinalvl givelvl \u00A7c(pour se give du niveaux)"),
						(false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(
						new StringTextComponent("\u00A73 - /erinalvl setlvl \u00A7c(pour se mettre a un niveaux pr\u00E9cis)"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A73 - /erinalvl takexp \u00A7c(pour prendre de l'xp)"),
						(false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A73 - /erinalvl takelvl \u00A7c(pour prendre des niveaux)"),
						(false));
			}
		} else if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("givexp"))) {
			{
				double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ErinafactionModVariables.PlayerVariables())).xp) + new Object() {
							int convert(String s) {
								try {
									return Integer.parseInt(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert((new Object() {
							public String getText() {
								String param = (String) cmdparams.get("1");
								if (param != null) {
									return param;
								}
								return "";
							}
						}.getText())));
				entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7aDone !"), (false));
			}
		} else if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("givelvl"))) {
			{
				double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ErinafactionModVariables.PlayerVariables())).Lvl) + new Object() {
							int convert(String s) {
								try {
									return Integer.parseInt(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert((new Object() {
							public String getText() {
								String param = (String) cmdparams.get("1");
								if (param != null) {
									return param;
								}
								return "";
							}
						}.getText())));
				entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Lvl = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7aDone !"), (false));
			}
		} else if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("setlvl"))) {
			{
				double _setval = (double) new Object() {
					int convert(String s) {
						try {
							return Integer.parseInt(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((new Object() {
					public String getText() {
						String param = (String) cmdparams.get("1");
						if (param != null) {
							return param;
						}
						return "";
					}
				}.getText()));
				entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Lvl = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7aDone !"), (false));
			}
		} else if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("takexp"))) {
			{
				double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ErinafactionModVariables.PlayerVariables())).xp) - new Object() {
							int convert(String s) {
								try {
									return Integer.parseInt(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert((new Object() {
							public String getText() {
								String param = (String) cmdparams.get("1");
								if (param != null) {
									return param;
								}
								return "";
							}
						}.getText())));
				entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.xp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7aDone !"), (false));
			}
		} else if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("takelvl"))) {
			{
				double _setval = (double) (((entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ErinafactionModVariables.PlayerVariables())).Lvl) - new Object() {
							int convert(String s) {
								try {
									return Integer.parseInt(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert((new Object() {
							public String getText() {
								String param = (String) cmdparams.get("1");
								if (param != null) {
									return param;
								}
								return "";
							}
						}.getText())));
				entity.getCapability(ErinafactionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Lvl = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7aDone !"), (false));
			}
		}
	}
}
