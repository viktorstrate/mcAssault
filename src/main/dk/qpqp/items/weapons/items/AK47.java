package main.dk.qpqp.items.weapons.items;

import main.dk.qpqp.items.ItemList;
import main.dk.qpqp.items.weapons.Weapon;
import main.dk.qpqp.items.weapons.Weapons.ShootType;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * This is an AK47 gun.
 * @author Viktor
 *
 */

public class AK47 extends Weapon {
	
	public AK47() {
		super(item, ItemList.AK47, ShootType.AUTOMATIC);
		// TODO Auto-generated constructor stub
	}

	private static final ItemStack item = getItem();
	
	private static final ItemStack getItem(){
		ItemStack item = new ItemStack(Material.STICK);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName("AK47");
		item.setItemMeta(itemMeta);
		return item;
	}
	
	

}
