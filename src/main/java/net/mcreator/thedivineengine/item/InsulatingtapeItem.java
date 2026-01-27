package net.mcreator.thedivineengine.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class InsulatingtapeItem extends Item {
	public InsulatingtapeItem() {
		super(new Item.Properties().durability(5));
	}

	@Override
	public boolean hasCraftingRemainingItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}
}