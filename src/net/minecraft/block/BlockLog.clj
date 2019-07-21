(ns net.minecraft.block.BlockLog
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockLog]))

(defn ->block-log
  "Constructor."
  (^BlockLog []
    (new BlockLog )))

(def *-log-axis
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockLog$EnumAxis>"
  BlockLog/LOG_AXIS)

(defn break-block
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockLog this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.breakBlock world-in pos state))))

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
  (^net.minecraft.block.state.IBlockState [^BlockLog this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z ^Integer meta ^net.minecraft.entity.EntityLivingBase placer]
    (-> this (.getStateForPlacement world-in pos facing hit-x hit-y hit-z meta placer))))

(defn with-rotation
  "state - `net.minecraft.block.state.IBlockState`
  rot - `net.minecraft.util.Rotation`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockLog this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Rotation rot]
    (-> this (.withRotation state rot))))

(defn can-sustain-leaves?
  "Description copied from class: Block

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: true if the presence this block can prevent leaves from decaying. - `boolean`"
  (^Boolean [^BlockLog this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canSustainLeaves state world pos))))

(defn wood?
  "world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: true if the block is wood (logs) - `boolean`"
  (^Boolean [^BlockLog this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isWood world pos))))

