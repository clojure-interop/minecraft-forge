(ns net.minecraft.world.gen.structure.MapGenScatteredFeature
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenScatteredFeature]))

(defn ->map-gen-scattered-feature
  "Constructor.

  p-i-2061-1 - `java.util.Map`"
  (^MapGenScatteredFeature [^java.util.Map p-i-2061-1]
    (new MapGenScatteredFeature p-i-2061-1))
  (^MapGenScatteredFeature []
    (new MapGenScatteredFeature )))

(defn get-structure-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MapGenScatteredFeature this]
    (-> this (.getStructureName))))

(defn get-closest-stronghold-pos
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  p-180706-3 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^MapGenScatteredFeature this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Boolean p-180706-3]
    (-> this (.getClosestStrongholdPos world-in pos p-180706-3))))

(defn swamp-hut?
  "p-175798-1 - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^MapGenScatteredFeature this ^net.minecraft.util.math.BlockPos p-175798-1]
    (-> this (.isSwampHut p-175798-1))))

(defn get-scattered-feature-spawn-list
  "returns: `java.util.List<net.minecraft.world.biome.Biome$SpawnListEntry>`"
  (^java.util.List [^MapGenScatteredFeature this]
    (-> this (.getScatteredFeatureSpawnList))))

