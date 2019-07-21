(ns net.minecraft.world.biome.BiomeForest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeForest]))

(defn ->biome-forest
  "Constructor.

  type-in - `net.minecraft.world.biome.BiomeForest$Type`
  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeForest [^net.minecraft.world.biome.BiomeForest$Type type-in ^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeForest type-in properties)))

(defn gen-big-tree-chance
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenAbstractTree`"
  (^net.minecraft.world.gen.feature.WorldGenAbstractTree [^BiomeForest this ^java.util.Random rand]
    (-> this (.genBigTreeChance rand))))

(defn pick-random-flower
  "rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.BlockFlower$EnumFlowerType`"
  (^net.minecraft.block.BlockFlower$EnumFlowerType [^BiomeForest this ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.pickRandomFlower rand pos))))

(defn decorate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BiomeForest this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate world-in rand pos))))

(defn add-mushrooms
  "p-185379-1 - `net.minecraft.world.World`
  p-185379-2 - `java.util.Random`
  p-185379-3 - `net.minecraft.util.math.BlockPos`"
  ([^BiomeForest this ^net.minecraft.world.World p-185379-1 ^java.util.Random p-185379-2 ^net.minecraft.util.math.BlockPos p-185379-3]
    (-> this (.addMushrooms p-185379-1 p-185379-2 p-185379-3))))

(defn add-double-plants
  "p-185378-1 - `net.minecraft.world.World`
  p-185378-2 - `java.util.Random`
  p-185378-3 - `net.minecraft.util.math.BlockPos`
  p-185378-4 - `int`"
  ([^BiomeForest this ^net.minecraft.world.World p-185378-1 ^java.util.Random p-185378-2 ^net.minecraft.util.math.BlockPos p-185378-3 ^Integer p-185378-4]
    (-> this (.addDoublePlants p-185378-1 p-185378-2 p-185378-3 p-185378-4))))

(defn add-default-flowers
  "Description copied from class: Biome"
  ([^BiomeForest this]
    (-> this (.addDefaultFlowers))))

(defn get-biome-class
  "returns: `java.lang.Class<? extends net.minecraft.world.biome.Biome>`"
  ([^BiomeForest this]
    (-> this (.getBiomeClass))))

(defn get-grass-color-at-pos
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^BiomeForest this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getGrassColorAtPos pos))))

