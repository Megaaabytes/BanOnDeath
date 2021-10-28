package megaabytes.banondeath;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class checkIfenabled implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(command.getName().equalsIgnoreCase("isbanondeathenabled")){
            if(eventListener.enabled || deathListener.enabledSpectateOnDeath){
                commandSender.sendMessage("The server is locked to one life only.");
            }else{
                commandSender.sendMessage("The server is NOT locked to one life only.");
            }
        }
        return true;
    }
}
