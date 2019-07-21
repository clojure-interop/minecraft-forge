(ns net.minecraft.world.gen.structure.StructureOceanMonument
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonument]))

(defn ->structure-ocean-monument
  "Constructor.

  p-i-45608-1 - `java.util.Map`"
  (^StructureOceanMonument [^java.util.Map p-i-45608-1]
    (new StructureOceanMonument p-i-45608-1))
  (^StructureOceanMonument []
    (new StructureOceanMonument )))

(def *-water-biomes
  "Static Constant.

  type: java.util.List<net.minecraft.world.biome.Biome>"
  StructureOceanMonument/WATER_BIOMES)

(def *-spawn-biomes
  "Static Constant.

  type: java.util.List<net.minecraft.world.biome.Biome>"
  StructureOceanMonument/SPAWN_BIOMES)

(defn get-structure-name
  "returns: `java.lang.String`"
  (^java.lang.String [^StructureOceanMonument this]
    (-> this (.getStructureName))))

(defn get-closest-stronghold-pos
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  p-180706-3 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^StructureOceanMonument this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Boolean p-180706-3]
    (-> this (.getClosestStrongholdPos world-in pos p-180706-3))))

(defn get-scattered-feature-spawn-list
  "returns: `java.util.List<net.minecraft.world.biome.Biome$SpawnListEntry>`"
  (^java.util.List [^StructureOceanMonument this]
    (-> this (.getScatteredFeatureSpawnList))))

