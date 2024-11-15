package me.wikmor.vcmversion;

import org.bukkit.plugin.java.JavaPlugin;

public final class VCMVersion extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("VCMVersion addon has been enabled.");

        // Load version-specific settings
        loadVersionSettings();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("VCMVersion addon has been disabled.");
    }

    private void loadVersionSettings() {
        String serverVersion = VersionCompatibility.getServerVersion();
        getLogger().info("Server version: " + serverVersion);

        // Apply version-specific settings here
        switch (serverVersion) {
            case "v1_17_R1":
                enableChatFormatting(true);
                enableNicknameSupport(true);
                enablePronounSupport(true);
                break;
            case "v1_18_R1":
                enableChatFormatting(true);
                enableNicknameSupport(true);
                enablePronounSupport(true);
                break;
            case "v1_19_R1":
                enableChatFormatting(true);
                enableNicknameSupport(true);
                enablePronounSupport(true);
                break;
            case "v1_20_R1":
                enableChatFormatting(true);
                enableNicknameSupport(true);
                enablePronounSupport(true);
                break;
            case "v1_21_R1":
                enableChatFormatting(true);
                enableNicknameSupport(true);
                enablePronounSupport(true);
                break;
            default:
                getLogger().warning("Unsupported server version: " + serverVersion);
                break;
        }
    }

    private void enableChatFormatting(boolean enabled) {
        if (enabled) {
            getLogger().info("Chat formatting is enabled.");
            // Add chat formatting logic here
        } else {
            getLogger().info("Chat formatting is disabled.");
        }
    }

    private void enableNicknameSupport(boolean enabled) {
        if (enabled) {
            getLogger().info("Nickname support is enabled.");
            // Add nickname support logic here
        } else {
            getLogger().info("Nickname support is disabled.");
        }
    }

    private void enablePronounSupport(boolean enabled) {
        if (enabled) {
            getLogger().info("Pronoun support is enabled.");
            // Add pronoun support logic here
        } else {
            getLogger().info("Pronoun support is disabled.");
        }
    }
}
