(ns net.minecraft.util.CombatEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util CombatEntry]))

(defn ->combat-entry
  "Constructor.

  damage-src-in - `net.minecraft.util.DamageSource`
  time-in - `int`
  health-amount - `float`
  damage-amount - `float`
  fall-suffix-in - `java.lang.String`
  fall-distance-in - `float`"
  (^CombatEntry [^net.minecraft.util.DamageSource damage-src-in ^Integer time-in ^Float health-amount ^Float damage-amount ^java.lang.String fall-suffix-in ^Float fall-distance-in]
    (new CombatEntry damage-src-in time-in health-amount damage-amount fall-suffix-in fall-distance-in)))

(defn get-damage-src
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^CombatEntry this]
    (-> this (.getDamageSrc))))

(defn get-damage
  "returns: `float`"
  (^Float [^CombatEntry this]
    (-> this (.getDamage))))

(defn living-damage-src?
  "returns: `boolean`"
  (^Boolean [^CombatEntry this]
    (-> this (.isLivingDamageSrc))))

(defn get-fall-suffix
  "returns: `java.lang.String`"
  (^java.lang.String [^CombatEntry this]
    (-> this (.getFallSuffix))))

(defn get-damage-src-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^CombatEntry this]
    (-> this (.getDamageSrcDisplayName))))

(defn get-damage-amount
  "returns: `float`"
  (^Float [^CombatEntry this]
    (-> this (.getDamageAmount))))

