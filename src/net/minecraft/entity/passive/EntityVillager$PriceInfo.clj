(ns net.minecraft.entity.passive.EntityVillager$PriceInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityVillager$PriceInfo]))

(defn ->price-info
  "Constructor.

  p-i-45810-1 - `int`
  p-i-45810-2 - `int`"
  (^EntityVillager$PriceInfo [^Integer p-i-45810-1 ^Integer p-i-45810-2]
    (new EntityVillager$PriceInfo p-i-45810-1 p-i-45810-2)))

(defn get-price
  "rand - `java.util.Random`

  returns: `int`"
  (^Integer [^EntityVillager$PriceInfo this ^java.util.Random rand]
    (-> this (.getPrice rand))))

