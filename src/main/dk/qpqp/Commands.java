package main.dk.qpqp;

import java.util.HashMap;

import main.dk.qpqp.items.CustomItemStack;
import main.dk.qpqp.items.ItemList;
import main.dk.qpqp.items.Items;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * This class is handling all the commands
 * 
 * @author Viktor Strate
 *
 */

public class Commands {
	public static boolean get(CommandSender sender, Command command, String label, String[] args, McAssault main){
		
		Player player = (Player) sender;
		// If command equals assault or guns
		if(command.getName().equalsIgnoreCase("assault") || command.getName().equalsIgnoreCase("guns")){
			// If no args show help message
			if(args.length==0){
				showHelp(player);
				return true;
			}
			
			// if first arg is give
			if(args[0].equalsIgnoreCase("give")){
				// if args length isn't 3 long show usage message
				if(args.length!=3){
					Message.playerMessage("Usage: /guns give <Username> <ItemName>", player);
					return false;
				} else { // Else give player custom item
						Player receivePlayer = McAssault.findPlayer(args[1]);
						// If no player was found from the arg[1]
						if(receivePlayer==null){
							Message.playerMessage("Player not found", player);
							return false;
						} else {
							// If player is found
							CustomItemStack item = Items.getCustomItemStack(args[2]);
							if(item!=null){
								// gives the item
								Message.playerMessage("Item given!", receivePlayer);
								receivePlayer.getInventory().addItem(item.getItemStack());
								return true;
							} else {
								// If the item wasn't found show message
								Message.playerMessage("Item not found", player);
								return false;
							}
						}
				}
			}else if(args[0].equalsIgnoreCase("list")){
				
				showWeaponList(sender, 1);
				
			}else if(args[0].equalsIgnoreCase("info")){
				Info.getDefaultInfo(player);
			}
		}
		
		return false;
	}

	// Shows basic commands
	private static void showHelp(Player player) {
		
		//Begin
		
		player.sendMessage(ChatColor.GREEN + "===== " + ChatColor.AQUA + Message.prefix + ChatColor.GREEN + " =====");
		
		//Commands
		
		player.sendMessage(ChatColor.YELLOW + "/guns" + ChatColor.WHITE + " Shows this help screen.");
		player.sendMessage(ChatColor.YELLOW + "/guns give <Username> <ItemName>" + ChatColor.WHITE + " Gives a gun.");
		player.sendMessage(ChatColor.YELLOW + "/guns list [Page]" + ChatColor.WHITE + " See all the gun ID's");
		player.sendMessage(ChatColor.YELLOW + "/guns info" + ChatColor.WHITE + " See the basic plugin info in-game!");
		
		//New Messages: player.sendMessage(ChatColor.YELLOW + "COMMAND" + ChatColor.WHITE + " INFORMATION");
	}
	
	public static void showWeaponList(CommandSender sender, int page){
		
		int higestId = 0;
		
		//Begin
		sender.sendMessage(ChatColor.GREEN + "===== " + ChatColor.AQUA + Message.prefix + ChatColor.GREEN + " =====");
		
		// Hashmap with a key of the id of the item and the item
		HashMap<Integer, ItemList> items = new HashMap<Integer, ItemList>();
		
		// Fills out the hashmap
		for(ItemList item: ItemList.values()){
			// if is is on page
			if(item.getId()>=(page-1)*10 && item.getId()<=(page-1)*10+10){
				items.put(item.getId(), item);
				// if last higest id is smaller that the current id, make that id the higest
				if(higestId<item.getId()){
					higestId=item.getId();
				}
			}
		}
		
		for(ItemList item: items.values()){
			sender.sendMessage(ChatColor.GREEN + item.getName()+ ChatColor.WHITE+" with id"+ ChatColor.GREEN + item.getId());
		}
		
		//End
		sender.sendMessage(ChatColor.GREEN + "===== " + ChatColor.AQUA + "Page "+page+" / "+ higestId*10 + ChatColor.GREEN + " =====");
		
	}
}
