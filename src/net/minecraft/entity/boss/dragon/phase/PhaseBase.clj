(ns net.minecraft.entity.boss.dragon.phase.PhaseBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseBase]))

(defn ->phase-base
  "Constructor.

  dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseBase [^net.minecraft.entity.boss.EntityDragon dragon-in]
    (new PhaseBase dragon-in)))

(defn get-target-location
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^PhaseBase this]
    (-> this (.getTargetLocation))))

(defn get-is-stationary?
  "returns: `boolean`"
  (^Boolean [^PhaseBase this]
    (-> this (.getIsStationary))))

(defn get-yaw-factor
  "returns: `float`"
  (^Float [^PhaseBase this]
    (-> this (.getYawFactor))))

(defn remove-area-effect
  ""
  ([^PhaseBase this]
    (-> this (.removeAreaEffect))))

(defn on-crystal-destroyed
  "crystal - `net.minecraft.entity.item.EntityEnderCrystal`
  pos - `net.minecraft.util.math.BlockPos`
  dmg-src - `net.minecraft.util.DamageSource`
  plyr - `net.minecraft.entity.player.EntityPlayer`"
  ([^PhaseBase this ^net.minecraft.entity.item.EntityEnderCrystal crystal ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.DamageSource dmg-src ^net.minecraft.entity.player.EntityPlayer plyr]
    (-> this (.onCrystalDestroyed crystal pos dmg-src plyr))))

(defn do-client-render-effects
  ""
  ([^PhaseBase this]
    (-> this (.doClientRenderEffects))))

(defn get-adjusted-damage
  "pt - `net.minecraft.entity.boss.EntityDragonPart`
  src - `net.minecraft.util.DamageSource`
  damage - `float`

  returns: `float`"
  (^Float [^PhaseBase this ^net.minecraft.entity.boss.EntityDragonPart pt ^net.minecraft.util.DamageSource src ^Float damage]
    (-> this (.getAdjustedDamage pt src damage))))

(defn get-max-rise-or-fall
  "returns: `float`"
  (^Float [^PhaseBase this]
    (-> this (.getMaxRiseOrFall))))

(defn do-local-update
  ""
  ([^PhaseBase this]
    (-> this (.doLocalUpdate))))

(defn init-phase
  ""
  ([^PhaseBase this]
    (-> this (.initPhase))))

