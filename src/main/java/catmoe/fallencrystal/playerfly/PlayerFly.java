// Decompiled with: CFR 0.152
// Class Version: 8
package catmoe.fallencrystal.playerfly;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class PlayerFly extends JavaPlugin {

    static String autoEnablePermission;
    static String usePermission;
    static String flyEnabled;
    static String flyDisabled;
    static String noPermission;
    static String onlyPlayer;
    static String whitelistWorld;
    static String bypassWhitelistWorldPermission;

    @Override
    public void onEnable() {
        this.getCommand("fly").setExecutor(new FlyCommand());
        this.getServer().getPluginManager().registerEvents(new JoinFly(), this);
        this.getServer().getPluginManager().registerEvents(new WorldSwitchListener(), this);
        List<String> enableMessages = new ArrayList<>();
        enableMessages.add("");
        enableMessages.add("&bEnabling PlayerFly by @FallenCrystal_");
        enableMessages.add("");
        for (String msg : enableMessages) {
            getServer().getConsoleSender().sendMessage(color(msg));
        }
        loadConfig();
    }

    @Override
    public void onDisable() {
        List<String> disableMessages = new ArrayList<>();
        disableMessages.add("");
        disableMessages.add("&cPlayerFly &cDisable!");
        disableMessages.add("");
        for (String msg : disableMessages) {
            getServer().getConsoleSender().sendMessage(color(msg));
        }
    }

    public static String color(String color) {
        return ChatColor.translateAlternateColorCodes('&', color);
    }

    public void loadConfig() {
        autoEnablePermission = getConfig().getString("AutoEnablePermission");
        usePermission = getConfig().getString("UsePermission");
        flyEnabled = getConfig().getString("FlyEnabled");
        flyDisabled = getConfig().getString("FlyDisabled");
        noPermission = getConfig().getString("NoPermission");
        onlyPlayer = getConfig().getString("OnlyPlayer");
        whitelistWorld = getConfig().getString("WhitelistWorld");
        bypassWhitelistWorldPermission = getConfig().getString("BypassWhitelistWorldPermission");
    }

}
