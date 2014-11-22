package main.dk.qpqp.items.grenades;

import main.dk.qpqp.items.CustomItemStack;
import main.dk.qpqp.items.ItemList;

import org.bukkit.inventory.ItemStack;

/**
 * This class holds all the basic grenade functions.
 * @author Viktor Strate
 *
 */

public class Grenades {
	public static Grenade getGrenade(CustomItemStack grenade){
		return getGrenade(grenade.getItemStack());
	}
	
	public static Grenade getGrenade(ItemStack grenade){
		for(ItemList g: ItemList.values()){
			if(grenade.getType().equals(g.getCustomItem().getItemStack().getType())){
				if(grenade.getItemMeta().equals(g.getCustomItem().getItemStack().getItemMeta())){
					return (Grenade) g.getCustomItem();
				}
			}
		}
		
		return null;
	}
}
