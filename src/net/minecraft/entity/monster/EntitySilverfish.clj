(ns net.minecraft.entity.monster.EntitySilverfish
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntitySilverfish]))

(defn ->entity-silverfish
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntitySilverfish [^net.minecraft.world.World world-in]
    (new EntitySilverfish world-in)))

(defn *register-fixes-silverfish
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntitySilverfish/registerFixesSilverfish fixer)))

(defn get-y-offset
  "returns: `double`"
  (^Double [^EntitySilverfish this]
    (-> this (.getYOffset))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntitySilverfish this]
    (-> this (.getEyeHeight))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntitySilverfish this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn on-update
  ""
  ([^EntitySilverfish this]
    (-> this (.onUpdate))))

(defn set-render-yaw-offset
  "offset - `float`"
  ([^EntitySilverfish this ^Float offset]
    (-> this (.setRenderYawOffset offset))))

(defn get-block-path-weight
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^EntitySilverfish this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockPathWeight pos))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntitySilverfish this]
    (-> this (.getCanSpawnHere))))

(defn get-creature-attribute
  "returns: `net.minecraft.entity.EnumCreatureAttribute`"
  (^net.minecraft.entity.EnumCreatureAttribute [^EntitySilverfish this]
    (-> this (.getCreatureAttribute))))

