package megaabytes.banondeath;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ToggleBanOnDeath implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(command.getName().equalsIgnoreCase("togglebanondeath")){
            Player player = (Player) commandSender;
            if(commandSender instanceof Player){
                if(player.isOp()){
                    if(!eventListener.enabled){
                        eventListener.enabled = true;
                        deathListener.enabledSpectateOnDeath = false;
                        commandSender.sendMessage("Players are now locked to one life.");
                    }else{
                        eventListener.enabled = false;
                        deathListener.enabledSpectateOnDeath = false;
                        commandSender.sendMessage("Players are no-longer locked to one life.");
                    }
                }else{
                    commandSender.sendMessage("You must be an operator to use that command!");
                }
            }else{
                if(!eventListener.enabled){
                    eventListener.enabled = true;
                    deathListener.enabledSpectateOnDeath = false;
                    commandSender.sendMessage("Players are now locked to one life.");
                }else{
                    eventListener.enabled = false;
                    deathListener.enabledSpectateOnDeath = false;
                    commandSender.sendMessage("Players are no-longer locked to one life.");
                }
            }
        }
        return true;
    }
}
