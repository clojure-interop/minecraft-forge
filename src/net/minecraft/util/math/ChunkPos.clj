(ns net.minecraft.util.math.ChunkPos
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.math ChunkPos]))

(defn ->chunk-pos
  "Constructor.

  x - `int`
  z - `int`"
  (^ChunkPos [^Integer x ^Integer z]
    (new ChunkPos x z))
  (^ChunkPos [^net.minecraft.util.math.BlockPos pos]
    (new ChunkPos pos)))

(defn chunk-x-pos
  "Instance Constant.

  type: int"
  (^Integer [^ChunkPos this]
    (-> this .-chunkXPos)))

(defn chunk-z-pos
  "Instance Constant.

  type: int"
  (^Integer [^ChunkPos this]
    (-> this .-chunkZPos)))

(defn *as-long
  "x - `int`
  z - `int`

  returns: `long`"
  (^Long [^Integer x ^Integer z]
    (ChunkPos/asLong x z)))

(defn get-z-start
  "returns: `int`"
  (^Integer [^ChunkPos this]
    (-> this (.getZStart))))

(defn get-block
  "x - `int`
  y - `int`
  z - `int`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^ChunkPos this ^Integer x ^Integer y ^Integer z]
    (-> this (.getBlock x y z))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ChunkPos this]
    (-> this (.toString))))

(defn get-x-end
  "returns: `int`"
  (^Integer [^ChunkPos this]
    (-> this (.getXEnd))))

(defn get-z-end
  "returns: `int`"
  (^Integer [^ChunkPos this]
    (-> this (.getZEnd))))

(defn get-distance-sq
  "entity-in - `net.minecraft.entity.Entity`

  returns: `double`"
  (^Double [^ChunkPos this ^net.minecraft.entity.Entity entity-in]
    (-> this (.getDistanceSq entity-in))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ChunkPos this]
    (-> this (.hashCode))))

(defn get-x-start
  "returns: `int`"
  (^Integer [^ChunkPos this]
    (-> this (.getXStart))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ChunkPos this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

