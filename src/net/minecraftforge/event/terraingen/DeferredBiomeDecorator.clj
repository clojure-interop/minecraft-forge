(ns net.minecraftforge.event.terraingen.DeferredBiomeDecorator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen DeferredBiomeDecorator]))

(defn ->deferred-biome-decorator
  "Constructor.

  wrapped-original - `net.minecraft.world.biome.BiomeDecorator`"
  (^DeferredBiomeDecorator [^net.minecraft.world.biome.BiomeDecorator wrapped-original]
    (new DeferredBiomeDecorator wrapped-original)))

(defn decorate
  "par-1-world - `net.minecraft.world.World`
  par-2-random - `java.util.Random`
  biome - `net.minecraft.world.biome.Biome`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^DeferredBiomeDecorator this ^net.minecraft.world.World par-1-world ^java.util.Random par-2-random ^net.minecraft.world.biome.Biome biome ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate par-1-world par-2-random biome pos))))

(defn fire-create-event-and-replace
  "biome - `net.minecraft.world.biome.Biome`"
  ([^DeferredBiomeDecorator this ^net.minecraft.world.biome.Biome biome]
    (-> this (.fireCreateEventAndReplace biome))))

