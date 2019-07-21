(ns net.minecraft.world.gen.feature.WorldGenBush
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenBush]))

(defn ->world-gen-bush
  "Constructor.

  block-in - `net.minecraft.block.BlockBush`"
  (^WorldGenBush [^net.minecraft.block.BlockBush block-in]
    (new WorldGenBush block-in)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenBush this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

