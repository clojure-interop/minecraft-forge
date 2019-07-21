(ns net.minecraft.realms.RealmsLevelSummary
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsLevelSummary]))

(defn ->realms-level-summary
  "Constructor.

  level-summary-in - `net.minecraft.world.storage.WorldSummary`"
  (^RealmsLevelSummary [^net.minecraft.world.storage.WorldSummary level-summary-in]
    (new RealmsLevelSummary level-summary-in)))

(defn get-game-mode
  "returns: `int`"
  (^Integer [^RealmsLevelSummary this]
    (-> this (.getGameMode))))

(defn requires-conversion?
  "returns: `boolean`"
  (^Boolean [^RealmsLevelSummary this]
    (-> this (.isRequiresConversion))))

(defn has-cheats?
  "returns: `boolean`"
  (^Boolean [^RealmsLevelSummary this]
    (-> this (.hasCheats))))

(defn get-level-name
  "returns: `java.lang.String`"
  (^java.lang.String [^RealmsLevelSummary this]
    (-> this (.getLevelName))))

(defn hardcore?
  "returns: `boolean`"
  (^Boolean [^RealmsLevelSummary this]
    (-> this (.isHardcore))))

(defn get-size-on-disk
  "returns: `long`"
  (^Long [^RealmsLevelSummary this]
    (-> this (.getSizeOnDisk))))

(defn compare-to
  "p-compare-to-1 - `net.minecraft.world.storage.WorldSummary`

  returns: `int`"
  (^Integer [^RealmsLevelSummary this ^net.minecraft.world.storage.WorldSummary p-compare-to-1]
    (-> this (.compareTo p-compare-to-1))))

(defn get-level-id
  "returns: `java.lang.String`"
  (^java.lang.String [^RealmsLevelSummary this]
    (-> this (.getLevelId))))

(defn get-last-played
  "returns: `long`"
  (^Long [^RealmsLevelSummary this]
    (-> this (.getLastPlayed))))

