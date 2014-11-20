package main.dk.qpqp.listeners;

import main.dk.qpqp.Message;
import main.dk.qpqp.items.Items;
import main.dk.qpqp.items.weapons.BulletInfo;
import main.dk.qpqp.items.weapons.Weapon;
import main.dk.qpqp.items.weapons.Weapons;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

/**
 * This file handles all the weapon listener stuff.
 * Like shooting.
 * @author Viktor
 *
 */

public class WeaponListener implements Listener {
	
	Plugin plugin;
	
	public WeaponListener(Plugin plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent event){
		Player player = event.getPlayer();
		if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK){
			ItemStack itemInHand = player.getItemInHand();
			if(itemInHand.getType().equals(Material.AIR)){
				Message.playerMessage(itemInHand.getType().name(), player);
			} else {
				if(Items.isCustomItem(itemInHand)){
					Weapon weapon = Weapons.getWeapon(itemInHand);
	//				Message.playerMessage("Is shooting a "+weapon.getItemList().getName(), player);
					weapon.shoot(player);
				}
			}
		}else{
			
		}
	}
	
	@EventHandler
	public void onDamageByWeapon(EntityDamageByEntityEvent event){
		if(event.getDamager().getType().equals(EntityType.SNOWBALL)){
			
			Entity damager = event.getDamager();
			
			for(BulletInfo bullet: Weapons.bullets.values()){
				if(bullet.getEntity().getEntityId()==damager.getEntityId()){
					event.setDamage(5);
				}
			}
			
		}
	}
}
