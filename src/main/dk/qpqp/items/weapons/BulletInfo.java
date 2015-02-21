package main.dk.qpqp.items.weapons;

import main.dk.qpqp.items.ItemList;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class BulletInfo {
	private Entity entity;
	private Player owner;
	private ItemList weapon;
	
	public BulletInfo(Entity entity, Player owner, ItemList weapon){
		this.entity = entity;
		this.owner = owner;
		this.weapon = weapon;
	}

	public ItemList getWeapon() {
		return weapon;
	}

	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}
}
