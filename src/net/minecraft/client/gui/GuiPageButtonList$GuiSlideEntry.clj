(ns net.minecraft.client.gui.GuiPageButtonList$GuiSlideEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiPageButtonList$GuiSlideEntry]))

(defn ->gui-slide-entry
  "Constructor.

  p-i-45530-1 - `int`
  p-i-45530-2 - `java.lang.String`
  p-i-45530-3 - `boolean`
  p-i-45530-4 - `net.minecraft.client.gui.GuiSlider$FormatHelper`
  p-i-45530-5 - `float`
  p-i-45530-6 - `float`
  p-i-45530-7 - `float`"
  (^GuiPageButtonList$GuiSlideEntry [^Integer p-i-45530-1 ^java.lang.String p-i-45530-2 ^Boolean p-i-45530-3 ^net.minecraft.client.gui.GuiSlider$FormatHelper p-i-45530-4 ^Float p-i-45530-5 ^Float p-i-45530-6 ^Float p-i-45530-7]
    (new GuiPageButtonList$GuiSlideEntry p-i-45530-1 p-i-45530-2 p-i-45530-3 p-i-45530-4 p-i-45530-5 p-i-45530-6 p-i-45530-7)))

(defn get-formatter
  "returns: `net.minecraft.client.gui.GuiSlider$FormatHelper`"
  (^net.minecraft.client.gui.GuiSlider$FormatHelper [^GuiPageButtonList$GuiSlideEntry this]
    (-> this (.getFormatter))))

(defn get-min-value
  "returns: `float`"
  (^Float [^GuiPageButtonList$GuiSlideEntry this]
    (-> this (.getMinValue))))

(defn get-max-value
  "returns: `float`"
  (^Float [^GuiPageButtonList$GuiSlideEntry this]
    (-> this (.getMaxValue))))

(defn get-inital-value
  "returns: `float`"
  (^Float [^GuiPageButtonList$GuiSlideEntry this]
    (-> this (.getInitalValue))))

