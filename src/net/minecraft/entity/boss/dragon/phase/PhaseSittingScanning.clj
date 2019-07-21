(ns net.minecraft.entity.boss.dragon.phase.PhaseSittingScanning
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseSittingScanning]))

(defn ->phase-sitting-scanning
  "Constructor.

  dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseSittingScanning [^net.minecraft.entity.boss.EntityDragon dragon-in]
    (new PhaseSittingScanning dragon-in)))

(defn do-local-update
  ""
  ([^PhaseSittingScanning this]
    (-> this (.doLocalUpdate))))

(defn init-phase
  ""
  ([^PhaseSittingScanning this]
    (-> this (.initPhase))))

(defn get-phase-list
  "returns: `net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseSittingScanning>`"
  (^net.minecraft.entity.boss.dragon.phase.PhaseList [^PhaseSittingScanning this]
    (-> this (.getPhaseList))))

