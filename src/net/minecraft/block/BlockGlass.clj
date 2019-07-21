(ns net.minecraft.block.BlockGlass
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockGlass]))

(defn ->block-glass
  "Constructor.

  material-in - `net.minecraft.block.material.Material`
  ignore-similarity - `boolean`"
  (^BlockGlass [^net.minecraft.block.material.Material material-in ^Boolean ignore-similarity]
    (new BlockGlass material-in ignore-similarity)))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockGlass this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockGlass this]
    (-> this (.getBlockLayer))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockGlass this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

