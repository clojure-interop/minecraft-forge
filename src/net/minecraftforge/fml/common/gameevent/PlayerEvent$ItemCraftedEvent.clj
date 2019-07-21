(ns net.minecraftforge.fml.common.gameevent.PlayerEvent$ItemCraftedEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent PlayerEvent$ItemCraftedEvent]))

(defn ->item-crafted-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  crafting - `net.minecraft.item.ItemStack`
  craft-matrix - `net.minecraft.inventory.IInventory`"
  (^PlayerEvent$ItemCraftedEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack crafting ^net.minecraft.inventory.IInventory craft-matrix]
    (new PlayerEvent$ItemCraftedEvent player crafting craft-matrix)))

(defn crafting
  "Instance Constant.

  type: net.minecraft.item.ItemStack"
  (^net.minecraft.item.ItemStack [^PlayerEvent$ItemCraftedEvent this]
    (-> this .-crafting)))

(defn craft-matrix
  "Instance Constant.

  type: net.minecraft.inventory.IInventory"
  (^net.minecraft.inventory.IInventory [^PlayerEvent$ItemCraftedEvent this]
    (-> this .-craftMatrix)))

