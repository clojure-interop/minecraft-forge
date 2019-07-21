(ns net.minecraft.block.BlockStructureVoid
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockStructureVoid]))

(defn get-render-type
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.util.EnumBlockRenderType`"
  (^net.minecraft.util.EnumBlockRenderType [^BlockStructureVoid this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getRenderType state))))

(defn get-collision-bounding-box
  "block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockStructureVoid this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getCollisionBoundingBox block-state world-in pos))))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockStructureVoid this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockStructureVoid this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockStructureVoid this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn get-ambient-occlusion-light-value
  "state - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^BlockStructureVoid this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getAmbientOcclusionLightValue state))))

(defn drop-block-as-item-with-chance
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  chance - `float`
  fortune - `int`"
  ([^BlockStructureVoid this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Float chance ^Integer fortune]
    (-> this (.dropBlockAsItemWithChance world-in pos state chance fortune))))

(defn get-mobility-flag
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.EnumPushReaction`"
  (^net.minecraft.block.material.EnumPushReaction [^BlockStructureVoid this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMobilityFlag state))))

