(ns net.minecraft.util.WeightedRandom$Item
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util WeightedRandom$Item]))

(defn ->item
  "Constructor.

  item-weight-in - `int`"
  (^WeightedRandom$Item [^Integer item-weight-in]
    (new WeightedRandom$Item item-weight-in)))

(defn item-weight
  "Instance Field.

  type: int"
  (^Integer [^WeightedRandom$Item this]
    (-> this .-itemWeight)))

