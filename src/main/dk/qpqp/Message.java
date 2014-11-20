package main.dk.qpqp;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 * This file handles all message functions, like sending players messages, or sending logs to the console.
 * @author Viktor
 *
 */

public class Message {
	
	public static String name = "McAssault";
	public static String prefix = "["+name+"]";
	public static String coloredPrefix = ChatColor.AQUA + "[" + ChatColor.YELLOW + name + ChatColor.AQUA + "]";
	
	// Sends a player a message with the plugin's prefix
	public static void playerMessage(String message, Player player){
		player.sendMessage(coloredPrefix+" "+message);
	}
	
	// Logs info to the console
	public static void log(String message){
		McAssault.plugin.getLogger().info(message);
	}
}
