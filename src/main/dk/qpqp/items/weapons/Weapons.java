/**
 * 
 */
package main.dk.qpqp.items.weapons;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import main.dk.qpqp.items.CustomItemStack;


/**
 * @author Viktor Strate
 * 
 * This class holds all the basic weapon functions.
 * Like the class Items but with weapons instead
 */
public class Weapons {

	// Keeps track of the bullet's owners
	public static HashMap<Entity, Player> bullets = new HashMap<Entity, Player>();
	
	public static Weapon getWeapon(WeaponType weapon){
		for(WeaponType w: WeaponType.values()){
			if(weapon.equals(w)){
				return w.getWeapon();
			}
		}
		
		return null;
	}
	
	// **THIS IS THE SHOOTING MECHANIC**
	// Accuracy is how precise the projectile will move,
	// if the accuracy is 0 it will be 100% where the player is looking
	public static void spawnProjectile(Player player, double accuracy, double speed){
		
		double randX, randY, randZ;
		randX = Math.random()*accuracy;
		randY = Math.random()*accuracy;
		randZ = Math.random()*accuracy;
		
		Snowball bullet = player.getWorld().spawn(player.getEyeLocation(), Snowball.class);
		Vector velocity = new Vector().setX(randX).setY(randY).setZ(randZ);
		velocity.add(player.getLocation().getDirection().multiply(1.5));
		bullet.setVelocity(velocity); 
		bullet.setShooter(player);
		bullets.put(bullet, player);
	}
	
	public static Weapon getWeapon(CustomItemStack weapon){
		for(WeaponType w: WeaponType.values()){
			if(weapon.equals(w.getWeapon())){
				return w.getWeapon();
			}
		}
		
		return null;
	}
	
	public static Weapon getWeapon(ItemStack weapon){
		for(WeaponType w: WeaponType.values()){
			if(weapon.equals(w.getWeapon().getItemStack())){
				return w.getWeapon();
			}
		}
		
		return null;
	}
	
	public static ArrayList<Weapon> getWeapons(){
		ArrayList<Weapon> weapons = new ArrayList<Weapon>();
		for(WeaponType w: WeaponType.values()){
			weapons.add(w.getWeapon());
		}
		return weapons;
	}
	
}
