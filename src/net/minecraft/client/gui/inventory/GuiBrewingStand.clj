(ns net.minecraft.client.gui.inventory.GuiBrewingStand
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiBrewingStand]))

(defn ->gui-brewing-stand
  "Constructor.

  player-inv - `net.minecraft.entity.player.InventoryPlayer`
  p-i-45506-2 - `net.minecraft.inventory.IInventory`"
  (^GuiBrewingStand [^net.minecraft.entity.player.InventoryPlayer player-inv ^net.minecraft.inventory.IInventory p-i-45506-2]
    (new GuiBrewingStand player-inv p-i-45506-2)))

