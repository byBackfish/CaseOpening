package de.bybackfish.caseopening.items;

import de.bybackfish.caseopening.data.InvHandler;
import de.bybackfish.caseopening.data.PrizeItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TestItem implements PrizeItem {
    @Override
    public int quantity() {
        return 10;
    }

    @Override
    public ItemStack item() {
        return InvHandler.CI ( Material.STICK, "FLY" );
    }

    @Override
    public void onExecute(Player p) {

        Bukkit.broadcastMessage ( "ahjdhasdha" );

    }

    @Override
    public String chesttype() {
        return "normal";
    }
}
