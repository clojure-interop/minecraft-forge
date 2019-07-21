(ns net.minecraftforge.event.terraingen.BiomeEvent$GetGrassColor
  "This event is fired when a biome is queried for its grass color."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen BiomeEvent$GetGrassColor]))

(defn ->get-grass-color
  "Constructor.

  biome - `net.minecraft.world.biome.Biome`
  original - `int`"
  (^BiomeEvent$GetGrassColor [^net.minecraft.world.biome.Biome biome ^Integer original]
    (new BiomeEvent$GetGrassColor biome original)))

