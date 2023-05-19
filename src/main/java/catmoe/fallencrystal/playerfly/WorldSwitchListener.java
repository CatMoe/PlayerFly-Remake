package catmoe.fallencrystal.playerfly;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class WorldSwitchListener implements Listener {

    @EventHandler
    public void onPlayerChangeWorld(PlayerChangedWorldEvent event) {
        if (event.getPlayer().getWorld().getName() != PlayerFly.whitelistWorld
                && !event.getPlayer().hasPermission(PlayerFly.bypassWhitelistWorldPermission)) {
            event.getPlayer().setFlying(false);
        }
    }
}
