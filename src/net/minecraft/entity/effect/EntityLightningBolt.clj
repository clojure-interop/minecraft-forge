(ns net.minecraft.entity.effect.EntityLightningBolt
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.effect EntityLightningBolt]))

(defn ->entity-lightning-bolt
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  effect-only-in - `boolean`"
  (^EntityLightningBolt [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^Boolean effect-only-in]
    (new EntityLightningBolt world-in x y z effect-only-in)))

(defn bolt-vertex
  "Instance Field.

  type: long"
  (^Long [^EntityLightningBolt this]
    (-> this .-boltVertex)))

(defn get-sound-category
  "returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^EntityLightningBolt this]
    (-> this (.getSoundCategory))))

(defn on-update
  ""
  ([^EntityLightningBolt this]
    (-> this (.onUpdate))))

