package fr.nbstudio.fishingchange;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class FishingChange extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("FishingChange is enable");

    }

    @Override
    public void onDisable() {
        getLogger().info("FishingChange is disable");
    }

    @EventHandler
    public void onFish(PlayerFishEvent e) {
        if (e.getCaught() instanceof Item) {
            Item caught = (Item) e.getCaught();
            if (caught.getItemStack().getType()  != Material.DIAMOND) {
                caught.setItemStack(new ItemStack(Material.DIAMOND));
            }
        }
    }

}
