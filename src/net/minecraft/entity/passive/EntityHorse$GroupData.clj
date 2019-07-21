(ns net.minecraft.entity.passive.EntityHorse$GroupData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityHorse$GroupData]))

(defn ->group-data
  "Constructor.

  variant-in - `int`"
  (^EntityHorse$GroupData [^Integer variant-in]
    (new EntityHorse$GroupData variant-in)))

(defn variant
  "Instance Field.

  type: int"
  (^Integer [^EntityHorse$GroupData this]
    (-> this .-variant)))

