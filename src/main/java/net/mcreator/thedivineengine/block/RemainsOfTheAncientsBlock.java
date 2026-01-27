package net.mcreator.thedivineengine.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class RemainsOfTheAncientsBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public RemainsOfTheAncientsBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(5, 0, 1, 10, 3, 5), box(4, 0, 6, 11, 1, 7), box(2, 0, 7, 3, 1, 14), box(13, 0, 2, 14, 1, 9), box(10, 1, 6, 11, 3, 7), box(4, 1, 6, 5, 3, 7), box(4, 1, 8, 5, 3, 9), box(4, 0, 8, 11, 1, 9), box(10, 1, 8, 11, 3, 9),
					box(4, 1, 10, 5, 3, 11), box(4, 0, 10, 11, 1, 11), box(10, 1, 10, 11, 3, 11));
			case NORTH -> Shapes.or(box(6, 0, 11, 11, 3, 15), box(5, 0, 9, 12, 1, 10), box(13, 0, 2, 14, 1, 9), box(2, 0, 7, 3, 1, 14), box(5, 1, 9, 6, 3, 10), box(11, 1, 9, 12, 3, 10), box(11, 1, 7, 12, 3, 8), box(5, 0, 7, 12, 1, 8),
					box(5, 1, 7, 6, 3, 8), box(11, 1, 5, 12, 3, 6), box(5, 0, 5, 12, 1, 6), box(5, 1, 5, 6, 3, 6));
			case EAST -> Shapes.or(box(1, 0, 6, 5, 3, 11), box(6, 0, 5, 7, 1, 12), box(7, 0, 13, 14, 1, 14), box(2, 0, 2, 9, 1, 3), box(6, 1, 5, 7, 3, 6), box(6, 1, 11, 7, 3, 12), box(8, 1, 11, 9, 3, 12), box(8, 0, 5, 9, 1, 12),
					box(8, 1, 5, 9, 3, 6), box(10, 1, 11, 11, 3, 12), box(10, 0, 5, 11, 1, 12), box(10, 1, 5, 11, 3, 6));
			case WEST -> Shapes.or(box(11, 0, 5, 15, 3, 10), box(9, 0, 4, 10, 1, 11), box(2, 0, 2, 9, 1, 3), box(7, 0, 13, 14, 1, 14), box(9, 1, 10, 10, 3, 11), box(9, 1, 4, 10, 3, 5), box(7, 1, 4, 8, 3, 5), box(7, 0, 4, 8, 1, 11),
					box(7, 1, 10, 8, 3, 11), box(5, 1, 4, 6, 3, 5), box(5, 0, 4, 6, 1, 11), box(5, 1, 10, 6, 3, 11));
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
}