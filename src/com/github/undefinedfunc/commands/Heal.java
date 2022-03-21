package com.github.undefinedfunc.commands;

import com.github.undefinedfunc.Msg;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            Msg.send(commandSender, "&cOnly fuckers can see this message");
            return true;
        }

        Player player = (Player) commandSender;
        player.setHealth(20.0d);
        return true;
    }
}
