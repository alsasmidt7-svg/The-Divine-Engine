package net.mcreator.thedivineengine.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.thedivineengine.init.TheDivineEngineModMenus;
import net.mcreator.thedivineengine.init.TheDivineEngineModItems;
import net.mcreator.thedivineengine.TheDivineEngineMod;

public class CrushingironProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.RAW_IRON) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			TheDivineEngineMod.queueServerWork(100, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					ItemStack _setstack3 = new ItemStack(TheDivineEngineModItems.IRONDUST.get()).copy();
					_setstack3.setCount(2);
					_menu.getSlots().get(1).set(_setstack3);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu5 ? _menu5.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.RAW_GOLD) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			TheDivineEngineMod.queueServerWork(100, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					ItemStack _setstack8 = new ItemStack(TheDivineEngineModItems.GOLDDUST.get()).copy();
					_setstack8.setCount(2);
					_menu.getSlots().get(1).set(_setstack8);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.RAW_COPPER) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			TheDivineEngineMod.queueServerWork(100, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					ItemStack _setstack13 = new ItemStack(TheDivineEngineModItems.COPPERDUST.get()).copy();
					_setstack13.setCount(2);
					_menu.getSlots().get(1).set(_setstack13);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu15 ? _menu15.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == TheDivineEngineModItems.ALUMINIUMRAWORE
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			TheDivineEngineMod.queueServerWork(100, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					ItemStack _setstack18 = new ItemStack(TheDivineEngineModItems.ALUMINIUMDUST.get()).copy();
					_setstack18.setCount(2);
					_menu.getSlots().get(1).set(_setstack18);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu20 ? _menu20.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == TheDivineEngineModItems.DIAMONDCRUSHERWHEELS.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu22 ? _menu22.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND) {
				if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(0).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				TheDivineEngineMod.queueServerWork(200, () -> {
					if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
						ItemStack _setstack25 = new ItemStack(Items.DIAMOND).copy();
						_setstack25.setCount(1);
						_menu.getSlots().get(1).set(_setstack25);
						_player.containerMenu.broadcastChanges();
					}
					if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
						if (entity instanceof Player _player && _player.containerMenu instanceof TheDivineEngineModMenus.MenuAccessor _menu) {
							ItemStack _setstack27 = new ItemStack(Items.DIAMOND).copy();
							_setstack27.setCount(2);
							_menu.getSlots().get(1).set(_setstack27);
							_player.containerMenu.broadcastChanges();
						}
					}
				});
			}
		}
	}
}