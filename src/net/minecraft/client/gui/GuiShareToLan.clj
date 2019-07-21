(ns net.minecraft.client.gui.GuiShareToLan
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiShareToLan]))

(defn ->gui-share-to-lan
  "Constructor.

  last-screen-in - `net.minecraft.client.gui.GuiScreen`"
  (^GuiShareToLan [^net.minecraft.client.gui.GuiScreen last-screen-in]
    (new GuiShareToLan last-screen-in)))

(defn init-gui
  ""
  ([^GuiShareToLan this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiShareToLan this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

