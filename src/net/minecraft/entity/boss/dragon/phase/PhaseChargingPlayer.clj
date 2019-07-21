(ns net.minecraft.entity.boss.dragon.phase.PhaseChargingPlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseChargingPlayer]))

(defn ->phase-charging-player
  "Constructor.

  dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseChargingPlayer [^net.minecraft.entity.boss.EntityDragon dragon-in]
    (new PhaseChargingPlayer dragon-in)))

(defn do-local-update
  ""
  ([^PhaseChargingPlayer this]
    (-> this (.doLocalUpdate))))

(defn init-phase
  ""
  ([^PhaseChargingPlayer this]
    (-> this (.initPhase))))

(defn set-target
  "p-188668-1 - `net.minecraft.util.math.Vec3d`"
  ([^PhaseChargingPlayer this ^net.minecraft.util.math.Vec3d p-188668-1]
    (-> this (.setTarget p-188668-1))))

(defn get-max-rise-or-fall
  "returns: `float`"
  (^Float [^PhaseChargingPlayer this]
    (-> this (.getMaxRiseOrFall))))

(defn get-target-location
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^PhaseChargingPlayer this]
    (-> this (.getTargetLocation))))

(defn get-phase-list
  "returns: `net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseChargingPlayer>`"
  (^net.minecraft.entity.boss.dragon.phase.PhaseList [^PhaseChargingPlayer this]
    (-> this (.getPhaseList))))

