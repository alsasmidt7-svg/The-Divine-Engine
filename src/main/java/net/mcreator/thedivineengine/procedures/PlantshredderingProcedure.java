package net.mcreator.thedivineengine.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.thedivineengine.init.TheDivineEngineModMenus;
import net.mcreator.thedivineengine.init.TheDivineEngineModItems;
import net.mcreator.thedivineengine.TheDivineEngineMod;

public class PlantshredderingProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.KELP.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			TheDivineEngineMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					ItemStack _setstack3 = new ItemStack(TheDivineEngineModItems.PLANTFIBER.get()).copy();
					_setstack3.setCount(2);
					_menu.getSlots().get(1).set(_setstack3);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu5 ? _menu5.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.SUGAR_CANE.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			TheDivineEngineMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					ItemStack _setstack8 = new ItemStack(TheDivineEngineModItems.PLANTFIBER.get()).copy();
					_setstack8.setCount(3);
					_menu.getSlots().get(1).set(_setstack8);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.SHORT_GRASS.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			TheDivineEngineMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					ItemStack _setstack13 = new ItemStack(TheDivineEngineModItems.PLANTFIBER.get()).copy();
					_setstack13.setCount(1);
					_menu.getSlots().get(1).set(_setstack13);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu15 ? _menu15.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.TALL_GRASS.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			TheDivineEngineMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					ItemStack _setstack18 = new ItemStack(TheDivineEngineModItems.PLANTFIBER.get()).copy();
					_setstack18.setCount(2);
					_menu.getSlots().get(1).set(_setstack18);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu20 ? _menu20.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.SEAGRASS.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			TheDivineEngineMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					ItemStack _setstack23 = new ItemStack(TheDivineEngineModItems.PLANTFIBER.get()).copy();
					_setstack23.setCount(1);
					_menu.getSlots().get(1).set(_setstack23);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu25 ? _menu25.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.FERN.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			TheDivineEngineMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					ItemStack _setstack28 = new ItemStack(TheDivineEngineModItems.PLANTFIBER.get()).copy();
					_setstack28.setCount(1);
					_menu.getSlots().get(1).set(_setstack28);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu30 ? _menu30.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.LARGE_FERN.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			TheDivineEngineMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					ItemStack _setstack33 = new ItemStack(TheDivineEngineModItems.PLANTFIBER.get()).copy();
					_setstack33.setCount(2);
					_menu.getSlots().get(1).set(_setstack33);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu35 ? _menu35.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == TheDivineEngineModItems.HARVESTEDHEMP
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			TheDivineEngineMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					ItemStack _setstack38 = new ItemStack(TheDivineEngineModItems.PLANTFIBER.get()).copy();
					_setstack38.setCount(2);
					_menu.getSlots().get(1).set(_setstack38);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
	}
}