(ns net.minecraft.world.gen.feature.WorldGenerator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenerator]))

(defn ->world-generator
  "Constructor.

  notify - `boolean`"
  (^WorldGenerator [^Boolean notify]
    (new WorldGenerator notify))
  (^WorldGenerator []
    (new WorldGenerator )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenerator this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

(defn set-decoration-defaults
  ""
  ([^WorldGenerator this]
    (-> this (.setDecorationDefaults))))

