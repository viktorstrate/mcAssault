package main.dk.qpqp.items.grenades;

import main.dk.qpqp.McAssault;
import main.dk.qpqp.items.CustomItemStack;
import main.dk.qpqp.items.ItemList;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.inventory.ItemStack;

/**
 * This is the basic structure of all weapons
 * @author Viktor
 *
 */

public abstract class Grenade extends CustomItemStack {

	public long delay = 40L; // The delay in minecraft ticks, it takes to trigger the grenade
	
	public Grenade(ItemStack itemStack, ItemList itemList) {
		super(itemStack, itemList);
	}
	
	public void throwGrenade(final Player player){
		Location loc = player.getEyeLocation().toVector().add(player.getLocation()
				.getDirection().multiply(2))
				.toLocation(player.getWorld(), player.getLocation().getYaw(), player.getLocation().getPitch());
		
		ItemStack itemStack = super.getItemStack();

        ItemStack itemGrenade = new ItemStack(itemStack.getType());
        itemGrenade.setData(super.getItemStack().getData());
        
        final Item grenade = player.getWorld().dropItem(loc, itemGrenade);
        grenade.setVelocity(player.getLocation().getDirection().multiply(2));

        grenade.setPickupDelay(999999);

        if(player.getItemInHand().getAmount()==1){
            player.setItemInHand(new ItemStack(Material.AIR, 1));
        } else {
            ItemStack itemInHand = player.getItemInHand();
            itemInHand.setAmount(itemInHand.getAmount()-1);
            player.setItemInHand(itemInHand);
        }
        
        // Makes a delay of the delay variable, and triggers the grenade
        McAssault.plugin.getServer().getScheduler().scheduleSyncDelayedTask(McAssault.plugin, new Runnable() {
            @Override
            public void run() {
            	trigger(player, grenade);
            }
        }, delay);

	}
	
	public void trigger(Player player, Item grenade){
		// Spawns a new entity, and stores it in variable tnt
        Entity tnt = player.getWorld().spawnEntity(grenade.getLocation(), EntityType.PRIMED_TNT);
        
        // Removes the grenade item
        grenade.remove();

        // Makes the tnt entity explode immediately
        ((TNTPrimed) tnt).setFuseTicks(0);
	}
	
}
