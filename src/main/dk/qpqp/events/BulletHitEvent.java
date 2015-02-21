package main.dk.qpqp.events;

import main.dk.qpqp.items.ItemList;
import main.dk.qpqp.items.weapons.BulletInfo;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class BulletHitEvent extends Event {

	double damage = 0;
	ItemList weapon = null;
	Player damager = null;
	Entity entity = null;
	boolean cancelled = false;
	
	public BulletHitEvent(double damage, BulletInfo bulletInfo){
		this.weapon = bulletInfo.getWeapon();
		this.damage = damage;
		this.entity = bulletInfo.getEntity();
		this.damager = bulletInfo.getOwner();
		
		if(!isCancelled()){
			Bukkit.getServer().getPluginManager().callEvent(new EntityDamageByEntityEvent(damager, entity, DamageCause.CUSTOM, getDamage()));
		}
	}
	
	/**
	 * 
	 * @return The damage dealt by the weapon
	 */
	public double getDamage(){
		return damage;
	}

	/**
	 * 
	 * @return Whenever the event was cancelled or not
	 */
	public boolean isCancelled() {
		return cancelled;
	}

	/**
	 * 
	 * @param cancelled Sets if the event should be cancelled or not
	 */
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	/**
	 * 
	 * @return The weapon that shoot the projectile
	 */
	public ItemList getWeapon() {
		return weapon;
	}

	/**
	 * 
	 * @return The player that shoot the projectile
	 */
	public Player getDamager() {
		return damager;
	}

	/**
	 * 
	 * @return The entity that got hit
	 */
	public Entity getEntity() {
		return entity;
	}

	/**
	 * 
	 * @param damage Amount of damage.
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}



	private static final HandlerList handlers = new HandlerList();
	 
	public HandlerList getHandlers() {
	    return handlers;
	}
	 
	public static HandlerList getHandlerList() {
	    return handlers;
	}
	
}
