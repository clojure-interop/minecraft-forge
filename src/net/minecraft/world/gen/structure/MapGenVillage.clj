(ns net.minecraft.world.gen.structure.MapGenVillage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenVillage]))

(defn ->map-gen-village
  "Constructor.

  map - `java.util.Map`"
  (^MapGenVillage [^java.util.Map map]
    (new MapGenVillage map))
  (^MapGenVillage []
    (new MapGenVillage )))

(defn *-village-spawn-biomes
  "Static Field.

  type: java.util.List<net.minecraft.world.biome.Biome>"
  []
  MapGenVillage/VILLAGE_SPAWN_BIOMES)

(defn get-structure-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MapGenVillage this]
    (-> this (.getStructureName))))

(defn get-closest-stronghold-pos
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  p-180706-3 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^MapGenVillage this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Boolean p-180706-3]
    (-> this (.getClosestStrongholdPos world-in pos p-180706-3))))

