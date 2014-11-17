package main.dk.qpqp.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

// This is the basic structure of all weapons

public abstract class Weapon implements CustomItemStack {
	
	ItemStack itemStack = null;
	WeaponType weaponType = null;
	ShootType shootType = null; 

	public enum ShootType{
		AUTOMATIC,
		SEMI_AUTOMATIC
	}
	
	public int getWeaponId(){
		int id = 0;
		for(WeaponType type: WeaponType.values()){
			if(type.equals(weaponType)){
				break;
			}
			id++;
		}
		
		return id;
	}
	
	public Weapon(ItemStack item, WeaponType weaponType){
		this.amount = item.getAmount();
		this.data = item.getData();
		this.itemMeta = item.getItemMeta();
		this.material = item.getType();
		this.weaponType = weaponType;
	}
	
	public ItemStack getItemStack() {
		return null;
	}
	
	// Custom ItemStack setup
	
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
	
	public ShootType getShootType() {
		return shootType;
	}

	public void setShootType(ShootType shootType) {
		this.shootType = shootType;
	}
	
}
