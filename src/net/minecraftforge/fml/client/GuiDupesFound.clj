(ns net.minecraftforge.fml.client.GuiDupesFound
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiDupesFound]))

(defn ->gui-dupes-found
  "Constructor.

  dupes - `net.minecraftforge.fml.common.DuplicateModsFoundException`"
  (^GuiDupesFound [^net.minecraftforge.fml.common.DuplicateModsFoundException dupes]
    (new GuiDupesFound dupes)))

(defn init-gui
  ""
  ([^GuiDupesFound this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiDupesFound this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

