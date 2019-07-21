(ns net.minecraft.client.gui.GuiVideoSettings
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiVideoSettings]))

(defn ->gui-video-settings
  "Constructor.

  parent-screen-in - `net.minecraft.client.gui.GuiScreen`
  game-settings-in - `net.minecraft.client.settings.GameSettings`"
  (^GuiVideoSettings [^net.minecraft.client.gui.GuiScreen parent-screen-in ^net.minecraft.client.settings.GameSettings game-settings-in]
    (new GuiVideoSettings parent-screen-in game-settings-in)))

(defn init-gui
  ""
  ([^GuiVideoSettings this]
    (-> this (.initGui))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiVideoSettings this]
    (-> this (.handleMouseInput))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiVideoSettings this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn on-gui-closed
  ""
  ([^GuiVideoSettings this]
    (-> this (.onGuiClosed))))

