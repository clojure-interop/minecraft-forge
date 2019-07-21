(ns net.minecraft.world.biome.BiomeHills
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeHills]))

(defn ->biome-hills
  "Constructor.

  p-i-46710-1 - `net.minecraft.world.biome.BiomeHills$Type`
  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeHills [^net.minecraft.world.biome.BiomeHills$Type p-i-46710-1 ^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeHills p-i-46710-1 properties)))

(defn gen-big-tree-chance
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenAbstractTree`"
  (^net.minecraft.world.gen.feature.WorldGenAbstractTree [^BiomeHills this ^java.util.Random rand]
    (-> this (.genBigTreeChance rand))))

(defn decorate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BiomeHills this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate world-in rand pos))))

(defn gen-terrain-blocks
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  chunk-primer-in - `net.minecraft.world.chunk.ChunkPrimer`
  x - `int`
  z - `int`
  noise-val - `double`"
  ([^BiomeHills this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.world.chunk.ChunkPrimer chunk-primer-in ^Integer x ^Integer z ^Double noise-val]
    (-> this (.genTerrainBlocks world-in rand chunk-primer-in x z noise-val))))

