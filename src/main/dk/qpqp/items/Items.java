package main.dk.qpqp.items;

import java.util.ArrayList;

import main.dk.qpqp.items.weapons.WeaponType;
import main.dk.qpqp.items.weapons.Weapons;

import org.bukkit.inventory.ItemStack;

/**
 * General item functions
 * 
 * @author Viktor Strate
 */

public class Items {
	public static CustomItemStack getCustomItemStack(ItemStack item){
		
		// TODO make this
		
		return null;
		
	}
	
	public static ArrayList<CustomItemStack> getAllCustomItems(){
		
		ArrayList<CustomItemStack> customItems = new ArrayList<CustomItemStack>();
		
		for(WeaponType weapon: WeaponType.values()){
			customItems.add(Weapons.getWeapon(weapon));
		}
		
		return customItems;
	}
}
