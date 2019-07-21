(ns net.minecraft.block.BlockGravel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockGravel]))

(defn ->block-gravel
  "Constructor."
  (^BlockGravel []
    (new BlockGravel )))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockGravel this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockGravel this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn get-dust-color
  "p-189876-1 - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockGravel this ^net.minecraft.block.state.IBlockState p-189876-1]
    (-> this (.getDustColor p-189876-1))))

