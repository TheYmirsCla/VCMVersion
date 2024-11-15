package me.wikmor.vcmversion;

import org.bukkit.plugin.java.JavaPlugin;

public final class VCMVersion extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("VCMVersion addon has been enabled.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("VCMVersion addon has been disabled.");
    }
}
