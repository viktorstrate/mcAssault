package main.dk.qpqp.items;

import java.util.ArrayList;

import main.dk.qpqp.items.weapons.Weapons;

import org.bukkit.inventory.ItemStack;

/**
 * General item functions.
 * 
 * @author Viktor Strate
 */

public class Items {
	public static CustomItemStack getCustomItemStack(ItemStack item){
		
		for(ItemList list: ItemList.values()){
			CustomItemStack itm = list.getCustomItem();
			if(itm.getItemStack().getType().equals(item.getType())){
				if(itm.getItemStack().getItemMeta().equals(item.getItemMeta())){
					return itm;
				}
			}
		}
		return null;
		
	}
	
	public static CustomItemStack getCustomItemStack(String itemname){
		
		// Check weapons
		for(ItemList wt: ItemList.values()){
			if(wt.getName().equalsIgnoreCase(itemname)){
				return wt.getCustomItem();
			}
		}
		
		return null;
		
	}
	
	public static ItemList getItemList(CustomItemStack item){
		for(ItemList itemList: ItemList.values()){
			if(itemList.getCustomItem().getItemStack().getType().equals(item.itemStack.getType())){
				if(itemList.getCustomItem().getItemStack().getItemMeta().equals(item.itemStack.getItemMeta())){
					return itemList;
				}
			}
		}
		
		return null;
	}
	
	public static ArrayList<CustomItemStack> getAllCustomItems(){
		
		ArrayList<CustomItemStack> customItems = new ArrayList<CustomItemStack>();
		
		for(ItemList weapon: ItemList.values()){
			customItems.add(Weapons.getWeapon(weapon));
		}
		
		return customItems;
	}
	
	public static boolean isCustomItem(ItemStack item){
		if(getCustomItemStack(item)!=null){
			return true;
		} else return false;
	}
}
