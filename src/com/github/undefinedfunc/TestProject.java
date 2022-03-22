package com.github.undefinedfunc;

import com.github.undefinedfunc.commands.Feed;
import com.github.undefinedfunc.commands.Heal;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TestProject extends JavaPlugin {
    private static TestProject instance;

    @Override
    public void onEnable() {
        instance = this;
        System.out.println("Hello World!");

        Bukkit.getPluginManager().registerEvents(new HelloWorld(), this);
        getCommand("heal").setExecutor(new Heal());
        new Feed();
    }

    @Override
    public void onDisable() {
        System.out.println("Bye World!");
    }

    public static TestProject getInstance() {
        return instance;
    }
}
