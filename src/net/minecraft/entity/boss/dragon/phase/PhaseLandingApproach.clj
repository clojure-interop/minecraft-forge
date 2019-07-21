(ns net.minecraft.entity.boss.dragon.phase.PhaseLandingApproach
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseLandingApproach]))

(defn ->phase-landing-approach
  "Constructor.

  dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseLandingApproach [^net.minecraft.entity.boss.EntityDragon dragon-in]
    (new PhaseLandingApproach dragon-in)))

(defn get-phase-list
  "returns: `net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseLandingApproach>`"
  (^net.minecraft.entity.boss.dragon.phase.PhaseList [^PhaseLandingApproach this]
    (-> this (.getPhaseList))))

(defn init-phase
  ""
  ([^PhaseLandingApproach this]
    (-> this (.initPhase))))

(defn do-local-update
  ""
  ([^PhaseLandingApproach this]
    (-> this (.doLocalUpdate))))

(defn get-target-location
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^PhaseLandingApproach this]
    (-> this (.getTargetLocation))))

