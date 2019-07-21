(ns net.minecraft.world.biome.BiomeDesert
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeDesert]))

(defn ->biome-desert
  "Constructor.

  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeDesert [^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeDesert properties)))

(defn decorate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BiomeDesert this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate world-in rand pos))))

