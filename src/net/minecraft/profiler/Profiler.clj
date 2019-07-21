(ns net.minecraft.profiler.Profiler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.profiler Profiler]))

(defn ->profiler
  "Constructor."
  (^Profiler []
    (new Profiler )))

(defn profiling-enabled
  "Instance Field.

  type: boolean"
  (^Boolean [^Profiler this]
    (-> this .-profilingEnabled)))

(defn clear-profiling
  ""
  ([^Profiler this]
    (-> this (.clearProfiling))))

(defn start-section
  "name - `java.lang.String`"
  ([^Profiler this ^java.lang.String name]
    (-> this (.startSection name))))

(defn end-section
  ""
  ([^Profiler this]
    (-> this (.endSection))))

(defn get-profiling-data
  "profiler-name - `java.lang.String`

  returns: `java.util.List<net.minecraft.profiler.Profiler$Result>`"
  (^java.util.List [^Profiler this ^java.lang.String profiler-name]
    (-> this (.getProfilingData profiler-name))))

(defn end-start-section
  "name - `java.lang.String`"
  ([^Profiler this ^java.lang.String name]
    (-> this (.endStartSection name))))

(defn get-name-of-last-section
  "returns: `java.lang.String`"
  (^java.lang.String [^Profiler this]
    (-> this (.getNameOfLastSection))))

