(ns net.minecraft.client.renderer.RenderHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer RenderHelper]))

(defn ->render-helper
  "Constructor."
  (^RenderHelper []
    (new RenderHelper )))

(defn *disable-standard-item-lighting
  ""
  ([]
    (RenderHelper/disableStandardItemLighting )))

(defn *enable-standard-item-lighting
  ""
  ([]
    (RenderHelper/enableStandardItemLighting )))

(defn *set-color-buffer
  "p-74521-0 - `float`
  p-74521-1 - `float`
  p-74521-2 - `float`
  p-74521-3 - `float`

  returns: `java.nio.FloatBuffer`"
  (^java.nio.FloatBuffer [^Float p-74521-0 ^Float p-74521-1 ^Float p-74521-2 ^Float p-74521-3]
    (RenderHelper/setColorBuffer p-74521-0 p-74521-1 p-74521-2 p-74521-3)))

(defn *enable-gui-standard-item-lighting
  ""
  ([]
    (RenderHelper/enableGUIStandardItemLighting )))

