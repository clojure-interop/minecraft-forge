(ns net.minecraft.entity.item.EntityEnderCrystal
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityEnderCrystal]))

(defn ->entity-ender-crystal
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityEnderCrystal [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityEnderCrystal world-in x y z))
  (^EntityEnderCrystal [^net.minecraft.world.World world-in]
    (new EntityEnderCrystal world-in)))

(defn inner-rotation
  "Instance Field.

  type: int"
  (^Integer [^EntityEnderCrystal this]
    (-> this .-innerRotation)))

(defn in-range-to-render-dist?
  "distance - `double`

  returns: `boolean`"
  (^Boolean [^EntityEnderCrystal this ^Double distance]
    (-> this (.isInRangeToRenderDist distance))))

(defn should-show-bottom?
  "returns: `boolean`"
  (^Boolean [^EntityEnderCrystal this]
    (-> this (.shouldShowBottom))))

(defn on-kill-command
  ""
  ([^EntityEnderCrystal this]
    (-> this (.onKillCommand))))

(defn set-show-bottom
  "show-bottom - `boolean`"
  ([^EntityEnderCrystal this ^Boolean show-bottom]
    (-> this (.setShowBottom show-bottom))))

(defn on-update
  ""
  ([^EntityEnderCrystal this]
    (-> this (.onUpdate))))

(defn get-beam-target
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^EntityEnderCrystal this]
    (-> this (.getBeamTarget))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityEnderCrystal this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityEnderCrystal this]
    (-> this (.canBeCollidedWith))))

(defn set-beam-target
  "beam-target - `net.minecraft.util.math.BlockPos`"
  ([^EntityEnderCrystal this ^net.minecraft.util.math.BlockPos beam-target]
    (-> this (.setBeamTarget beam-target))))

