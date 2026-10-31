package fr.byswiizen.disabledespawn;

import com.tcoded.folialib.FoliaLib;
import fr.byswiizen.disabledespawn.listener.ItemSpawnListener;
import org.bstats.bukkit.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class DisableDespawn extends JavaPlugin {

	
    @Override
    public void onEnable() {
		registerFolia();
		registerMetrics();
		registerListener();
		getLogger().info("-----------------------");
		getLogger().info(getName() + " v" + getDescription().getVersion());
		getLogger().info("The plugin is enabled.");
		getLogger().info("-----------------------");
    }

    @Override
    public void onDisable() {
		getLogger().info("------------------------");
		getLogger().info(getName() + " v" + getDescription().getVersion());
		getLogger().info("The plugin is disabled.");
		getLogger().info("------------------------");
    }
	
	private void registerFolia() {
		new FoliaLib(this);
	}
	
	private void registerMetrics() {
		new Metrics(this, 35037);
	}
	
	private void registerListener() {
		PluginManager pluginmanager = Bukkit.getServer().getPluginManager();
		pluginmanager.registerEvents(new ItemSpawnListener(), this);
	}
}