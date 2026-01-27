package net.mcreator.thedivineengine.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.thedivineengine.procedures.HarvestedhempPriZaviershieniiIspolzovaniiaProcedure;

public class HarvestedhempItem extends Item {
	public HarvestedhempItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		HarvestedhempPriZaviershieniiIspolzovaniiaProcedure.execute(entity);
		return retval;
	}
}