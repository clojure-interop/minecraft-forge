(ns net.minecraft.entity.boss.dragon.phase.PhaseSittingBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseSittingBase]))

(defn ->phase-sitting-base
  "Constructor.

  p-i-46794-1 - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseSittingBase [^net.minecraft.entity.boss.EntityDragon p-i-46794-1]
    (new PhaseSittingBase p-i-46794-1)))

(defn get-is-stationary?
  "returns: `boolean`"
  (^Boolean [^PhaseSittingBase this]
    (-> this (.getIsStationary))))

(defn get-adjusted-damage
  "pt - `net.minecraft.entity.boss.EntityDragonPart`
  src - `net.minecraft.util.DamageSource`
  damage - `float`

  returns: `float`"
  (^Float [^PhaseSittingBase this ^net.minecraft.entity.boss.EntityDragonPart pt ^net.minecraft.util.DamageSource src ^Float damage]
    (-> this (.getAdjustedDamage pt src damage))))

