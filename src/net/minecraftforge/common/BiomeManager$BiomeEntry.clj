(ns net.minecraftforge.common.BiomeManager$BiomeEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common BiomeManager$BiomeEntry]))

(defn ->biome-entry
  "Constructor.

  biome - `net.minecraft.world.biome.Biome`
  weight - `int`"
  (^BiomeManager$BiomeEntry [^net.minecraft.world.biome.Biome biome ^Integer weight]
    (new BiomeManager$BiomeEntry biome weight)))

(defn biome
  "Instance Constant.

  type: net.minecraft.world.biome.Biome"
  (^net.minecraft.world.biome.Biome [^BiomeManager$BiomeEntry this]
    (-> this .-biome)))

