(ns net.minecraft.entity.monster.EntitySpider$GroupData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntitySpider$GroupData]))

(defn ->group-data
  "Constructor."
  (^EntitySpider$GroupData []
    (new EntitySpider$GroupData )))

(defn effect
  "Instance Field.

  type: net.minecraft.potion.Potion"
  (^net.minecraft.potion.Potion [^EntitySpider$GroupData this]
    (-> this .-effect)))

(defn set-random-effect
  "rand - `java.util.Random`"
  ([^EntitySpider$GroupData this ^java.util.Random rand]
    (-> this (.setRandomEffect rand))))

