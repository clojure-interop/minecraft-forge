(ns net.minecraft.client.gui.GuiIngameMenu
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiIngameMenu]))

(defn ->gui-ingame-menu
  "Constructor."
  (^GuiIngameMenu []
    (new GuiIngameMenu )))

(defn init-gui
  ""
  ([^GuiIngameMenu this]
    (-> this (.initGui))))

(defn update-screen
  ""
  ([^GuiIngameMenu this]
    (-> this (.updateScreen))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiIngameMenu this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

