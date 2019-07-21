(ns net.minecraft.world.chunk.storage.NibbleArrayReader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk.storage NibbleArrayReader]))

(defn ->nibble-array-reader
  "Constructor.

  data-in - `byte[]`
  depth-bits-in - `int`"
  (^NibbleArrayReader [data-in ^Integer depth-bits-in]
    (new NibbleArrayReader data-in depth-bits-in)))

(defn data
  "Instance Constant.

  type: byte[]"
  ([^NibbleArrayReader this]
    (-> this .-data)))

(defn get
  "x - `int`
  y - `int`
  z - `int`

  returns: `int`"
  (^Integer [^NibbleArrayReader this ^Integer x ^Integer y ^Integer z]
    (-> this (.get x y z))))

