package io.github.manager

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.ItemStack

object ItemType : Listener {
    @EventHandler
    fun onPlayerInteract(event: PlayerInteractEvent) {
        val player = event.player
        val itemInHand = event.item
        if (event.action == org.bukkit.event.block.Action.RIGHT_CLICK_AIR || event.action == org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK) {
            if (isSpaceHelm(itemInHand)) {
                val helmetSlotItem = player.inventory.helmet
                player.inventory.helmet = itemInHand
                player.inventory.setItemInHand(helmetSlotItem)

            }
        }
    }

    private fun isSpaceHelm(item: ItemStack?): Boolean {
        return item?.isSimilar(ItemManager.getSpaceHelm()) ?: false
    }
}
