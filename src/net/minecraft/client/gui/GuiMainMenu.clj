(ns net.minecraft.client.gui.GuiMainMenu
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiMainMenu]))

(defn ->gui-main-menu
  "Constructor."
  (^GuiMainMenu []
    (new GuiMainMenu )))

(def *-more-info-text
  "Static Constant.

  type: java.lang.String"
  GuiMainMenu/MORE_INFO_TEXT)

(defn update-screen
  ""
  ([^GuiMainMenu this]
    (-> this (.updateScreen))))

(defn does-gui-pause-game
  "returns: `boolean`"
  (^Boolean [^GuiMainMenu this]
    (-> this (.doesGuiPauseGame))))

(defn init-gui
  ""
  ([^GuiMainMenu this]
    (-> this (.initGui))))

(defn confirm-clicked
  "result - `boolean`
  id - `int`"
  ([^GuiMainMenu this ^Boolean result ^Integer id]
    (-> this (.confirmClicked result id))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiMainMenu this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn on-gui-closed
  ""
  ([^GuiMainMenu this]
    (-> this (.onGuiClosed))))

