package main.dk.qpqp.items;

import org.bukkit.inventory.ItemStack;

// This is the basic structure of all weapons

public interface Weapon {
	
	public enum shootType{
		AUTOMATIC,
		SEMI_AUTOMATIC
	}
	
	public ItemStack getItemStack();
	
	
}
