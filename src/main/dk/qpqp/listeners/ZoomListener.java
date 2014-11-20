package main.dk.qpqp.listeners;

import java.util.ArrayList;

import main.dk.qpqp.items.Items;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class ZoomListener implements Listener{

	Plugin plugin;
	
	private ArrayList<Player> zoomed = new ArrayList<Player>();
	

	public ZoomListener(Plugin plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent event){
		Player player = event.getPlayer();
		if(event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK){
			ItemStack itemInHand = player.getItemInHand();
			if(Items.isCustomItem(itemInHand)){
				if(zoomed.contains(player)){
//					Zoom out
					zoomed.remove(player);
					player.setWalkSpeed(0.2F);
				}else{
//					Zoom in
					zoomed.add(player);
					player.setWalkSpeed(-0.2F);
				}
				
			}else{
				
			}
		}
	}
	
	

}
