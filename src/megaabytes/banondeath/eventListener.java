package megaabytes.banondeath;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import static org.bukkit.Bukkit.*;

public class eventListener implements Listener
{
    public static boolean enabled = false;

    @EventHandler
    public void playerDeathEvent(PlayerDeathEvent event){
        Player player = event.getEntity();
        if(enabled){
            if(!player.isOp()){
                player.kickPlayer("Sorry the server is locked to one life.");
                player.setWhitelisted(false);
            }
        }
    }
}
