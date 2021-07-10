package org.managely.managelycontraband.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.managely.ManagelyCore.events.custom.ManagelyContrabandItemPickupEvent;

public class yo implements Listener {

    public yo(){

    }

    @EventHandler
    public void onTestEvent(ManagelyContrabandItemPickupEvent e){
        e.getPlayer().sendMessage("you picked up a fuckin item!");

    }
}
