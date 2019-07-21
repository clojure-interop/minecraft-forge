(ns net.minecraft.world.gen.layer.IntCache
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer IntCache]))

(defn ->int-cache
  "Constructor."
  (^IntCache []
    (new IntCache )))

(defn *get-int-cache
  "p-76445-0 - `int`

  returns: `int[]`"
  ([^Integer p-76445-0]
    (IntCache/getIntCache p-76445-0)))

(defn *reset-int-cache
  ""
  ([]
    (IntCache/resetIntCache )))

(defn *get-cache-sizes
  "returns: `java.lang.String`"
  (^java.lang.String []
    (IntCache/getCacheSizes )))

