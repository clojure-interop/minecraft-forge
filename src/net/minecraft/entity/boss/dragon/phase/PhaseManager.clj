(ns net.minecraft.entity.boss.dragon.phase.PhaseManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseManager]))

(defn ->phase-manager
  "Constructor.

  dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseManager [^net.minecraft.entity.boss.EntityDragon dragon-in]
    (new PhaseManager dragon-in)))

(defn set-phase
  "phase-in - `net.minecraft.entity.boss.dragon.phase.PhaseList`"
  ([^PhaseManager this ^net.minecraft.entity.boss.dragon.phase.PhaseList phase-in]
    (-> this (.setPhase phase-in))))

(defn get-current-phase
  "returns: `net.minecraft.entity.boss.dragon.phase.IPhase`"
  (^net.minecraft.entity.boss.dragon.phase.IPhase [^PhaseManager this]
    (-> this (.getCurrentPhase))))

(defn get-phase
  "phase-in - `net.minecraft.entity.boss.dragon.phase.PhaseList`

  returns: `<T extends net.minecraft.entity.boss.dragon.phase.IPhase> T`"
  ([^PhaseManager this ^net.minecraft.entity.boss.dragon.phase.PhaseList phase-in]
    (-> this (.getPhase phase-in))))

