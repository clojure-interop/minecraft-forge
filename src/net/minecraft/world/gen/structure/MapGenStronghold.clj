(ns net.minecraft.world.gen.structure.MapGenStronghold
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenStronghold]))

(defn ->map-gen-stronghold
  "Constructor.

  p-i-2068-1 - `java.util.Map`"
  (^MapGenStronghold [^java.util.Map p-i-2068-1]
    (new MapGenStronghold p-i-2068-1))
  (^MapGenStronghold []
    (new MapGenStronghold )))

(defn allowed-biomes
  "Instance Constant.

  type: java.util.List<net.minecraft.world.biome.Biome>"
  (^java.util.List [^MapGenStronghold this]
    (-> this .-allowedBiomes)))

(defn get-structure-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MapGenStronghold this]
    (-> this (.getStructureName))))

(defn get-closest-stronghold-pos
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  p-180706-3 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^MapGenStronghold this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Boolean p-180706-3]
    (-> this (.getClosestStrongholdPos world-in pos p-180706-3))))

