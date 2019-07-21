(ns net.minecraft.entity.ai.EntitySenses
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntitySenses]))

(defn ->entity-senses
  "Constructor.

  entity-obj-in - `net.minecraft.entity.EntityLiving`"
  (^EntitySenses [^net.minecraft.entity.EntityLiving entity-obj-in]
    (new EntitySenses entity-obj-in)))

(defn clear-sensing-cache
  ""
  ([^EntitySenses this]
    (-> this (.clearSensingCache))))

(defn can-see?
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntitySenses this ^net.minecraft.entity.Entity entity-in]
    (-> this (.canSee entity-in))))

