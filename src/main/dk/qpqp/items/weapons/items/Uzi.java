package main.dk.qpqp.items.weapons.items;

import main.dk.qpqp.items.ItemList;
import main.dk.qpqp.items.weapons.Weapon;
import main.dk.qpqp.items.weapons.Weapons.ShootType;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * This is a Glock gun.
 * @author Viktor
 *
 */

public class Uzi extends Weapon {
	
	public Uzi() {
			super(item, ItemList.Glock, ShootType.SEMI_AUTOMATIC);
		}
	
	private static final ItemStack item = getItem();
		
	private static final ItemStack getItem(){
		ItemStack item = new ItemStack(Material.FEATHER);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName("Uzi");
		item.setItemMeta(itemMeta);
		return item;
	}

}
