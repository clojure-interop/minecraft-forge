(ns net.minecraft.world.gen.feature.WorldGenSpikes$EndSpike
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenSpikes$EndSpike]))

(defn ->end-spike
  "Constructor.

  p-i-47020-1 - `int`
  p-i-47020-2 - `int`
  p-i-47020-3 - `int`
  p-i-47020-4 - `int`
  p-i-47020-5 - `boolean`"
  (^WorldGenSpikes$EndSpike [^Integer p-i-47020-1 ^Integer p-i-47020-2 ^Integer p-i-47020-3 ^Integer p-i-47020-4 ^Boolean p-i-47020-5]
    (new WorldGenSpikes$EndSpike p-i-47020-1 p-i-47020-2 p-i-47020-3 p-i-47020-4 p-i-47020-5)))

(defn does-start-in-chunk
  "p-186154-1 - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenSpikes$EndSpike this ^net.minecraft.util.math.BlockPos p-186154-1]
    (-> this (.doesStartInChunk p-186154-1))))

(defn get-center-x
  "returns: `int`"
  (^Integer [^WorldGenSpikes$EndSpike this]
    (-> this (.getCenterX))))

(defn get-center-z
  "returns: `int`"
  (^Integer [^WorldGenSpikes$EndSpike this]
    (-> this (.getCenterZ))))

(defn get-radius
  "returns: `int`"
  (^Integer [^WorldGenSpikes$EndSpike this]
    (-> this (.getRadius))))

(defn get-height
  "returns: `int`"
  (^Integer [^WorldGenSpikes$EndSpike this]
    (-> this (.getHeight))))

(defn guarded?
  "returns: `boolean`"
  (^Boolean [^WorldGenSpikes$EndSpike this]
    (-> this (.isGuarded))))

(defn get-top-bounding-box
  "returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^WorldGenSpikes$EndSpike this]
    (-> this (.getTopBoundingBox))))

