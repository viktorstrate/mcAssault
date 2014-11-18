package main.dk.qpqp.items.weapons.items;

import main.dk.qpqp.items.weapons.Weapon;
import main.dk.qpqp.items.weapons.WeaponType;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Glock extends Weapon {
	
private static final ItemStack item = getItem();
	
	public Glock() {
		super(item, WeaponType.Glock);
		super.setShootType(ShootType.SEMI_AUTOMATIC);
		super.setItemStack(getItem());
	}
	
	private static final ItemStack getItem(){
		ItemStack item = new ItemStack(Material.BLAZE_ROD);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName("Glock");
		item.setItemMeta(itemMeta);
		return item;
	}

}
