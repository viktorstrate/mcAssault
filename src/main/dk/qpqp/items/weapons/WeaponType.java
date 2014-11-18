package main.dk.qpqp.items.weapons;

import main.dk.qpqp.items.weapons.items.*;

/*
 * A list of all the weapons
 */

public enum WeaponType {
	AK47 (new AK47());
	
	private Weapon weapon;
	
	WeaponType(Weapon weapon){
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return weapon;
	}
	
}
