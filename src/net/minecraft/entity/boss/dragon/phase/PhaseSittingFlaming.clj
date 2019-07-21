(ns net.minecraft.entity.boss.dragon.phase.PhaseSittingFlaming
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseSittingFlaming]))

(defn ->phase-sitting-flaming
  "Constructor.

  dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseSittingFlaming [^net.minecraft.entity.boss.EntityDragon dragon-in]
    (new PhaseSittingFlaming dragon-in)))

(defn do-client-render-effects
  ""
  ([^PhaseSittingFlaming this]
    (-> this (.doClientRenderEffects))))

(defn do-local-update
  ""
  ([^PhaseSittingFlaming this]
    (-> this (.doLocalUpdate))))

(defn init-phase
  ""
  ([^PhaseSittingFlaming this]
    (-> this (.initPhase))))

(defn remove-area-effect
  ""
  ([^PhaseSittingFlaming this]
    (-> this (.removeAreaEffect))))

(defn get-phase-list
  "returns: `net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseSittingFlaming>`"
  (^net.minecraft.entity.boss.dragon.phase.PhaseList [^PhaseSittingFlaming this]
    (-> this (.getPhaseList))))

(defn reset-flame-count
  ""
  ([^PhaseSittingFlaming this]
    (-> this (.resetFlameCount))))

