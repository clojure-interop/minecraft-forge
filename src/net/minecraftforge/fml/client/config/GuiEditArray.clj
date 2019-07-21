(ns net.minecraftforge.fml.client.config.GuiEditArray
  "This class is the base screen used for editing an array-type property. It provides a list of array entries for the user to edit.
  This screen is invoked from a GuiConfig screen by controls that use the EditListPropEntry IGuiConfigListEntry object."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiEditArray]))

(defn ->gui-edit-array
  "Constructor.

  parent-screen - `net.minecraft.client.gui.GuiScreen`
  config-element - `net.minecraftforge.fml.client.config.IConfigElement`
  slot-index - `int`
  current-values - `java.lang.Object[]`
  enabled - `boolean`"
  (^GuiEditArray [^net.minecraft.client.gui.GuiScreen parent-screen ^net.minecraftforge.fml.client.config.IConfigElement config-element ^Integer slot-index current-values ^Boolean enabled]
    (new GuiEditArray parent-screen config-element slot-index current-values enabled)))

(defn init-gui
  ""
  ([^GuiEditArray this]
    (-> this (.initGui))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiEditArray this]
    (-> this (.handleMouseInput))))

(defn update-screen
  ""
  ([^GuiEditArray this]
    (-> this (.updateScreen))))

(defn draw-screen
  "par-1 - `int`
  par-2 - `int`
  par-3 - `float`"
  ([^GuiEditArray this ^Integer par-1 ^Integer par-2 ^Float par-3]
    (-> this (.drawScreen par-1 par-2 par-3))))

(defn draw-tool-tip
  "string-list - `java.util.List`
  x - `int`
  y - `int`"
  ([^GuiEditArray this ^java.util.List string-list ^Integer x ^Integer y]
    (-> this (.drawToolTip string-list x y))))

