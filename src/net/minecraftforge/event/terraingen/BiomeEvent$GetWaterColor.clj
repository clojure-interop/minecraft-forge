(ns net.minecraftforge.event.terraingen.BiomeEvent$GetWaterColor
  "This event is fired when a biome is queried for its water color."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen BiomeEvent$GetWaterColor]))

(defn ->get-water-color
  "Constructor.

  biome - `net.minecraft.world.biome.Biome`
  original - `int`"
  (^BiomeEvent$GetWaterColor [^net.minecraft.world.biome.Biome biome ^Integer original]
    (new BiomeEvent$GetWaterColor biome original)))

