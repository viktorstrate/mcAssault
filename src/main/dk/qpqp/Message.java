package main.dk.qpqp;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Message {
	
	private static String prefix = "[McAssault]";
	
	public static void playerMessage(String message, Player player, Plugin plugin){
		player.sendMessage(prefix+""+message);
	}
}
