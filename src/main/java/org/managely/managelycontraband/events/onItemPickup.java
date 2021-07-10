package org.managely.managelycontraband.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.managely.ManagelyCore.events.custom.ManagelyContrabandItemPickupEvent;

public class onItemPickup implements Listener {
    @EventHandler
    public void onPickupItem(EntityPickupItemEvent e){
        if (e.getEntity() instanceof Player) {
            if(true /* TODO: implement groups system, i'm just testing events here. */){
                ManagelyContrabandItemPickupEvent event = new ManagelyContrabandItemPickupEvent((Player) e.getEntity(), e.getItem().getItemStack().getType());
                Bukkit.getPluginManager().callEvent(event);

            }

        }
    }
}
