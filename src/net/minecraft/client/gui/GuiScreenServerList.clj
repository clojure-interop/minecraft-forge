(ns net.minecraft.client.gui.GuiScreenServerList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiScreenServerList]))

(defn ->gui-screen-server-list
  "Constructor.

  last-screen-in - `net.minecraft.client.gui.GuiScreen`
  server-data-in - `net.minecraft.client.multiplayer.ServerData`"
  (^GuiScreenServerList [^net.minecraft.client.gui.GuiScreen last-screen-in ^net.minecraft.client.multiplayer.ServerData server-data-in]
    (new GuiScreenServerList last-screen-in server-data-in)))

(defn update-screen
  ""
  ([^GuiScreenServerList this]
    (-> this (.updateScreen))))

(defn init-gui
  ""
  ([^GuiScreenServerList this]
    (-> this (.initGui))))

(defn on-gui-closed
  ""
  ([^GuiScreenServerList this]
    (-> this (.onGuiClosed))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiScreenServerList this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

