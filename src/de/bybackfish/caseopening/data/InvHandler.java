package de.bybackfish.caseopening.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.ArrayUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class InvHandler {

    public static Inventory create(String name, int size) {

        return Bukkit.createInventory(null, size, name);
    }

    public static Inventory create(String name, InventoryType type) {
        return Bukkit.createInventory(null, type, name);

    }

    public static ItemStack setUnstackerble(ItemStack e) {
        ItemMeta meta = e.getItemMeta();
        ArrayList<String> lore = meta.getLore()!= null ? (ArrayList<String>) meta.getLore() : new ArrayList<String>(); {
        };
        String randomHex = new String();
        for(int i = 0;i<10;i++) {
            int random = new Random().nextInt(15) ;
            randomHex+= random>9 ? Arrays.asList("a","b","c","d","e","f").get(random-9):""+random;

        }

        lore.add("§0"+randomHex);
        meta.setLore(lore);
        e.setItemMeta(meta);

        return e;

    }
    public static ItemStack CI(Material m, String name) {
        ItemStack item = new ItemStack(m, 1);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        item.setItemMeta(itemm);

        return item;

    }

    public static ItemStack CI(Material m, String name ,ItemFlag flag) {
        ItemStack item = new ItemStack(m, 1);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addItemFlags(flag);
        item.setItemMeta(itemm);

        return item;

    }
    public static ItemStack CI(Material m, String name ,ItemFlag flag,List<String>Lore) {
        ItemStack item = new ItemStack(m, 1);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addItemFlags(flag);
        itemm.setLore(Lore);
        item.setItemMeta(itemm);

        return item;

    }
    public static ItemStack CI(Material m, String name ,List<String>Lore) {
        ItemStack item = new ItemStack(m, 1);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);

        itemm.setLore(Lore);
        item.setItemMeta(itemm);

        return item;

    }
    public static ItemStack CI(Material m, String name ,ItemFlag flag,ItemFlag flag1,ArrayList<String>Lore) {
        ItemStack item = new ItemStack(m, 1);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addItemFlags(flag);
        itemm.addItemFlags(flag1);
        itemm.setLore(Lore);
        item.setItemMeta(itemm);

        return item;

    }

    public static ItemStack CI(Material m, String name ,ItemFlag flag, Short i) {
        ItemStack item = new ItemStack(m, 1, i);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addItemFlags(flag);
        item.setItemMeta(itemm);

        return item;

    }
    public static ItemStack CI(Material m, String name ,ItemFlag flag,ArrayList<String>Lore, Short i) {
        ItemStack item = new ItemStack(m, 1, i);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addItemFlags(flag);
        itemm.setLore(Lore);
        item.setItemMeta(itemm);

        return item;

    }
    public static ItemStack CI(Material m, String name ,ItemFlag flag,ItemFlag flag1,ArrayList<String>Lore, Short i) {
        ItemStack item = new ItemStack(m, 1, i);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addItemFlags(flag);
        itemm.addItemFlags(flag1);
        itemm.setLore(Lore);
        item.setItemMeta(itemm);

        return item;

    }


    public static ItemStack CI(Material m, String name, Short i) {
        ItemStack item = new ItemStack(m, 1, i);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        item.setItemMeta(itemm);

        return item;

    }
    //->
    public static ItemStack CI(Material m, String name,Enchantment entch,int level) {
        ItemStack item = new ItemStack(m, 1);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addEnchant(entch, level, true);
        item.setItemMeta(itemm);

        return item;

    }

    public static ItemStack CI(Material m, String name ,ItemFlag flag,Enchantment entch,int level) {
        ItemStack item = new ItemStack(m, 1);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addItemFlags(flag);
        itemm.addEnchant(entch, level, true);
        item.setItemMeta(itemm);

        return item;

    }
    public static ItemStack CI(Material m, String name ,ItemFlag flag,ArrayList<String>Lore,Enchantment entch,int level) {
        ItemStack item = new ItemStack(m, 1);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addItemFlags(flag);
        itemm.setLore(Lore);
        itemm.addEnchant(entch, level, true);
        item.setItemMeta(itemm);

        return item;

    }
    public static ItemStack CI(Material m, String name ,ItemFlag flag,ItemFlag flag1,ArrayList<String>Lore,Enchantment entch,int level) {
        ItemStack item = new ItemStack(m, 1);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addItemFlags(flag);
        itemm.addItemFlags(flag1);
        itemm.setLore(Lore);
        itemm.addEnchant(entch, level, true);
        item.setItemMeta(itemm);

        return item;

    }

    public static ItemStack CI(Material m, String name ,ItemFlag flag, Short i,Enchantment entch,int level) {
        ItemStack item = new ItemStack(m, 1, i);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addItemFlags(flag);
        itemm.addEnchant(entch, level, true);
        item.setItemMeta(itemm);

        return item;

    }
    public static ItemStack CI(Material m, String name ,ItemFlag flag,ArrayList<String>Lore, Short i,Enchantment entch,int level) {
        ItemStack item = new ItemStack(m, 1, i);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addItemFlags(flag);
        itemm.setLore(Lore);
        itemm.addEnchant(entch, level, true);
        item.setItemMeta(itemm);

        return item;

    }
    public static ItemStack CI(Material m, String name ,ItemFlag flag,ItemFlag flag1,ArrayList<String>Lore, Short i,Enchantment entch,int level) {
        ItemStack item = new ItemStack(m, 1, i);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addItemFlags(flag);
        itemm.addItemFlags(flag1);
        itemm.setLore(Lore);
        itemm.addEnchant(entch, level, true);
        item.setItemMeta(itemm);

        return item;

    }


    public static ItemStack CI(Material m, String name, Short i,Enchantment entch,int level) {
        ItemStack item = new ItemStack(m, 1, i);
        ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName(name);
        itemm.addEnchant(entch, level, true);
        item.setItemMeta(itemm);

        return item;

    }
    //-<

    // 1 1
    public static Inventory fill(Inventory inv, ItemStack mat, int fromX, int fromY, int toX, int toY) {
        int slotfrom = fromY * 9 + fromX;
        int slotto = toY * 9 + toX;
        if (fromX == toX) {
            if (toY - fromY < 0) {
                // <-

                for (int i = 0; i <= fromY - toY; i++) {
                    inv.setItem(slotfrom - 9 * i, mat);

                }
                inv.setItem(slotfrom, mat);
                inv.setItem(slotto, mat);

            } else if (toY - fromY > 0) {
                // ->

                for (int i = 0; i <= toY - fromY; i++) {
                    inv.setItem(slotfrom + 9 * i, mat);

                }
                inv.setItem(slotfrom, mat);
                inv.setItem(slotto, mat);

            }

        } else if (fromY == toY) {
            if (toX - fromX < 0) {
                // <-

                for (int i = 0; i <= fromX - toX; i++) {
                    inv.setItem(slotfrom - i, mat);

                }
                inv.setItem(slotfrom, mat);
                inv.setItem(slotto, mat);

            } else if (toX - fromX > 0) {

                // ->

                for (int i = 0; i <= toX - fromX; i++) {
                    inv.setItem(slotfrom + i, mat);

                }
                inv.setItem(slotfrom, mat);
                inv.setItem(slotto, mat);
            }

        } else {
            int[] cords = { slotfrom, slotto };
            Arrays.sort(cords);
            ArrayUtils.reverse(cords);

            for (int i = cords[1]; i < cords[0]; i++) {
                inv.setItem(i, mat);

            }
            inv.setItem(slotfrom, mat);
            inv.setItem(slotto, mat);

        }

        return inv;

    }

    public static Inventory fill(Inventory inv, ItemStack mat, int[] cordfrom, int[] cordto) {
        int fromX = cordfrom[0];
        int fromY = cordfrom[1];
        int toX = cordto[0];
        int toY = cordto[1];
        return InvHandler.fill(inv, mat, fromX, fromY, toX, toY);


    }
    public static ItemStack CH(String name ,String Display) {
        @SuppressWarnings("deprecation")
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());

        SkullMeta meta = (SkullMeta) skull.getItemMeta();
        meta.setOwner(name);
        meta.setDisplayName(Display);
        skull.setItemMeta(meta);
        return skull;


    }
    public static Inventory clearRect(Inventory inv, int[] cordfrom, int[] cordto) {
        int fromX = cordfrom[0];
        int fromY = cordfrom[1];
        int toX = cordto[0];
        int toY = cordto[1];
        return InvHandler.fill(inv, new ItemStack(Material.AIR), fromX, fromY, toX, toY);

    }
    public static Inventory clearRect(Inventory inv,int fromX, int fromY, int toX, int toY) {

        return InvHandler.fill(inv, new ItemStack(Material.AIR), fromX, fromY, toX, toY);

    }

    public static int[] slotToCord(int slot) {
        int x;
        int y;
        y = slot / 9;
        x = slot - y;
        int[] statment = { x, y };

        return statment;
    }

    public static int[] easycordToCord(int x,int y) {

        int[] statment = { x, y };

        return statment;
    }

    public static int cordToSlot(int[] cord) {

        return cord[1] * 9 + cord[0];
    }

    public static Inventory move(Inventory inv, int fromX, int fromY, int toX, int toY) {
        ItemStack befor = inv.getItem(toY * 9 + toX);
        inv.setItem(toY * 9 + toX, inv.getItem(fromY * 9 + fromX));
        inv.setItem(fromY * 9 + fromX, befor);

        return inv;
    }
    public static Inventory move(Inventory inv, int[] cordfrom, int[] cordto) {

        int fromX = cordfrom[0];
        int fromY = cordfrom[1];
        int toX = cordto[0];
        int toY = cordto[1];
        return move(inv, fromX, fromY, toX, toY);


    }

    public static Inventory set(Inventory inv, ItemStack mat, int toX, int toY) {

        int slotto = toY * 9 + toX;
        inv.setItem(slotto, mat);


        return inv;
    }
    public static Inventory set(Inventory inv, ItemStack mat,int [] cord) {


        inv.setItem(InvHandler.cordToSlot(cord), mat);


        return inv;
    }

    public static Inventory quarrySet(Inventory inv, ItemStack mat,List<int[]> cords) {

        for(int i =0;i<cords.size();i++) {


            inv.setItem(InvHandler.cordToSlot(cords.get(i)), mat);

        }


        return inv;
    }

    public static Inventory fillAll(Inventory inv, ItemStack i) {
        for(int it = 0; it < inv.getSize(); it++)
            inv.setItem(it, i);
        return inv;
    }
}
