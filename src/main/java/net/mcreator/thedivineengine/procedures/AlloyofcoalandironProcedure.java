package net.mcreator.thedivineengine.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.thedivineengine.init.TheDivineEngineModMenus;
import net.mcreator.thedivineengine.init.TheDivineEngineModItems;
import net.mcreator.thedivineengine.TheDivineEngineMod;

public class AlloyofcoalandironProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FIRE || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.CAMPFIRE) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.RAW_IRON
					&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.COAL) {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(0).remove(1);
					_menu.getSlots().get(1).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				TheDivineEngineMod.queueServerWork(100, () -> {
					if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
						ItemStack _setstack12 = new ItemStack(TheDivineEngineModItems.STEEL_INGOT.get()).copy();
						_setstack12.setCount(1);
						_menu.getSlots().get(2).set(_setstack12);
						_player.containerMenu.broadcastChanges();
					}
				});
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.RAW_IRON
					&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu16 ? _menu16.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.COAL) {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(0).remove(1);
					_menu.getSlots().get(1).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				TheDivineEngineMod.queueServerWork(100, () -> {
					if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
						ItemStack _setstack20 = new ItemStack(TheDivineEngineModItems.STEEL_INGOT.get()).copy();
						_setstack20.setCount(1);
						_menu.getSlots().get(2).set(_setstack20);
						_player.containerMenu.broadcastChanges();
					}
				});
			}
		}
	}
}