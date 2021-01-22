package de.bybackfish.caseopening.commands;

import de.bybackfish.caseopening.data.Data;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender cs , Command cmd , String s , String[] args) {
        if(cs instanceof Player){
            Player p = (Player) cs;
            if(p.hasPermission ( "caseopening.test" )){
                    p.sendMessage ( Data.Prefix + " Test Completed!" );
            }else{

            }
        }


        return false;
    }
}
