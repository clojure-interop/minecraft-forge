(ns net.minecraft.entity.boss.dragon.phase.IPhase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase IPhase]))

(defn get-target-location
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^IPhase this]
    (-> this (.getTargetLocation))))

(defn get-is-stationary?
  "returns: `boolean`"
  (^Boolean [^IPhase this]
    (-> this (.getIsStationary))))

(defn get-yaw-factor
  "returns: `float`"
  (^Float [^IPhase this]
    (-> this (.getYawFactor))))

(defn remove-area-effect
  ""
  ([^IPhase this]
    (-> this (.removeAreaEffect))))

(defn on-crystal-destroyed
  "crystal - `net.minecraft.entity.item.EntityEnderCrystal`
  pos - `net.minecraft.util.math.BlockPos`
  dmg-src - `net.minecraft.util.DamageSource`
  plyr - `net.minecraft.entity.player.EntityPlayer`"
  ([^IPhase this ^net.minecraft.entity.item.EntityEnderCrystal crystal ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.DamageSource dmg-src ^net.minecraft.entity.player.EntityPlayer plyr]
    (-> this (.onCrystalDestroyed crystal pos dmg-src plyr))))

(defn do-client-render-effects
  ""
  ([^IPhase this]
    (-> this (.doClientRenderEffects))))

(defn get-adjusted-damage
  "pt - `net.minecraft.entity.boss.EntityDragonPart`
  src - `net.minecraft.util.DamageSource`
  damage - `float`

  returns: `float`"
  (^Float [^IPhase this ^net.minecraft.entity.boss.EntityDragonPart pt ^net.minecraft.util.DamageSource src ^Float damage]
    (-> this (.getAdjustedDamage pt src damage))))

(defn get-max-rise-or-fall
  "returns: `float`"
  (^Float [^IPhase this]
    (-> this (.getMaxRiseOrFall))))

(defn get-phase-list
  "returns: `net.minecraft.entity.boss.dragon.phase.PhaseList<? extends net.minecraft.entity.boss.dragon.phase.IPhase>`"
  ([^IPhase this]
    (-> this (.getPhaseList))))

(defn do-local-update
  ""
  ([^IPhase this]
    (-> this (.doLocalUpdate))))

(defn init-phase
  ""
  ([^IPhase this]
    (-> this (.initPhase))))

