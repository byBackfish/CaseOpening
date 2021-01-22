package de.bybackfish.caseopening.data;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public interface PrizeItem {



    public int quantity();
 //   public UUID id();
    public ItemStack item();

    public void onExecute(Player p);

    public ChestType chesttype();

}
