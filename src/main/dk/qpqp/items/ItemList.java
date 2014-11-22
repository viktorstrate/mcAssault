package main.dk.qpqp.items;

import main.dk.qpqp.items.grenades.items.Flashbang;
import main.dk.qpqp.items.grenades.items.HandGrenade;
import main.dk.qpqp.items.weapons.items.AK47;
import main.dk.qpqp.items.weapons.items.Glock;
import main.dk.qpqp.items.weapons.items.Uzi;

public enum ItemList {
	AK47 (0, "AK47", ItemType.Weapon),
	Glock (1, "Glock", ItemType.Weapon),
	HandGrenade(2, "HandGrenade", ItemType.Grenade),
	Uzi (3, "Uzi", ItemType.Weapon),
	FlashBang(4, "Flashbang", ItemType.Grenade);
	
	private int id;
	private String name;
	private ItemType itemType;
	
	public static enum ItemType{
		Weapon,
		Grenade
	}
	
	private static CustomItemStack getClass(ItemList itm){
		switch(itm){
		case AK47:
			return new AK47();
		case Glock:
			return new Glock();
		case HandGrenade:
			return new HandGrenade();
		case Uzi:
			return new Uzi();
		case FlashBang:
			return new Flashbang();
		default:
			break;
		}
		return null;
	}
	
	ItemList(int id, String name, ItemType itemType){
		this.id = id;
		this.name = name;
		this.itemType = itemType;
	}

	public int getId() {
		return id;
	}
	
	public CustomItemStack getCustomItem(){
		for(ItemList w: ItemList.values()){
			if(w.getId()==id){
				return getClass(w);
			}
		}
		
		return null;
	}
	
	public static CustomItemStack getCustomItem(int id){
		for(ItemList w: ItemList.values()){
			if(w.getId()==id){
				return getClass(w);

			}
		}
		
		return null;
	}
	
	public String getName(){
		return name;
	}
	
	public ItemType getItemType(){
		return itemType;
	}
}
