(ns net.minecraft.world.biome.Biome$BiomeProperties
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome Biome$BiomeProperties]))

(defn ->biome-properties
  "Constructor.

  name-in - `java.lang.String`"
  (^Biome$BiomeProperties [^java.lang.String name-in]
    (new Biome$BiomeProperties name-in)))

(defn set-temperature
  "temperature-in - `float`

  returns: `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^net.minecraft.world.biome.Biome$BiomeProperties [^Biome$BiomeProperties this ^Float temperature-in]
    (-> this (.setTemperature temperature-in))))

(defn set-rainfall
  "rainfall-in - `float`

  returns: `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^net.minecraft.world.biome.Biome$BiomeProperties [^Biome$BiomeProperties this ^Float rainfall-in]
    (-> this (.setRainfall rainfall-in))))

(defn set-base-height
  "base-height-in - `float`

  returns: `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^net.minecraft.world.biome.Biome$BiomeProperties [^Biome$BiomeProperties this ^Float base-height-in]
    (-> this (.setBaseHeight base-height-in))))

(defn set-height-variation
  "height-variation-in - `float`

  returns: `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^net.minecraft.world.biome.Biome$BiomeProperties [^Biome$BiomeProperties this ^Float height-variation-in]
    (-> this (.setHeightVariation height-variation-in))))

(defn set-rain-disabled
  "returns: `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^net.minecraft.world.biome.Biome$BiomeProperties [^Biome$BiomeProperties this]
    (-> this (.setRainDisabled))))

(defn set-snow-enabled
  "returns: `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^net.minecraft.world.biome.Biome$BiomeProperties [^Biome$BiomeProperties this]
    (-> this (.setSnowEnabled))))

(defn set-water-color
  "water-color-in - `int`

  returns: `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^net.minecraft.world.biome.Biome$BiomeProperties [^Biome$BiomeProperties this ^Integer water-color-in]
    (-> this (.setWaterColor water-color-in))))

(defn set-base-biome
  "name-in - `java.lang.String`

  returns: `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^net.minecraft.world.biome.Biome$BiomeProperties [^Biome$BiomeProperties this ^java.lang.String name-in]
    (-> this (.setBaseBiome name-in))))

