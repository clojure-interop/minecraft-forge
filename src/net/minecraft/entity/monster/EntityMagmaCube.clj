(ns net.minecraft.entity.monster.EntityMagmaCube
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityMagmaCube]))

(defn ->entity-magma-cube
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityMagmaCube [^net.minecraft.world.World world-in]
    (new EntityMagmaCube world-in)))

(defn *register-fixes-magma-cube
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityMagmaCube/registerFixesMagmaCube fixer)))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityMagmaCube this]
    (-> this (.getCanSpawnHere))))

(defn not-colliding?
  "returns: `boolean`"
  (^Boolean [^EntityMagmaCube this]
    (-> this (.isNotColliding))))

(defn get-brightness-for-render
  "partial-ticks - `float`

  returns: `int`"
  (^Integer [^EntityMagmaCube this ^Float partial-ticks]
    (-> this (.getBrightnessForRender partial-ticks))))

(defn get-brightness
  "partial-ticks - `float`

  returns: `float`"
  (^Float [^EntityMagmaCube this ^Float partial-ticks]
    (-> this (.getBrightness partial-ticks))))

(defn burning?
  "returns: `boolean`"
  (^Boolean [^EntityMagmaCube this]
    (-> this (.isBurning))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityMagmaCube this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

