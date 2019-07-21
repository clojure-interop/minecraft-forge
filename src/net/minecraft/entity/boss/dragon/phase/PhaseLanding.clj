(ns net.minecraft.entity.boss.dragon.phase.PhaseLanding
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseLanding]))

(defn ->phase-landing
  "Constructor.

  dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseLanding [^net.minecraft.entity.boss.EntityDragon dragon-in]
    (new PhaseLanding dragon-in)))

(defn do-client-render-effects
  ""
  ([^PhaseLanding this]
    (-> this (.doClientRenderEffects))))

(defn do-local-update
  ""
  ([^PhaseLanding this]
    (-> this (.doLocalUpdate))))

(defn get-max-rise-or-fall
  "returns: `float`"
  (^Float [^PhaseLanding this]
    (-> this (.getMaxRiseOrFall))))

(defn get-yaw-factor
  "returns: `float`"
  (^Float [^PhaseLanding this]
    (-> this (.getYawFactor))))

(defn init-phase
  ""
  ([^PhaseLanding this]
    (-> this (.initPhase))))

(defn get-target-location
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^PhaseLanding this]
    (-> this (.getTargetLocation))))

(defn get-phase-list
  "returns: `net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseLanding>`"
  (^net.minecraft.entity.boss.dragon.phase.PhaseList [^PhaseLanding this]
    (-> this (.getPhaseList))))

