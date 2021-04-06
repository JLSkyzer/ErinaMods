
package fr.strykerz.erinafaction.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import fr.strykerz.erinafaction.itemgroup.NyphractusTabItemGroup;
import fr.strykerz.erinafaction.ErinafactionModElements;

@ErinafactionModElements.ModElement.Tag
public class NyphractusAxeItem extends ErinafactionModElements.ModElement {
	@ObjectHolder("erinafaction:nyphractus_axe")
	public static final Item block = null;
	public NyphractusAxeItem(ErinafactionModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NyphractusIngotItem.block, (int) (1)));
			}
		}, 1, 96f, new Item.Properties().group(NyphractusTabItemGroup.tab)) {
		}.setRegistryName("nyphractus_axe"));
	}
}
