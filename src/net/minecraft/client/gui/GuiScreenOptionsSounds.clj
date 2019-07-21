(ns net.minecraft.client.gui.GuiScreenOptionsSounds
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiScreenOptionsSounds]))

(defn ->gui-screen-options-sounds
  "Constructor.

  parent-in - `net.minecraft.client.gui.GuiScreen`
  settings-in - `net.minecraft.client.settings.GameSettings`"
  (^GuiScreenOptionsSounds [^net.minecraft.client.gui.GuiScreen parent-in ^net.minecraft.client.settings.GameSettings settings-in]
    (new GuiScreenOptionsSounds parent-in settings-in)))

(defn init-gui
  ""
  ([^GuiScreenOptionsSounds this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiScreenOptionsSounds this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

