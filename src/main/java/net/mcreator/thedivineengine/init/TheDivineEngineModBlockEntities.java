/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedivineengine.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.thedivineengine.block.entity.*;
import net.mcreator.thedivineengine.TheDivineEngineMod;

@EventBusSubscriber
public class TheDivineEngineModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, TheDivineEngineMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CrusherBlockEntity>> CRUSHER = register("crusher", TheDivineEngineModBlocks.CRUSHER, CrusherBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PlantshredderBlockEntity>> PLANTSHREDDER = register("plantshredder", TheDivineEngineModBlocks.PLANTSHREDDER, PlantshredderBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ElctricGeneratorBlockEntity>> ELCTRIC_GENERATOR = register("elctric_generator", TheDivineEngineModBlocks.ELCTRIC_GENERATOR, ElctricGeneratorBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CopperWireBlockBlockEntity>> COPPER_WIRE_BLOCK = register("copper_wire_block", TheDivineEngineModBlocks.COPPER_WIRE_BLOCK, CopperWireBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CopperWireNBlockEntity>> COPPER_WIRE_N = register("copper_wire_n", TheDivineEngineModBlocks.COPPER_WIRE_N, CopperWireNBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CopperWireBlock13452BlockEntity>> COPPER_WIRE_BLOCK_13452 = register("copper_wire_block_13452", TheDivineEngineModBlocks.COPPER_WIRE_BLOCK_13452,
			CopperWireBlock13452BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FurnitureCraftingTableBlockEntity>> FURNITURE_CRAFTING_TABLE = register("furniture_crafting_table", TheDivineEngineModBlocks.FURNITURE_CRAFTING_TABLE,
			FurnitureCraftingTableBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CRUSHER.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PLANTSHREDDER.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ELCTRIC_GENERATOR.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, ELCTRIC_GENERATOR.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COPPER_WIRE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, COPPER_WIRE_BLOCK.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COPPER_WIRE_N.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, COPPER_WIRE_N.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COPPER_WIRE_BLOCK_13452.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, COPPER_WIRE_BLOCK_13452.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FURNITURE_CRAFTING_TABLE.get(), SidedInvWrapper::new);
	}
}