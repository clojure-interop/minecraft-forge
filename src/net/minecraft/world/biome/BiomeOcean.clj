(ns net.minecraft.world.biome.BiomeOcean
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeOcean]))

(defn ->biome-ocean
  "Constructor.

  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeOcean [^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeOcean properties)))

(defn get-temp-category
  "returns: `net.minecraft.world.biome.Biome$TempCategory`"
  (^net.minecraft.world.biome.Biome$TempCategory [^BiomeOcean this]
    (-> this (.getTempCategory))))

