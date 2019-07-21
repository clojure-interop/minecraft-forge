(ns net.minecraft.world.DifficultyInstance
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world DifficultyInstance]))

(defn ->difficulty-instance
  "Constructor.

  world-difficulty - `net.minecraft.world.EnumDifficulty`
  world-time - `long`
  chunk-inhabited-time - `long`
  moon-phase-factor - `float`"
  (^DifficultyInstance [^net.minecraft.world.EnumDifficulty world-difficulty ^Long world-time ^Long chunk-inhabited-time ^Float moon-phase-factor]
    (new DifficultyInstance world-difficulty world-time chunk-inhabited-time moon-phase-factor)))

(defn get-additional-difficulty
  "returns: `float`"
  (^Float [^DifficultyInstance this]
    (-> this (.getAdditionalDifficulty))))

(defn get-clamped-additional-difficulty
  "returns: `float`"
  (^Float [^DifficultyInstance this]
    (-> this (.getClampedAdditionalDifficulty))))

