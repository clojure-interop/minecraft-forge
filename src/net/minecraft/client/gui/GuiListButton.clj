(ns net.minecraft.client.gui.GuiListButton
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiListButton]))

(defn ->gui-list-button
  "Constructor.

  responder - `net.minecraft.client.gui.GuiPageButtonList$GuiResponder`
  button-id - `int`
  x - `int`
  y - `int`
  localization-str-in - `java.lang.String`
  value-in - `boolean`"
  (^GuiListButton [^net.minecraft.client.gui.GuiPageButtonList$GuiResponder responder ^Integer button-id ^Integer x ^Integer y ^java.lang.String localization-str-in ^Boolean value-in]
    (new GuiListButton responder button-id x y localization-str-in value-in)))

(defn set-value
  "value-in - `boolean`"
  ([^GuiListButton this ^Boolean value-in]
    (-> this (.setValue value-in))))

(defn mouse-pressed
  "mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiListButton this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.mousePressed mc mouse-x mouse-y))))

