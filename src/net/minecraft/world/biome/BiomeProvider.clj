(ns net.minecraft.world.biome.BiomeProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeProvider]))

(defn ->biome-provider
  "Constructor.

  info - `net.minecraft.world.storage.WorldInfo`"
  (^BiomeProvider [^net.minecraft.world.storage.WorldInfo info]
    (new BiomeProvider info)))

(defn *-allowed-biomes
  "Static Field.

  type: java.util.List<net.minecraft.world.biome.Biome>"
  []
  BiomeProvider/allowedBiomes)

(defn get-biomes-for-generation
  "biomes - `net.minecraft.world.biome.Biome[]`
  x - `int`
  z - `int`
  width - `int`
  height - `int`

  returns: `net.minecraft.world.biome.Biome[]`"
  ([^BiomeProvider this biomes ^Integer x ^Integer z ^Integer width ^Integer height]
    (-> this (.getBiomesForGeneration biomes x z width height))))

(defn get-biomes-to-spawn-in
  "returns: `java.util.List<net.minecraft.world.biome.Biome>`"
  (^java.util.List [^BiomeProvider this]
    (-> this (.getBiomesToSpawnIn))))

(defn fixed-biome?
  "returns: `boolean`"
  (^Boolean [^BiomeProvider this]
    (-> this (.isFixedBiome))))

(defn get-biome
  "pos - `net.minecraft.util.math.BlockPos`
  default-biome - `net.minecraft.world.biome.Biome`

  returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^BiomeProvider this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.biome.Biome default-biome]
    (-> this (.getBiome pos default-biome)))
  (^net.minecraft.world.biome.Biome [^BiomeProvider this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBiome pos))))

(defn cleanup-cache
  ""
  ([^BiomeProvider this]
    (-> this (.cleanupCache))))

(defn are-biomes-viable
  "x - `int`
  z - `int`
  radius - `int`
  allowed - `java.util.List`

  returns: `boolean`"
  (^Boolean [^BiomeProvider this ^Integer x ^Integer z ^Integer radius ^java.util.List allowed]
    (-> this (.areBiomesViable x z radius allowed))))

(defn get-fixed-biome
  "returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^BiomeProvider this]
    (-> this (.getFixedBiome))))

(defn get-biomes
  "list-to-reuse - `net.minecraft.world.biome.Biome[]`
  x - `int`
  z - `int`
  width - `int`
  length - `int`
  cache-flag - `boolean`

  returns: `net.minecraft.world.biome.Biome[]`"
  ([^BiomeProvider this list-to-reuse ^Integer x ^Integer z ^Integer width ^Integer length ^Boolean cache-flag]
    (-> this (.getBiomes list-to-reuse x z width length cache-flag)))
  ([^BiomeProvider this old-biome-list ^Integer x ^Integer z ^Integer width ^Integer depth]
    (-> this (.getBiomes old-biome-list x z width depth))))

(defn get-temperature-at-height
  "p-76939-1 - `float`
  p-76939-2 - `int`

  returns: `float`"
  (^Float [^BiomeProvider this ^Float p-76939-1 ^Integer p-76939-2]
    (-> this (.getTemperatureAtHeight p-76939-1 p-76939-2))))

(defn find-biome-position
  "x - `int`
  z - `int`
  range - `int`
  biomes - `java.util.List`
  random - `java.util.Random`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BiomeProvider this ^Integer x ^Integer z ^Integer range ^java.util.List biomes ^java.util.Random random]
    (-> this (.findBiomePosition x z range biomes random))))

(defn get-modded-biome-generators
  "world-type - `net.minecraft.world.WorldType`
  seed - `long`
  original - `net.minecraft.world.gen.layer.GenLayer[]`

  returns: `net.minecraft.world.gen.layer.GenLayer[]`"
  ([^BiomeProvider this ^net.minecraft.world.WorldType world-type ^Long seed original]
    (-> this (.getModdedBiomeGenerators world-type seed original))))

