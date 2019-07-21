(ns net.minecraft.world.gen.structure.MapGenMineshaft
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenMineshaft]))

(defn ->map-gen-mineshaft
  "Constructor.

  p-i-2034-1 - `java.util.Map`"
  (^MapGenMineshaft [^java.util.Map p-i-2034-1]
    (new MapGenMineshaft p-i-2034-1))
  (^MapGenMineshaft []
    (new MapGenMineshaft )))

(defn get-structure-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MapGenMineshaft this]
    (-> this (.getStructureName))))

(defn get-closest-stronghold-pos
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  p-180706-3 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^MapGenMineshaft this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Boolean p-180706-3]
    (-> this (.getClosestStrongholdPos world-in pos p-180706-3))))

