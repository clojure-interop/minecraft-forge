(ns net.minecraft.client.gui.GuiOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiOptions]))

(defn ->gui-options
  "Constructor.

  p-i-1046-1 - `net.minecraft.client.gui.GuiScreen`
  p-i-1046-2 - `net.minecraft.client.settings.GameSettings`"
  (^GuiOptions [^net.minecraft.client.gui.GuiScreen p-i-1046-1 ^net.minecraft.client.settings.GameSettings p-i-1046-2]
    (new GuiOptions p-i-1046-1 p-i-1046-2)))

(defn init-gui
  ""
  ([^GuiOptions this]
    (-> this (.initGui))))

(defn get-difficulty-text
  "p-175355-1 - `net.minecraft.world.EnumDifficulty`

  returns: `java.lang.String`"
  (^java.lang.String [^GuiOptions this ^net.minecraft.world.EnumDifficulty p-175355-1]
    (-> this (.getDifficultyText p-175355-1))))

(defn confirm-clicked
  "result - `boolean`
  id - `int`"
  ([^GuiOptions this ^Boolean result ^Integer id]
    (-> this (.confirmClicked result id))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiOptions this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

