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
public abstract class CustomItemStack {
	private int amount = 0;
	private MaterialData data = null;
	private ItemMeta itemMeta = null;
	private Material material = null;
	
	public int getAmount(){
		return amount;
	}
	
	public MaterialData getData(){
		return data;
	}
	
	public ItemMeta getItemMeta(){
		return itemMeta;
	}
	
	public Material getType(){
		return material;
	}
	
	public void setAmount(int amount){
		this.amount = amount;
	}
}