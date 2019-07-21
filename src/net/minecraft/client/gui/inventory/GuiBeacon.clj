(ns net.minecraft.client.gui.inventory.GuiBeacon
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiBeacon]))

(defn ->gui-beacon
  "Constructor.

  player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  tile-beacon-in - `net.minecraft.inventory.IInventory`"
  (^GuiBeacon [^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.inventory.IInventory tile-beacon-in]
    (new GuiBeacon player-inventory tile-beacon-in)))

(defn init-gui
  ""
  ([^GuiBeacon this]
    (-> this (.initGui))))

(defn update-screen
  ""
  ([^GuiBeacon this]
    (-> this (.updateScreen))))

