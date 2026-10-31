package fr.byswiizen.disabledespawn.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;


public class ItemSpawnListener implements Listener {
	
	
	@EventHandler
	public void onItemSpawn(ItemSpawnEvent event) {
		event.getEntity().setUnlimitedLifetime(true);
		
		// TEST
		Item item = event.getEntity();
		item.setTicksLived(11990);
		Bukkit.getLogger().info("Test item" + item.isUnlimitedLifetime());
	}
}