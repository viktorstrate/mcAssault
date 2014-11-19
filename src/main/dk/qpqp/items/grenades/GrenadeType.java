package main.dk.qpqp.items.grenades;

/**
 * This is a enum (list) of all the grenades.
 * @author Viktor Strate
 *
 */

public enum GrenadeType {
	
	Grenade(0, "Grenade");
	
	private int grenadeId;
	private String name;
	
	GrenadeType(int grenadeId, String name){
		this.grenadeId = grenadeId;
		this.name = name;
	}

	public int getId() {
		return grenadeId;
	}

	public String getName() {
		return name;
	}
	
}
