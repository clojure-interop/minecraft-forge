(ns net.minecraft.world.biome.BiomeSwamp
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeSwamp]))

(defn gen-big-tree-chance
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenAbstractTree`"
  (^net.minecraft.world.gen.feature.WorldGenAbstractTree [^BiomeSwamp this ^java.util.Random rand]
    (-> this (.genBigTreeChance rand))))

(defn pick-random-flower
  "rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.BlockFlower$EnumFlowerType`"
  (^net.minecraft.block.BlockFlower$EnumFlowerType [^BiomeSwamp this ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.pickRandomFlower rand pos))))

(defn gen-terrain-blocks
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  chunk-primer-in - `net.minecraft.world.chunk.ChunkPrimer`
  x - `int`
  z - `int`
  noise-val - `double`"
  ([^BiomeSwamp this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.world.chunk.ChunkPrimer chunk-primer-in ^Integer x ^Integer z ^Double noise-val]
    (-> this (.genTerrainBlocks world-in rand chunk-primer-in x z noise-val))))

(defn decorate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BiomeSwamp this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate world-in rand pos))))

(defn get-grass-color-at-pos
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^BiomeSwamp this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getGrassColorAtPos pos))))

(defn get-foliage-color-at-pos
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^BiomeSwamp this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getFoliageColorAtPos pos))))

(defn add-default-flowers
  "Description copied from class: Biome"
  ([^BiomeSwamp this]
    (-> this (.addDefaultFlowers))))

