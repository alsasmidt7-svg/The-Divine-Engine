/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedivineengine.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.thedivineengine.world.inventory.*;
import net.mcreator.thedivineengine.network.MenuStateUpdateMessage;
import net.mcreator.thedivineengine.TheDivineEngineMod;

import java.util.Map;

public class TheDivineEngineModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, TheDivineEngineMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<InductionfurnanceinrerfaceMenu>> INDUCTIONFURNANCEINRERFACE = REGISTRY.register("inductionfurnanceinrerface", () -> IMenuTypeExtension.create(InductionfurnanceinrerfaceMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CrusherinterfaceMenu>> CRUSHERINTERFACE = REGISTRY.register("crusherinterface", () -> IMenuTypeExtension.create(CrusherinterfaceMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BackpackinterfaceMenu>> BACKPACKINTERFACE = REGISTRY.register("backpackinterface", () -> IMenuTypeExtension.create(BackpackinterfaceMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<PlantshredderinterfaceMenu>> PLANTSHREDDERINTERFACE = REGISTRY.register("plantshredderinterface", () -> IMenuTypeExtension.create(PlantshredderinterfaceMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<HanddynamointerfaceMenu>> HANDDYNAMOINTERFACE = REGISTRY.register("handdynamointerface", () -> IMenuTypeExtension.create(HanddynamointerfaceMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Backpacktier2interfaceMenu>> BACKPACKTIER_2INTERFACE = REGISTRY.register("backpacktier_2interface", () -> IMenuTypeExtension.create(Backpacktier2interfaceMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<InkAndSheetInterfaceMenu>> INK_AND_SHEET_INTERFACE = REGISTRY.register("ink_and_sheet_interface", () -> IMenuTypeExtension.create(InkAndSheetInterfaceMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FurnitureCraftingTableInterfaceMenu>> FURNITURE_CRAFTING_TABLE_INTERFACE = REGISTRY.register("furniture_crafting_table_interface",
			() -> IMenuTypeExtension.create(FurnitureCraftingTableInterfaceMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof TheDivineEngineModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				PacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}