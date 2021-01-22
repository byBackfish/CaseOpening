package de.bybackfish.caseopening.data;

import de.bybackfish.caseopening.main.CaseOpening;
import io.netty.channel.ChannelOutboundBuffer;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class ChestOpening implements Runnable{

    private final CaseOpening plugin;
    private final Player p;
    private final Inventory inv;
    private final String type;


    private BukkitTask task;

    public static HashMap<Player, Integer> counter = new HashMap<> (  );
    //     public static HashMap<Player, Boolean> running = new HashMap<> (  );



    public ChestOpening(CaseOpening plugin , Player p , Inventory inv, String type){
        this.p = p;
        this.plugin = plugin;
        this.inv = inv;
        this.type = type;
if(!type.equalsIgnoreCase ( "normal" )||!type.equalsIgnoreCase ( "claved" )){
    type = "normal";
}


        this.task = this.plugin.getServer ().getScheduler ().runTaskTimer ( plugin,this,2L,2L );


    }

    @Override
    public void run() {
        List<ItemStack> items = null;
        if(type.equalsIgnoreCase ( "normal" )){
            items = PrizeManager.getAllNormalItems ();
        }else{
            if(type.equalsIgnoreCase ( "claved" )){
                items = PrizeManager.getAllClavedItems ();
            }
        }
        int rnd = new Random (  ).nextInt (items.size ());
        ItemStack nextItem = items.get ( rnd );

        for(int i = 10; i < 18; i++)
            moveItem ( i );
     //   p.closeInventory ();
             p.openInventory ( inv );
        p.playSound ( p.getLocation (), Sound.CLICK, 10L, 10L );
        counter.put ( p, counter.get ( p ) + 1 );

        checkEnd ();
        //      running.put ( p, true );

    }

    public void moveItem(int slot){
        if(type.equalsIgnoreCase ( "normal" )) {
            int rnd = new Random ( ).nextInt ( PrizeManager.getAllNormalItems ( ).size ( ) );
            if (inv.getItem ( slot ) != null)
                inv.setItem ( (slot - 1) , inv.getItem ( slot ) );
            inv.setItem ( 17 , PrizeManager.getAllNormalItems ( ).get ( rnd ) );
        }else if(type.equalsIgnoreCase ( "claved" )){
            int rnd = new Random ( ).nextInt ( PrizeManager.getAllClavedItems ( ).size ( ) );
            if (inv.getItem ( slot ) != null)
                inv.setItem ( (slot - 1) , inv.getItem ( slot ) );
            inv.setItem ( 17 , PrizeManager.getAllClavedItems ( ).get ( rnd ) );


        }
    }

    public void checkEnd(){
        if(counter.get ( p ) >= 50){
            task.cancel ();
            p.sendMessage ( "You won" + inv.getItem ( 13 ).getItemMeta ().getDisplayName () );
            ItemStack i = inv.getItem ( 13 );


            //    running.put ( p, false );

            PrizeItem prize = PrizeManager.getPrizeItem ( i );
            if(prize != null)
             prize.onExecute (p);
            else
                throw new NullPointerException ( "Prize Item wasnt added To Prize List!" );

        }

        if(counter.get ( p ) == 25){
            task.cancel ();
            this.task = this.plugin.getServer ().getScheduler ().runTaskTimer ( plugin,this,4L,4L );
        }

        if(counter.get ( p ) == 35){
            task.cancel ();
            this.task = this.plugin.getServer ().getScheduler ().runTaskTimer ( plugin,this,6L,6L );
        }

        if(counter.get ( p ) == 45){
            task.cancel ();
            this.task = this.plugin.getServer ().getScheduler ().runTaskTimer ( plugin,this,10L,10L );
        }
    }
}
