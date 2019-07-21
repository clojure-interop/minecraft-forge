(ns net.minecraft.client.gui.inventory.GuiDispenser
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiDispenser]))

(defn ->gui-dispenser
  "Constructor.

  player-inv - `net.minecraft.entity.player.InventoryPlayer`
  dispenser-inv - `net.minecraft.inventory.IInventory`"
  (^GuiDispenser [^net.minecraft.entity.player.InventoryPlayer player-inv ^net.minecraft.inventory.IInventory dispenser-inv]
    (new GuiDispenser player-inv dispenser-inv)))

(defn dispenser-inventory
  "Instance Field.

  type: net.minecraft.inventory.IInventory"
  (^net.minecraft.inventory.IInventory [^GuiDispenser this]
    (-> this .-dispenserInventory)))

