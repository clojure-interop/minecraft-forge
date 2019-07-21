(ns net.minecraft.entity.boss.dragon.phase.PhaseList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseList]))

(def *-holding-pattern
  "Static Constant.

  type: net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseHoldingPattern>"
  PhaseList/HOLDING_PATTERN)

(def *-strafe-player
  "Static Constant.

  type: net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseStrafePlayer>"
  PhaseList/STRAFE_PLAYER)

(def *-landing-approach
  "Static Constant.

  type: net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseLandingApproach>"
  PhaseList/LANDING_APPROACH)

(def *-landing
  "Static Constant.

  type: net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseLanding>"
  PhaseList/LANDING)

(def *-takeoff
  "Static Constant.

  type: net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseTakeoff>"
  PhaseList/TAKEOFF)

(def *-sitting-flaming
  "Static Constant.

  type: net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseSittingFlaming>"
  PhaseList/SITTING_FLAMING)

(def *-sitting-scanning
  "Static Constant.

  type: net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseSittingScanning>"
  PhaseList/SITTING_SCANNING)

(def *-sitting-attacking
  "Static Constant.

  type: net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseSittingAttacking>"
  PhaseList/SITTING_ATTACKING)

(def *-charging-player
  "Static Constant.

  type: net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseChargingPlayer>"
  PhaseList/CHARGING_PLAYER)

(def *-dying
  "Static Constant.

  type: net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseDying>"
  PhaseList/DYING)

(def *-hover
  "Static Constant.

  type: net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseHover>"
  PhaseList/HOVER)

(defn *get-by-id
  "p-188738-0 - `int`

  returns: `net.minecraft.entity.boss.dragon.phase.PhaseList<?>`"
  (^net.minecraft.entity.boss.dragon.phase.PhaseList [^Integer p-188738-0]
    (PhaseList/getById p-188738-0)))

(defn *get-total-phases
  "returns: `int`"
  (^Integer []
    (PhaseList/getTotalPhases )))

(defn create-phase
  "dragon - `net.minecraft.entity.boss.EntityDragon`

  returns: `net.minecraft.entity.boss.dragon.phase.IPhase`"
  (^net.minecraft.entity.boss.dragon.phase.IPhase [^PhaseList this ^net.minecraft.entity.boss.EntityDragon dragon]
    (-> this (.createPhase dragon))))

(defn get-id
  "returns: `int`"
  (^Integer [^PhaseList this]
    (-> this (.getId))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^PhaseList this]
    (-> this (.toString))))

