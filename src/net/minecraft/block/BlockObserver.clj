(ns net.minecraft.block.BlockObserver
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockObserver]))

(defn ->block-observer
  "Constructor."
  (^BlockObserver []
    (new BlockObserver )))

(def *-powered
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockObserver/POWERED)

(defn update-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockObserver this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world-in pos state rand))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockObserver this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn neighbor-changed
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  from-pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockObserver this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^net.minecraft.util.math.BlockPos from-pos]
    (-> this (.neighborChanged state world-in pos block-in from-pos))))

(defn get-weak-power
  "block-state - `net.minecraft.block.state.IBlockState`
  block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `int`"
  (^Integer [^BlockObserver this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.getWeakPower block-state block-access pos side))))

(defn with-mirror
  "state - `net.minecraft.block.state.IBlockState`
  mirror-in - `net.minecraft.util.Mirror`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockObserver this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Mirror mirror-in]
    (-> this (.withMirror state mirror-in))))

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
  (^net.minecraft.block.state.IBlockState [^BlockObserver this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z ^Integer meta ^net.minecraft.entity.EntityLivingBase placer]
    (-> this (.getStateForPlacement world-in pos facing hit-x hit-y hit-z meta placer))))

(defn can-provide-power?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockObserver this ^net.minecraft.block.state.IBlockState state]
    (-> this (.canProvidePower state))))

(defn on-block-added
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockObserver this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.onBlockAdded world-in pos state))))

(defn observed-neighbor-change
  "Description copied from class: Block

  observer-state - The Observer block's state. - `net.minecraft.block.state.IBlockState`
  world - The current world. - `net.minecraft.world.World`
  observer-pos - The Observer block's position. - `net.minecraft.util.math.BlockPos`
  changed-block - The updated block. - `net.minecraft.block.Block`
  changed-block-pos - The updated block's position. - `net.minecraft.util.math.BlockPos`"
  ([^BlockObserver this ^net.minecraft.block.state.IBlockState observer-state ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos observer-pos ^net.minecraft.block.Block changed-block ^net.minecraft.util.math.BlockPos changed-block-pos]
    (-> this (.observedNeighborChange observer-state world observer-pos changed-block changed-block-pos))))

(defn observed-neighbor-changed
  "p-190962-1 - `net.minecraft.block.state.IBlockState`
  p-190962-2 - `net.minecraft.world.World`
  p-190962-3 - `net.minecraft.util.math.BlockPos`
  p-190962-4 - `net.minecraft.block.Block`
  p-190962-5 - `net.minecraft.util.math.BlockPos`"
  ([^BlockObserver this ^net.minecraft.block.state.IBlockState p-190962-1 ^net.minecraft.world.World p-190962-2 ^net.minecraft.util.math.BlockPos p-190962-3 ^net.minecraft.block.Block p-190962-4 ^net.minecraft.util.math.BlockPos p-190962-5]
    (-> this (.observedNeighborChanged p-190962-1 p-190962-2 p-190962-3 p-190962-4 p-190962-5))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockObserver this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn break-block
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockObserver this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.breakBlock world-in pos state))))

(defn with-rotation
  "state - `net.minecraft.block.state.IBlockState`
  rot - `net.minecraft.util.Rotation`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockObserver this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Rotation rot]
    (-> this (.withRotation state rot))))

(defn get-strong-power
  "block-state - `net.minecraft.block.state.IBlockState`
  block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `int`"
  (^Integer [^BlockObserver this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.getStrongPower block-state block-access pos side))))

