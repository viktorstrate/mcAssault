package main.dk.qpqp;

import main.dk.qpqp.items.CustomItemStack;
import main.dk.qpqp.items.Items;
import main.dk.qpqp.items.weapons.WeaponList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Commands {
	public static boolean get(CommandSender sender, Command command, String label, String[] args, McAssault main){
		// A copy of 
		Plugin plugin = main.plugin;
		
		Player player = (Player) sender;
		// If command equals assault or guns
		if(command.getName().equalsIgnoreCase("assault") || command.getName().equalsIgnoreCase("guns")){
			// If no args show help message
			if(args.length==0){
				showHelp(player);
				return true;
			}
			
			if(args[0].equalsIgnoreCase("give")){
				if(args.length!=3){
					Message.playerMessage("Usage: /guns give <Username> <ItemName>", player, plugin);
					return false;
				} else {
						Player receivePlayer = McAssault.findPlayer(args[1]);
						if(receivePlayer==null){
							Message.playerMessage("Player not found", player, plugin);
							return false;
						} else {
							// If player is found
							CustomItemStack item = Items.getCustomItemStack(args[2]);
							if(item!=null){
								// gives the item
								Message.playerMessage("Item given!", receivePlayer, plugin);
								receivePlayer.getInventory().addItem(item.getItemStack());
								return true;
							} else {
								Message.playerMessage("Item not found", player, plugin);
								return false;
							}
						}
				}
			}else if(args[0].equalsIgnoreCase("list")){
				
				WeaponList.showWeaponList(sender, 1);
				
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
		
		//New Messages: player.sendMessage(ChatColor.YELLOW + "COMMAND" + ChatColor.WHITE + " INFORMATION");
	}
}
