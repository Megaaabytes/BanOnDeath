package megaabytes.banondeath;

import org.bukkit.plugin.java.JavaPlugin;

public class BanOnDeath extends JavaPlugin
{
    @Override
    public void onEnable(){
        eventListener eventListener = new eventListener();
        getServer().getPluginManager().registerEvents(new eventListener(),this);
        getServer().getPluginManager().registerEvents(new deathListener(), this);
        getCommand("togglebanondeath").setExecutor(new ToggleBanOnDeath());
        getCommand("isbanondeathenabled").setExecutor(new checkIfenabled());
        getCommand("togglespectateondeath").setExecutor(new ToggleSpectateOnDeath());
    }
}
