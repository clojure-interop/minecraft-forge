(ns net.minecraft.entity.boss.dragon.phase.PhaseHover
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseHover]))

(defn ->phase-hover
  "Constructor.

  dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseHover [^net.minecraft.entity.boss.EntityDragon dragon-in]
    (new PhaseHover dragon-in)))

(defn do-local-update
  ""
  ([^PhaseHover this]
    (-> this (.doLocalUpdate))))

(defn get-is-stationary?
  "returns: `boolean`"
  (^Boolean [^PhaseHover this]
    (-> this (.getIsStationary))))

(defn init-phase
  ""
  ([^PhaseHover this]
    (-> this (.initPhase))))

(defn get-max-rise-or-fall
  "returns: `float`"
  (^Float [^PhaseHover this]
    (-> this (.getMaxRiseOrFall))))

(defn get-target-location
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^PhaseHover this]
    (-> this (.getTargetLocation))))

(defn get-phase-list
  "returns: `net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseHover>`"
  (^net.minecraft.entity.boss.dragon.phase.PhaseList [^PhaseHover this]
    (-> this (.getPhaseList))))

