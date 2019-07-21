(ns net.minecraft.entity.boss.dragon.phase.PhaseSittingAttacking
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseSittingAttacking]))

(defn ->phase-sitting-attacking
  "Constructor.

  dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseSittingAttacking [^net.minecraft.entity.boss.EntityDragon dragon-in]
    (new PhaseSittingAttacking dragon-in)))

(defn do-client-render-effects
  ""
  ([^PhaseSittingAttacking this]
    (-> this (.doClientRenderEffects))))

(defn do-local-update
  ""
  ([^PhaseSittingAttacking this]
    (-> this (.doLocalUpdate))))

(defn init-phase
  ""
  ([^PhaseSittingAttacking this]
    (-> this (.initPhase))))

(defn get-phase-list
  "returns: `net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseSittingAttacking>`"
  (^net.minecraft.entity.boss.dragon.phase.PhaseList [^PhaseSittingAttacking this]
    (-> this (.getPhaseList))))

