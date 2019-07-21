(ns net.minecraft.client.gui.inventory.GuiEditStructure
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiEditStructure]))

(defn ->gui-edit-structure
  "Constructor.

  p-i-47142-1 - `net.minecraft.tileentity.TileEntityStructure`"
  (^GuiEditStructure [^net.minecraft.tileentity.TileEntityStructure p-i-47142-1]
    (new GuiEditStructure p-i-47142-1)))

(def *-legal-key-codes
  "Static Constant.

  type: int[]"
  GuiEditStructure/LEGAL_KEY_CODES)

(defn update-screen
  ""
  ([^GuiEditStructure this]
    (-> this (.updateScreen))))

(defn init-gui
  ""
  ([^GuiEditStructure this]
    (-> this (.initGui))))

(defn on-gui-closed
  ""
  ([^GuiEditStructure this]
    (-> this (.onGuiClosed))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiEditStructure this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn does-gui-pause-game
  "returns: `boolean`"
  (^Boolean [^GuiEditStructure this]
    (-> this (.doesGuiPauseGame))))

