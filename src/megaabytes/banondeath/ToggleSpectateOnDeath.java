package megaabytes.banondeath;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ToggleSpectateOnDeath implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(command.getName().equalsIgnoreCase("togglespectateondeath")){
            Player player = (Player) commandSender;
            if(commandSender instanceof Player){
                if(player.isOp()){
                    if(!deathListener.enabledSpectateOnDeath){
                        deathListener.enabledSpectateOnDeath = true;
                        eventListener.enabled = false;
                        commandSender.sendMessage("Players are now locked to one life.");
                    }else{
                        deathListener.enabledSpectateOnDeath = false;
                        eventListener.enabled = false;
                        commandSender.sendMessage("Players are no-longer locked to one life.");
                    }
                }else{
                    commandSender.sendMessage("You must be an operator to use that command!");
                }
            }else{
                if(!deathListener.enabledSpectateOnDeath){
                    deathListener.enabledSpectateOnDeath = true;
                    eventListener.enabled = false;
                    commandSender.sendMessage("Players are now locked to one life.");
                }else{
                    deathListener.enabledSpectateOnDeath = false;
                    eventListener.enabled = false;
                    commandSender.sendMessage("Players are no-longer locked to one life.");
                }
            }
        }
        return true;
    }
}
