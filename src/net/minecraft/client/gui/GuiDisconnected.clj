(ns net.minecraft.client.gui.GuiDisconnected
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiDisconnected]))

(defn ->gui-disconnected
  "Constructor.

  screen - `net.minecraft.client.gui.GuiScreen`
  reason-localization-key - `java.lang.String`
  chat-comp - `net.minecraft.util.text.ITextComponent`"
  (^GuiDisconnected [^net.minecraft.client.gui.GuiScreen screen ^java.lang.String reason-localization-key ^net.minecraft.util.text.ITextComponent chat-comp]
    (new GuiDisconnected screen reason-localization-key chat-comp)))

(defn init-gui
  ""
  ([^GuiDisconnected this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiDisconnected this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

