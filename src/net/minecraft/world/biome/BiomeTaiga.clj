(ns net.minecraft.world.biome.BiomeTaiga
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeTaiga]))

(defn ->biome-taiga
  "Constructor.

  type-in - `net.minecraft.world.biome.BiomeTaiga$Type`
  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeTaiga [^net.minecraft.world.biome.BiomeTaiga$Type type-in ^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeTaiga type-in properties)))

(defn gen-big-tree-chance
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenAbstractTree`"
  (^net.minecraft.world.gen.feature.WorldGenAbstractTree [^BiomeTaiga this ^java.util.Random rand]
    (-> this (.genBigTreeChance rand))))

(defn get-random-world-gen-for-grass
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenerator`"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeTaiga this ^java.util.Random rand]
    (-> this (.getRandomWorldGenForGrass rand))))

(defn decorate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BiomeTaiga this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate world-in rand pos))))

(defn gen-terrain-blocks
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  chunk-primer-in - `net.minecraft.world.chunk.ChunkPrimer`
  x - `int`
  z - `int`
  noise-val - `double`"
  ([^BiomeTaiga this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.world.chunk.ChunkPrimer chunk-primer-in ^Integer x ^Integer z ^Double noise-val]
    (-> this (.genTerrainBlocks world-in rand chunk-primer-in x z noise-val))))

