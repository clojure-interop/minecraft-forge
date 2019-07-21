(ns net.minecraft.client.gui.GuiSnooper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiSnooper]))

(defn ->gui-snooper
  "Constructor.

  p-i-1061-1 - `net.minecraft.client.gui.GuiScreen`
  p-i-1061-2 - `net.minecraft.client.settings.GameSettings`"
  (^GuiSnooper [^net.minecraft.client.gui.GuiScreen p-i-1061-1 ^net.minecraft.client.settings.GameSettings p-i-1061-2]
    (new GuiSnooper p-i-1061-1 p-i-1061-2)))

(defn init-gui
  ""
  ([^GuiSnooper this]
    (-> this (.initGui))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiSnooper this]
    (-> this (.handleMouseInput))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiSnooper this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

