package main.dk.qpqp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class McAssault extends JavaPlugin {
	
	public void onEnable(){
		
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		return Commands.get(sender, command, label, args, this);
	}
}
