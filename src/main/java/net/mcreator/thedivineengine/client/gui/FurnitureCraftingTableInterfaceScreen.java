package net.mcreator.thedivineengine.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.thedivineengine.world.inventory.FurnitureCraftingTableInterfaceMenu;
import net.mcreator.thedivineengine.network.FurnitureCraftingTableInterfaceButtonMessage;
import net.mcreator.thedivineengine.init.TheDivineEngineModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class FurnitureCraftingTableInterfaceScreen extends AbstractContainerScreen<FurnitureCraftingTableInterfaceMenu> implements TheDivineEngineModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_table_15_spruce_planks;
	private Button button_chair_10_spruce_planks;
	private Button button_cutting_board_5_spruce_planks;

	public FurnitureCraftingTableInterfaceScreen(FurnitureCraftingTableInterfaceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 204;
		this.imageHeight = 184;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("the_divine_engine:textures/screens/furniture_crafting_table_interface.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.the_divine_engine.furniture_crafting_table_interface.label_furniture_crafting_table"), 3, 3, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_table_15_spruce_planks = Button.builder(Component.translatable("gui.the_divine_engine.furniture_crafting_table_interface.button_table_15_spruce_planks"), e -> {
			int x = FurnitureCraftingTableInterfaceScreen.this.x;
			int y = FurnitureCraftingTableInterfaceScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new FurnitureCraftingTableInterfaceButtonMessage(0, x, y, z));
				FurnitureCraftingTableInterfaceButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 23, this.topPos + 12, 155, 20).build();
		this.addRenderableWidget(button_table_15_spruce_planks);
		button_chair_10_spruce_planks = Button.builder(Component.translatable("gui.the_divine_engine.furniture_crafting_table_interface.button_chair_10_spruce_planks"), e -> {
			int x = FurnitureCraftingTableInterfaceScreen.this.x;
			int y = FurnitureCraftingTableInterfaceScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new FurnitureCraftingTableInterfaceButtonMessage(1, x, y, z));
				FurnitureCraftingTableInterfaceButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 23, this.topPos + 33, 155, 20).build();
		this.addRenderableWidget(button_chair_10_spruce_planks);
		button_cutting_board_5_spruce_planks = Button.builder(Component.translatable("gui.the_divine_engine.furniture_crafting_table_interface.button_cutting_board_5_spruce_planks"), e -> {
			int x = FurnitureCraftingTableInterfaceScreen.this.x;
			int y = FurnitureCraftingTableInterfaceScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new FurnitureCraftingTableInterfaceButtonMessage(2, x, y, z));
				FurnitureCraftingTableInterfaceButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 54, 191, 20).build();
		this.addRenderableWidget(button_cutting_board_5_spruce_planks);
	}
}