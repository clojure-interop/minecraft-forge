(ns net.minecraft.client.gui.inventory.GuiChest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiChest]))

(defn ->gui-chest
  "Constructor.

  upper-inv - `net.minecraft.inventory.IInventory`
  lower-inv - `net.minecraft.inventory.IInventory`"
  (^GuiChest [^net.minecraft.inventory.IInventory upper-inv ^net.minecraft.inventory.IInventory lower-inv]
    (new GuiChest upper-inv lower-inv)))

