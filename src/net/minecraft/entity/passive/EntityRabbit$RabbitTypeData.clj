(ns net.minecraft.entity.passive.EntityRabbit$RabbitTypeData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityRabbit$RabbitTypeData]))

(defn ->rabbit-type-data
  "Constructor.

  type - `int`"
  (^EntityRabbit$RabbitTypeData [^Integer type]
    (new EntityRabbit$RabbitTypeData type)))

(defn type-data
  "Instance Field.

  type: int"
  (^Integer [^EntityRabbit$RabbitTypeData this]
    (-> this .-typeData)))

