package io.github.Commands;

import io.github.Main;
import io.github.Manager.ItemManager;
import io.github.Manager.Rarity;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class SpaceHelmCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 1) {
                String targetPlayerName = args[0];
                Player targetPlayer = Main.getInstance().getServer().getPlayer(targetPlayerName);

                if (targetPlayer != null) {
                    ItemStack spaceHelm = ItemManager.spaceHelm;
                    if (spaceHelm != null) {
                        targetPlayer.getInventory().addItem(spaceHelm);
                        ItemManager.cmdSpaceHelm(spaceHelm, "playerFrom", "playerTo");

                        player.sendMessage("Space Helmet given to " + targetPlayerName);
                    } else {
                        player.sendMessage("Unable to find the player: " + targetPlayerName);
                    }
                }
            }
        }
        return true;
    } }
