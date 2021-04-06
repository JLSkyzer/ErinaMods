
package fr.strykerz.erinafaction.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import fr.strykerz.erinafaction.itemgroup.BloodesiumTabItemGroup;
import fr.strykerz.erinafaction.ErinafactionModElements;

@ErinafactionModElements.ModElement.Tag
public class BloodesiumIngotItem extends ErinafactionModElements.ModElement {
	@ObjectHolder("erinafaction:bloodesium_ingot")
	public static final Item block = null;
	public BloodesiumIngotItem(ErinafactionModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BloodesiumTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bloodesium_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
