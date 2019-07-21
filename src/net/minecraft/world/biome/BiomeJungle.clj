(ns net.minecraft.world.biome.BiomeJungle
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeJungle]))

(defn ->biome-jungle
  "Constructor.

  is-edge-in - `boolean`
  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeJungle [^Boolean is-edge-in ^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeJungle is-edge-in properties)))

(defn gen-big-tree-chance
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenAbstractTree`"
  (^net.minecraft.world.gen.feature.WorldGenAbstractTree [^BiomeJungle this ^java.util.Random rand]
    (-> this (.genBigTreeChance rand))))

(defn get-random-world-gen-for-grass
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenerator`"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeJungle this ^java.util.Random rand]
    (-> this (.getRandomWorldGenForGrass rand))))

(defn decorate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BiomeJungle this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate world-in rand pos))))

