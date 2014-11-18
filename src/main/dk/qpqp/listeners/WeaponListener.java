package main.dk.qpqp.listeners;

import main.dk.qpqp.Message;

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
		if(itemInHand!=null){
			Message.playerMessage("You got an item in your hand", player, plugin);
		} else
			Message.playerMessage("Empty hand", player, plugin);
	}
}
