(ns net.minecraft.client.gui.GuiFlatPresets
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiFlatPresets]))

(defn ->gui-flat-presets
  "Constructor.

  p-i-46318-1 - `net.minecraft.client.gui.GuiCreateFlatWorld`"
  (^GuiFlatPresets [^net.minecraft.client.gui.GuiCreateFlatWorld p-i-46318-1]
    (new GuiFlatPresets p-i-46318-1)))

(defn init-gui
  ""
  ([^GuiFlatPresets this]
    (-> this (.initGui))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiFlatPresets this]
    (-> this (.handleMouseInput))))

(defn on-gui-closed
  ""
  ([^GuiFlatPresets this]
    (-> this (.onGuiClosed))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiFlatPresets this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn update-screen
  ""
  ([^GuiFlatPresets this]
    (-> this (.updateScreen))))

(defn update-button-validity
  ""
  ([^GuiFlatPresets this]
    (-> this (.updateButtonValidity))))

