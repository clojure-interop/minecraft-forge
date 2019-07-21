(ns net.minecraft.world.gen.feature.WorldGenDoublePlant
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenDoublePlant]))

(defn ->world-gen-double-plant
  "Constructor."
  (^WorldGenDoublePlant []
    (new WorldGenDoublePlant )))

(defn set-plant-type
  "plant-type-in - `net.minecraft.block.BlockDoublePlant$EnumPlantType`"
  ([^WorldGenDoublePlant this ^net.minecraft.block.BlockDoublePlant$EnumPlantType plant-type-in]
    (-> this (.setPlantType plant-type-in))))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenDoublePlant this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

