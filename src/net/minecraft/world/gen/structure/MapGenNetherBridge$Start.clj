(ns net.minecraft.world.gen.structure.MapGenNetherBridge$Start
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenNetherBridge$Start]))

(defn ->start
  "Constructor.

  world-in - `net.minecraft.world.World`
  random - `java.util.Random`
  chunk-x - `int`
  chunk-z - `int`"
  (^MapGenNetherBridge$Start [^net.minecraft.world.World world-in ^java.util.Random random ^Integer chunk-x ^Integer chunk-z]
    (new MapGenNetherBridge$Start world-in random chunk-x chunk-z))
  (^MapGenNetherBridge$Start []
    (new MapGenNetherBridge$Start )))

