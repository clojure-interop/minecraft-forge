(ns net.minecraft.block.BlockEventData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockEventData]))

(defn ->block-event-data
  "Constructor.

  pos - `net.minecraft.util.math.BlockPos`
  block-type - `net.minecraft.block.Block`
  event-id - `int`
  p-i-45756-4 - `int`"
  (^BlockEventData [^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-type ^Integer event-id ^Integer p-i-45756-4]
    (new BlockEventData pos block-type event-id p-i-45756-4)))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockEventData this]
    (-> this (.getPosition))))

(defn get-event-id
  "returns: `int`"
  (^Integer [^BlockEventData this]
    (-> this (.getEventID))))

(defn get-event-parameter
  "returns: `int`"
  (^Integer [^BlockEventData this]
    (-> this (.getEventParameter))))

(defn get-block
  "returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^BlockEventData this]
    (-> this (.getBlock))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BlockEventData this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockEventData this]
    (-> this (.toString))))

