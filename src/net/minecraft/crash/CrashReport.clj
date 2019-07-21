(ns net.minecraft.crash.CrashReport
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.crash CrashReport]))

(defn ->crash-report
  "Constructor.

  description-in - `java.lang.String`
  cause-throwable - `java.lang.Throwable`"
  (^CrashReport [^java.lang.String description-in ^java.lang.Throwable cause-throwable]
    (new CrashReport description-in cause-throwable)))

(defn *make-crash-report
  "cause-in - `java.lang.Throwable`
  description-in - `java.lang.String`

  returns: `net.minecraft.crash.CrashReport`"
  (^net.minecraft.crash.CrashReport [^java.lang.Throwable cause-in ^java.lang.String description-in]
    (CrashReport/makeCrashReport cause-in description-in)))

(defn get-sections-in-string-builder
  "builder - `java.lang.StringBuilder`"
  ([^CrashReport this ^java.lang.StringBuilder builder]
    (-> this (.getSectionsInStringBuilder builder))))

(defn get-cause-stack-trace-or-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CrashReport this]
    (-> this (.getCauseStackTraceOrString))))

(defn get-complete-report
  "returns: `java.lang.String`"
  (^java.lang.String [^CrashReport this]
    (-> this (.getCompleteReport))))

(defn make-category
  "name - `java.lang.String`

  returns: `net.minecraft.crash.CrashReportCategory`"
  (^net.minecraft.crash.CrashReportCategory [^CrashReport this ^java.lang.String name]
    (-> this (.makeCategory name))))

(defn get-category
  "returns: `net.minecraft.crash.CrashReportCategory`"
  (^net.minecraft.crash.CrashReportCategory [^CrashReport this]
    (-> this (.getCategory))))

(defn make-category-depth
  "category-name - `java.lang.String`
  stacktrace-length - `int`

  returns: `net.minecraft.crash.CrashReportCategory`"
  (^net.minecraft.crash.CrashReportCategory [^CrashReport this ^java.lang.String category-name ^Integer stacktrace-length]
    (-> this (.makeCategoryDepth category-name stacktrace-length))))

(defn save-to-file
  "to-file - `java.io.File`

  returns: `boolean`"
  (^Boolean [^CrashReport this ^java.io.File to-file]
    (-> this (.saveToFile to-file))))

(defn get-description
  "returns: `java.lang.String`"
  (^java.lang.String [^CrashReport this]
    (-> this (.getDescription))))

(defn get-file
  "returns: `java.io.File`"
  (^java.io.File [^CrashReport this]
    (-> this (.getFile))))

(defn get-crash-cause
  "returns: `java.lang.Throwable`"
  (^java.lang.Throwable [^CrashReport this]
    (-> this (.getCrashCause))))

