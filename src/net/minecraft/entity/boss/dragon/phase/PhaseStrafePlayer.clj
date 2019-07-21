(ns net.minecraft.entity.boss.dragon.phase.PhaseStrafePlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseStrafePlayer]))

(defn ->phase-strafe-player
  "Constructor.

  dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseStrafePlayer [^net.minecraft.entity.boss.EntityDragon dragon-in]
    (new PhaseStrafePlayer dragon-in)))

(defn do-local-update
  ""
  ([^PhaseStrafePlayer this]
    (-> this (.doLocalUpdate))))

(defn init-phase
  ""
  ([^PhaseStrafePlayer this]
    (-> this (.initPhase))))

(defn set-target
  "p-188686-1 - `net.minecraft.entity.EntityLivingBase`"
  ([^PhaseStrafePlayer this ^net.minecraft.entity.EntityLivingBase p-188686-1]
    (-> this (.setTarget p-188686-1))))

(defn get-target-location
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^PhaseStrafePlayer this]
    (-> this (.getTargetLocation))))

(defn get-phase-list
  "returns: `net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseStrafePlayer>`"
  (^net.minecraft.entity.boss.dragon.phase.PhaseList [^PhaseStrafePlayer this]
    (-> this (.getPhaseList))))

