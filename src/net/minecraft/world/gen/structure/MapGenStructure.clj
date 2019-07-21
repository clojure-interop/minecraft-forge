(ns net.minecraft.world.gen.structure.MapGenStructure
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenStructure]))

(defn ->map-gen-structure
  "Constructor."
  (^MapGenStructure []
    (new MapGenStructure )))

(defn get-structure-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MapGenStructure this]
    (-> this (.getStructureName))))

(defn generate-structure
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  chunk-coord - `net.minecraft.util.math.ChunkPos`

  returns: `boolean`"
  (^Boolean [^MapGenStructure this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.util.math.ChunkPos chunk-coord]
    (-> this (.generateStructure world-in random-in chunk-coord))))

(defn inside-structure?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^MapGenStructure this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isInsideStructure pos))))

(defn position-in-structure?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^MapGenStructure this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isPositionInStructure world-in pos))))

(defn get-closest-stronghold-pos
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  p-180706-3 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^MapGenStructure this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Boolean p-180706-3]
    (-> this (.getClosestStrongholdPos world-in pos p-180706-3))))

