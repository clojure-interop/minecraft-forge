(ns net.minecraftforge.client.event.GuiScreenEvent$ActionPerformedEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$ActionPerformedEvent]))

(defn ->action-performed-event
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`
  button - `net.minecraft.client.gui.GuiButton`
  button-list - `java.util.List`"
  (^GuiScreenEvent$ActionPerformedEvent [^net.minecraft.client.gui.GuiScreen gui ^net.minecraft.client.gui.GuiButton button ^java.util.List button-list]
    (new GuiScreenEvent$ActionPerformedEvent gui button button-list)))

(defn get-button
  "The button that was clicked.

  returns: `net.minecraft.client.gui.GuiButton`"
  (^net.minecraft.client.gui.GuiButton [^GuiScreenEvent$ActionPerformedEvent this]
    (-> this (.getButton))))

(defn set-button
  "button - `net.minecraft.client.gui.GuiButton`"
  ([^GuiScreenEvent$ActionPerformedEvent this ^net.minecraft.client.gui.GuiButton button]
    (-> this (.setButton button))))

(defn get-button-list
  "A COPY of the buttonList field from the GuiScreen referenced by GuiScreenEvent.gui.

  returns: `java.util.List<net.minecraft.client.gui.GuiButton>`"
  (^java.util.List [^GuiScreenEvent$ActionPerformedEvent this]
    (-> this (.getButtonList))))

(defn set-button-list
  "button-list - `java.util.List`"
  ([^GuiScreenEvent$ActionPerformedEvent this ^java.util.List button-list]
    (-> this (.setButtonList button-list))))

