(ns net.minecraft.world.gen.structure.MapGenNetherBridge
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenNetherBridge]))

(defn ->map-gen-nether-bridge
  "Constructor."
  (^MapGenNetherBridge []
    (new MapGenNetherBridge )))

(defn get-structure-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MapGenNetherBridge this]
    (-> this (.getStructureName))))

(defn get-spawn-list
  "returns: `java.util.List<net.minecraft.world.biome.Biome$SpawnListEntry>`"
  (^java.util.List [^MapGenNetherBridge this]
    (-> this (.getSpawnList))))

(defn get-closest-stronghold-pos
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  p-180706-3 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^MapGenNetherBridge this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Boolean p-180706-3]
    (-> this (.getClosestStrongholdPos world-in pos p-180706-3))))

