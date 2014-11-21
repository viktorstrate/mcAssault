package main.dk.qpqp.listeners;

import main.dk.qpqp.items.ItemList.ItemType;
import main.dk.qpqp.items.Items;
import main.dk.qpqp.items.grenades.Grenade;
import main.dk.qpqp.items.grenades.Grenades;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class GrenadeListener implements Listener {
	
	
	public GrenadeListener(){
	}
	
	@EventHandler
	public void onGrenadeThrow(PlayerInteractEvent event){
		Player player = event.getPlayer();
		ItemStack itemInHand = player.getItemInHand();
		if(!itemInHand.getType().equals(Material.AIR)){
			// Checks if the item is a custom item
			if(Items.isCustomItem(itemInHand)){
				// Checks if the custom item is a grenade
				if(Items.getCustomItemStack(itemInHand).getItemList().getItemType().equals(ItemType.Grenade)){
				Grenade grenade = Grenades.getGrenade(itemInHand);
				grenade.throwGrenade(player);
				}
			}
		}
	}
}
