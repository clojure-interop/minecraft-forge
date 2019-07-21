(ns net.minecraft.world.WorldProviderSurface
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world WorldProviderSurface]))

(defn ->world-provider-surface
  "Constructor."
  (^WorldProviderSurface []
    (new WorldProviderSurface )))

(defn get-dimension-type
  "returns: `net.minecraft.world.DimensionType`"
  (^net.minecraft.world.DimensionType [^WorldProviderSurface this]
    (-> this (.getDimensionType))))

(defn can-drop-chunk?
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^WorldProviderSurface this ^Integer x ^Integer z]
    (-> this (.canDropChunk x z))))

