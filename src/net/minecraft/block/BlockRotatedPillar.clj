(ns net.minecraft.block.BlockRotatedPillar
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockRotatedPillar]))

(def *-axis
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.util.EnumFacing$Axis>"
  BlockRotatedPillar/AXIS)

(defn rotate-block
  "Description copied from class: Block

  world - The world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  axis - The axis to rotate around - `net.minecraft.util.EnumFacing`

  returns: True if the rotation was successful, False if the rotation failed, or is not possible - `boolean`"
  (^Boolean [^BlockRotatedPillar this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing axis]
    (-> this (.rotateBlock world pos axis))))

(defn with-rotation
  "state - `net.minecraft.block.state.IBlockState`
  rot - `net.minecraft.util.Rotation`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockRotatedPillar this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Rotation rot]
    (-> this (.withRotation state rot))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockRotatedPillar this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockRotatedPillar this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn get-state-for-placement
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`
  meta - `int`
  placer - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockRotatedPillar this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z ^Integer meta ^net.minecraft.entity.EntityLivingBase placer]
    (-> this (.getStateForPlacement world-in pos facing hit-x hit-y hit-z meta placer))))

