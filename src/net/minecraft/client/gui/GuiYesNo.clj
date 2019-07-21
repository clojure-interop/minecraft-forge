(ns net.minecraft.client.gui.GuiYesNo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiYesNo]))

(defn ->gui-yes-no
  "Constructor.

  parent-screen-in - `net.minecraft.client.gui.GuiYesNoCallback`
  message-line-1-in - `java.lang.String`
  message-line-2-in - `java.lang.String`
  confirm-button-text-in - `java.lang.String`
  cancel-button-text-in - `java.lang.String`
  parent-button-clicked-id-in - `int`"
  (^GuiYesNo [^net.minecraft.client.gui.GuiYesNoCallback parent-screen-in ^java.lang.String message-line-1-in ^java.lang.String message-line-2-in ^java.lang.String confirm-button-text-in ^java.lang.String cancel-button-text-in ^Integer parent-button-clicked-id-in]
    (new GuiYesNo parent-screen-in message-line-1-in message-line-2-in confirm-button-text-in cancel-button-text-in parent-button-clicked-id-in))
  (^GuiYesNo [^net.minecraft.client.gui.GuiYesNoCallback parent-screen-in ^java.lang.String message-line-1-in ^java.lang.String message-line-2-in ^Integer parent-button-clicked-id-in]
    (new GuiYesNo parent-screen-in message-line-1-in message-line-2-in parent-button-clicked-id-in)))

(defn init-gui
  ""
  ([^GuiYesNo this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiYesNo this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn set-button-delay
  "ticks-until-enable-in - `int`"
  ([^GuiYesNo this ^Integer ticks-until-enable-in]
    (-> this (.setButtonDelay ticks-until-enable-in))))

(defn update-screen
  ""
  ([^GuiYesNo this]
    (-> this (.updateScreen))))

