package main.dk.qpqp.items.grenades.items;

import main.dk.qpqp.items.ItemList;
import main.dk.qpqp.items.grenades.Grenade;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HandGrenade extends Grenade {
	
	public HandGrenade() {
		super(item, ItemList.HandGrenade);
	}
	
	private static final ItemStack item = getItem();
	
	private static final ItemStack getItem(){
		ItemStack item = new ItemStack(Material.COAL);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName("Hand Grenade");
		item.setItemMeta(itemMeta);
		return item;
	}

}
