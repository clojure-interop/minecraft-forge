(ns net.minecraftforge.fml.client.config.GuiSlider$ISlider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiSlider$ISlider]))

(defn on-change-slider-value
  "slider - `net.minecraftforge.fml.client.config.GuiSlider`"
  ([^GuiSlider$ISlider this ^net.minecraftforge.fml.client.config.GuiSlider slider]
    (-> this (.onChangeSliderValue slider))))

