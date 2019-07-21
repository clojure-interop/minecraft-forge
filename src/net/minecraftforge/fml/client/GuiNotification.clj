(ns net.minecraftforge.fml.client.GuiNotification
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiNotification]))

(defn ->gui-notification
  "Constructor.

  query - `net.minecraftforge.fml.common.StartupQuery`"
  (^GuiNotification [^net.minecraftforge.fml.common.StartupQuery query]
    (new GuiNotification query)))

(defn init-gui
  ""
  ([^GuiNotification this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiNotification this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

