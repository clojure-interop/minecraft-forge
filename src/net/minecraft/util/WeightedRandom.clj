(ns net.minecraft.util.WeightedRandom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util WeightedRandom]))

(defn ->weighted-random
  "Constructor."
  (^WeightedRandom []
    (new WeightedRandom )))

(defn *get-total-weight
  "collection - `java.util.List`

  returns: `int`"
  (^Integer [^java.util.List collection]
    (WeightedRandom/getTotalWeight collection)))

(defn *get-random-item
  "random - `java.util.Random`
  collection - `java.util.List`
  total-weight - `int`

  returns: `<T extends net.minecraft.util.WeightedRandom$Item> T`"
  ([^java.util.Random random ^java.util.List collection ^Integer total-weight]
    (WeightedRandom/getRandomItem random collection total-weight))
  ([^java.util.List collection ^Integer weight]
    (WeightedRandom/getRandomItem collection weight)))

