// Decompiled with: CFR 0.152
// Class Version: 8
package catmoe.fallencrystal.playerfly;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command
        implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String lable, String[] args) {
        Player p = (Player) sender;
        if (sender instanceof Player) {
            if (args.length == 0 && cmd.getName().equalsIgnoreCase("fly")) {
                if (p.hasPermission("fly.use") && !p.getAllowFlight()) {
                    p.setAllowFlight(true);
                    p.setFlying(true);
                    p.setFlySpeed(0.1f);
                    p.sendMessage(PlayerFly.color(PlayerFly.flyEnabled));
                } else if (p.hasPermission(PlayerFly.usePermission) && p.getAllowFlight()) {
                    p.setAllowFlight(false);
                    p.sendMessage(PlayerFly.color(PlayerFly.flyDisabled));
                } else {
                    p.sendMessage(PlayerFly.color(PlayerFly.noPermission));
                }
                return false;
            }
        } else {
            sender.sendMessage(PlayerFly.color(PlayerFly.onlyPlayer));
        }
        return false;
    }
}
