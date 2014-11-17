package main.dk.qpqp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands {
	public static boolean get(CommandSender sender, Command command, String label, String[] args, McAssault main){
		Player player = (Player) sender;
		// If command equals assault or guns
		if(command.getName().equalsIgnoreCase("assault") || command.getName().equalsIgnoreCase("guns")){
			// If no args show help message
			if(args.length==0){
				showHelp(player);
			}
		}
		
		return false;
	}

	// Shows basic commands
	private static void showHelp(Player player) {
		
	}
}
