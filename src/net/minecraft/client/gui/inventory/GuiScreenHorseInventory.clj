(ns net.minecraft.client.gui.inventory.GuiScreenHorseInventory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiScreenHorseInventory]))

(defn ->gui-screen-horse-inventory
  "Constructor.

  player-inv - `net.minecraft.inventory.IInventory`
  horse-inv - `net.minecraft.inventory.IInventory`
  horse - `net.minecraft.entity.passive.AbstractHorse`"
  (^GuiScreenHorseInventory [^net.minecraft.inventory.IInventory player-inv ^net.minecraft.inventory.IInventory horse-inv ^net.minecraft.entity.passive.AbstractHorse horse]
    (new GuiScreenHorseInventory player-inv horse-inv horse)))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiScreenHorseInventory this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

