(ns net.minecraft.client.gui.GuiSlider$FormatHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiSlider$FormatHelper]))

(defn get-text
  "id - `int`
  name - `java.lang.String`
  value - `float`

  returns: `java.lang.String`"
  (^java.lang.String [^GuiSlider$FormatHelper this ^Integer id ^java.lang.String name ^Float value]
    (-> this (.getText id name value))))

