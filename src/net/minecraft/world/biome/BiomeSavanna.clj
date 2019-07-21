(ns net.minecraft.world.biome.BiomeSavanna
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeSavanna]))

(defn ->biome-savanna
  "Constructor.

  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeSavanna [^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeSavanna properties)))

(defn gen-big-tree-chance
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenAbstractTree`"
  (^net.minecraft.world.gen.feature.WorldGenAbstractTree [^BiomeSavanna this ^java.util.Random rand]
    (-> this (.genBigTreeChance rand))))

(defn decorate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BiomeSavanna this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate world-in rand pos))))

(defn get-biome-class
  "returns: `java.lang.Class<? extends net.minecraft.world.biome.Biome>`"
  ([^BiomeSavanna this]
    (-> this (.getBiomeClass))))

