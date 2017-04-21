package me.clonalejandro.nmstest.listeners;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerListHeaderFooter;
import net.minecraft.server.v1_8_R3.PlayerConnection;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;

/**
 * Created by alejandrorioscalera
 * On 20/4/17
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

public class Tab {


    /**
     * 
     * @param p
     * @param header
     */
    
    public static void sendTabHeader(Player p, String header){

        CraftPlayer cp = (CraftPlayer) p;
        PlayerConnection connection = cp.getHandle().playerConnection;

        IChatBaseComponent top = IChatBaseComponent.ChatSerializer.a("{text: '" + header + "'}");

        PacketPlayOutPlayerListHeaderFooter packet = new PacketPlayOutPlayerListHeaderFooter();

        try {

            Field headerfield = packet.getClass().getDeclaredField("a");

            headerfield.setAccessible(true);
            headerfield.set(packet, top);
            headerfield.setAccessible(!headerfield.isAccessible());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        connection.sendPacket(packet);
    }


    /**
     * 
     * @param p
     * @param footer
     */
    
    public static void sendTabFooter(Player p, String footer){

        CraftPlayer cp = (CraftPlayer) p;
        PlayerConnection connection = cp.getHandle().playerConnection;

        IChatBaseComponent bottom = IChatBaseComponent.ChatSerializer.a("{text: '" + footer + "'}");

        PacketPlayOutPlayerListHeaderFooter packet = new PacketPlayOutPlayerListHeaderFooter();

        try {

            Field footerField = packet.getClass().getDeclaredField("b");

            footerField.setAccessible(true);
            footerField.set(packet, bottom);
            footerField.setAccessible(!footerField.isAccessible());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        connection.sendPacket(packet);
    }


}
