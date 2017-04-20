package me.clonalejandro.nmstest.listeners;

import me.clonalejandro.nmstest.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by alejandrorioscalera
 * On 21/4/17
 *
 * -- SOCIAL NETWORKS --
 *
 * GitHub: https://github.com/clonalejandro or @clonalejandro
 * Website: https://clonalejandro.me/
 * Twitter: https://twitter.com/clonalejandro11/ or @clonalejandro11
 * Keybase: https://keybase.io/clonalejandro/
 *
 * -- LICENSE --
 *
 * All rights reserved for clonalejandro ©nmstest 2017 / 2018
 */

public class Example implements Listener {
    
    
    /** SMALL CONSTRUCTOR **/
    
    private final Main plugin;
    
    public Example(Main instance){
        plugin = instance;
    }
    
    
    /** REST **/
    
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent e){
        
        Player p = e.getPlayer();
        
        String header = "test";
        String footer = ChatColor.AQUA + "bomp";
        
        Tab.sendTabHeader(p, header);
        Tab.sendTabFooter(p, footer);
    }
    
    
}
