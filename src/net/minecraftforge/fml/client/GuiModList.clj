(ns net.minecraftforge.fml.client.GuiModList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiModList]))

(defn ->gui-mod-list
  "Constructor.

  main-menu - `net.minecraft.client.gui.GuiScreen`"
  (^GuiModList [^net.minecraft.client.gui.GuiScreen main-menu]
    (new GuiModList main-menu)))

(defn init-gui
  ""
  ([^GuiModList this]
    (-> this (.initGui))))

(defn update-screen
  ""
  ([^GuiModList this]
    (-> this (.updateScreen))))

(defn draw-line
  "line - `java.lang.String`
  offset - `int`
  shifty - `int`

  returns: `int`"
  (^Integer [^GuiModList this ^java.lang.String line ^Integer offset ^Integer shifty]
    (-> this (.drawLine line offset shifty))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiModList this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiModList this]
    (-> this (.handleMouseInput))))

(defn select-mod-index
  "index - `int`"
  ([^GuiModList this ^Integer index]
    (-> this (.selectModIndex index))))

(defn mod-index-selected
  "index - `int`

  returns: `boolean`"
  (^Boolean [^GuiModList this ^Integer index]
    (-> this (.modIndexSelected index))))

