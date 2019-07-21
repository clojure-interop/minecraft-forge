(ns net.minecraft.world.biome.BiomeSavannaMutated
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeSavannaMutated]))

(defn ->biome-savanna-mutated
  "Constructor.

  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeSavannaMutated [^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeSavannaMutated properties)))

(defn gen-terrain-blocks
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  chunk-primer-in - `net.minecraft.world.chunk.ChunkPrimer`
  x - `int`
  z - `int`
  noise-val - `double`"
  ([^BiomeSavannaMutated this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.world.chunk.ChunkPrimer chunk-primer-in ^Integer x ^Integer z ^Double noise-val]
    (-> this (.genTerrainBlocks world-in rand chunk-primer-in x z noise-val))))

(defn decorate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BiomeSavannaMutated this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate world-in rand pos))))

