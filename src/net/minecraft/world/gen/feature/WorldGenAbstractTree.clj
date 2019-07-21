(ns net.minecraft.world.gen.feature.WorldGenAbstractTree
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenAbstractTree]))

(defn ->world-gen-abstract-tree
  "Constructor.

  notify - `boolean`"
  (^WorldGenAbstractTree [^Boolean notify]
    (new WorldGenAbstractTree notify)))

(defn generate-saplings
  "world-in - `net.minecraft.world.World`
  random - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^WorldGenAbstractTree this ^net.minecraft.world.World world-in ^java.util.Random random ^net.minecraft.util.math.BlockPos pos]
    (-> this (.generateSaplings world-in random pos))))

(defn replaceable?
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenAbstractTree this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isReplaceable world pos))))

