(ns net.minecraft.crash.CrashReportCategory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.crash CrashReportCategory]))

(defn ->crash-report-category
  "Constructor.

  report - `net.minecraft.crash.CrashReport`
  name - `java.lang.String`"
  (^CrashReportCategory [^net.minecraft.crash.CrashReport report ^java.lang.String name]
    (new CrashReportCategory report name)))

(defn *get-coordinate-info
  "x - `double`
  y - `double`
  z - `double`

  returns: `java.lang.String`"
  (^java.lang.String [^Double x ^Double y ^Double z]
    (CrashReportCategory/getCoordinateInfo x y z))
  (^java.lang.String [^net.minecraft.util.math.BlockPos pos]
    (CrashReportCategory/getCoordinateInfo pos)))

(defn *add-block-info
  "category - `net.minecraft.crash.CrashReportCategory`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  block-data - `int`"
  ([^net.minecraft.crash.CrashReportCategory category ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^Integer block-data]
    (CrashReportCategory/addBlockInfo category pos block-in block-data))
  ([^net.minecraft.crash.CrashReportCategory category ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (CrashReportCategory/addBlockInfo category pos state)))

(defn set-detail
  "name-in - `java.lang.String`
  detail - `net.minecraft.crash.ICrashReportDetail`"
  ([^CrashReportCategory this ^java.lang.String name-in ^net.minecraft.crash.ICrashReportDetail detail]
    (-> this (.setDetail name-in detail))))

(defn add-crash-section
  "section-name - `java.lang.String`
  value - `java.lang.Object`"
  ([^CrashReportCategory this ^java.lang.String section-name ^java.lang.Object value]
    (-> this (.addCrashSection section-name value))))

(defn add-crash-section-throwable
  "section-name - `java.lang.String`
  throwable - `java.lang.Throwable`"
  ([^CrashReportCategory this ^java.lang.String section-name ^java.lang.Throwable throwable]
    (-> this (.addCrashSectionThrowable section-name throwable))))

(defn get-pruned-stack-trace
  "size - `int`

  returns: `int`"
  (^Integer [^CrashReportCategory this ^Integer size]
    (-> this (.getPrunedStackTrace size))))

(defn first-two-elements-of-stack-trace-match
  "s-1 - `java.lang.StackTraceElement`
  s-2 - `java.lang.StackTraceElement`

  returns: `boolean`"
  (^Boolean [^CrashReportCategory this ^java.lang.StackTraceElement s-1 ^java.lang.StackTraceElement s-2]
    (-> this (.firstTwoElementsOfStackTraceMatch s-1 s-2))))

(defn trim-stack-trace-entries-from-bottom
  "amount - `int`"
  ([^CrashReportCategory this ^Integer amount]
    (-> this (.trimStackTraceEntriesFromBottom amount))))

(defn append-to-string-builder
  "builder - `java.lang.StringBuilder`"
  ([^CrashReportCategory this ^java.lang.StringBuilder builder]
    (-> this (.appendToStringBuilder builder))))

(defn get-stack-trace
  "returns: `java.lang.StackTraceElement[]`"
  ([^CrashReportCategory this]
    (-> this (.getStackTrace))))

