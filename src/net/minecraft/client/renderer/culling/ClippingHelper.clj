(ns net.minecraft.client.renderer.culling.ClippingHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.culling ClippingHelper]))

(defn ->clipping-helper
  "Constructor."
  (^ClippingHelper []
    (new ClippingHelper )))

(defn frustum
  "Instance Field.

  type: float[][]"
  ([^ClippingHelper this]
    (-> this .-frustum)))

(defn projection-matrix
  "Instance Field.

  type: float[]"
  ([^ClippingHelper this]
    (-> this .-projectionMatrix)))

(defn modelview-matrix
  "Instance Field.

  type: float[]"
  ([^ClippingHelper this]
    (-> this .-modelviewMatrix)))

(defn clipping-matrix
  "Instance Field.

  type: float[]"
  ([^ClippingHelper this]
    (-> this .-clippingMatrix)))

(defn box-in-frustum?
  "p-78553-1 - `double`
  p-78553-3 - `double`
  p-78553-5 - `double`
  p-78553-7 - `double`
  p-78553-9 - `double`
  p-78553-11 - `double`

  returns: `boolean`"
  (^Boolean [^ClippingHelper this ^Double p-78553-1 ^Double p-78553-3 ^Double p-78553-5 ^Double p-78553-7 ^Double p-78553-9 ^Double p-78553-11]
    (-> this (.isBoxInFrustum p-78553-1 p-78553-3 p-78553-5 p-78553-7 p-78553-9 p-78553-11))))

