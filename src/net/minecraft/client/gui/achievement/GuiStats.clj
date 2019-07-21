(ns net.minecraft.client.gui.achievement.GuiStats
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.achievement GuiStats]))

(defn ->gui-stats
  "Constructor.

  p-i-1071-1 - `net.minecraft.client.gui.GuiScreen`
  p-i-1071-2 - `net.minecraft.stats.StatisticsManager`"
  (^GuiStats [^net.minecraft.client.gui.GuiScreen p-i-1071-1 ^net.minecraft.stats.StatisticsManager p-i-1071-2]
    (new GuiStats p-i-1071-1 p-i-1071-2)))

(defn init-gui
  ""
  ([^GuiStats this]
    (-> this (.initGui))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiStats this]
    (-> this (.handleMouseInput))))

(defn init-lists
  ""
  ([^GuiStats this]
    (-> this (.initLists))))

(defn create-buttons
  ""
  ([^GuiStats this]
    (-> this (.createButtons))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiStats this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn done-loading
  ""
  ([^GuiStats this]
    (-> this (.doneLoading))))

(defn does-gui-pause-game
  "returns: `boolean`"
  (^Boolean [^GuiStats this]
    (-> this (.doesGuiPauseGame))))

