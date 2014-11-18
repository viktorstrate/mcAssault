package main.dk.qpqp.items.weapons;

import main.dk.qpqp.Message;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;



public class WeaponList {
	
	
	
	public static void showWeaponList(CommandSender sender, int page){
		
		if (page == 1){
		
			//Begin
			sender.sendMessage(ChatColor.GREEN + "===== " + ChatColor.AQUA + Message.prefix + ChatColor.GREEN + " =====");
			
			//Weapons
			sender.sendMessage(ChatColor.YELLOW + "0" + ChatColor.WHITE + " AK47");
			sender.sendMessage(ChatColor.YELLOW + "1" + ChatColor.WHITE + " Glock");
			
			//End
			sender.sendMessage(ChatColor.GREEN + "===== " + ChatColor.AQUA + "Page 1 / 1" + ChatColor.GREEN + " =====");
		
		}else{
			
			sender.sendMessage(ChatColor.RED + "That page doesn't exist!");
			
		}
		
	}
	
	
}
