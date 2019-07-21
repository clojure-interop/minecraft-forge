(ns net.minecraftforge.event.terraingen.BiomeEvent
  "BiomeEvent is fired whenever an event involving biomes occurs.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  All children of this event are fired on the MinecraftForge.TERRAIN_GEN_BUS
  unless stated otherwise in their Javadocs."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen BiomeEvent]))

(defn ->biome-event
  "Constructor.

  biome - `net.minecraft.world.biome.Biome`"
  (^BiomeEvent [^net.minecraft.world.biome.Biome biome]
    (new BiomeEvent biome)))

(defn get-biome
  "returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^BiomeEvent this]
    (-> this (.getBiome))))

