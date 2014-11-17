package main.dk.qpqp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
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
			}
			
			if(args[0].equalsIgnoreCase("give")){
				if(args.length!=3){
					Message.playerMessage("Usage: /guns give [USERNAME] [ITEMNAME]", player, plugin);
				}
			}
		}
		
		ItemStack itm;
		
		return false;
	}

	// Shows basic commands
	private static void showHelp(Player player) {
		
	}
}
