(ns net.minecraft.client.gui.GuiScreenCustomizePresets
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiScreenCustomizePresets]))

(defn ->gui-screen-customize-presets
  "Constructor.

  parent-in - `net.minecraft.client.gui.GuiCustomizeWorldScreen`"
  (^GuiScreenCustomizePresets [^net.minecraft.client.gui.GuiCustomizeWorldScreen parent-in]
    (new GuiScreenCustomizePresets parent-in)))

(defn init-gui
  ""
  ([^GuiScreenCustomizePresets this]
    (-> this (.initGui))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiScreenCustomizePresets this]
    (-> this (.handleMouseInput))))

(defn on-gui-closed
  ""
  ([^GuiScreenCustomizePresets this]
    (-> this (.onGuiClosed))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiScreenCustomizePresets this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn update-screen
  ""
  ([^GuiScreenCustomizePresets this]
    (-> this (.updateScreen))))

(defn update-button-validity
  ""
  ([^GuiScreenCustomizePresets this]
    (-> this (.updateButtonValidity))))

