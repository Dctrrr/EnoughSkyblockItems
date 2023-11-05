package io.github;

import io.github.Manager.*;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {

    private static Main instance;

    public static Main getInstance() {
        return Main.instance;
    }

    @Override
    public void onEnable() {

        Main.instance = this;

        ItemManager.init();
    }
}