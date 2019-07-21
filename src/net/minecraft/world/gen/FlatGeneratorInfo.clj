(ns net.minecraft.world.gen.FlatGeneratorInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen FlatGeneratorInfo]))

(defn ->flat-generator-info
  "Constructor."
  (^FlatGeneratorInfo []
    (new FlatGeneratorInfo )))

(defn *create-flat-generator-from-string
  "flat-generator-settings - `java.lang.String`

  returns: `net.minecraft.world.gen.FlatGeneratorInfo`"
  (^net.minecraft.world.gen.FlatGeneratorInfo [^java.lang.String flat-generator-settings]
    (FlatGeneratorInfo/createFlatGeneratorFromString flat-generator-settings)))

(defn *get-default-flat-generator
  "returns: `net.minecraft.world.gen.FlatGeneratorInfo`"
  (^net.minecraft.world.gen.FlatGeneratorInfo []
    (FlatGeneratorInfo/getDefaultFlatGenerator )))

(defn get-biome
  "returns: `int`"
  (^Integer [^FlatGeneratorInfo this]
    (-> this (.getBiome))))

(defn set-biome
  "biome - `int`"
  ([^FlatGeneratorInfo this ^Integer biome]
    (-> this (.setBiome biome))))

(defn get-world-features
  "returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>>`"
  (^java.util.Map [^FlatGeneratorInfo this]
    (-> this (.getWorldFeatures))))

(defn get-flat-layers
  "returns: `java.util.List<net.minecraft.world.gen.FlatLayerInfo>`"
  (^java.util.List [^FlatGeneratorInfo this]
    (-> this (.getFlatLayers))))

(defn update-layers
  ""
  ([^FlatGeneratorInfo this]
    (-> this (.updateLayers))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FlatGeneratorInfo this]
    (-> this (.toString))))

