/**
 * 
 */
package main.dk.qpqp.items;

import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

/**
 * @author Viktor Strate
 *
 */
public abstract interface CustomItemStack {
	int amount = 0;
	MaterialData data = null;
	ItemMeta itemMeta = null;
	Material material = null;
	
	public int getAmount();
	
	public MaterialData getData();
	
	public ItemMeta getItemMeta();
	
	public Material getType();
	
	public void setAmount(int amount);
}