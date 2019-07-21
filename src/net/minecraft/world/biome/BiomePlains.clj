(ns net.minecraft.world.biome.BiomePlains
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomePlains]))

(defn ->biome-plains
  "Constructor.

  p-i-46699-1 - `boolean`
  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomePlains [^Boolean p-i-46699-1 ^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomePlains p-i-46699-1 properties)))

(defn pick-random-flower
  "rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.BlockFlower$EnumFlowerType`"
  (^net.minecraft.block.BlockFlower$EnumFlowerType [^BiomePlains this ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.pickRandomFlower rand pos))))

(defn decorate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BiomePlains this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate world-in rand pos))))

(defn add-default-flowers
  "Description copied from class: Biome"
  ([^BiomePlains this]
    (-> this (.addDefaultFlowers))))

(defn gen-big-tree-chance
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenAbstractTree`"
  (^net.minecraft.world.gen.feature.WorldGenAbstractTree [^BiomePlains this ^java.util.Random rand]
    (-> this (.genBigTreeChance rand))))

