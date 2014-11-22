package main.dk.qpqp.items.weapons;

import main.dk.qpqp.events.PlayerShootEvent;
import main.dk.qpqp.items.CustomItemStack;
import main.dk.qpqp.items.ItemList;
import main.dk.qpqp.items.weapons.Weapons.ShootType;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * This is the basic structure of all weapons
 * @author Viktor
 *
 */

public abstract class Weapon extends CustomItemStack {
	
	public Weapon(ItemStack itemStack, ItemList itemList, ShootType shootType) {
		super(itemStack, itemList);
		this.shootType = shootType;
		this.itemList = itemList;
	}	
	
	ItemList itemList = null;
	ShootType shootType = null;
	
	public void shoot(Player player){
		Weapons.spawnProjectile(player, 0.01, 3, getItemList());
		callShootEvent(player, itemList);
	}
	
	private void callShootEvent(Player player, ItemList weapon){
		Bukkit.getServer().getPluginManager().callEvent(new PlayerShootEvent(player, weapon));
	}
	
}
