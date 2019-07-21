(ns net.minecraft.world.chunk.NibbleArray
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk NibbleArray]))

(defn ->nibble-array
  "Constructor.

  storage-array - `byte[]`"
  (^NibbleArray [storage-array]
    (new NibbleArray storage-array))
  (^NibbleArray []
    (new NibbleArray )))

(defn get
  "x - `int`
  y - `int`
  z - `int`

  returns: `int`"
  (^Integer [^NibbleArray this ^Integer x ^Integer y ^Integer z]
    (-> this (.get x y z))))

(defn set
  "x - `int`
  y - `int`
  z - `int`
  value - `int`"
  ([^NibbleArray this ^Integer x ^Integer y ^Integer z ^Integer value]
    (-> this (.set x y z value))))

(defn get-from-index
  "index - `int`

  returns: `int`"
  (^Integer [^NibbleArray this ^Integer index]
    (-> this (.getFromIndex index))))

(defn set-index
  "index - `int`
  value - `int`"
  ([^NibbleArray this ^Integer index ^Integer value]
    (-> this (.setIndex index value))))

(defn get-data
  "returns: `byte[]`"
  ([^NibbleArray this]
    (-> this (.getData))))

