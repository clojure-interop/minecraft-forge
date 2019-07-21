(ns net.minecraft.world.biome.BiomeVoid
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeVoid]))

(defn ->biome-void
  "Constructor.

  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeVoid [^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeVoid properties)))

(defn ignore-player-spawn-suitability
  "returns: `boolean`"
  (^Boolean [^BiomeVoid this]
    (-> this (.ignorePlayerSpawnSuitability))))

