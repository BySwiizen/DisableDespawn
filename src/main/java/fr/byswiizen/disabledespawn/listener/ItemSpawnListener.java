package fr.byswiizen.disabledespawn.listener;

import fr.byswiizen.disabledespawn.DisableDespawn;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;


public class ItemSpawnListener implements Listener {
	
	public DisableDespawn plugin;
	public ItemSpawnListener(DisableDespawn instance) {
		this.plugin = instance;
	}
	
	
	@EventHandler
	public void onItemSpawn(ItemSpawnEvent event) {
		if (DisableDespawn.configfile.getBoolean("disable-despawn")) {
			event.getEntity().setUnlimitedLifetime(true);
		}
	}
}