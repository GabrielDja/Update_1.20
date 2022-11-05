
package net.gabrieldja.trickupdate.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.gabrieldja.trickupdate.procedures.BarrierLorsqueLitemEstDansEnMainProcedure;
import net.gabrieldja.trickupdate.init.TrickUpdate120ModTabs;

public class BarrierItem extends Item {
	public BarrierItem() {
		super(new Item.Properties().tab(TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			BarrierLorsqueLitemEstDansEnMainProcedure.execute(entity, itemstack);
	}
}
