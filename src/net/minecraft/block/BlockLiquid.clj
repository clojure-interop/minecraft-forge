(ns net.minecraft.block.BlockLiquid
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockLiquid]))

(def *-level
  "Static Constant.

  type: net.minecraft.block.properties.PropertyInteger"
  BlockLiquid/LEVEL)

(defn *get-liquid-height-percent
  "meta - `int`

  returns: `float`"
  (^Float [^Integer meta]
    (BlockLiquid/getLiquidHeightPercent meta)))

(defn *get-slope-angle
  "p-189544-0 - `net.minecraft.world.IBlockAccess`
  p-189544-1 - `net.minecraft.util.math.BlockPos`
  p-189544-2 - `net.minecraft.block.material.Material`
  p-189544-3 - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^net.minecraft.world.IBlockAccess p-189544-0 ^net.minecraft.util.math.BlockPos p-189544-1 ^net.minecraft.block.material.Material p-189544-2 ^net.minecraft.block.state.IBlockState p-189544-3]
    (BlockLiquid/getSlopeAngle p-189544-0 p-189544-1 p-189544-2 p-189544-3)))

(defn *get-flowing-block
  "material-in - `net.minecraft.block.material.Material`

  returns: `net.minecraft.block.BlockDynamicLiquid`"
  (^net.minecraft.block.BlockDynamicLiquid [^net.minecraft.block.material.Material material-in]
    (BlockLiquid/getFlowingBlock material-in)))

(defn *get-static-block
  "material-in - `net.minecraft.block.material.Material`

  returns: `net.minecraft.block.BlockStaticLiquid`"
  (^net.minecraft.block.BlockStaticLiquid [^net.minecraft.block.material.Material material-in]
    (BlockLiquid/getStaticBlock material-in)))

(defn *get-block-liquid-height
  "p-190973-0 - `net.minecraft.block.state.IBlockState`
  p-190973-1 - `net.minecraft.world.IBlockAccess`
  p-190973-2 - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^net.minecraft.block.state.IBlockState p-190973-0 ^net.minecraft.world.IBlockAccess p-190973-1 ^net.minecraft.util.math.BlockPos p-190973-2]
    (BlockLiquid/getBlockLiquidHeight p-190973-0 p-190973-1 p-190973-2)))

(defn *get-liquid-height
  "p-190972-0 - `net.minecraft.block.state.IBlockState`
  p-190972-1 - `net.minecraft.world.IBlockAccess`
  p-190972-2 - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^net.minecraft.block.state.IBlockState p-190972-0 ^net.minecraft.world.IBlockAccess p-190972-1 ^net.minecraft.util.math.BlockPos p-190972-2]
    (BlockLiquid/getLiquidHeight p-190972-0 p-190972-1 p-190972-2)))

(defn get-render-type
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.util.EnumBlockRenderType`"
  (^net.minecraft.util.EnumBlockRenderType [^BlockLiquid this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getRenderType state))))

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockLiquid this]
    (-> this (.getBlockLayer))))

(defn modify-acceleration
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-in - `net.minecraft.entity.Entity`
  motion - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^BlockLiquid this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity entity-in ^net.minecraft.util.math.Vec3d motion]
    (-> this (.modifyAcceleration world-in pos entity-in motion))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockLiquid this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockLiquid this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn passable?
  "world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockLiquid this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isPassable world-in pos))))

(defn neighbor-changed
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  from-pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockLiquid this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^net.minecraft.util.math.BlockPos from-pos]
    (-> this (.neighborChanged state world-in pos block-in from-pos))))

(defn tick-rate
  "world-in - `net.minecraft.world.World`

  returns: `int`"
  (^Integer [^BlockLiquid this ^net.minecraft.world.World world-in]
    (-> this (.tickRate world-in))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockLiquid this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn block-solid?
  "world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^BlockLiquid this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.isBlockSolid world-in pos side))))

(defn should-side-be-rendered?
  "block-state - `net.minecraft.block.state.IBlockState`
  block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^BlockLiquid this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.shouldSideBeRendered block-state block-access pos side))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockLiquid this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn on-block-added
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockLiquid this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.onBlockAdded world-in pos state))))

(defn should-render-sides?
  "block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockLiquid this ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos]
    (-> this (.shouldRenderSides block-access pos))))

(defn can-collide-check?
  "state - `net.minecraft.block.state.IBlockState`
  hit-if-liquid - `boolean`

  returns: `boolean`"
  (^Boolean [^BlockLiquid this ^net.minecraft.block.state.IBlockState state ^Boolean hit-if-liquid]
    (-> this (.canCollideCheck state hit-if-liquid))))

(defn get-packed-lightmap-coords
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^BlockLiquid this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPackedLightmapCoords state source pos))))

(defn check-for-mixing
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockLiquid this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.checkForMixing world-in pos state))))

(defn get-collision-bounding-box
  "block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockLiquid this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getCollisionBoundingBox block-state world-in pos))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockLiquid this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockLiquid this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockLiquid this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn random-display-tick
  "state-in - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  rand - `java.util.Random`"
  ([^BlockLiquid this ^net.minecraft.block.state.IBlockState state-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^java.util.Random rand]
    (-> this (.randomDisplayTick state-in world-in pos rand))))

