(ns net.minecraftforge.event.terraingen.BiomeEvent$GetFoliageColor
  "This event is fired when a biome is queried for its grass color."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen BiomeEvent$GetFoliageColor]))

(defn ->get-foliage-color
  "Constructor.

  biome - `net.minecraft.world.biome.Biome`
  original - `int`"
  (^BiomeEvent$GetFoliageColor [^net.minecraft.world.biome.Biome biome ^Integer original]
    (new BiomeEvent$GetFoliageColor biome original)))

