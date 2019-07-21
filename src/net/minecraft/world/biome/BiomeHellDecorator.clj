(ns net.minecraft.world.biome.BiomeHellDecorator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeHellDecorator]))

(defn ->biome-hell-decorator
  "Constructor."
  (^BiomeHellDecorator []
    (new BiomeHellDecorator )))

(defn decorate
  "world-in - `net.minecraft.world.World`
  random - `java.util.Random`
  biome - `net.minecraft.world.biome.Biome`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BiomeHellDecorator this ^net.minecraft.world.World world-in ^java.util.Random random ^net.minecraft.world.biome.Biome biome ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate world-in random biome pos))))

