(ns net.minecraft.util.ReportedException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util ReportedException]))

(defn ->reported-exception
  "Constructor.

  report - `net.minecraft.crash.CrashReport`"
  (^ReportedException [^net.minecraft.crash.CrashReport report]
    (new ReportedException report)))

(defn get-crash-report
  "returns: `net.minecraft.crash.CrashReport`"
  (^net.minecraft.crash.CrashReport [^ReportedException this]
    (-> this (.getCrashReport))))

(defn get-cause
  "returns: `java.lang.Throwable`"
  (^java.lang.Throwable [^ReportedException this]
    (-> this (.getCause))))

(defn get-message
  "returns: `java.lang.String`"
  (^java.lang.String [^ReportedException this]
    (-> this (.getMessage))))

