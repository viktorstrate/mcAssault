package main.dk.qpqp.listeners;

import main.dk.qpqp.Message;
import main.dk.qpqp.events.BulletHitEvent;
import main.dk.qpqp.items.ItemList.ItemType;
import main.dk.qpqp.items.Items;
import main.dk.qpqp.items.weapons.BulletInfo;
import main.dk.qpqp.items.weapons.Weapon;
import main.dk.qpqp.items.weapons.Weapons;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

/**
 * This file handles all the weapon listener stuff.
 * Like shooting.
 * @author Viktor
 *
 */

public class WeaponListener implements Listener {
	
	public WeaponListener() {
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent event){
		Player player = event.getPlayer();
		ItemStack itemInHand = player.getItemInHand();
		if(itemInHand.getType().equals(Material.AIR)){
			Message.playerMessage(itemInHand.getType().name(), player);
		} else {
			// Checks if the item is a custom item
			if(Items.isCustomItem(itemInHand)){
				// Checks if the custom item is a weapon
				//if(Weapons.isWeapon(Items.getCustomItemStack(itemInHand))){
				if(Items.getCustomItemStack(itemInHand).getItemList().getItemType().equals(ItemType.Weapon)){
				Weapon weapon = Weapons.getWeapon(itemInHand);
				weapon.shoot(player);
				}
			}
		}
	}
	
	@EventHandler
	public void onDamageByWeapon(EntityDamageByEntityEvent event){
		if(event.getDamager().getType().equals(EntityType.SNOWBALL)){
			
			Entity damager = event.getDamager();
			
			for(BulletInfo bullet: Weapons.bullets.values()){
				if(bullet.getEntity().getEntityId()==damager.getEntityId()){
					event.setDamage(5);
					Bukkit.getServer().getPluginManager().callEvent(new BulletHitEvent(event.getDamage(), bullet));
				}
			}
			
		}
	}
}
