(ns net.minecraft.client.gui.GuiOptionSlider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiOptionSlider]))

(defn ->gui-option-slider
  "Constructor.

  button-id - `int`
  x - `int`
  y - `int`
  option-in - `net.minecraft.client.settings.GameSettings$Options`
  min-value-in - `float`
  max-value - `float`"
  (^GuiOptionSlider [^Integer button-id ^Integer x ^Integer y ^net.minecraft.client.settings.GameSettings$Options option-in ^Float min-value-in ^Float max-value]
    (new GuiOptionSlider button-id x y option-in min-value-in max-value))
  (^GuiOptionSlider [^Integer button-id ^Integer x ^Integer y ^net.minecraft.client.settings.GameSettings$Options option-in]
    (new GuiOptionSlider button-id x y option-in)))

(defn dragging
  "Instance Field.

  type: boolean"
  (^Boolean [^GuiOptionSlider this]
    (-> this .-dragging)))

(defn mouse-pressed
  "mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiOptionSlider this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.mousePressed mc mouse-x mouse-y))))

(defn mouse-released
  "mouse-x - `int`
  mouse-y - `int`"
  ([^GuiOptionSlider this ^Integer mouse-x ^Integer mouse-y]
    (-> this (.mouseReleased mouse-x mouse-y))))

