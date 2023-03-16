package fr.nathanbordat.fishingchange;

import org.bukkit.plugin.java.JavaPlugin;
import fr.nathanbordat.fishingchange.NewFishing;

public class Main extends JavaPlugin {


    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new NewFishing(null), this);
    }

    public void onDisable() {

    }
    	
}
