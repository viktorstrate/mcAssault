/**
 * 
 */
package main.dk.qpqp.items;

import org.bukkit.inventory.ItemStack;

/**
 * This is the base of all custom made items by this plugin.
 * All the guns and grenades.
 * @author Viktor Strate
 *
 */
public abstract class CustomItemStack {
	ItemStack itemStack = null;
	ItemList itemList = null;
	
	public CustomItemStack(ItemStack itemStack, ItemList itemList){
		this.itemStack = itemStack;
		
	}
	
	public ItemStack getItemStack(){
		return itemStack;
	}
	
	public ItemList getItemList(){
		return itemList;
	}
}