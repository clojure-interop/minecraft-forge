(ns net.minecraft.client.gui.GuiGameOver
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiGameOver]))

(defn ->gui-game-over
  "Constructor.

  p-i-46598-1 - `net.minecraft.util.text.ITextComponent`"
  (^GuiGameOver [^net.minecraft.util.text.ITextComponent p-i-46598-1]
    (new GuiGameOver p-i-46598-1)))

(defn init-gui
  ""
  ([^GuiGameOver this]
    (-> this (.initGui))))

(defn confirm-clicked
  "result - `boolean`
  id - `int`"
  ([^GuiGameOver this ^Boolean result ^Integer id]
    (-> this (.confirmClicked result id))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiGameOver this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn get-clicked-component-at
  "p-184870-1 - `int`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^GuiGameOver this ^Integer p-184870-1]
    (-> this (.getClickedComponentAt p-184870-1))))

(defn does-gui-pause-game
  "returns: `boolean`"
  (^Boolean [^GuiGameOver this]
    (-> this (.doesGuiPauseGame))))

(defn update-screen
  ""
  ([^GuiGameOver this]
    (-> this (.updateScreen))))

