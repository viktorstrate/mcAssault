package main.dk.qpqp.items.weapons;

import main.dk.qpqp.items.weapons.items.*;

/*
 * A list of all the weapons
 */

public enum WeaponType {
	AK47 (0, "AK47"),
	Glock (1, "Glock");
	
	private int weaponId;
	private String name;
	
	WeaponType(int weaponId, String name){
		this.weaponId = weaponId;
		this.name = name;
	}

	public int getWeaponId() {
		return weaponId;
	}
	
	public Weapon getWeapon(){
		for(WeaponType w: WeaponType.values()){
			if(w.getWeaponId()==weaponId){
				switch(w){
				case AK47:
					return new AK47();
				case Glock:
					return new Glock();
				}
			}
		}
		
		return null;
	}
	
	public String getName(){
		return name;
	}
	
}
