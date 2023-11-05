package io.github;

import io.github.commands.ItemsGUICMD;
import io.github.commands.SpaceHelmCMD;
import io.github.gui.ItemsGUI;
import io.github.manager.*;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {

    private static Main instance;

    public static Main getInstance() {
        return Main.instance;
    }

    @Override
    public void onEnable() {

        Main.instance = this;


        getCommand ("spacehelm").setExecutor (new SpaceHelmCMD());
        getCommand("$aib").setExecutor (new ItemsGUICMD());

        getServer().getPluginManager ().registerEvents (new ItemsGUI(), this);

        ItemManager.init();
    }
}