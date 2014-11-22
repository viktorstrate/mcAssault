package main.dk.qpqp.items.grenades.items;

import java.util.List;

import main.dk.qpqp.items.ItemList;
import main.dk.qpqp.items.grenades.Grenade;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Flashbang extends Grenade {
	
	public Flashbang() {
		super(item, ItemList.FlashBang);
	}
	
	private double radius = 5;
	
	private final static ItemStack item = getItem();
	
	private final static ItemStack getItem(){
		ItemStack itm = new ItemStack(Material.INK_SACK, 1, (byte) 5);
		ItemMeta meta = itm.getItemMeta();
		meta.setDisplayName("Flashbang");
		itm.setItemMeta(meta);
		return itm;
	}
	
	@Override
	public void trigger(Player player, Item grenade) {
		grenade.getWorld().createExplosion(grenade.getLocation(), 0);
		List<Entity> entities = grenade.getNearbyEntities(radius, radius, radius);
		for(Entity ent: entities){
			if(ent instanceof Player){
				Player pl = (Player) ent;
				pl.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 1));
			}
		}
		
		grenade.remove();
	}

}
