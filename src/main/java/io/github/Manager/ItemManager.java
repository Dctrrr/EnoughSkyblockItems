package io.github.Manager;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.*;


public class ItemManager {

    public static ItemStack spaceHelm;

    public static void init() {
        createspaceHelm();
    }


    public static void createspaceHelm() {
        ItemStack item = new ItemStack(Material.RED_STAINED_GLASS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + " Space Helmet");
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC +"A rare space helmet forged ");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "from shards of moon glass.");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "from shards of moon glass.");
        lore.add("");
        lore.add("");
        lore.add("");
        lore.add("");
        lore.add("");
        lore.add("");
        lore.add("");
        lore.add(ChatColor.GRAY +" This item can be reforged!");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD  + "" + ChatColor.BOLD + "SPECIAL HELMET");
        lore.add("");
        UUID uuid = UUID.randomUUID();
        lore.add(ChatColor.GRAY + "Item UUID: " + uuid);
        meta.setUnbreakable(true);
        meta.setLore(lore);
        item.setItemMeta(meta);
        spaceHelm = item;
    }
    public static void cmdSpaceHelm(ItemStack itemStack, String playerFrom, String playerTo) {
        if (itemStack != null) {
            ItemMeta meta = itemStack.getItemMeta();
            if (meta != null) {
                List<String> lore = new ArrayList<>(meta.getLore());
                UUID uuid = UUID.randomUUID();
                meta.setDisplayName(ChatColor.RED + playerFrom + " s" + " Space Helmet");
                lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC +"A rare space helmet forged ");
                lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "from shards of moon glass.");
                lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "from shards of moon glass.");
                lore.add("");
                lore.add(ChatColor.GRAY + "From: " + playerFrom);
                lore.add(ChatColor.GRAY + "To: " + playerTo);
                lore.add("");
                lore.add(ChatColor.GRAY + "Edition: ");
                lore.add(ChatColor.GRAY + "Year: ");
                lore.add("");
                lore.add(ChatColor.GRAY +" This item can be reforged!");
                lore.add(ChatColor.RED + "" + ChatColor.BOLD  + "" + ChatColor.BOLD + "SPECIAL HELMET");
                lore.add("");
                lore.add(ChatColor.GRAY + "Item UUID: " + uuid);
                meta.getLore().clear();
                meta.setLore(lore);
                itemStack.setItemMeta(meta);
            }
        }
    }

public static ItemStack getSpaceHelm() {
        return spaceHelm;
    }
}

