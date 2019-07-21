(ns net.minecraft.client.gui.GuiCustomizeSkin
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiCustomizeSkin]))

(defn ->gui-customize-skin
  "Constructor.

  parent-screen-in - `net.minecraft.client.gui.GuiScreen`"
  (^GuiCustomizeSkin [^net.minecraft.client.gui.GuiScreen parent-screen-in]
    (new GuiCustomizeSkin parent-screen-in)))

(defn init-gui
  ""
  ([^GuiCustomizeSkin this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiCustomizeSkin this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

