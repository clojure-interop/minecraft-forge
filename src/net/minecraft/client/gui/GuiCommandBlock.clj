(ns net.minecraft.client.gui.GuiCommandBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiCommandBlock]))

(defn ->gui-command-block
  "Constructor.

  command-block-in - `net.minecraft.tileentity.TileEntityCommandBlock`"
  (^GuiCommandBlock [^net.minecraft.tileentity.TileEntityCommandBlock command-block-in]
    (new GuiCommandBlock command-block-in)))

(defn update-screen
  ""
  ([^GuiCommandBlock this]
    (-> this (.updateScreen))))

(defn init-gui
  ""
  ([^GuiCommandBlock this]
    (-> this (.initGui))))

(defn update-gui
  ""
  ([^GuiCommandBlock this]
    (-> this (.updateGui))))

(defn on-gui-closed
  ""
  ([^GuiCommandBlock this]
    (-> this (.onGuiClosed))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiCommandBlock this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn set-completions
  "new-completions - `java.lang.String`"
  ([^GuiCommandBlock this ^java.lang.String new-completions]
    (-> this (.setCompletions new-completions))))

