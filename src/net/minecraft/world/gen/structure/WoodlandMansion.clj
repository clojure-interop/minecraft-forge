(ns net.minecraft.world.gen.structure.WoodlandMansion
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure WoodlandMansion]))

(defn ->woodland-mansion
  "Constructor.

  p-i-47240-1 - `net.minecraft.world.gen.ChunkProviderOverworld`"
  (^WoodlandMansion [^net.minecraft.world.gen.ChunkProviderOverworld p-i-47240-1]
    (new WoodlandMansion p-i-47240-1)))

(def *-allowed-biomes
  "Static Constant.

  type: java.util.List<net.minecraft.world.biome.Biome>"
  WoodlandMansion/ALLOWED_BIOMES)

(defn get-structure-name
  "returns: `java.lang.String`"
  (^java.lang.String [^WoodlandMansion this]
    (-> this (.getStructureName))))

(defn get-closest-stronghold-pos
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  p-180706-3 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^WoodlandMansion this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Boolean p-180706-3]
    (-> this (.getClosestStrongholdPos world-in pos p-180706-3))))

