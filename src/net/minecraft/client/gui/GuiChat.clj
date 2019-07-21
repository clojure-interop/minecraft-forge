(ns net.minecraft.client.gui.GuiChat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiChat]))

(defn ->gui-chat
  "Constructor.

  default-text - `java.lang.String`"
  (^GuiChat [^java.lang.String default-text]
    (new GuiChat default-text))
  (^GuiChat []
    (new GuiChat )))

(defn init-gui
  ""
  ([^GuiChat this]
    (-> this (.initGui))))

(defn on-gui-closed
  ""
  ([^GuiChat this]
    (-> this (.onGuiClosed))))

(defn update-screen
  ""
  ([^GuiChat this]
    (-> this (.updateScreen))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiChat this]
    (-> this (.handleMouseInput))))

(defn get-sent-history
  "msg-pos - `int`"
  ([^GuiChat this ^Integer msg-pos]
    (-> this (.getSentHistory msg-pos))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiChat this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn does-gui-pause-game
  "returns: `boolean`"
  (^Boolean [^GuiChat this]
    (-> this (.doesGuiPauseGame))))

(defn set-completions
  "new-completions - `java.lang.String`"
  ([^GuiChat this ^java.lang.String new-completions]
    (-> this (.setCompletions new-completions))))

