(ns net.minecraft.world.biome.BiomeMesa
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeMesa]))

(defn ->biome-mesa
  "Constructor.

  p-i-46704-1 - `boolean`
  p-i-46704-2 - `boolean`
  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeMesa [^Boolean p-i-46704-1 ^Boolean p-i-46704-2 ^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeMesa p-i-46704-1 p-i-46704-2 properties)))

(defn create-biome-decorator
  "returns: `net.minecraft.world.biome.BiomeDecorator`"
  (^net.minecraft.world.biome.BiomeDecorator [^BiomeMesa this]
    (-> this (.createBiomeDecorator))))

(defn gen-big-tree-chance
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenAbstractTree`"
  (^net.minecraft.world.gen.feature.WorldGenAbstractTree [^BiomeMesa this ^java.util.Random rand]
    (-> this (.genBigTreeChance rand))))

(defn gen-terrain-blocks
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  chunk-primer-in - `net.minecraft.world.chunk.ChunkPrimer`
  x - `int`
  z - `int`
  noise-val - `double`"
  ([^BiomeMesa this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.world.chunk.ChunkPrimer chunk-primer-in ^Integer x ^Integer z ^Double noise-val]
    (-> this (.genTerrainBlocks world-in rand chunk-primer-in x z noise-val))))

(defn generate-bands
  "p-150619-1 - `long`"
  ([^BiomeMesa this ^Long p-150619-1]
    (-> this (.generateBands p-150619-1))))

(defn get-band
  "p-180629-1 - `int`
  p-180629-2 - `int`
  p-180629-3 - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BiomeMesa this ^Integer p-180629-1 ^Integer p-180629-2 ^Integer p-180629-3]
    (-> this (.getBand p-180629-1 p-180629-2 p-180629-3))))

(defn get-foliage-color-at-pos
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^BiomeMesa this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getFoliageColorAtPos pos))))

(defn get-grass-color-at-pos
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^BiomeMesa this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getGrassColorAtPos pos))))

