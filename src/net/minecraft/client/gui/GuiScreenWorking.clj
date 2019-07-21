(ns net.minecraft.client.gui.GuiScreenWorking
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiScreenWorking]))

(defn ->gui-screen-working
  "Constructor."
  (^GuiScreenWorking []
    (new GuiScreenWorking )))

(defn display-saving-string
  "message - `java.lang.String`"
  ([^GuiScreenWorking this ^java.lang.String message]
    (-> this (.displaySavingString message))))

(defn reset-progress-and-message
  "message - `java.lang.String`"
  ([^GuiScreenWorking this ^java.lang.String message]
    (-> this (.resetProgressAndMessage message))))

(defn display-loading-string
  "message - `java.lang.String`"
  ([^GuiScreenWorking this ^java.lang.String message]
    (-> this (.displayLoadingString message))))

(defn set-loading-progress
  "progress - `int`"
  ([^GuiScreenWorking this ^Integer progress]
    (-> this (.setLoadingProgress progress))))

(defn set-done-working
  ""
  ([^GuiScreenWorking this]
    (-> this (.setDoneWorking))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiScreenWorking this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

