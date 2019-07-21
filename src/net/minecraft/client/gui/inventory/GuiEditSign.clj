(ns net.minecraft.client.gui.inventory.GuiEditSign
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiEditSign]))

(defn ->gui-edit-sign
  "Constructor.

  te-sign - `net.minecraft.tileentity.TileEntitySign`"
  (^GuiEditSign [^net.minecraft.tileentity.TileEntitySign te-sign]
    (new GuiEditSign te-sign)))

(defn init-gui
  ""
  ([^GuiEditSign this]
    (-> this (.initGui))))

(defn on-gui-closed
  ""
  ([^GuiEditSign this]
    (-> this (.onGuiClosed))))

(defn update-screen
  ""
  ([^GuiEditSign this]
    (-> this (.updateScreen))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiEditSign this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

