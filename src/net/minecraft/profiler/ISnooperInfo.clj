(ns net.minecraft.profiler.ISnooperInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.profiler ISnooperInfo]))

(defn add-server-stats-to-snooper
  "player-snooper - `net.minecraft.profiler.Snooper`"
  ([^ISnooperInfo this ^net.minecraft.profiler.Snooper player-snooper]
    (-> this (.addServerStatsToSnooper player-snooper))))

(defn add-server-type-to-snooper
  "player-snooper - `net.minecraft.profiler.Snooper`"
  ([^ISnooperInfo this ^net.minecraft.profiler.Snooper player-snooper]
    (-> this (.addServerTypeToSnooper player-snooper))))

(defn snooper-enabled?
  "returns: `boolean`"
  (^Boolean [^ISnooperInfo this]
    (-> this (.isSnooperEnabled))))

