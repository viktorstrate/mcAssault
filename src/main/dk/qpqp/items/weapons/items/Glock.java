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

public class Glock extends Weapon {
	
	public Glock() {
			super(item, ItemList.Glock, ShootType.SEMI_AUTOMATIC);
		}
	
	private static final ItemStack item = getItem();
		
	private static final ItemStack getItem(){
		ItemStack item = new ItemStack(Material.BLAZE_ROD);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName("Glock");
		item.setItemMeta(itemMeta);
		return item;
	}

}
