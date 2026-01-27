/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedivineengine.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.thedivineengine.TheDivineEngineMod;

@EventBusSubscriber
public class TheDivineEngineModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheDivineEngineMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THE_DIVINE_ENGINE = REGISTRY.register("the_divine_engine",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_divine_engine.the_divine_engine")).icon(() -> new ItemStack(TheDivineEngineModItems.STEEL_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheDivineEngineModBlocks.INDUSTRIALFURNANCE.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.CRUSHER.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.PLANTSHREDDER.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.ELCTRIC_GENERATOR.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.IRONPLATEBLOCK.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.STEELPLATEBLOCK.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.ALUMINIUMPLATEBLOCK.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.STEELBLOCK.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.ALUMINIUMBLOCK.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.TITANIUMBLOCK.get().asItem());
				tabData.accept(TheDivineEngineModItems.STEEL_INGOT.get());
				tabData.accept(TheDivineEngineModBlocks.MAGNETITEORE.get().asItem());
				tabData.accept(TheDivineEngineModItems.MAGNETITERAWORE.get());
				tabData.accept(TheDivineEngineModBlocks.ALUMINIUMORE.get().asItem());
				tabData.accept(TheDivineEngineModItems.ALUMINIUMRAWORE.get());
				tabData.accept(TheDivineEngineModItems.ALUMINIUMINGOT.get());
				tabData.accept(TheDivineEngineModBlocks.TITANIUMORE.get().asItem());
				tabData.accept(TheDivineEngineModItems.TITANIUMRAWORE.get());
				tabData.accept(TheDivineEngineModItems.TITANIUMINGOT.get());
				tabData.accept(TheDivineEngineModItems.ELECTRUMINGOT.get());
				tabData.accept(TheDivineEngineModItems.IRONHAMMER.get());
				tabData.accept(TheDivineEngineModItems.STEELHAMMER.get());
				tabData.accept(TheDivineEngineModItems.IRONPLATE.get());
				tabData.accept(TheDivineEngineModItems.STEELPLATE.get());
				tabData.accept(TheDivineEngineModItems.COPPERPLATE.get());
				tabData.accept(TheDivineEngineModItems.ALUMINIUMPLATE.get());
				tabData.accept(TheDivineEngineModItems.ELECTRUMPLATE.get());
				tabData.accept(TheDivineEngineModItems.TITAMIUMPLATE.get());
				tabData.accept(TheDivineEngineModItems.IRONDUST.get());
				tabData.accept(TheDivineEngineModItems.GOLDDUST.get());
				tabData.accept(TheDivineEngineModItems.COPPERDUST.get());
				tabData.accept(TheDivineEngineModItems.ALUMINIUMDUST.get());
				tabData.accept(TheDivineEngineModItems.ELECTRUMDUST.get());
				tabData.accept(TheDivineEngineModItems.COPPERWIRE.get());
				tabData.accept(TheDivineEngineModItems.INSULATEDCOPPERWIRE.get());
				tabData.accept(TheDivineEngineModItems.ELECTRUMWIRE.get());
				tabData.accept(TheDivineEngineModItems.INSULATED_ELECTRUM_WIRE.get());
				tabData.accept(TheDivineEngineModItems.SILICON.get());
				tabData.accept(TheDivineEngineModItems.COPPERCOIL.get());
				tabData.accept(TheDivineEngineModItems.INSULATINGTAPE.get());
				tabData.accept(TheDivineEngineModItems.SILICONWAFER.get());
				tabData.accept(TheDivineEngineModItems.CHIP.get());
				tabData.accept(TheDivineEngineModItems.DIAMONDCRUSHERWHEELS.get());
				tabData.accept(TheDivineEngineModItems.PLANTFIBER.get());
				tabData.accept(TheDivineEngineModItems.SHREDDERBLADES.get());
				tabData.accept(TheDivineEngineModItems.STEELGEARS.get());
				tabData.accept(TheDivineEngineModItems.STEELWIPE.get());
				tabData.accept(TheDivineEngineModItems.MECHANICALPARTS.get());
				tabData.accept(TheDivineEngineModItems.WHEEL_FOR_HAND_DYNAMO.get());
				tabData.accept(TheDivineEngineModItems.ROTOR.get());
				tabData.accept(TheDivineEngineModItems.PROCESSEDMAGNETITE.get());
				tabData.accept(TheDivineEngineModItems.MOTOR.get());
				tabData.accept(TheDivineEngineModBlocks.THEBASISOFAMECHANICALMACHINE.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.BASISTIER_2.get().asItem());
				tabData.accept(TheDivineEngineModItems.BACKPACK.get());
				tabData.accept(TheDivineEngineModItems.BACKPACKTIER_2.get());
				tabData.accept(TheDivineEngineModItems.STEELSWORD.get());
				tabData.accept(TheDivineEngineModItems.STEELAXE.get());
				tabData.accept(TheDivineEngineModItems.STEELSHOVEL.get());
				tabData.accept(TheDivineEngineModItems.STEEL_PICKAXE.get());
				tabData.accept(TheDivineEngineModItems.STEELHOE.get());
				tabData.accept(TheDivineEngineModItems.COPPERSWORD.get());
				tabData.accept(TheDivineEngineModItems.COPPERAXE.get());
				tabData.accept(TheDivineEngineModItems.COPPERSHOVEL.get());
				tabData.accept(TheDivineEngineModItems.COPPERPICKAXE.get());
				tabData.accept(TheDivineEngineModItems.COPPERHOE.get());
				tabData.accept(TheDivineEngineModItems.ALUMINIUM_SWORD.get());
				tabData.accept(TheDivineEngineModItems.ALUMINIUMAXE.get());
				tabData.accept(TheDivineEngineModItems.ALUMINIUM_PICKAXE.get());
				tabData.accept(TheDivineEngineModItems.ALUMINIUM_SHOVEL.get());
				tabData.accept(TheDivineEngineModItems.ALUMINIUM_HOE.get());
				tabData.accept(TheDivineEngineModItems.TITANIUM_SWORD.get());
				tabData.accept(TheDivineEngineModItems.TITANIUM_AXE.get());
				tabData.accept(TheDivineEngineModItems.TITANIUM_SHOVEL.get());
				tabData.accept(TheDivineEngineModItems.TITANIUM_PICKAXE.get());
				tabData.accept(TheDivineEngineModItems.TITANIUM_HOE.get());
				tabData.accept(TheDivineEngineModItems.THE_DIVINE_ENGINE_ITEM.get());
				tabData.accept(TheDivineEngineModItems.STEEL_ARMOR_HELMET.get());
				tabData.accept(TheDivineEngineModItems.STEEL_ARMOR_CHESTPLATE.get());
				tabData.accept(TheDivineEngineModItems.STEEL_ARMOR_LEGGINGS.get());
				tabData.accept(TheDivineEngineModItems.STEEL_ARMOR_BOOTS.get());
				tabData.accept(TheDivineEngineModItems.COPPERARMOR_HELMET.get());
				tabData.accept(TheDivineEngineModItems.COPPERARMOR_CHESTPLATE.get());
				tabData.accept(TheDivineEngineModItems.COPPERARMOR_LEGGINGS.get());
				tabData.accept(TheDivineEngineModItems.COPPERARMOR_BOOTS.get());
				tabData.accept(TheDivineEngineModItems.ALUMINIUM_ARMOR_HELMET.get());
				tabData.accept(TheDivineEngineModItems.ALUMINIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(TheDivineEngineModItems.ALUMINIUM_ARMOR_LEGGINGS.get());
				tabData.accept(TheDivineEngineModItems.ALUMINIUM_ARMOR_BOOTS.get());
				tabData.accept(TheDivineEngineModItems.TITANIUM_ARMOR_HELMET.get());
				tabData.accept(TheDivineEngineModItems.TITANIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(TheDivineEngineModItems.TITANIUM_ARMOR_LEGGINGS.get());
				tabData.accept(TheDivineEngineModItems.TITANIUM_ARMOR_BOOTS.get());
				tabData.accept(TheDivineEngineModBlocks.HEMP.get().asItem());
				tabData.accept(TheDivineEngineModItems.HARVESTEDHEMP.get());
				tabData.accept(TheDivineEngineModBlocks.ANCIENT_BASIS.get().asItem());
				tabData.accept(TheDivineEngineModItems.ANCIENT_RECIPE.get());
				tabData.accept(TheDivineEngineModItems.PIECE_OF_QN_QNCIENT_RECIPE.get());
				tabData.accept(TheDivineEngineModBlocks.FURNITURE_CRAFTING_TABLE.get().asItem());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FUTNITURE_TAB = REGISTRY.register("futniture_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_divine_engine.futniture_tab")).icon(() -> new ItemStack(TheDivineEngineModBlocks.TABLE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheDivineEngineModBlocks.ANCIENT_BASIS.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.REMAINS_OF_THE_ANCIENTS.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.CUTTING_BOARD.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.TABLE.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.SHEETANDINK.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.CHAIR.get().asItem());
				tabData.accept(TheDivineEngineModBlocks.FURNITURE_CRAFTING_TABLE.get().asItem());
			}).withTabsBefore(THE_DIVINE_ENGINE.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TheDivineEngineModBlocks.HEMP.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TheDivineEngineModItems.COPPERAXE.get());
			tabData.accept(TheDivineEngineModItems.COPPERSHOVEL.get());
			tabData.accept(TheDivineEngineModItems.COPPERPICKAXE.get());
			tabData.accept(TheDivineEngineModItems.COPPERHOE.get());
			tabData.accept(TheDivineEngineModItems.STEELAXE.get());
			tabData.accept(TheDivineEngineModItems.STEELSHOVEL.get());
			tabData.accept(TheDivineEngineModItems.STEEL_PICKAXE.get());
			tabData.accept(TheDivineEngineModItems.STEELHOE.get());
			tabData.accept(TheDivineEngineModItems.ALUMINIUMAXE.get());
			tabData.accept(TheDivineEngineModItems.ALUMINIUM_SHOVEL.get());
			tabData.accept(TheDivineEngineModItems.ALUMINIUM_PICKAXE.get());
			tabData.accept(TheDivineEngineModItems.ALUMINIUM_HOE.get());
			tabData.accept(TheDivineEngineModItems.TITANIUM_AXE.get());
			tabData.accept(TheDivineEngineModItems.TITANIUM_SHOVEL.get());
			tabData.accept(TheDivineEngineModItems.TITANIUM_PICKAXE.get());
			tabData.accept(TheDivineEngineModItems.TITANIUM_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TheDivineEngineModItems.STEELSWORD.get());
			tabData.accept(TheDivineEngineModItems.COPPERSWORD.get());
			tabData.accept(TheDivineEngineModItems.ALUMINIUM_SWORD.get());
			tabData.accept(TheDivineEngineModItems.TITANIUM_SWORD.get());
			tabData.accept(TheDivineEngineModItems.STEEL_ARMOR_HELMET.get());
			tabData.accept(TheDivineEngineModItems.STEEL_ARMOR_CHESTPLATE.get());
			tabData.accept(TheDivineEngineModItems.STEEL_ARMOR_LEGGINGS.get());
			tabData.accept(TheDivineEngineModItems.STEEL_ARMOR_BOOTS.get());
			tabData.accept(TheDivineEngineModItems.COPPERARMOR_HELMET.get());
			tabData.accept(TheDivineEngineModItems.COPPERARMOR_CHESTPLATE.get());
			tabData.accept(TheDivineEngineModItems.COPPERARMOR_LEGGINGS.get());
			tabData.accept(TheDivineEngineModItems.COPPERARMOR_BOOTS.get());
			tabData.accept(TheDivineEngineModItems.ALUMINIUM_ARMOR_HELMET.get());
			tabData.accept(TheDivineEngineModItems.ALUMINIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(TheDivineEngineModItems.ALUMINIUM_ARMOR_LEGGINGS.get());
			tabData.accept(TheDivineEngineModItems.ALUMINIUM_ARMOR_BOOTS.get());
			tabData.accept(TheDivineEngineModItems.TITANIUM_ARMOR_HELMET.get());
			tabData.accept(TheDivineEngineModItems.TITANIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(TheDivineEngineModItems.TITANIUM_ARMOR_LEGGINGS.get());
			tabData.accept(TheDivineEngineModItems.TITANIUM_ARMOR_BOOTS.get());
		}
	}
}