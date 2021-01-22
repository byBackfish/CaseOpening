package de.bybackfish.caseopening;

import de.bybackfish.caseopening.data.*;
import de.bybackfish.caseopening.main.CaseOpening;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

import java.util.Random;

public class InteractListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent e){


        if(e.getAction () == Action.RIGHT_CLICK_BLOCK) {
            if (e.getClickedBlock ( ).getType ( ).equals ( Material.ENDER_CHEST )) {

                        e.setCancelled ( true );
                        e.getPlayer ().openInventory ( InventoryManager.getCrateSelectInventory () );

                }
            }
        }


    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        if(e.getInventory ().getTitle ().equals ( "Chest Opening" )){
            e.setCancelled ( true );
        }

        if(e.getInventory ().getTitle ().equalsIgnoreCase ("Select Case"  )){
            if(e.getCurrentItem ().getType ().equals ( Material.CHEST )){
                openCrate ( (Player) e.getWhoClicked (), "normal" );
            }else if(e.getCurrentItem ().getType ().equals ( Material.ENDER_CHEST )){
                openCrate ( (Player) e.getWhoClicked (), "claved" );
            }

            e.setCancelled ( true );
        }
    }



    public void openCrate(Player p, String type) {
        if (type.equalsIgnoreCase ( "normal" )) {
            p.openInventory ( InventoryManager.getNormalChestInv ( ) );
            new ChestOpening ( CaseOpening.getInstance ( ) , p , InventoryManager.getNormalChestInv () , type);
            ChestOpening.counter.put ( p , 0 );
        }

        else if(type.equalsIgnoreCase ( "claved" )){
            p.openInventory ( InventoryManager.getNormalChestInv ( ) );
            new ChestOpening ( CaseOpening.getInstance ( ) , p , InventoryManager.getClavedChestInv () , type);
            ChestOpening.counter.put ( p , 0 );


        }
    }
}
