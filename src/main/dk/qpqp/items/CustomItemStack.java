/**
 * 
 */
package main.dk.qpqp.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

/**
 * This is the base of all custom made items by this plugin.
 * All the guns and grenades.
 * @author Viktor Strate
 *
 */
public abstract class CustomItemStack {
	int amount = 0;
	MaterialData data = null;
	ItemMeta itemMeta = null;
	Material material = null;
	
	public CustomItemStack(int amount, MaterialData data, ItemMeta itemMeta, Material material){
		this.amount = amount;
		this.data = data;
		this.itemMeta = itemMeta;
		this.material = material;
	}
	
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
	
	public ItemStack getItemStack(){
		return null;
		
	}
	
	public void setAmount(int amount){
		this.amount = amount;
	}
}