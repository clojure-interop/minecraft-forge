(ns net.minecraft.profiler.Profiler$Result
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.profiler Profiler$Result]))

(defn ->result
  "Constructor.

  profiler-name - `java.lang.String`
  use-percentage - `double`
  total-use-percentage - `double`"
  (^Profiler$Result [^java.lang.String profiler-name ^Double use-percentage ^Double total-use-percentage]
    (new Profiler$Result profiler-name use-percentage total-use-percentage)))

(defn use-percentage
  "Instance Field.

  type: double"
  (^Double [^Profiler$Result this]
    (-> this .-usePercentage)))

(defn total-use-percentage
  "Instance Field.

  type: double"
  (^Double [^Profiler$Result this]
    (-> this .-totalUsePercentage)))

(defn profiler-name
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^Profiler$Result this]
    (-> this .-profilerName)))

(defn compare-to
  "p-compare-to-1 - `net.minecraft.profiler.Profiler$Result`

  returns: `int`"
  (^Integer [^Profiler$Result this ^net.minecraft.profiler.Profiler$Result p-compare-to-1]
    (-> this (.compareTo p-compare-to-1))))

(defn get-color
  "returns: `int`"
  (^Integer [^Profiler$Result this]
    (-> this (.getColor))))

