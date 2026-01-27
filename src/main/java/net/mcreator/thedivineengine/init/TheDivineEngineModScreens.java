/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedivineengine.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.thedivineengine.client.gui.*;

@EventBusSubscriber(Dist.CLIENT)
public class TheDivineEngineModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(TheDivineEngineModMenus.INDUCTIONFURNANCEINRERFACE.get(), InductionfurnanceinrerfaceScreen::new);
		event.register(TheDivineEngineModMenus.CRUSHERINTERFACE.get(), CrusherinterfaceScreen::new);
		event.register(TheDivineEngineModMenus.BACKPACKINTERFACE.get(), BackpackinterfaceScreen::new);
		event.register(TheDivineEngineModMenus.PLANTSHREDDERINTERFACE.get(), PlantshredderinterfaceScreen::new);
		event.register(TheDivineEngineModMenus.HANDDYNAMOINTERFACE.get(), HanddynamointerfaceScreen::new);
		event.register(TheDivineEngineModMenus.BACKPACKTIER_2INTERFACE.get(), Backpacktier2interfaceScreen::new);
		event.register(TheDivineEngineModMenus.INK_AND_SHEET_INTERFACE.get(), InkAndSheetInterfaceScreen::new);
		event.register(TheDivineEngineModMenus.FURNITURE_CRAFTING_TABLE_INTERFACE.get(), FurnitureCraftingTableInterfaceScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}