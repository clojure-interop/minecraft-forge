(ns net.minecraft.world.gen.structure.WoodlandMansion$Start
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure WoodlandMansion$Start]))

(defn ->start
  "Constructor.

  p-i-47235-1 - `net.minecraft.world.World`
  p-i-47235-2 - `net.minecraft.world.gen.ChunkProviderOverworld`
  p-i-47235-3 - `java.util.Random`
  p-i-47235-4 - `int`
  p-i-47235-5 - `int`"
  (^WoodlandMansion$Start [^net.minecraft.world.World p-i-47235-1 ^net.minecraft.world.gen.ChunkProviderOverworld p-i-47235-2 ^java.util.Random p-i-47235-3 ^Integer p-i-47235-4 ^Integer p-i-47235-5]
    (new WoodlandMansion$Start p-i-47235-1 p-i-47235-2 p-i-47235-3 p-i-47235-4 p-i-47235-5))
  (^WoodlandMansion$Start []
    (new WoodlandMansion$Start )))

(defn generate-structure
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  structurebb - `net.minecraft.world.gen.structure.StructureBoundingBox`"
  ([^WoodlandMansion$Start this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox structurebb]
    (-> this (.generateStructure world-in rand structurebb))))

(defn sizeable-structure?
  "returns: `boolean`"
  (^Boolean [^WoodlandMansion$Start this]
    (-> this (.isSizeableStructure))))

