package de.bybackfish.caseopening.main;

import de.bybackfish.caseopening.InteractListener;
import de.bybackfish.caseopening.commands.TestCommand;
import de.bybackfish.caseopening.data.ChestOpening;
import de.bybackfish.caseopening.data.Data;
import de.bybackfish.caseopening.data.PrizeItem;
import de.bybackfish.caseopening.data.PrizeManager;
import de.bybackfish.caseopening.items.TestItem;
import de.bybackfish.caseopening.items.TestItem2;
import de.bybackfish.caseopening.items.TestItem3;
import de.bybackfish.caseopening.items.TestItem4;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.List;

public class CaseOpening extends JavaPlugin {


    private static CaseOpening main;






    @Override
    public void onEnable(){
    main = this;
        Bukkit.getConsoleSender ( ).sendMessage ( Data.Prefix + "Starting Plugin...." );

        PrizeManager.registerItem ( new TestItem() );
        PrizeManager.registerItem ( new TestItem2 () );
        PrizeManager.registerItem ( new TestItem3 () );
        PrizeManager.registerItem ( new TestItem4 () );

        Bukkit.getPluginManager ().registerEvents ( new InteractListener (), this );
        Bukkit.getConsoleSender ().sendMessage ( "Listener Loaded!" );

    }

    @Override
    public void onDisable(){
        Bukkit.getConsoleSender ( ).sendMessage ( Data.Prefix + "Stopping Plugin...." );

    }

    private void loadCommands(){

        getCommand ( "test" ).setExecutor ( new TestCommand () );
    }



    public static CaseOpening getInstance(){
        return main;
    }
}
