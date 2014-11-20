package main.dk.qpqp.items.weapons;

import main.dk.qpqp.items.CustomItemStack;
import main.dk.qpqp.items.ItemList;
import main.dk.qpqp.items.weapons.Weapons.ShootType;

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
	}	
	
	ShootType shootType = null;
	
	public void shoot(Player player){
		Weapons.spawnProjectile(player, 0.01, 3);
	}
	
}
