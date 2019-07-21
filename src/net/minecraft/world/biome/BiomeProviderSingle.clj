(ns net.minecraft.world.biome.BiomeProviderSingle
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeProviderSingle]))

(defn ->biome-provider-single
  "Constructor.

  biome-in - `net.minecraft.world.biome.Biome`"
  (^BiomeProviderSingle [^net.minecraft.world.biome.Biome biome-in]
    (new BiomeProviderSingle biome-in)))

(defn get-biome
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^BiomeProviderSingle this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBiome pos))))

(defn get-biomes-for-generation
  "biomes - `net.minecraft.world.biome.Biome[]`
  x - `int`
  z - `int`
  width - `int`
  height - `int`

  returns: `net.minecraft.world.biome.Biome[]`"
  ([^BiomeProviderSingle this biomes ^Integer x ^Integer z ^Integer width ^Integer height]
    (-> this (.getBiomesForGeneration biomes x z width height))))

(defn get-biomes
  "list-to-reuse - `net.minecraft.world.biome.Biome[]`
  x - `int`
  z - `int`
  width - `int`
  length - `int`
  cache-flag - `boolean`

  returns: `net.minecraft.world.biome.Biome[]`"
  ([^BiomeProviderSingle this list-to-reuse ^Integer x ^Integer z ^Integer width ^Integer length ^Boolean cache-flag]
    (-> this (.getBiomes list-to-reuse x z width length cache-flag)))
  ([^BiomeProviderSingle this old-biome-list ^Integer x ^Integer z ^Integer width ^Integer depth]
    (-> this (.getBiomes old-biome-list x z width depth))))

(defn find-biome-position
  "x - `int`
  z - `int`
  range - `int`
  biomes - `java.util.List`
  random - `java.util.Random`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BiomeProviderSingle this ^Integer x ^Integer z ^Integer range ^java.util.List biomes ^java.util.Random random]
    (-> this (.findBiomePosition x z range biomes random))))

(defn are-biomes-viable
  "x - `int`
  z - `int`
  radius - `int`
  allowed - `java.util.List`

  returns: `boolean`"
  (^Boolean [^BiomeProviderSingle this ^Integer x ^Integer z ^Integer radius ^java.util.List allowed]
    (-> this (.areBiomesViable x z radius allowed))))

(defn fixed-biome?
  "returns: `boolean`"
  (^Boolean [^BiomeProviderSingle this]
    (-> this (.isFixedBiome))))

(defn get-fixed-biome
  "returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^BiomeProviderSingle this]
    (-> this (.getFixedBiome))))

