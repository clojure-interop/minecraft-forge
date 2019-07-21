(ns net.minecraft.world.NextTickListEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world NextTickListEntry]))

(defn ->next-tick-list-entry
  "Constructor.

  position-in - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`"
  (^NextTickListEntry [^net.minecraft.util.math.BlockPos position-in ^net.minecraft.block.Block block-in]
    (new NextTickListEntry position-in block-in)))

(defn position
  "Instance Constant.

  type: net.minecraft.util.math.BlockPos"
  (^net.minecraft.util.math.BlockPos [^NextTickListEntry this]
    (-> this .-position)))

(defn scheduled-time
  "Instance Field.

  type: long"
  (^Long [^NextTickListEntry this]
    (-> this .-scheduledTime)))

(defn priority
  "Instance Field.

  type: int"
  (^Integer [^NextTickListEntry this]
    (-> this .-priority)))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NextTickListEntry this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NextTickListEntry this]
    (-> this (.hashCode))))

(defn set-scheduled-time
  "scheduled-time-in - `long`

  returns: `net.minecraft.world.NextTickListEntry`"
  (^net.minecraft.world.NextTickListEntry [^NextTickListEntry this ^Long scheduled-time-in]
    (-> this (.setScheduledTime scheduled-time-in))))

(defn set-priority
  "priority-in - `int`"
  ([^NextTickListEntry this ^Integer priority-in]
    (-> this (.setPriority priority-in))))

(defn compare-to
  "p-compare-to-1 - `net.minecraft.world.NextTickListEntry`

  returns: `int`"
  (^Integer [^NextTickListEntry this ^net.minecraft.world.NextTickListEntry p-compare-to-1]
    (-> this (.compareTo p-compare-to-1))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NextTickListEntry this]
    (-> this (.toString))))

(defn get-block
  "returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^NextTickListEntry this]
    (-> this (.getBlock))))

