package megaabytes.banondeath;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class deathListener implements Listener {
    public static boolean enabledSpectateOnDeath = false;

    @EventHandler
    public void playerDeathEvent(PlayerDeathEvent event) {
        Player player = event.getEntity();
        if (enabledSpectateOnDeath) {
            if (!player.isOp()) {
                player.sendMessage("Sorry the server is locked to one life.");
                player.setGameMode(GameMode.SPECTATOR);
            }
        }
    }
}