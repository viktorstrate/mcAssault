package main.dk.qpqp.events;

import org.bukkit.event.Event;

import main.dk.qpqp.items.ItemList;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class PlayerShootEvent extends Event {
	
	Player player;
	ItemList weapon;
	
	public PlayerShootEvent(Player player, ItemList weapon){
		this.player = player;
		this.weapon = weapon;
	}
	
	public Player getPlayer(){
		return player;
	}
	
	public ItemList getWeapon(){
		return weapon;
	}
	
	private static final HandlerList handlers = new HandlerList();
	 
	public HandlerList getHandlers() {
	    return handlers;
	}
	 
	public static HandlerList getHandlerList() {
	    return handlers;
	}
}
