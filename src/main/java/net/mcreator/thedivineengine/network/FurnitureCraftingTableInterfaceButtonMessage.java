package net.mcreator.thedivineengine.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.thedivineengine.procedures.FurnitureCraftinhTableProcedure3Procedure;
import net.mcreator.thedivineengine.procedures.FurnitureCraftinhTableProcedure2Procedure;
import net.mcreator.thedivineengine.procedures.FurnitureCraftinhTableProcedure1Procedure;
import net.mcreator.thedivineengine.TheDivineEngineMod;

@EventBusSubscriber
public record FurnitureCraftingTableInterfaceButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<FurnitureCraftingTableInterfaceButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(TheDivineEngineMod.MODID, "furniture_crafting_table_interface_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, FurnitureCraftingTableInterfaceButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, FurnitureCraftingTableInterfaceButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new FurnitureCraftingTableInterfaceButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<FurnitureCraftingTableInterfaceButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final FurnitureCraftingTableInterfaceButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			FurnitureCraftinhTableProcedure1Procedure.execute(entity);
		}
		if (buttonID == 1) {

			FurnitureCraftinhTableProcedure2Procedure.execute(entity);
		}
		if (buttonID == 2) {

			FurnitureCraftinhTableProcedure3Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TheDivineEngineMod.addNetworkMessage(FurnitureCraftingTableInterfaceButtonMessage.TYPE, FurnitureCraftingTableInterfaceButtonMessage.STREAM_CODEC, FurnitureCraftingTableInterfaceButtonMessage::handleData);
	}
}