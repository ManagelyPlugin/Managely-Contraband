package org.managely.managelycontraband;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.managely.ManagelyCore.ManagelyCore;
import org.managely.ManagelyCore.modules.ManagelyModule;
import org.managely.managelycontraband.events.onItemPickup;
import org.managely.managelycontraband.events.yo;

public class Main extends JavaPlugin implements ManagelyModule {
    @Override
    public void onEnable(){
        Bukkit.getPluginManager().registerEvents(new yo(), this);
        Bukkit.getPluginManager().registerEvents(new onItemPickup(), this);
        ManagelyCore.registerModule("Contraband", this);
    }

    @Override
    public void manageCommandCalled(CommandSender commandSender, Command command, String s, String[] strings){
        commandSender.sendMessage("yo");
    }
}
