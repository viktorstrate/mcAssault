package main.dk.qpqp.items.weapons;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class BulletInfo {
	private Entity entity;
	private Player owner;
	
	public BulletInfo(Entity entity, Player owner){
		this.entity = entity;
		this.owner = owner;
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
