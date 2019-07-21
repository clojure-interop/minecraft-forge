(ns net.minecraft.client.gui.GuiWinGame
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiWinGame]))

(defn ->gui-win-game
  "Constructor."
  (^GuiWinGame []
    (new GuiWinGame )))

(defn update-screen
  ""
  ([^GuiWinGame this]
    (-> this (.updateScreen))))

(defn does-gui-pause-game
  "returns: `boolean`"
  (^Boolean [^GuiWinGame this]
    (-> this (.doesGuiPauseGame))))

(defn init-gui
  ""
  ([^GuiWinGame this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiWinGame this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

