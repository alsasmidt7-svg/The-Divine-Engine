/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedivineengine.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.thedivineengine.block.*;
import net.mcreator.thedivineengine.TheDivineEngineMod;

public class TheDivineEngineModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TheDivineEngineMod.MODID);
	public static final DeferredBlock<Block> INDUSTRIALFURNANCE;
	public static final DeferredBlock<Block> STEELBLOCK;
	public static final DeferredBlock<Block> STEELPLATEBLOCK;
	public static final DeferredBlock<Block> IRONPLATEBLOCK;
	public static final DeferredBlock<Block> CRUSHER;
	public static final DeferredBlock<Block> ALUMINIUMORE;
	public static final DeferredBlock<Block> ALUMINIUMBLOCK;
	public static final DeferredBlock<Block> ALUMINIUMPLATEBLOCK;
	public static final DeferredBlock<Block> PLANTSHREDDER;
	public static final DeferredBlock<Block> MAGNETITEORE;
	public static final DeferredBlock<Block> ELCTRIC_GENERATOR;
	public static final DeferredBlock<Block> TITANIUMORE;
	public static final DeferredBlock<Block> TITANIUMBLOCK;
	public static final DeferredBlock<Block> THEBASISOFAMECHANICALMACHINE;
	public static final DeferredBlock<Block> BASISTIER_2;
	public static final DeferredBlock<Block> HEMP;
	public static final DeferredBlock<Block> COPPER_WIRE_BLOCK;
	public static final DeferredBlock<Block> COPPER_WIRE_N;
	public static final DeferredBlock<Block> COPPER_WIRE_BLOCK_13452;
	public static final DeferredBlock<Block> ANCIENT_BASIS;
	public static final DeferredBlock<Block> REMAINS_OF_THE_ANCIENTS;
	public static final DeferredBlock<Block> CUTTING_BOARD;
	public static final DeferredBlock<Block> TABLE;
	public static final DeferredBlock<Block> SHEETANDINK;
	public static final DeferredBlock<Block> CHAIR;
	public static final DeferredBlock<Block> FURNITURE_CRAFTING_TABLE;
	static {
		INDUSTRIALFURNANCE = REGISTRY.register("industrialfurnance", IndustrialfurnanceBlock::new);
		STEELBLOCK = REGISTRY.register("steelblock", SteelblockBlock::new);
		STEELPLATEBLOCK = REGISTRY.register("steelplateblock", SteelplateblockBlock::new);
		IRONPLATEBLOCK = REGISTRY.register("ironplateblock", IronplateblockBlock::new);
		CRUSHER = REGISTRY.register("crusher", CrusherBlock::new);
		ALUMINIUMORE = REGISTRY.register("aluminiumore", AluminiumoreBlock::new);
		ALUMINIUMBLOCK = REGISTRY.register("aluminiumblock", AluminiumblockBlock::new);
		ALUMINIUMPLATEBLOCK = REGISTRY.register("aluminiumplateblock", AluminiumplateblockBlock::new);
		PLANTSHREDDER = REGISTRY.register("plantshredder", PlantshredderBlock::new);
		MAGNETITEORE = REGISTRY.register("magnetiteore", MagnetiteoreBlock::new);
		ELCTRIC_GENERATOR = REGISTRY.register("elctric_generator", ElctricGeneratorBlock::new);
		TITANIUMORE = REGISTRY.register("titaniumore", TitaniumoreBlock::new);
		TITANIUMBLOCK = REGISTRY.register("titaniumblock", TitaniumblockBlock::new);
		THEBASISOFAMECHANICALMACHINE = REGISTRY.register("thebasisofamechanicalmachine", ThebasisofamechanicalmachineBlock::new);
		BASISTIER_2 = REGISTRY.register("basistier_2", Basistier2Block::new);
		HEMP = REGISTRY.register("hemp", HempBlock::new);
		COPPER_WIRE_BLOCK = REGISTRY.register("copper_wire_block", CopperWireBlockBlock::new);
		COPPER_WIRE_N = REGISTRY.register("copper_wire_n", CopperWireNBlock::new);
		COPPER_WIRE_BLOCK_13452 = REGISTRY.register("copper_wire_block_13452", CopperWireBlock13452Block::new);
		ANCIENT_BASIS = REGISTRY.register("ancient_basis", AncientBasisBlock::new);
		REMAINS_OF_THE_ANCIENTS = REGISTRY.register("remains_of_the_ancients", RemainsOfTheAncientsBlock::new);
		CUTTING_BOARD = REGISTRY.register("cutting_board", CuttingBoardBlock::new);
		TABLE = REGISTRY.register("table", TableBlock::new);
		SHEETANDINK = REGISTRY.register("sheetandink", SheetandinkBlock::new);
		CHAIR = REGISTRY.register("chair", ChairBlock::new);
		FURNITURE_CRAFTING_TABLE = REGISTRY.register("furniture_crafting_table", FurnitureCraftingTableBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}