(ns net.minecraft.entity.EntityFlying
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityFlying]))

(defn ->entity-flying
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityFlying [^net.minecraft.world.World world-in]
    (new EntityFlying world-in)))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityFlying this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn move-entity-with-heading
  "strafe - `float`
  forward - `float`"
  ([^EntityFlying this ^Float strafe ^Float forward]
    (-> this (.moveEntityWithHeading strafe forward))))

(defn on-ladder?
  "returns: `boolean`"
  (^Boolean [^EntityFlying this]
    (-> this (.isOnLadder))))

