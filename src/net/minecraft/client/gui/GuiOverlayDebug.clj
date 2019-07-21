(ns net.minecraft.client.gui.GuiOverlayDebug
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiOverlayDebug]))

(defn ->gui-overlay-debug
  "Constructor.

  mc - `net.minecraft.client.Minecraft`"
  (^GuiOverlayDebug [^net.minecraft.client.Minecraft mc]
    (new GuiOverlayDebug mc)))

(defn render-debug-info
  "scaled-resolution-in - `net.minecraft.client.gui.ScaledResolution`"
  ([^GuiOverlayDebug this ^net.minecraft.client.gui.ScaledResolution scaled-resolution-in]
    (-> this (.renderDebugInfo scaled-resolution-in))))

(defn render-lagometer
  ""
  ([^GuiOverlayDebug this]
    (-> this (.renderLagometer))))

