package main.dk.qpqp;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Message {
	
	public static String name = "McAssault";
	public static String prefix = "["+name+"]";
	
	public static void playerMessage(String message, Player player, Plugin plugin){
		
		player.sendMessage(prefix+" "+message);
	}
	
	public static void log(String message, Plugin plugin){
		plugin.getLogger().info(message);
	}
}
