(ns net.minecraft.profiler.Snooper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.profiler Snooper]))

(defn ->snooper
  "Constructor.

  side - `java.lang.String`
  player-stat-collector - `net.minecraft.profiler.ISnooperInfo`
  start-time - `long`"
  (^Snooper [^java.lang.String side ^net.minecraft.profiler.ISnooperInfo player-stat-collector ^Long start-time]
    (new Snooper side player-stat-collector start-time)))

(defn get-minecraft-start-time-millis
  "returns: `long`"
  (^Long [^Snooper this]
    (-> this (.getMinecraftStartTimeMillis))))

(defn get-unique-id
  "returns: `java.lang.String`"
  (^java.lang.String [^Snooper this]
    (-> this (.getUniqueID))))

(defn start-snooper
  ""
  ([^Snooper this]
    (-> this (.startSnooper))))

(defn add-memory-stats-to-snooper
  ""
  ([^Snooper this]
    (-> this (.addMemoryStatsToSnooper))))

(defn get-current-stats
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^Snooper this]
    (-> this (.getCurrentStats))))

(defn add-client-stat
  "stat-name - `java.lang.String`
  stat-value - `java.lang.Object`"
  ([^Snooper this ^java.lang.String stat-name ^java.lang.Object stat-value]
    (-> this (.addClientStat stat-name stat-value))))

(defn add-stat-to-snooper
  "stat-name - `java.lang.String`
  stat-value - `java.lang.Object`"
  ([^Snooper this ^java.lang.String stat-name ^java.lang.Object stat-value]
    (-> this (.addStatToSnooper stat-name stat-value))))

(defn stop-snooper
  ""
  ([^Snooper this]
    (-> this (.stopSnooper))))

(defn snooper-running?
  "returns: `boolean`"
  (^Boolean [^Snooper this]
    (-> this (.isSnooperRunning))))

