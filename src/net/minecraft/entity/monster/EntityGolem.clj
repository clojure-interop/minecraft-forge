(ns net.minecraft.entity.monster.EntityGolem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityGolem]))

(defn ->entity-golem
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityGolem [^net.minecraft.world.World world-in]
    (new EntityGolem world-in)))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityGolem this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn get-talk-interval
  "returns: `int`"
  (^Integer [^EntityGolem this]
    (-> this (.getTalkInterval))))

