(ns net.minecraft.world.gen.structure.MapGenEndCity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenEndCity]))

(defn ->map-gen-end-city
  "Constructor.

  p-i-46665-1 - `net.minecraft.world.gen.ChunkProviderEnd`"
  (^MapGenEndCity [^net.minecraft.world.gen.ChunkProviderEnd p-i-46665-1]
    (new MapGenEndCity p-i-46665-1)))

(defn get-structure-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MapGenEndCity this]
    (-> this (.getStructureName))))

(defn get-closest-stronghold-pos
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  p-180706-3 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^MapGenEndCity this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Boolean p-180706-3]
    (-> this (.getClosestStrongholdPos world-in pos p-180706-3))))

