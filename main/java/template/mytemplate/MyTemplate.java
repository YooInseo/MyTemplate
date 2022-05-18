package template.mytemplate;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import template.mytemplate.cmd.cmd;

import java.util.Arrays;

public final class MyTemplate extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("").setExecutor(new cmd());
        Listener[] events = {};
        PluginManager pm = Bukkit.getPluginManager();
        Arrays.stream(events).forEach(classes -> {
            pm.registerEvents(classes, this);
        });
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
