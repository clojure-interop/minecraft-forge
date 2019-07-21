(ns net.minecraft.client.gui.GuiCreateFlatWorld
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiCreateFlatWorld]))

(defn ->gui-create-flat-world
  "Constructor.

  create-world-gui-in - `net.minecraft.client.gui.GuiCreateWorld`
  preset - `java.lang.String`"
  (^GuiCreateFlatWorld [^net.minecraft.client.gui.GuiCreateWorld create-world-gui-in ^java.lang.String preset]
    (new GuiCreateFlatWorld create-world-gui-in preset)))

(defn get-preset
  "returns: `java.lang.String`"
  (^java.lang.String [^GuiCreateFlatWorld this]
    (-> this (.getPreset))))

(defn set-preset
  "preset - `java.lang.String`"
  ([^GuiCreateFlatWorld this ^java.lang.String preset]
    (-> this (.setPreset preset))))

(defn init-gui
  ""
  ([^GuiCreateFlatWorld this]
    (-> this (.initGui))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiCreateFlatWorld this]
    (-> this (.handleMouseInput))))

(defn on-layers-changed
  ""
  ([^GuiCreateFlatWorld this]
    (-> this (.onLayersChanged))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiCreateFlatWorld this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

