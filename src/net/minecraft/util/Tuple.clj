(ns net.minecraft.util.Tuple
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util Tuple]))

(defn ->tuple
  "Constructor.

  a-in - `A`
  b-in - `B`"
  (^Tuple [a-in b-in]
    (new Tuple a-in b-in)))

(defn get-first
  "returns: `A`"
  ([^Tuple this]
    (-> this (.getFirst))))

(defn get-second
  "returns: `B`"
  ([^Tuple this]
    (-> this (.getSecond))))

