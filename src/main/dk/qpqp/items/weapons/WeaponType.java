package main.dk.qpqp.items.weapons;

import main.dk.qpqp.items.weapons.items.*;

/*
 * A list of all the weapons
 */

public enum WeaponType {
	AK47 (new AK47(), "AK47"),
	Glock (new Glock(), "Glock");
	
	private Weapon weapon;
	private String name;
	
	WeaponType(Weapon weapon, String name){
		this.weapon = weapon;
		this.name = name;
	}

	public Weapon getWeapon() {
		return weapon;
	}
	
	public String getName(){
		return name;
	}
	
}
