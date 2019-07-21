(ns net.minecraft.client.gui.GuiControls
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiControls]))

(defn ->gui-controls
  "Constructor.

  screen - `net.minecraft.client.gui.GuiScreen`
  settings - `net.minecraft.client.settings.GameSettings`"
  (^GuiControls [^net.minecraft.client.gui.GuiScreen screen ^net.minecraft.client.settings.GameSettings settings]
    (new GuiControls screen settings)))

(defn button-id
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GuiControls this]
    (-> this .-buttonId)))

(defn time
  "Instance Field.

  type: long"
  (^Long [^GuiControls this]
    (-> this .-time)))

(defn init-gui
  ""
  ([^GuiControls this]
    (-> this (.initGui))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiControls this]
    (-> this (.handleMouseInput))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiControls this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

