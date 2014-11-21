/**
 * 
 */
package main.dk.qpqp.items.weapons;

import java.util.ArrayList;
import java.util.HashMap;

import main.dk.qpqp.items.CustomItemStack;
import main.dk.qpqp.items.ItemList;
import main.dk.qpqp.items.ItemList.ItemType;

import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;


/**
 * @author Viktor Strate
 * 
 * This class holds all the basic weapon functions.
 * Like the class "Items" but with weapons instead.
 */
public class Weapons {
	
	public enum ShootType{
		AUTOMATIC,
		SEMI_AUTOMATIC
	}

	// Keeps track of the bullet's owners
	// EntityId and Data about bullet
	public static HashMap<Integer, BulletInfo> bullets = new HashMap<Integer, BulletInfo>();
	
	public static Weapon getWeapon(ItemList item){
		if(item.getItemType().equals(ItemType.Weapon)){
			for(ItemType i: ItemType.values()){
				if(item.equals(i)){
					return (Weapon) item.getCustomItem();
				}
			}
		}
		
		return null;
	}
	
	/**
	 * This is the shooting mechanic
	 * @param player the player that the projectile should be spawned at
	 * @param accuracy the accuracy of the projectile, 0 is 100% accurate
	 * @param speed the speed the projectile will have
	 */
	public static void spawnProjectile(Player player, double accuracy, double speed){
		
		double randX, randY, randZ;
		randX = Math.random()*accuracy;
		randY = Math.random()*accuracy;
		randZ = Math.random()*accuracy;
		
		Snowball bullet = player.getWorld().spawn(player.getEyeLocation(), Snowball.class);
		Vector velocity = new Vector().setX(randX).setY(randY).setZ(randZ);
		velocity.add(player.getLocation().getDirection().multiply(speed));
		bullet.setVelocity(velocity); 
		bullet.setShooter(player);
		bullets.put(bullet.getEntityId(), new BulletInfo(bullet, player));
	}
	
	public static Weapon getWeapon(CustomItemStack weapon){
		for(ItemList w: ItemList.values()){
			if(weapon.getItemStack().getType().equals(w.getCustomItem().getItemStack().getType())){
				if(weapon.getItemStack().getItemMeta().equals(w.getCustomItem().getItemStack().getItemMeta())){
					return (Weapon) w.getCustomItem();
				}
			}
		}
		return null;
	}
	
	public static Weapon getWeapon(ItemStack weapon){
		for(ItemList w: ItemList.values()){
			if(weapon.getType().equals(w.getCustomItem().getItemStack().getType())){
				if(weapon.getItemMeta().equals(w.getCustomItem().getItemStack().getItemMeta())){
					return (Weapon) w.getCustomItem();
				}
			}
		}
		
		return null;
	}
	
	/**
	 * 
	 * @return all weapons in an arraylist
	 */
	public static ArrayList<Weapon> getWeapons(){
		ArrayList<Weapon> weapons = new ArrayList<Weapon>();
		for(ItemList w: ItemList.values()){
			if(w.getItemType().equals(ItemType.Weapon)){
				weapons.add((Weapon) w.getCustomItem());
			}
		}
		return weapons;
	}
	
}
