package net.mcreator.thedivineengine.world.inventory;

import net.neoforged.neoforge.items.wrapper.InvWrapper;
import net.neoforged.neoforge.items.SlotItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.thedivineengine.init.TheDivineEngineModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class Backpacktier2interfaceMenu extends AbstractContainerMenu implements TheDivineEngineModMenus.MenuAccessor {
	public final Map<String, Object> menuState = new HashMap<>() {
		@Override
		public Object put(String key, Object value) {
			if (!this.containsKey(key) && this.size() >= 56)
				return null;
			return super.put(key, value);
		}
	};
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private ContainerLevelAccess access = ContainerLevelAccess.NULL;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;
	private Supplier<Boolean> boundItemMatcher = null;
	private Entity boundEntity = null;
	private BlockEntity boundBlockEntity = null;

	public Backpacktier2interfaceMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(TheDivineEngineModMenus.BACKPACKTIER_2INTERFACE.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level();
		this.internal = new ItemStackHandler(55);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
			access = ContainerLevelAccess.create(world, pos);
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack = hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem();
				this.boundItemMatcher = () -> itemstack == (hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem());
				IItemHandler cap = itemstack.getCapability(Capabilities.ItemHandler.ITEM);
				if (cap != null) {
					this.internal = cap;
					this.bound = true;
				}
			} else if (extraData.readableBytes() > 1) { // bound to entity
				extraData.readByte(); // drop padding
				boundEntity = world.getEntity(extraData.readVarInt());
				if (boundEntity != null) {
					IItemHandler cap = boundEntity.getCapability(Capabilities.ItemHandler.ENTITY);
					if (cap != null) {
						this.internal = cap;
						this.bound = true;
					}
				}
			} else { // might be bound to block
				boundBlockEntity = this.world.getBlockEntity(pos);
				if (boundBlockEntity instanceof BaseContainerBlockEntity baseContainerBlockEntity) {
					this.internal = new InvWrapper(baseContainerBlockEntity);
					this.bound = true;
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 24, 54) {
			private final int slot = 0;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 42, 54) {
			private final int slot = 1;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 78, 54) {
			private final int slot = 3;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 96, 54) {
			private final int slot = 4;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 114, 54) {
			private final int slot = 5;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 132, 54) {
			private final int slot = 6;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 24, 72) {
			private final int slot = 9;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 24, 90) {
			private final int slot = 18;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 42, 72) {
			private final int slot = 10;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 60, 72) {
			private final int slot = 11;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 78, 72) {
			private final int slot = 12;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 96, 72) {
			private final int slot = 13;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 114, 72) {
			private final int slot = 14;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 132, 72) {
			private final int slot = 15;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 150, 54) {
			private final int slot = 7;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 168, 54) {
			private final int slot = 8;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 150, 72) {
			private final int slot = 16;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 168, 72) {
			private final int slot = 17;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 42, 90) {
			private final int slot = 19;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 60, 90) {
			private final int slot = 20;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 78, 90) {
			private final int slot = 21;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 96, 90) {
			private final int slot = 22;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 114, 90) {
			private final int slot = 23;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 132, 90) {
			private final int slot = 24;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 150, 90) {
			private final int slot = 25;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 168, 90) {
			private final int slot = 26;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 24, 36) {
			private final int slot = 27;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 42, 36) {
			private final int slot = 28;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 60, 36) {
			private final int slot = 29;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 78, 36) {
			private final int slot = 30;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 96, 36) {
			private final int slot = 31;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 114, 36) {
			private final int slot = 32;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 132, 36) {
			private final int slot = 33;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 150, 36) {
			private final int slot = 34;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 168, 36) {
			private final int slot = 35;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 24, 18) {
			private final int slot = 36;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 42, 18) {
			private final int slot = 37;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 60, 18) {
			private final int slot = 38;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 78, 18) {
			private final int slot = 39;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 96, 18) {
			private final int slot = 40;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 114, 18) {
			private final int slot = 41;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 132, 18) {
			private final int slot = 42;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 150, 18) {
			private final int slot = 43;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 168, 18) {
			private final int slot = 44;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 6, 18) {
			private final int slot = 45;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 6, 36) {
			private final int slot = 46;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 6, 54) {
			private final int slot = 47;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 6, 72) {
			private final int slot = 48;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 6, 90) {
			private final int slot = 49;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 186, 18) {
			private final int slot = 50;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 186, 36) {
			private final int slot = 51;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 186, 54) {
			private final int slot = 52;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 186, 72) {
			private final int slot = 53;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 186, 90) {
			private final int slot = 54;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 60, 54) {
			private final int slot = 2;
			private int x = Backpacktier2interfaceMenu.this.x;
			private int y = Backpacktier2interfaceMenu.this.y;
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 16 + 8 + sj * 18, 30 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 16 + 8 + si * 18, 30 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		if (this.bound) {
			if (this.boundItemMatcher != null)
				return this.boundItemMatcher.get();
			else if (this.boundBlockEntity != null)
				return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity.getBlockState().getBlock());
			else if (this.boundEntity != null)
				return this.boundEntity.isAlive();
		}
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 55) {
				if (!this.moveItemStackTo(itemstack1, 55, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 55, false)) {
				if (index < 55 + 27) {
					if (!this.moveItemStackTo(itemstack1, 55 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 55, 55 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.isEmpty()) {
				slot.setByPlayer(ItemStack.EMPTY);
			} else {
				slot.setChanged();
			}
			if (itemstack1.getCount() == itemstack.getCount()) {
				return ItemStack.EMPTY;
			}
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty() && (p_38907_ ? i >= p_38905_ : i < p_38906_)) {
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameComponents(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int k = slot.getMaxStackSize(itemstack);
					if (j <= k) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < k) {
						p_38904_.shrink(k - itemstack.getCount());
						itemstack.setCount(k);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					i--;
				} else {
					i++;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (p_38907_ ? i >= p_38905_ : i < p_38906_) {
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					int l = slot1.getMaxStackSize(p_38904_);
					slot1.setByPlayer(p_38904_.split(Math.min(p_38904_.getCount(), l)));
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					i--;
				} else {
					i++;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					if (j == 0)
						continue;
					if (j == 1)
						continue;
					if (j == 3)
						continue;
					if (j == 4)
						continue;
					if (j == 5)
						continue;
					if (j == 6)
						continue;
					if (j == 9)
						continue;
					if (j == 18)
						continue;
					if (j == 10)
						continue;
					if (j == 11)
						continue;
					if (j == 12)
						continue;
					if (j == 13)
						continue;
					if (j == 14)
						continue;
					if (j == 15)
						continue;
					if (j == 7)
						continue;
					if (j == 8)
						continue;
					if (j == 16)
						continue;
					if (j == 17)
						continue;
					if (j == 19)
						continue;
					if (j == 20)
						continue;
					if (j == 21)
						continue;
					if (j == 22)
						continue;
					if (j == 23)
						continue;
					if (j == 24)
						continue;
					if (j == 25)
						continue;
					if (j == 26)
						continue;
					if (j == 27)
						continue;
					if (j == 28)
						continue;
					if (j == 29)
						continue;
					if (j == 30)
						continue;
					if (j == 31)
						continue;
					if (j == 32)
						continue;
					if (j == 33)
						continue;
					if (j == 34)
						continue;
					if (j == 35)
						continue;
					if (j == 36)
						continue;
					if (j == 37)
						continue;
					if (j == 38)
						continue;
					if (j == 39)
						continue;
					if (j == 40)
						continue;
					if (j == 41)
						continue;
					if (j == 42)
						continue;
					if (j == 43)
						continue;
					if (j == 44)
						continue;
					if (j == 45)
						continue;
					if (j == 46)
						continue;
					if (j == 47)
						continue;
					if (j == 48)
						continue;
					if (j == 49)
						continue;
					if (j == 50)
						continue;
					if (j == 51)
						continue;
					if (j == 52)
						continue;
					if (j == 53)
						continue;
					if (j == 54)
						continue;
					if (j == 2)
						continue;
					playerIn.drop(internal.getStackInSlot(j), false);
					if (internal instanceof IItemHandlerModifiable ihm)
						ihm.setStackInSlot(j, ItemStack.EMPTY);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					if (i == 0)
						continue;
					if (i == 1)
						continue;
					if (i == 3)
						continue;
					if (i == 4)
						continue;
					if (i == 5)
						continue;
					if (i == 6)
						continue;
					if (i == 9)
						continue;
					if (i == 18)
						continue;
					if (i == 10)
						continue;
					if (i == 11)
						continue;
					if (i == 12)
						continue;
					if (i == 13)
						continue;
					if (i == 14)
						continue;
					if (i == 15)
						continue;
					if (i == 7)
						continue;
					if (i == 8)
						continue;
					if (i == 16)
						continue;
					if (i == 17)
						continue;
					if (i == 19)
						continue;
					if (i == 20)
						continue;
					if (i == 21)
						continue;
					if (i == 22)
						continue;
					if (i == 23)
						continue;
					if (i == 24)
						continue;
					if (i == 25)
						continue;
					if (i == 26)
						continue;
					if (i == 27)
						continue;
					if (i == 28)
						continue;
					if (i == 29)
						continue;
					if (i == 30)
						continue;
					if (i == 31)
						continue;
					if (i == 32)
						continue;
					if (i == 33)
						continue;
					if (i == 34)
						continue;
					if (i == 35)
						continue;
					if (i == 36)
						continue;
					if (i == 37)
						continue;
					if (i == 38)
						continue;
					if (i == 39)
						continue;
					if (i == 40)
						continue;
					if (i == 41)
						continue;
					if (i == 42)
						continue;
					if (i == 43)
						continue;
					if (i == 44)
						continue;
					if (i == 45)
						continue;
					if (i == 46)
						continue;
					if (i == 47)
						continue;
					if (i == 48)
						continue;
					if (i == 49)
						continue;
					if (i == 50)
						continue;
					if (i == 51)
						continue;
					if (i == 52)
						continue;
					if (i == 53)
						continue;
					if (i == 54)
						continue;
					if (i == 2)
						continue;
					playerIn.getInventory().placeItemBackInInventory(internal.getStackInSlot(i));
					if (internal instanceof IItemHandlerModifiable ihm)
						ihm.setStackInSlot(i, ItemStack.EMPTY);
				}
			}
		}
	}

	@Override
	public Map<Integer, Slot> getSlots() {
		return Collections.unmodifiableMap(customSlots);
	}

	@Override
	public Map<String, Object> getMenuState() {
		return menuState;
	}
}