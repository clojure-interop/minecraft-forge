(ns net.minecraft.client.gui.GuiMemoryErrorScreen
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiMemoryErrorScreen]))

(defn ->gui-memory-error-screen
  "Constructor."
  (^GuiMemoryErrorScreen []
    (new GuiMemoryErrorScreen )))

(defn init-gui
  ""
  ([^GuiMemoryErrorScreen this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiMemoryErrorScreen this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

