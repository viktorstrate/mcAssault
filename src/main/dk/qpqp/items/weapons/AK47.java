package main.dk.qpqp.items.weapons;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import main.dk.qpqp.items.Weapon;
import main.dk.qpqp.items.WeaponType;

public class AK47 extends Weapon {
	
	private static final ItemStack item = getItem();
	
	public AK47() {
		super(item, WeaponType.AK47);
	}
	
	private static final ItemStack getItem(){
		ItemStack item = new ItemStack(Material.STICK);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName("§1AK47");
		item.setItemMeta(itemMeta);
		return item;
	}

}
