(ns net.minecraft.client.renderer.culling.Frustum
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.culling Frustum]))

(defn ->frustum
  "Constructor.

  clipping-helper-in - `net.minecraft.client.renderer.culling.ClippingHelper`"
  (^Frustum [^net.minecraft.client.renderer.culling.ClippingHelper clipping-helper-in]
    (new Frustum clipping-helper-in))
  (^Frustum []
    (new Frustum )))

(defn set-position
  "x-position-in - `double`
  y-position-in - `double`
  z-position-in - `double`"
  ([^Frustum this ^Double x-position-in ^Double y-position-in ^Double z-position-in]
    (-> this (.setPosition x-position-in y-position-in z-position-in))))

(defn box-in-frustum?
  "p-78548-1 - `double`
  p-78548-3 - `double`
  p-78548-5 - `double`
  p-78548-7 - `double`
  p-78548-9 - `double`
  p-78548-11 - `double`

  returns: `boolean`"
  (^Boolean [^Frustum this ^Double p-78548-1 ^Double p-78548-3 ^Double p-78548-5 ^Double p-78548-7 ^Double p-78548-9 ^Double p-78548-11]
    (-> this (.isBoxInFrustum p-78548-1 p-78548-3 p-78548-5 p-78548-7 p-78548-9 p-78548-11))))

(defn bounding-box-in-frustum?
  "p-78546-1 - `net.minecraft.util.math.AxisAlignedBB`

  returns: `boolean`"
  (^Boolean [^Frustum this ^net.minecraft.util.math.AxisAlignedBB p-78546-1]
    (-> this (.isBoundingBoxInFrustum p-78546-1))))

