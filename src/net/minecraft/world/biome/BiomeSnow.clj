(ns net.minecraft.world.biome.BiomeSnow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeSnow]))

(defn ->biome-snow
  "Constructor.

  super-icy-in - `boolean`
  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeSnow [^Boolean super-icy-in ^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeSnow super-icy-in properties)))

(defn get-spawning-chance
  "returns: `float`"
  (^Float [^BiomeSnow this]
    (-> this (.getSpawningChance))))

(defn decorate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BiomeSnow this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate world-in rand pos))))

(defn gen-big-tree-chance
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenAbstractTree`"
  (^net.minecraft.world.gen.feature.WorldGenAbstractTree [^BiomeSnow this ^java.util.Random rand]
    (-> this (.genBigTreeChance rand))))

