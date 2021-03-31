
package fr.strykerz.erinafaction.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import fr.strykerz.erinafaction.itemgroup.NyphractusTabItemGroup;
import fr.strykerz.erinafaction.ErinafactionModElements;

@ErinafactionModElements.ModElement.Tag
public class NyphractusPickaxeItem extends ErinafactionModElements.ModElement {
	@ObjectHolder("erinafaction:nyphractus_pickaxe")
	public static final Item block = null;
	public NyphractusPickaxeItem(ErinafactionModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1500;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(NyphractusTabItemGroup.tab)) {
		}.setRegistryName("nyphractus_pickaxe"));
	}
}
