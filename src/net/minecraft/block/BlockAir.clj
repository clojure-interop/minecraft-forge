(ns net.minecraft.block.BlockAir
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockAir]))

(defn get-render-type
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.util.EnumBlockRenderType`"
  (^net.minecraft.util.EnumBlockRenderType [^BlockAir this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getRenderType state))))

(defn get-collision-bounding-box
  "block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockAir this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getCollisionBoundingBox block-state world-in pos))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockAir this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn can-collide-check?
  "state - `net.minecraft.block.state.IBlockState`
  hit-if-liquid - `boolean`

  returns: `boolean`"
  (^Boolean [^BlockAir this ^net.minecraft.block.state.IBlockState state ^Boolean hit-if-liquid]
    (-> this (.canCollideCheck state hit-if-liquid))))

(defn drop-block-as-item-with-chance
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  chance - `float`
  fortune - `int`"
  ([^BlockAir this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Float chance ^Integer fortune]
    (-> this (.dropBlockAsItemWithChance world-in pos state chance fortune))))

(defn replaceable?
  "world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockAir this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isReplaceable world-in pos))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockAir this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

