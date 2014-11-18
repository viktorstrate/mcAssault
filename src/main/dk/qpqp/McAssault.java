package main.dk.qpqp;

import main.dk.qpqp.listeners.WeaponListener;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class McAssault extends JavaPlugin {
	
	public Plugin plugin;
	public PluginDescriptionFile pdf;
	
	public void onEnable(){
		plugin = this;
		pdf = plugin.getDescription();
		
		getServer().getPluginManager().registerEvents(new WeaponListener(plugin), this);
		
		Message.log(pdf.getName()+" v"+pdf.getVersion()+" has been enabled", plugin);
		
		
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		return Commands.get(sender, command, label, args, this);
	}
	
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
