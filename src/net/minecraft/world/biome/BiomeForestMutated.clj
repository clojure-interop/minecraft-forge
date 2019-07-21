(ns net.minecraft.world.biome.BiomeForestMutated
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeForestMutated]))

(defn ->biome-forest-mutated
  "Constructor.

  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeForestMutated [^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeForestMutated properties)))

(defn gen-big-tree-chance
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenAbstractTree`"
  (^net.minecraft.world.gen.feature.WorldGenAbstractTree [^BiomeForestMutated this ^java.util.Random rand]
    (-> this (.genBigTreeChance rand))))

