(ns net.minecraft.client.gui.GuiSimpleScrolledSelectionListProxy
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiSimpleScrolledSelectionListProxy]))

(defn ->gui-simple-scrolled-selection-list-proxy
  "Constructor.

  realms-scrolled-selection-list-in - `net.minecraft.realms.RealmsSimpleScrolledSelectionList`
  width-in - `int`
  height-in - `int`
  top-in - `int`
  bottom-in - `int`
  slot-height-in - `int`"
  (^GuiSimpleScrolledSelectionListProxy [^net.minecraft.realms.RealmsSimpleScrolledSelectionList realms-scrolled-selection-list-in ^Integer width-in ^Integer height-in ^Integer top-in ^Integer bottom-in ^Integer slot-height-in]
    (new GuiSimpleScrolledSelectionListProxy realms-scrolled-selection-list-in width-in height-in top-in bottom-in slot-height-in)))

(defn get-width
  "returns: `int`"
  (^Integer [^GuiSimpleScrolledSelectionListProxy this]
    (-> this (.getWidth))))

(defn get-mouse-y
  "returns: `int`"
  (^Integer [^GuiSimpleScrolledSelectionListProxy this]
    (-> this (.getMouseY))))

(defn get-mouse-x
  "returns: `int`"
  (^Integer [^GuiSimpleScrolledSelectionListProxy this]
    (-> this (.getMouseX))))

(defn handle-mouse-input
  ""
  ([^GuiSimpleScrolledSelectionListProxy this]
    (-> this (.handleMouseInput))))

(defn draw-screen
  "mouse-x-in - `int`
  mouse-y-in - `int`
  partial-ticks - `float`"
  ([^GuiSimpleScrolledSelectionListProxy this ^Integer mouse-x-in ^Integer mouse-y-in ^Float partial-ticks]
    (-> this (.drawScreen mouse-x-in mouse-y-in partial-ticks))))

