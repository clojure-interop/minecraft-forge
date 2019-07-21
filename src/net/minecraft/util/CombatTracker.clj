(ns net.minecraft.util.CombatTracker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util CombatTracker]))

(defn ->combat-tracker
  "Constructor.

  fighter-in - `net.minecraft.entity.EntityLivingBase`"
  (^CombatTracker [^net.minecraft.entity.EntityLivingBase fighter-in]
    (new CombatTracker fighter-in)))

(defn calculate-fall-suffix
  ""
  ([^CombatTracker this]
    (-> this (.calculateFallSuffix))))

(defn track-damage
  "damage-src - `net.minecraft.util.DamageSource`
  health-in - `float`
  damage-amount - `float`"
  ([^CombatTracker this ^net.minecraft.util.DamageSource damage-src ^Float health-in ^Float damage-amount]
    (-> this (.trackDamage damage-src health-in damage-amount))))

(defn get-death-message
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^CombatTracker this]
    (-> this (.getDeathMessage))))

(defn get-best-attacker
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^CombatTracker this]
    (-> this (.getBestAttacker))))

(defn get-combat-duration
  "returns: `int`"
  (^Integer [^CombatTracker this]
    (-> this (.getCombatDuration))))

(defn reset
  ""
  ([^CombatTracker this]
    (-> this (.reset))))

(defn get-fighter
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^CombatTracker this]
    (-> this (.getFighter))))

