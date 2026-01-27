package net.mcreator.thedivineengine.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.thedivineengine.init.TheDivineEngineModMenus;
import net.mcreator.thedivineengine.init.TheDivineEngineModBlocks;

public class FurnitureCraftinhTableProcedure2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_PLANKS.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(10);
				ItemStack _setstack3 = new ItemStack(TheDivineEngineModBlocks.CHAIR.get()).copy();
				_setstack3.setCount(1);
				_menu.getSlots().get(1).set(_setstack3);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}