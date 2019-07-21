(ns net.minecraft.world.gen.feature.WorldGenMegaPineTree
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenMegaPineTree]))

(defn ->world-gen-mega-pine-tree
  "Constructor.

  notify - `boolean`
  p-i-45457-2 - `boolean`"
  (^WorldGenMegaPineTree [^Boolean notify ^Boolean p-i-45457-2]
    (new WorldGenMegaPineTree notify p-i-45457-2)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenMegaPineTree this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

(defn generate-saplings
  "world-in - `net.minecraft.world.World`
  random - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^WorldGenMegaPineTree this ^net.minecraft.world.World world-in ^java.util.Random random ^net.minecraft.util.math.BlockPos pos]
    (-> this (.generateSaplings world-in random pos))))

