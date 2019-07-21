(ns net.minecraft.client.gui.inventory.GuiShulkerBox
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiShulkerBox]))

(defn ->gui-shulker-box
  "Constructor.

  p-i-47233-1 - `net.minecraft.entity.player.InventoryPlayer`
  p-i-47233-2 - `net.minecraft.inventory.IInventory`"
  (^GuiShulkerBox [^net.minecraft.entity.player.InventoryPlayer p-i-47233-1 ^net.minecraft.inventory.IInventory p-i-47233-2]
    (new GuiShulkerBox p-i-47233-1 p-i-47233-2)))

