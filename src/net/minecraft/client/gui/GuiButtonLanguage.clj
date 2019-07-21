(ns net.minecraft.client.gui.GuiButtonLanguage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiButtonLanguage]))

(defn ->gui-button-language
  "Constructor.

  button-id - `int`
  x-pos - `int`
  y-pos - `int`"
  (^GuiButtonLanguage [^Integer button-id ^Integer x-pos ^Integer y-pos]
    (new GuiButtonLanguage button-id x-pos y-pos)))

(defn draw-button
  "mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`"
  ([^GuiButtonLanguage this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawButton mc mouse-x mouse-y))))

