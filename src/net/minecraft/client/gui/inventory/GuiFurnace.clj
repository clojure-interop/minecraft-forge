(ns net.minecraft.client.gui.inventory.GuiFurnace
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiFurnace]))

(defn ->gui-furnace
  "Constructor.

  player-inv - `net.minecraft.entity.player.InventoryPlayer`
  furnace-inv - `net.minecraft.inventory.IInventory`"
  (^GuiFurnace [^net.minecraft.entity.player.InventoryPlayer player-inv ^net.minecraft.inventory.IInventory furnace-inv]
    (new GuiFurnace player-inv furnace-inv)))

