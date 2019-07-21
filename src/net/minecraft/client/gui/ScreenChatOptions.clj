(ns net.minecraft.client.gui.ScreenChatOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui ScreenChatOptions]))

(defn ->screen-chat-options
  "Constructor.

  parent-screen-in - `net.minecraft.client.gui.GuiScreen`
  game-settings-in - `net.minecraft.client.settings.GameSettings`"
  (^ScreenChatOptions [^net.minecraft.client.gui.GuiScreen parent-screen-in ^net.minecraft.client.settings.GameSettings game-settings-in]
    (new ScreenChatOptions parent-screen-in game-settings-in)))

(defn init-gui
  ""
  ([^ScreenChatOptions this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^ScreenChatOptions this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

