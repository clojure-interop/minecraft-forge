(ns net.minecraft.world.biome.Biome$FlowerEntry
  "Weighted random holder class used to hold possible flowers
  that can spawn in this biome when bonemeal is used on grass."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome Biome$FlowerEntry]))

(defn ->flower-entry
  "Constructor.

  state - `net.minecraft.block.state.IBlockState`
  weight - `int`"
  (^Biome$FlowerEntry [^net.minecraft.block.state.IBlockState state ^Integer weight]
    (new Biome$FlowerEntry state weight)))

(defn state
  "Instance Constant.

  type: net.minecraft.block.state.IBlockState"
  (^net.minecraft.block.state.IBlockState [^Biome$FlowerEntry this]
    (-> this .-state)))

