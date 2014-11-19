package main.dk.qpqp.items.grenades;

import main.dk.qpqp.items.CustomItemStack;
import main.dk.qpqp.items.ItemType;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

/**
 * This is the basic structure of all weapons
 * @author Viktor
 *
 */

public abstract class Grenade extends CustomItemStack {

	public Grenade(int amount, MaterialData data, ItemMeta itemMeta,
			Material material) {
		super(amount, data, itemMeta, material);
	}

	ItemType itemType = null;
	ShootType shootType = null;
	
	public enum ShootType{
		AUTOMATIC,
		SEMI_AUTOMATIC
	}
	
	// Creates the weapon
	
	
	// Custom ItemStack setup down below.
	
	private int amount = 0;
	private MaterialData data = null;
	private ItemMeta itemMeta = null;
	private Material material = null;
	private ItemStack itemStack = null;
	
	public void setItemStack(ItemStack itemStack){
		this.itemStack = itemStack;
		material = itemStack.getType();
		amount = itemStack.getAmount();
		data = itemStack.getData();
		itemMeta = itemStack.getItemMeta();
	}
	
	// Throw basic grenade function
	public void throwGrenade(Player player){
		
	}
	
	public ItemStack getItemStack() {
		return itemStack;
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
	
	public void setAmount(int amount){
		this.amount = amount;
		itemStack.setAmount(amount);
	}
	
	public Material getType() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
		itemStack.setType(material);
	}

	public void setData(MaterialData data) {
		this.data = data;
		itemStack.setData(data);
	}

	public void setItemMeta(ItemMeta itemMeta) {
		this.itemMeta = itemMeta;
		itemStack.setItemMeta(itemMeta);
	}

	public ShootType getShootType() {
		return shootType;
	}

	public void setShootType(ShootType shootType) {
		this.shootType = shootType;
	}
	
	public int getId(){
		return itemType.getId();
	}
	
	public ItemType getWeaponType(){
		return itemType;
	}
	
	
}
