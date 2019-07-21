(ns net.minecraft.world.gen.feature.WorldGenFlowers
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenFlowers]))

(defn ->world-gen-flowers
  "Constructor.

  flower-in - `net.minecraft.block.BlockFlower`
  type - `net.minecraft.block.BlockFlower$EnumFlowerType`"
  (^WorldGenFlowers [^net.minecraft.block.BlockFlower flower-in ^net.minecraft.block.BlockFlower$EnumFlowerType type]
    (new WorldGenFlowers flower-in type)))

(defn set-generated-block
  "flower-in - `net.minecraft.block.BlockFlower`
  type-in - `net.minecraft.block.BlockFlower$EnumFlowerType`"
  ([^WorldGenFlowers this ^net.minecraft.block.BlockFlower flower-in ^net.minecraft.block.BlockFlower$EnumFlowerType type-in]
    (-> this (.setGeneratedBlock flower-in type-in))))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenFlowers this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

