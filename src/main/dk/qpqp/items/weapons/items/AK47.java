package main.dk.qpqp.items.weapons.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import main.dk.qpqp.items.weapons.Weapon;
import main.dk.qpqp.items.weapons.WeaponType;

/*
 * This is an AK47 weapon
 */

public class AK47 extends Weapon {
	
	private static final ItemStack item = getItem();
	
	public AK47() {
		super(item, WeaponType.AK47);
		super.setShootType(ShootType.AUTOMATIC);
	}
	
	private static final ItemStack getItem(){
		ItemStack item = new ItemStack(Material.STICK);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName("AK47");
		item.setItemMeta(itemMeta);
		return item;
	}

}
