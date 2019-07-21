(ns net.minecraft.client.gui.GuiDownloadTerrain
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiDownloadTerrain]))

(defn ->gui-download-terrain
  "Constructor.

  net-handler - `net.minecraft.client.network.NetHandlerPlayClient`"
  (^GuiDownloadTerrain [^net.minecraft.client.network.NetHandlerPlayClient net-handler]
    (new GuiDownloadTerrain net-handler)))

(defn init-gui
  ""
  ([^GuiDownloadTerrain this]
    (-> this (.initGui))))

(defn update-screen
  ""
  ([^GuiDownloadTerrain this]
    (-> this (.updateScreen))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiDownloadTerrain this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn does-gui-pause-game
  "returns: `boolean`"
  (^Boolean [^GuiDownloadTerrain this]
    (-> this (.doesGuiPauseGame))))

