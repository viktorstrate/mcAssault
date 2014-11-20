package main.dk.qpqp.items.grenades;

import main.dk.qpqp.items.CustomItemStack;
import main.dk.qpqp.items.ItemList;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * This is the basic structure of all weapons
 * @author Viktor
 *
 */

public abstract class Grenade extends CustomItemStack {

	public Grenade(ItemStack itemStack, ItemList itemList) {
		super(itemStack, itemList);
	}
	
	public void throwGrenade(Player player){
		ItemStack itemStack = super.getItemStack();

        ItemStack itemGrenade = new ItemStack(itemStack.getType());
        itemGrenade.setAmount(1);
        itemGrenade.setData(itemStack.getData());

        Location loc = player.getEyeLocation().toVector().add(player.getLocation().getDirection().multiply(2)).toLocation(player.getWorld(), player.getLocation().getYaw(), player.getLocation().getPitch());

        final Item grenade = player.getWorld().dropItem(loc, itemGrenade);
        grenade.setVelocity(player.getLocation().getDirection().multiply(2));

        grenade.setPickupDelay(999999);

        if(player.getItemInHand().getAmount()==1){
            player.setItemInHand(new ItemStack(Material.AIR, 1));
        } else {
            ItemStack itemInHand = itemStack;
            itemInHand.setAmount(player.getItemInHand().getAmount()-1);
            player.setItemInHand(itemInHand);
        }
	}
	
}
