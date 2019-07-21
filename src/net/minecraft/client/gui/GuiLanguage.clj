(ns net.minecraft.client.gui.GuiLanguage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiLanguage]))

(defn ->gui-language
  "Constructor.

  screen - `net.minecraft.client.gui.GuiScreen`
  game-settings-obj - `net.minecraft.client.settings.GameSettings`
  manager - `net.minecraft.client.resources.LanguageManager`"
  (^GuiLanguage [^net.minecraft.client.gui.GuiScreen screen ^net.minecraft.client.settings.GameSettings game-settings-obj ^net.minecraft.client.resources.LanguageManager manager]
    (new GuiLanguage screen game-settings-obj manager)))

(defn init-gui
  ""
  ([^GuiLanguage this]
    (-> this (.initGui))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiLanguage this]
    (-> this (.handleMouseInput))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiLanguage this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

