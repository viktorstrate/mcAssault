package main.dk.qpqp;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;

public class Info {
	
	private static Plugin plugin;
	private static PluginDescriptionFile pdf;
	
	public static void getDefaultInfo(Player player){
		plugin = McAssault.plugin;
		pdf = plugin.getDescription();
		
		player.sendMessage(ChatColor.GREEN + "===== " + ChatColor.AQUA + Message.coloredPrefix + ChatColor.GREEN + " =====");
		player.sendMessage(ChatColor.YELLOW + "Plugin Name: " + ChatColor.WHITE + pdf.getName());
		player.sendMessage(ChatColor.YELLOW + "Plugin Description: " + ChatColor.WHITE + pdf.getDescription());
		player.sendMessage(ChatColor.YELLOW + "Plugin Version: " + ChatColor.WHITE + pdf.getVersion());
		player.sendMessage(ChatColor.YELLOW + "Plugin Author: " + ChatColor.WHITE + pdf.getAuthors());
		player.sendMessage(ChatColor.GREEN + "===== " + ChatColor.YELLOW + "Want to help? Contribute: http://bit.ly/mcma- " + ChatColor.GREEN + "=====");
	}

}
