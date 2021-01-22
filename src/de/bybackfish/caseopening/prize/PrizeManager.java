package de.bybackfish.caseopening.data;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.bukkit.craftbukkit.libs.jline.internal.Nullable;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class PrizeManager {

    protected static List<PrizeItem> pool = new ArrayList<> (  );


    public static void registerItem(PrizeItem prize){
        pool.add ( prize );
        System.out.println ( "Added Item: " + prize.item ().toString () );
    }

    public static List<ItemStack> getAllNormalItems(){
        List<ItemStack> statement = new ArrayList<> (  );

        for(PrizeItem item : pool){
            if(item.chesttype () == ChestType.NORMAL) {
                for (int i = 0; i < item.quantity ( ); i++) {
                    statement.add ( item.item ( ) );

                }
            }
        }

        return statement;
    }

    public static List<ItemStack> getAllClavedItems(){
        List<ItemStack> statement = new ArrayList<> (  );

        for(PrizeItem item : pool){
            if(item.chesttype () == ChestType.CLAVED) {
                for (int i = 0; i < item.quantity ( ); i++) {
                    statement.add ( item.item ( ) );

                }
            }
        }

        return statement;
    }
    @Nullable
    public static PrizeItem getPrizeItem(ItemStack i){
        for(PrizeItem item : pool)
            if(item.item ().equals (i))
                    return item;



        return null;
    }





}
