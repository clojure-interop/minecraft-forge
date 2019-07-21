(ns net.minecraft.world.gen.feature.WorldGenBigTree
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenBigTree]))

(defn ->world-gen-big-tree
  "Constructor.

  notify - `boolean`"
  (^WorldGenBigTree [^Boolean notify]
    (new WorldGenBigTree notify)))

(defn set-decoration-defaults
  ""
  ([^WorldGenBigTree this]
    (-> this (.setDecorationDefaults))))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenBigTree this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

