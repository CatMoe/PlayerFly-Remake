// Decompiled with: CFR 0.152
// Class Version: 8
package catmoe.fallencrystal.playerfly;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinFly
        implements Listener {
    @EventHandler
    public void onJoinFly(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (p.hasPermission(PlayerFly.autoEnablePermission)) {
            p.setAllowFlight(true);
            p.setFlying(true);
            p.setFlySpeed(0.1f);
        }
    }
}
