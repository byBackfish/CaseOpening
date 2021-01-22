package de.bybackfish.caseopening.items;

import de.bybackfish.caseopening.data.InvHandler;
import de.bybackfish.caseopening.data.PrizeItem;
import org.bukkit.Achievement;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TestItem4 implements PrizeItem {
    @Override
    public int quantity() {
        return 60;
    }

    @Override
    public ItemStack item() {
        return InvHandler.CI (
                Material.BROWN_MUSHROOM, "Test Item!"
        );
    }

    @Override
    public void onExecute(Player p) {
        p.awardAchievement ( Achievement.BAKE_CAKE );
    }

    @Override
    public String chesttype() {
        return "claved";
    }
}
