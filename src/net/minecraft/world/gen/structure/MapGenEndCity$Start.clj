(ns net.minecraft.world.gen.structure.MapGenEndCity$Start
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenEndCity$Start]))

(defn ->start
  "Constructor.

  world-in - `net.minecraft.world.World`
  chunk-provider - `net.minecraft.world.gen.ChunkProviderEnd`
  random - `java.util.Random`
  chunk-x - `int`
  chunk-z - `int`"
  (^MapGenEndCity$Start [^net.minecraft.world.World world-in ^net.minecraft.world.gen.ChunkProviderEnd chunk-provider ^java.util.Random random ^Integer chunk-x ^Integer chunk-z]
    (new MapGenEndCity$Start world-in chunk-provider random chunk-x chunk-z))
  (^MapGenEndCity$Start []
    (new MapGenEndCity$Start )))

(defn sizeable-structure?
  "returns: `boolean`"
  (^Boolean [^MapGenEndCity$Start this]
    (-> this (.isSizeableStructure))))

