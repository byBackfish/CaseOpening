package de.bybackfish.caseopening.data;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import java.util.Random;

public class InventoryManager {

    public static Inventory getCrateSelectInventory(){
        Inventory inv = Bukkit.createInventory ( null, 27, "Select Case");

        InvHandler.fillAll ( inv, InvHandler.CI ( Material.STAINED_GLASS_PANE, "Select an Crate", (short) 15) );

        inv.setItem ( 11, InvHandler.CI ( Material.CHEST, "Normal Case") );
        inv.setItem ( 15, InvHandler.CI ( Material.ENDER_CHEST, "Claved Case"));

        return inv;
    }
    public static Inventory getNormalChestInv(){
        Inventory inv = Bukkit.createInventory ( null, 27 , "Chest Opening");
        InvHandler.fillAll ( inv, InvHandler.CI ( Material.STAINED_GLASS_PANE, "Chest Opening", (short) 15));
        inv.setItem ( 4, InvHandler.CI ( Material.HOPPER, "Won Item" ) );

        for(int i = 9; i < 18; i++){
            inv.setItem ( i, PrizeManager.getAllNormalItems ().get ( new Random (  ).nextInt ( PrizeManager.getAllNormalItems ().size () ) ) );
        }

        return inv;
    }

    public static Inventory getClavedChestInv(){
        Inventory inv = Bukkit.createInventory ( null, 27 , "Claved Chest Opening");
        InvHandler.fillAll ( inv, InvHandler.CI ( Material.STAINED_GLASS_PANE, "Claved Chest Opening", (short) 15));
        inv.setItem ( 4, InvHandler.CI ( Material.HOPPER, "Won Item" ) );

        for(int i = 9; i < 18; i++){
            inv.setItem ( i, PrizeManager.getAllClavedItems ().get ( new Random (  ).nextInt ( PrizeManager.getAllClavedItems ().size () ) ) );
        }

        return inv;
    }




}
