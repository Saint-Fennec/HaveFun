package com.fennec.havefun;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerRecipeDiscoverEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.EulerAngle;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Have fun");
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onBreak(BlockBreakEvent q) {
        Player player = q.getPlayer();
        player.sendMessage("Did you break something?");
        Location l = player.getLocation();
        World world = Bukkit.getWorld("world");
        world.spawnEntity(l, EntityType.PRIMED_TNT);
        final int fusingTimeInSeconds = 1;
    }

    @EventHandler
    public void onLearn(PlayerRecipeDiscoverEvent b) {
        Player player = b.getPlayer();
        player.sendMessage("Did you unlock a recipe?");
        Location l = player.getLocation();
        World world = Bukkit.getWorld("world");
        world.spawnEntity(l, EntityType.PRIMED_TNT);
        final int fusingTimeInSeconds = 1;
    }

    @EventHandler
    public void onBreakNether(BlockBreakEvent q) {
        Player player = q.getPlayer();
        player.sendMessage("Did you break something?");
        Location l = player.getLocation();
        World world = Bukkit.getWorld("world_nether");
        world.spawnEntity(l, EntityType.PRIMED_TNT);
        final int fusingTimeInSeconds = 1;
    }
    @EventHandler
    public void onBreakEnd(BlockBreakEvent q) {
        Player player = q.getPlayer();
        player.sendMessage("Did you break something?");
        Location l = player.getLocation();
        World world = Bukkit.getWorld("world_the_end");
        world.spawnEntity(l, EntityType.PRIMED_TNT);
        final int fusingTimeInSeconds = 1;
    }

}
