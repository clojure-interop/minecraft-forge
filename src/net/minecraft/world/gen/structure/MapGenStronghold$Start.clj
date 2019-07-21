(ns net.minecraft.world.gen.structure.MapGenStronghold$Start
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenStronghold$Start]))

(defn ->start
  "Constructor.

  world-in - `net.minecraft.world.World`
  random - `java.util.Random`
  chunk-x - `int`
  chunk-z - `int`"
  (^MapGenStronghold$Start [^net.minecraft.world.World world-in ^java.util.Random random ^Integer chunk-x ^Integer chunk-z]
    (new MapGenStronghold$Start world-in random chunk-x chunk-z))
  (^MapGenStronghold$Start []
    (new MapGenStronghold$Start )))

