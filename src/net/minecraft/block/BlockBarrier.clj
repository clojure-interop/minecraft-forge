(ns net.minecraft.block.BlockBarrier
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockBarrier]))

(defn get-render-type
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.util.EnumBlockRenderType`"
  (^net.minecraft.util.EnumBlockRenderType [^BlockBarrier this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getRenderType state))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockBarrier this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn get-ambient-occlusion-light-value
  "state - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^BlockBarrier this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getAmbientOcclusionLightValue state))))

(defn drop-block-as-item-with-chance
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  chance - `float`
  fortune - `int`"
  ([^BlockBarrier this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Float chance ^Integer fortune]
    (-> this (.dropBlockAsItemWithChance world-in pos state chance fortune))))

