// Decompiled with: CFR 0.152
// Class Version: 8
package catmoe.fallencrystal.playerfly;

import org.bukkit.plugin.java.JavaPlugin;

public class PlayerFly extends JavaPlugin {

    static String autoEnablePermission;
    static String usePermission;
    static String flyEnabled;
    static String flyDisabled;
    static String noPermission;
    static String onlyPlayer;

    @Override
    public void onEnable() {
        this.getCommand("fly").setExecutor(new Command());
        this.getServer().getPluginManager().registerEvents(new JoinFly(), this);
        this.getServer().getConsoleSender().sendMessage(PlayerFly.color(""));
        this.getServer().getConsoleSender().sendMessage(PlayerFly.color("&bEnabling PlayerFly by @FallenCrystal_"));
        this.getServer().getConsoleSender().sendMessage(PlayerFly.color(""));
        loadConfig();
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(PlayerFly.color(""));
        getServer().getConsoleSender().sendMessage(PlayerFly.color("&cPlayerFly &cDisable!"));
        getServer().getConsoleSender().sendMessage(PlayerFly.color(""));
    }

    public static String color(String color) {
        return color.replace('&', '§');
    }

    public void loadConfig() {
        autoEnablePermission = getConfig().getString("AutoEnablePermission");
        usePermission = getConfig().getString("UsePermission");
        flyEnabled = getConfig().getString("FlyEnabled");
        flyDisabled = getConfig().getString("FlyDisabled");
        noPermission = getConfig().getString("NoPermission");
        onlyPlayer = getConfig().getString("OnlyPlayer");
    }

}
