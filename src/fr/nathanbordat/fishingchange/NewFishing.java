package fr.nathanbordat.fishingchange;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;


public class NewFishing implements Listener {

	public NewFishing (NewFishing plugin) {
    }

	@EventHandler
	public void onFish(PlayerFishEvent e) {
		   if(e.getCaught() instanceof Item) {
			   Item caught = (Item) e.getCaught();
	    		if (caught.getItemStack().getType() != Material.DIAMOND) {
	    			caught.setItemStack(new ItemStack(Material.DIAMOND));
	    		}
	    		
	    	}
	    
	}

	
}
