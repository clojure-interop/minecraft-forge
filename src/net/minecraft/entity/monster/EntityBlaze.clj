(ns net.minecraft.entity.monster.EntityBlaze
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityBlaze]))

(defn ->entity-blaze
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityBlaze [^net.minecraft.world.World world-in]
    (new EntityBlaze world-in)))

(defn *register-fixes-blaze
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityBlaze/registerFixesBlaze fixer)))

(defn get-brightness-for-render
  "partial-ticks - `float`

  returns: `int`"
  (^Integer [^EntityBlaze this ^Float partial-ticks]
    (-> this (.getBrightnessForRender partial-ticks))))

(defn get-brightness
  "partial-ticks - `float`

  returns: `float`"
  (^Float [^EntityBlaze this ^Float partial-ticks]
    (-> this (.getBrightness partial-ticks))))

(defn on-living-update
  ""
  ([^EntityBlaze this]
    (-> this (.onLivingUpdate))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityBlaze this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn burning?
  "returns: `boolean`"
  (^Boolean [^EntityBlaze this]
    (-> this (.isBurning))))

(defn charged?
  "returns: `boolean`"
  (^Boolean [^EntityBlaze this]
    (-> this (.isCharged))))

(defn set-on-fire
  "on-fire - `boolean`"
  ([^EntityBlaze this ^Boolean on-fire]
    (-> this (.setOnFire on-fire))))

