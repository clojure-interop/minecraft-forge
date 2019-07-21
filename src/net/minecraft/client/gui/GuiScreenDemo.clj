(ns net.minecraft.client.gui.GuiScreenDemo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiScreenDemo]))

(defn ->gui-screen-demo
  "Constructor."
  (^GuiScreenDemo []
    (new GuiScreenDemo )))

(defn init-gui
  ""
  ([^GuiScreenDemo this]
    (-> this (.initGui))))

(defn draw-default-background
  ""
  ([^GuiScreenDemo this]
    (-> this (.drawDefaultBackground))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiScreenDemo this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

