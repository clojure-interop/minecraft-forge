(ns net.minecraft.entity.boss.dragon.phase.PhaseHoldingPattern
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.boss.dragon.phase PhaseHoldingPattern]))

(defn ->phase-holding-pattern
  "Constructor.

  dragon-in - `net.minecraft.entity.boss.EntityDragon`"
  (^PhaseHoldingPattern [^net.minecraft.entity.boss.EntityDragon dragon-in]
    (new PhaseHoldingPattern dragon-in)))

(defn get-phase-list
  "returns: `net.minecraft.entity.boss.dragon.phase.PhaseList<net.minecraft.entity.boss.dragon.phase.PhaseHoldingPattern>`"
  (^net.minecraft.entity.boss.dragon.phase.PhaseList [^PhaseHoldingPattern this]
    (-> this (.getPhaseList))))

(defn do-local-update
  ""
  ([^PhaseHoldingPattern this]
    (-> this (.doLocalUpdate))))

(defn init-phase
  ""
  ([^PhaseHoldingPattern this]
    (-> this (.initPhase))))

(defn get-target-location
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^PhaseHoldingPattern this]
    (-> this (.getTargetLocation))))

(defn on-crystal-destroyed
  "crystal - `net.minecraft.entity.item.EntityEnderCrystal`
  pos - `net.minecraft.util.math.BlockPos`
  dmg-src - `net.minecraft.util.DamageSource`
  plyr - `net.minecraft.entity.player.EntityPlayer`"
  ([^PhaseHoldingPattern this ^net.minecraft.entity.item.EntityEnderCrystal crystal ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.DamageSource dmg-src ^net.minecraft.entity.player.EntityPlayer plyr]
    (-> this (.onCrystalDestroyed crystal pos dmg-src plyr))))

