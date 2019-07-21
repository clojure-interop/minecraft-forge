(ns net.minecraft.entity.boss.dragon.phase.PhaseDying
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseDying]))

(defn ->phase-dying
  "Constructor.

  dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseDying [^net.minecraft.entity.boss.EntityDragon dragon-in]
    (new PhaseDying dragon-in)))

(defn do-client-render-effects
  ""
  ([^PhaseDying this]
    (-> this (.doClientRenderEffects))))

(defn do-local-update
  ""
  ([^PhaseDying this]
    (-> this (.doLocalUpdate))))

(defn init-phase
  ""
  ([^PhaseDying this]
    (-> this (.initPhase))))

(defn get-max-rise-or-fall
  "returns: `float`"
  (^Float [^PhaseDying this]
    (-> this (.getMaxRiseOrFall))))

(defn get-target-location
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^PhaseDying this]
    (-> this (.getTargetLocation))))

(defn get-phase-list
  "returns: `net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseDying>`"
  (^net.minecraft.entity.boss.dragon.phase.PhaseList [^PhaseDying this]
    (-> this (.getPhaseList))))

