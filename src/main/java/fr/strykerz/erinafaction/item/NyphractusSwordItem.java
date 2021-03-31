
package fr.strykerz.erinafaction.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import fr.strykerz.erinafaction.itemgroup.NyphractusTabItemGroup;
import fr.strykerz.erinafaction.ErinafactionModElements;

@ErinafactionModElements.ModElement.Tag
public class NyphractusSwordItem extends ErinafactionModElements.ModElement {
	@ObjectHolder("erinafaction:nyphractus_sword")
	public static final Item block = null;
	public NyphractusSwordItem(ErinafactionModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 850;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 96f, new Item.Properties().group(NyphractusTabItemGroup.tab)) {
		}.setRegistryName("nyphractus_sword"));
	}
}
