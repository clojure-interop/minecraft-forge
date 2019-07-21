(ns net.minecraft.block.BlockFalling
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockFalling]))

(defn ->block-falling
  "Constructor.

  material-in - `net.minecraft.block.material.Material`"
  (^BlockFalling [^net.minecraft.block.material.Material material-in]
    (new BlockFalling material-in))
  (^BlockFalling []
    (new BlockFalling )))

(defn *-fall-instantly
  "Static Field.

  type: boolean"
  []
  BlockFalling/fallInstantly)

(defn *can-fall-through?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^net.minecraft.block.state.IBlockState state]
    (BlockFalling/canFallThrough state)))

(defn on-block-added
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockFalling this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.onBlockAdded world-in pos state))))

(defn neighbor-changed
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  from-pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockFalling this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^net.minecraft.util.math.BlockPos from-pos]
    (-> this (.neighborChanged state world-in pos block-in from-pos))))

(defn update-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockFalling this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world-in pos state rand))))

(defn tick-rate
  "world-in - `net.minecraft.world.World`

  returns: `int`"
  (^Integer [^BlockFalling this ^net.minecraft.world.World world-in]
    (-> this (.tickRate world-in))))

(defn on-end-falling
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockFalling this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.onEndFalling world-in pos))))

(defn on-broken
  "p-190974-1 - `net.minecraft.world.World`
  p-190974-2 - `net.minecraft.util.math.BlockPos`"
  ([^BlockFalling this ^net.minecraft.world.World p-190974-1 ^net.minecraft.util.math.BlockPos p-190974-2]
    (-> this (.onBroken p-190974-1 p-190974-2))))

(defn random-display-tick
  "state-in - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  rand - `java.util.Random`"
  ([^BlockFalling this ^net.minecraft.block.state.IBlockState state-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^java.util.Random rand]
    (-> this (.randomDisplayTick state-in world-in pos rand))))

(defn get-dust-color
  "p-189876-1 - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockFalling this ^net.minecraft.block.state.IBlockState p-189876-1]
    (-> this (.getDustColor p-189876-1))))

