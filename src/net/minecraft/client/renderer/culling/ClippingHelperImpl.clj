(ns net.minecraft.client.renderer.culling.ClippingHelperImpl
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.culling ClippingHelperImpl]))

(defn ->clipping-helper-impl
  "Constructor."
  (^ClippingHelperImpl []
    (new ClippingHelperImpl )))

(defn *get-instance
  "returns: `net.minecraft.client.renderer.culling.ClippingHelper`"
  (^net.minecraft.client.renderer.culling.ClippingHelper []
    (ClippingHelperImpl/getInstance )))

(defn init
  ""
  ([^ClippingHelperImpl this]
    (-> this (.init))))

