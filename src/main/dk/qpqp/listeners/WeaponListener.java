package main.dk.qpqp.listeners;

import main.dk.qpqp.Message;
import main.dk.qpqp.items.Items;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

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
			Message.playerMessage(itemInHand.getType().name(), player, plugin);
			
			if(Items.isCustomItem(itemInHand)){
				Message.playerMessage("Insert Shoot Function Here", player, plugin);
			}
			
		}
	}
}
