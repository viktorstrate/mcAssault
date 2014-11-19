package main.dk.qpqp.items;

import main.dk.qpqp.items.weapons.Weapon;
import main.dk.qpqp.items.weapons.WeaponType;
import main.dk.qpqp.items.weapons.items.AK47;
import main.dk.qpqp.items.weapons.items.Glock;

public enum ItemType {
	AK47 (0, "AK47"),
	Glock (1, "Glock");
	
	private int id;
	private String name;
	
	ItemType(int id, String name){
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public Weapon getWeapon(){
		for(WeaponType w: WeaponType.values()){
			if(w.getWeaponId()==id){
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
