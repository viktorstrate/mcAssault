package main.dk.qpqp.listeners;

import main.dk.qpqp.Message;
import main.dk.qpqp.items.Items;
import main.dk.qpqp.items.weapons.Weapon;
import main.dk.qpqp.items.weapons.Weapons;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
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
		ItemStack itemInHand = player.getItemInHand();
		if(itemInHand.getType().equals(Material.AIR)){
			Message.playerMessage(itemInHand.getType().name(), player);
		} else {
			if(Items.isCustomItem(itemInHand)){
				Weapon weapon = Weapons.getWeapon(itemInHand);
				Message.playerMessage("Is shooting a "+weapon.getItemList().getName(), player);
				weapon.shoot(player);
			}
		}
	}
}
