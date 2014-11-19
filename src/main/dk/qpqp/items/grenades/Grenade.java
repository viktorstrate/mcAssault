package main.dk.qpqp.items.grenades;

import main.dk.qpqp.items.CustomItemStack;
import main.dk.qpqp.items.ItemList;

import org.bukkit.inventory.ItemStack;

/**
 * This is the basic structure of all weapons
 * @author Viktor
 *
 */

public abstract class Grenade extends CustomItemStack {

	public Grenade(ItemStack itemStack, ItemList itemType) {
		super(itemStack, itemType);
	}
	
}
