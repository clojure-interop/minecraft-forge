(ns net.minecraft.world.gen.feature.WorldGenTallGrass
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenTallGrass]))

(defn ->world-gen-tall-grass
  "Constructor.

  p-i-45629-1 - `net.minecraft.block.BlockTallGrass$EnumType`"
  (^WorldGenTallGrass [^net.minecraft.block.BlockTallGrass$EnumType p-i-45629-1]
    (new WorldGenTallGrass p-i-45629-1)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenTallGrass this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

