package main.dk.qpqp.items;

import main.dk.qpqp.items.weapons.items.AK47;
import main.dk.qpqp.items.weapons.items.Glock;
import main.dk.qpqp.items.weapons.items.Uzi;

public enum ItemList {
	AK47 (0, "AK47", ItemType.Weapon),
	Glock (1, "Glock", ItemType.Weapon),
	Uzi (2, "Uzi", ItemType.Weapon);
	
	private int id;
	private String name;
	private ItemType itemType;
	
	public static enum ItemType{
		Weapon,
		Grenade
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
				switch(w){
				case AK47:
					return new AK47();
				case Glock:
					return new Glock();
				case Uzi:
					return new Uzi();
				}
			}
		}
		
		return null;
	}
	
	public static CustomItemStack getCustomItem(int id){
		for(ItemList w: ItemList.values()){
			if(w.getId()==id){
				switch(w){
				case AK47:
					return new AK47();
				case Glock:
					return new Glock();
				case Uzi:
					return new Uzi();
				}
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
