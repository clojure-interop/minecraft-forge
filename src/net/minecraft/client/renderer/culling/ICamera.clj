(ns net.minecraft.client.renderer.culling.ICamera
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.culling ICamera]))

(defn bounding-box-in-frustum?
  "p-78546-1 - `net.minecraft.util.math.AxisAlignedBB`

  returns: `boolean`"
  (^Boolean [^ICamera this ^net.minecraft.util.math.AxisAlignedBB p-78546-1]
    (-> this (.isBoundingBoxInFrustum p-78546-1))))

(defn set-position
  "x-position-in - `double`
  y-position-in - `double`
  z-position-in - `double`"
  ([^ICamera this ^Double x-position-in ^Double y-position-in ^Double z-position-in]
    (-> this (.setPosition x-position-in y-position-in z-position-in))))

