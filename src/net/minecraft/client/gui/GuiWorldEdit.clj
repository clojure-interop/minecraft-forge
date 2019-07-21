(ns net.minecraft.client.gui.GuiWorldEdit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiWorldEdit]))

(defn ->gui-world-edit
  "Constructor.

  p-i-46593-1 - `net.minecraft.client.gui.GuiScreen`
  p-i-46593-2 - `java.lang.String`"
  (^GuiWorldEdit [^net.minecraft.client.gui.GuiScreen p-i-46593-1 ^java.lang.String p-i-46593-2]
    (new GuiWorldEdit p-i-46593-1 p-i-46593-2)))

(defn update-screen
  ""
  ([^GuiWorldEdit this]
    (-> this (.updateScreen))))

(defn init-gui
  ""
  ([^GuiWorldEdit this]
    (-> this (.initGui))))

(defn on-gui-closed
  ""
  ([^GuiWorldEdit this]
    (-> this (.onGuiClosed))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiWorldEdit this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

