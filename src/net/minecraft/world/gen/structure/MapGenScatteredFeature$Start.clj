(ns net.minecraft.world.gen.structure.MapGenScatteredFeature$Start
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenScatteredFeature$Start]))

(defn ->start
  "Constructor.

  world-in - `net.minecraft.world.World`
  random - `java.util.Random`
  chunk-x - `int`
  chunk-z - `int`
  biome-in - `net.minecraft.world.biome.Biome`"
  (^MapGenScatteredFeature$Start [^net.minecraft.world.World world-in ^java.util.Random random ^Integer chunk-x ^Integer chunk-z ^net.minecraft.world.biome.Biome biome-in]
    (new MapGenScatteredFeature$Start world-in random chunk-x chunk-z biome-in))
  (^MapGenScatteredFeature$Start [^net.minecraft.world.World world-in ^java.util.Random random ^Integer chunk-x ^Integer chunk-z]
    (new MapGenScatteredFeature$Start world-in random chunk-x chunk-z))
  (^MapGenScatteredFeature$Start []
    (new MapGenScatteredFeature$Start )))

