/**
 * 
 */
package main.dk.qpqp.items.weapons;

import java.util.ArrayList;

import main.dk.qpqp.items.CustomItemStack;


/**
 * @author Viktor Strate
 * 
 * This class holds all the basic weapon functions.
 * Like the class Items but with weapons instead
 */
public class Weapons {

	public static Weapon getWeapon(WeaponType weapon){
		for(WeaponType w: WeaponType.values()){
			if(weapon.equals(w)){
				return w.getWeapon();
			}
		}
		
		return null;
	}
	
	public static Weapon getWeapon(CustomItemStack weapon){
		for(WeaponType w: WeaponType.values()){
			if(weapon.equals(w)){
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
