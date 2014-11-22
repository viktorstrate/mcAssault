package main.dk.qpqp;

import main.dk.qpqp.listeners.GrenadeListener;
import main.dk.qpqp.listeners.WeaponListener;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This is the main file, from here everything happens.
 * @author Viktor
 *
 */

public class McAssault extends JavaPlugin {
	
	public static Plugin plugin;
	public PluginDescriptionFile pdf;
	
	public void onEnable(){
		plugin = this;
		pdf = plugin.getDescription();
		
		// Registers the listener that handles the Weapon's shoot mechanics and things like that
		getServer().getPluginManager().registerEvents(new WeaponListener(), this);
		getServer().getPluginManager().registerEvents(new GrenadeListener(), this);
		
		// Logs that the plugin has been enabled and what version it is running
		Message.log(pdf.getName()+" v"+pdf.getVersion()+" has been enabled");
		

	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// Sends the command to another class
		return Commands.get(sender, command, label, args, this);
	}
	
	// Finds a player based on their username.
	// if no one found returns null
	public static Player findPlayer(String username){
		for(Player player: Bukkit.getOnlinePlayers()){
			if(player.getName().equalsIgnoreCase(username)){
				return player;
			}
		}
		
		for(Player player: Bukkit.getOnlinePlayers()){
			if(player.getName().contains(username)){
				return player;
			}
		}
		
		return null;
	}
}
