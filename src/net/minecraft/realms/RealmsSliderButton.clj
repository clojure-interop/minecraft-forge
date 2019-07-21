(ns net.minecraft.realms.RealmsSliderButton
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsSliderButton]))

(defn ->realms-slider-button
  "Constructor.

  button-id - `int`
  x - `int`
  y - `int`
  width - `int`
  p-i-1057-5 - `int`
  value-in - `int`
  min-value-in - `float`
  max-value-in - `float`"
  (^RealmsSliderButton [^Integer button-id ^Integer x ^Integer y ^Integer width ^Integer p-i-1057-5 ^Integer value-in ^Float min-value-in ^Float max-value-in]
    (new RealmsSliderButton button-id x y width p-i-1057-5 value-in min-value-in max-value-in))
  (^RealmsSliderButton [^Integer button-id ^Integer x ^Integer y ^Integer width ^Integer max-value-in ^Integer p-i-1056-6]
    (new RealmsSliderButton button-id x y width max-value-in p-i-1056-6)))

(defn value
  "Instance Field.

  type: float"
  (^Float [^RealmsSliderButton this]
    (-> this .-value)))

(defn sliding
  "Instance Field.

  type: boolean"
  (^Boolean [^RealmsSliderButton this]
    (-> this .-sliding)))

(defn get-message
  "returns: `java.lang.String`"
  (^java.lang.String [^RealmsSliderButton this]
    (-> this (.getMessage))))

(defn to-pct
  "p-to-pct-1 - `float`

  returns: `float`"
  (^Float [^RealmsSliderButton this ^Float p-to-pct-1]
    (-> this (.toPct p-to-pct-1))))

(defn to-value
  "p-to-value-1 - `float`

  returns: `float`"
  (^Float [^RealmsSliderButton this ^Float p-to-value-1]
    (-> this (.toValue p-to-value-1))))

(defn clamp
  "p-clamp-1 - `float`

  returns: `float`"
  (^Float [^RealmsSliderButton this ^Float p-clamp-1]
    (-> this (.clamp p-clamp-1))))

(defn get-y-image
  "p-get-y-image-1 - `boolean`

  returns: `int`"
  (^Integer [^RealmsSliderButton this ^Boolean p-get-y-image-1]
    (-> this (.getYImage p-get-y-image-1))))

(defn render-bg
  "p-render-bg-1 - `int`
  p-render-bg-2 - `int`"
  ([^RealmsSliderButton this ^Integer p-render-bg-1 ^Integer p-render-bg-2]
    (-> this (.renderBg p-render-bg-1 p-render-bg-2))))

(defn clicked
  "p-clicked-1 - `int`
  p-clicked-2 - `int`"
  ([^RealmsSliderButton this ^Integer p-clicked-1 ^Integer p-clicked-2]
    (-> this (.clicked p-clicked-1 p-clicked-2)))
  ([^RealmsSliderButton this ^Float p-clicked-1]
    (-> this (.clicked p-clicked-1))))

(defn released
  "p-released-1 - `int`
  p-released-2 - `int`"
  ([^RealmsSliderButton this ^Integer p-released-1 ^Integer p-released-2]
    (-> this (.released p-released-1 p-released-2))))

