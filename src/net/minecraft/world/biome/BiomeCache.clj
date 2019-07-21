(ns net.minecraft.world.biome.BiomeCache
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeCache]))

(defn ->biome-cache
  "Constructor.

  chunk-manager-in - `net.minecraft.world.biome.BiomeProvider`"
  (^BiomeCache [^net.minecraft.world.biome.BiomeProvider chunk-manager-in]
    (new BiomeCache chunk-manager-in)))

(defn get-biome-cache-block
  "x - `int`
  z - `int`

  returns: `net.minecraft.world.biome.BiomeCache$Block`"
  (^net.minecraft.world.biome.BiomeCache$Block [^BiomeCache this ^Integer x ^Integer z]
    (-> this (.getBiomeCacheBlock x z))))

(defn get-biome
  "x - `int`
  z - `int`
  default-value - `net.minecraft.world.biome.Biome`

  returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^BiomeCache this ^Integer x ^Integer z ^net.minecraft.world.biome.Biome default-value]
    (-> this (.getBiome x z default-value))))

(defn cleanup-cache
  ""
  ([^BiomeCache this]
    (-> this (.cleanupCache))))

(defn get-cached-biomes
  "x - `int`
  z - `int`

  returns: `net.minecraft.world.biome.Biome[]`"
  ([^BiomeCache this ^Integer x ^Integer z]
    (-> this (.getCachedBiomes x z))))

