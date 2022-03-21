package com.github.undefinedfunc;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class HelloWorld implements Listener {
    @EventHandler
     public void onBlockPlace(BlockPlaceEvent event) {
        Material type = event.getBlock().getType();
        if (type == Material.NETHERITE_BLOCK) {
            Player player = event.getPlayer();
            player.sendMessage("Hello You");
            player.giveExpLevels(10000);
        }
    }
}
