(ns net.minecraftforge.fml.client.config.GuiSelectString
  "This class provides a screen that allows the user to select a value from a list."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiSelectString]))

(defn ->gui-select-string
  "Constructor.

  parent-screen - `net.minecraft.client.gui.GuiScreen`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`
  slot-index - `int`
  selectable-values - `java.util.Map`
  current-value - `java.lang.Object`
  enabled - `boolean`"
  (^GuiSelectString [^net.minecraft.client.gui.GuiScreen parent-screen ^net.minecraftforge.fml.client.config.IConfigElement config-element ^Integer slot-index ^java.util.Map selectable-values ^java.lang.Object current-value ^Boolean enabled]
    (new GuiSelectString parent-screen config-element slot-index selectable-values current-value enabled)))

(defn before-value
  "Instance Constant.

  type: java.lang.Object"
  (^java.lang.Object [^GuiSelectString this]
    (-> this .-beforeValue)))

(defn current-value
  "Instance Field.

  type: java.lang.Object"
  (^java.lang.Object [^GuiSelectString this]
    (-> this .-currentValue)))

(defn init-gui
  ""
  ([^GuiSelectString this]
    (-> this (.initGui))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiSelectString this]
    (-> this (.handleMouseInput))))

(defn draw-screen
  "par-1 - `int`
  par-2 - `int`
  par-3 - `float`"
  ([^GuiSelectString this ^Integer par-1 ^Integer par-2 ^Float par-3]
    (-> this (.drawScreen par-1 par-2 par-3))))

(defn draw-tool-tip
  "string-list - `java.util.List`
  x - `int`
  y - `int`"
  ([^GuiSelectString this ^java.util.List string-list ^Integer x ^Integer y]
    (-> this (.drawToolTip string-list x y))))

