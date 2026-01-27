package net.mcreator.thedivineengine.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.thedivineengine.procedures.ReadingSheetAndInkProcedureProcedure;

public class SheetandinkBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public SheetandinkBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(2, 0, 3, 9, 1, 14), box(11, 0, 8, 15, 1, 12), box(11, 1, 8, 12, 3, 12), box(14, 1, 8, 15, 3, 12), box(12, 1, 11, 14, 3, 12), box(12, 1, 8, 14, 3, 9), box(13, 1, 9, 14, 5, 10), box(13, 5, 9, 15, 10, 10));
			case NORTH -> Shapes.or(box(7, 0, 2, 14, 1, 13), box(1, 0, 4, 5, 1, 8), box(4, 1, 4, 5, 3, 8), box(1, 1, 4, 2, 3, 8), box(2, 1, 4, 4, 3, 5), box(2, 1, 7, 4, 3, 8), box(2, 1, 6, 3, 5, 7), box(1, 5, 6, 3, 10, 7));
			case EAST -> Shapes.or(box(3, 0, 7, 14, 1, 14), box(8, 0, 1, 12, 1, 5), box(8, 1, 4, 12, 3, 5), box(8, 1, 1, 12, 3, 2), box(11, 1, 2, 12, 3, 4), box(8, 1, 2, 9, 3, 4), box(9, 1, 2, 10, 5, 3), box(9, 5, 1, 10, 10, 3));
			case WEST -> Shapes.or(box(2, 0, 2, 13, 1, 9), box(4, 0, 11, 8, 1, 15), box(4, 1, 11, 8, 3, 12), box(4, 1, 14, 8, 3, 15), box(4, 1, 12, 5, 3, 14), box(7, 1, 12, 8, 3, 14), box(6, 1, 13, 7, 5, 14), box(6, 5, 13, 7, 10, 15));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		ReadingSheetAndInkProcedureProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}