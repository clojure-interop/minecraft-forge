(ns net.minecraft.util.BitArray
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util BitArray]))

(defn ->bit-array
  "Constructor.

  bits-per-entry-in - `int`
  array-size-in - `int`"
  (^BitArray [^Integer bits-per-entry-in ^Integer array-size-in]
    (new BitArray bits-per-entry-in array-size-in)))

(defn set-at
  "index - `int`
  value - `int`"
  ([^BitArray this ^Integer index ^Integer value]
    (-> this (.setAt index value))))

(defn get-at
  "index - `int`

  returns: `int`"
  (^Integer [^BitArray this ^Integer index]
    (-> this (.getAt index))))

(defn get-backing-long-array
  "returns: `long[]`"
  ([^BitArray this]
    (-> this (.getBackingLongArray))))

(defn size
  "returns: `int`"
  (^Integer [^BitArray this]
    (-> this (.size))))

