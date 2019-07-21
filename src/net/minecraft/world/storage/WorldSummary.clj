(ns net.minecraft.world.storage.WorldSummary
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage WorldSummary]))

(defn ->world-summary
  "Constructor.

  info - `net.minecraft.world.storage.WorldInfo`
  file-name-in - `java.lang.String`
  display-name-in - `java.lang.String`
  size-on-disk-in - `long`
  requires-conversion-in - `boolean`"
  (^WorldSummary [^net.minecraft.world.storage.WorldInfo info ^java.lang.String file-name-in ^java.lang.String display-name-in ^Long size-on-disk-in ^Boolean requires-conversion-in]
    (new WorldSummary info file-name-in display-name-in size-on-disk-in requires-conversion-in)))

(defn get-file-name
  "returns: `java.lang.String`"
  (^java.lang.String [^WorldSummary this]
    (-> this (.getFileName))))

(defn get-enum-game-type
  "returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^WorldSummary this]
    (-> this (.getEnumGameType))))

(defn ask-to-open-world
  "returns: `boolean`"
  (^Boolean [^WorldSummary this]
    (-> this (.askToOpenWorld))))

(defn mark-version-in-list
  "returns: `boolean`"
  (^Boolean [^WorldSummary this]
    (-> this (.markVersionInList))))

(defn hardcore-mode-enabled?
  "returns: `boolean`"
  (^Boolean [^WorldSummary this]
    (-> this (.isHardcoreModeEnabled))))

(defn get-display-name
  "returns: `java.lang.String`"
  (^java.lang.String [^WorldSummary this]
    (-> this (.getDisplayName))))

(defn get-cheats-enabled?
  "returns: `boolean`"
  (^Boolean [^WorldSummary this]
    (-> this (.getCheatsEnabled))))

(defn get-version-name
  "returns: `java.lang.String`"
  (^java.lang.String [^WorldSummary this]
    (-> this (.getVersionName))))

(defn get-size-on-disk
  "returns: `long`"
  (^Long [^WorldSummary this]
    (-> this (.getSizeOnDisk))))

(defn requires-conversion
  "returns: `boolean`"
  (^Boolean [^WorldSummary this]
    (-> this (.requiresConversion))))

(defn compare-to
  "p-compare-to-1 - `net.minecraft.world.storage.WorldSummary`

  returns: `int`"
  (^Integer [^WorldSummary this ^net.minecraft.world.storage.WorldSummary p-compare-to-1]
    (-> this (.compareTo p-compare-to-1))))

(defn get-last-time-played
  "returns: `long`"
  (^Long [^WorldSummary this]
    (-> this (.getLastTimePlayed))))

