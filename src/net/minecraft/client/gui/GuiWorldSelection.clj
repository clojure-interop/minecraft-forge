(ns net.minecraft.client.gui.GuiWorldSelection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiWorldSelection]))

(defn ->gui-world-selection
  "Constructor.

  screen-in - `net.minecraft.client.gui.GuiScreen`"
  (^GuiWorldSelection [^net.minecraft.client.gui.GuiScreen screen-in]
    (new GuiWorldSelection screen-in)))

(defn init-gui
  ""
  ([^GuiWorldSelection this]
    (-> this (.initGui))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiWorldSelection this]
    (-> this (.handleMouseInput))))

(defn post-init
  ""
  ([^GuiWorldSelection this]
    (-> this (.postInit))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiWorldSelection this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn set-version-tooltip
  "p-184861-1 - `java.lang.String`"
  ([^GuiWorldSelection this ^java.lang.String p-184861-1]
    (-> this (.setVersionTooltip p-184861-1))))

(defn select-world
  "entry - `net.minecraft.client.gui.GuiListWorldSelectionEntry`"
  ([^GuiWorldSelection this ^net.minecraft.client.gui.GuiListWorldSelectionEntry entry]
    (-> this (.selectWorld entry))))

