(ns net.minecraft.util.datafix.walkers.ItemStackData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.walkers ItemStackData]))

(defn ->item-stack-data
  "Constructor.

  p-i-47311-1 - `java.lang.Class`
  matching-tags-in - `java.lang.String`"
  (^ItemStackData [^java.lang.Class p-i-47311-1 ^java.lang.String matching-tags-in]
    (new ItemStackData p-i-47311-1 matching-tags-in)))

