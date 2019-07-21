(ns net.minecraft.entity.monster.EntityWitch
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityWitch]))

(defn ->entity-witch
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityWitch [^net.minecraft.world.World world-in]
    (new EntityWitch world-in)))

(defn *register-fixes-witch
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityWitch/registerFixesWitch fixer)))

(defn set-aggressive
  "aggressive - `boolean`"
  ([^EntityWitch this ^Boolean aggressive]
    (-> this (.setAggressive aggressive))))

(defn drinking-potion?
  "returns: `boolean`"
  (^Boolean [^EntityWitch this]
    (-> this (.isDrinkingPotion))))

(defn on-living-update
  ""
  ([^EntityWitch this]
    (-> this (.onLivingUpdate))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityWitch this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn attack-entity-with-ranged-attack
  "target - `net.minecraft.entity.EntityLivingBase`
  distance-factor - `float`"
  ([^EntityWitch this ^net.minecraft.entity.EntityLivingBase target ^Float distance-factor]
    (-> this (.attackEntityWithRangedAttack target distance-factor))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityWitch this]
    (-> this (.getEyeHeight))))

