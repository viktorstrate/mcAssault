package main.dk.qpqp.api;

import main.dk.qpqp.items.ItemList;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * This is the main api class. Here all api functions are
 * @author Viktor Strate
 * 
 */

public class McAssaultAPI {
	
	/**
	 * 
	 * @param player The player that will get the item
	 * @param item The item that the player will get
	 */
	public static void giveItem(Player player, ItemList item){
		ItemStack customItem = item.getCustomItem().getItemStack();
		player.getInventory().addItem(customItem);
	}
	
	public static void giveItem(Player player, ItemList item, int amount){
		ItemStack customItem = item.getCustomItem().getItemStack();
		customItem.setAmount(amount);
		player.getInventory().addItem(customItem);
	}
	
	/**
	 * 
	 * @return A custom item from the itemlist.
	 */
	public static ItemStack getItemStack(ItemList item){
		return item.getCustomItem().getItemStack();
	}
}
