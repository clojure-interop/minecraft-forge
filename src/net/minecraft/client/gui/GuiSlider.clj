(ns net.minecraft.client.gui.GuiSlider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiSlider]))

(defn ->gui-slider
  "Constructor.

  gui-responder - `net.minecraft.client.gui.GuiPageButtonList$GuiResponder`
  id-in - `int`
  x - `int`
  y - `int`
  name-in - `java.lang.String`
  min-in - `float`
  max-in - `float`
  default-value - `float`
  formatter - `net.minecraft.client.gui.GuiSlider$FormatHelper`"
  (^GuiSlider [^net.minecraft.client.gui.GuiPageButtonList$GuiResponder gui-responder ^Integer id-in ^Integer x ^Integer y ^java.lang.String name-in ^Float min-in ^Float max-in ^Float default-value ^net.minecraft.client.gui.GuiSlider$FormatHelper formatter]
    (new GuiSlider gui-responder id-in x y name-in min-in max-in default-value formatter)))

(defn is-mouse-down
  "Instance Field.

  type: boolean"
  (^Boolean [^GuiSlider this]
    (-> this .-isMouseDown)))

(defn get-slider-value
  "returns: `float`"
  (^Float [^GuiSlider this]
    (-> this (.getSliderValue))))

(defn set-slider-value
  "value - `float`
  notify-responder - `boolean`"
  ([^GuiSlider this ^Float value ^Boolean notify-responder]
    (-> this (.setSliderValue value notify-responder))))

(defn get-slider-position
  "returns: `float`"
  (^Float [^GuiSlider this]
    (-> this (.getSliderPosition))))

(defn set-slider-position
  "position - `float`"
  ([^GuiSlider this ^Float position]
    (-> this (.setSliderPosition position))))

(defn mouse-pressed
  "mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiSlider this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.mousePressed mc mouse-x mouse-y))))

(defn mouse-released
  "mouse-x - `int`
  mouse-y - `int`"
  ([^GuiSlider this ^Integer mouse-x ^Integer mouse-y]
    (-> this (.mouseReleased mouse-x mouse-y))))

