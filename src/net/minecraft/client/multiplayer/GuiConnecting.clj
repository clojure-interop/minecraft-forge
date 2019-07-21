(ns net.minecraft.client.multiplayer.GuiConnecting
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.multiplayer GuiConnecting]))

(defn ->gui-connecting
  "Constructor.

  parent - `net.minecraft.client.gui.GuiScreen`
  mc-in - `net.minecraft.client.Minecraft`
  host-name - `java.lang.String`
  port - `int`"
  (^GuiConnecting [^net.minecraft.client.gui.GuiScreen parent ^net.minecraft.client.Minecraft mc-in ^java.lang.String host-name ^Integer port]
    (new GuiConnecting parent mc-in host-name port))
  (^GuiConnecting [^net.minecraft.client.gui.GuiScreen parent ^net.minecraft.client.Minecraft mc-in ^net.minecraft.client.multiplayer.ServerData server-data-in]
    (new GuiConnecting parent mc-in server-data-in)))

(defn update-screen
  ""
  ([^GuiConnecting this]
    (-> this (.updateScreen))))

(defn init-gui
  ""
  ([^GuiConnecting this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiConnecting this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

