(ns net.minecraft.client.gui.GuiErrorScreen
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiErrorScreen]))

(defn ->gui-error-screen
  "Constructor.

  title-in - `java.lang.String`
  message-in - `java.lang.String`"
  (^GuiErrorScreen [^java.lang.String title-in ^java.lang.String message-in]
    (new GuiErrorScreen title-in message-in)))

(defn init-gui
  ""
  ([^GuiErrorScreen this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiErrorScreen this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

