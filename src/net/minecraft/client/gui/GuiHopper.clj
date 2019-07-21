(ns net.minecraft.client.gui.GuiHopper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiHopper]))

(defn ->gui-hopper
  "Constructor.

  player-inv - `net.minecraft.entity.player.InventoryPlayer`
  hopper-inv - `net.minecraft.inventory.IInventory`"
  (^GuiHopper [^net.minecraft.entity.player.InventoryPlayer player-inv ^net.minecraft.inventory.IInventory hopper-inv]
    (new GuiHopper player-inv hopper-inv)))

