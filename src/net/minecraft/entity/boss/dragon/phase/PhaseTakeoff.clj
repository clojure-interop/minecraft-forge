(ns net.minecraft.entity.boss.dragon.phase.PhaseTakeoff
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseTakeoff]))

(defn ->phase-takeoff
  "Constructor.

  dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseTakeoff [^net.minecraft.entity.boss.EntityDragon dragon-in]
    (new PhaseTakeoff dragon-in)))

(defn do-local-update
  ""
  ([^PhaseTakeoff this]
    (-> this (.doLocalUpdate))))

(defn init-phase
  ""
  ([^PhaseTakeoff this]
    (-> this (.initPhase))))

(defn get-target-location
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^PhaseTakeoff this]
    (-> this (.getTargetLocation))))

(defn get-phase-list
  "returns: `net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseTakeoff>`"
  (^net.minecraft.entity.boss.dragon.phase.PhaseList [^PhaseTakeoff this]
    (-> this (.getPhaseList))))

