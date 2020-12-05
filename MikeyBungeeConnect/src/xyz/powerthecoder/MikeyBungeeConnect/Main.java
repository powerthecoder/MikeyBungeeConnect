package xyz.powerthecoder.MikeyBungeeConnect;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("lobby")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("You must be in game!");
				sender.sendMessage("Developer: Leo Power");
				sender.sendMessage("Discord: -{ Power1482 }-#0101");
				return true;
			}
			Player player = (Player) sender;
			player.chat("/server lobby");
			return true;
		}
		else if (label.equalsIgnoreCase("factions")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("You must be in game!");
				sender.sendMessage("Developer: Leo Power");
				sender.sendMessage("Discord: -{ Power1482 }-#0101");
				return true;
			}
			Player player = (Player) sender;
			player.chat("/server factions");
			return true;
		}
		return false;
	}
	
}