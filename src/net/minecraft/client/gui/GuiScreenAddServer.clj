(ns net.minecraft.client.gui.GuiScreenAddServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiScreenAddServer]))

(defn ->gui-screen-add-server
  "Constructor.

  parent-screen-in - `net.minecraft.client.gui.GuiScreen`
  server-data-in - `net.minecraft.client.multiplayer.ServerData`"
  (^GuiScreenAddServer [^net.minecraft.client.gui.GuiScreen parent-screen-in ^net.minecraft.client.multiplayer.ServerData server-data-in]
    (new GuiScreenAddServer parent-screen-in server-data-in)))

(defn update-screen
  ""
  ([^GuiScreenAddServer this]
    (-> this (.updateScreen))))

(defn init-gui
  ""
  ([^GuiScreenAddServer this]
    (-> this (.initGui))))

(defn on-gui-closed
  ""
  ([^GuiScreenAddServer this]
    (-> this (.onGuiClosed))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiScreenAddServer this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

