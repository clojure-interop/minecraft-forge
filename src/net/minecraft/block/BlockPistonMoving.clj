(ns net.minecraft.block.BlockPistonMoving
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPistonMoving]))

(defn ->block-piston-moving
  "Constructor."
  (^BlockPistonMoving []
    (new BlockPistonMoving )))

(def *-facing
  "Static Constant.

  type: net.minecraft.block.properties.PropertyDirection"
  BlockPistonMoving/FACING)

(def *-type
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockPistonExtension$EnumPistonType>"
  BlockPistonMoving/TYPE)

(defn *create-tile-piston
  "block-state-in - `net.minecraft.block.state.IBlockState`
  facing-in - `net.minecraft.util.EnumFacing`
  extending-in - `boolean`
  should-head-be-rendered-in - `boolean`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^net.minecraft.block.state.IBlockState block-state-in ^net.minecraft.util.EnumFacing facing-in ^Boolean extending-in ^Boolean should-head-be-rendered-in]
    (BlockPistonMoving/createTilePiston block-state-in facing-in extending-in should-head-be-rendered-in)))

(defn get-item
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BlockPistonMoving this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.getItem world-in pos state))))

(defn can-place-block-at?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockPistonMoving this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canPlaceBlockAt world-in pos))))

(defn drop-block-as-item-with-chance
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  chance - `float`
  fortune - `int`"
  ([^BlockPistonMoving this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Float chance ^Integer fortune]
    (-> this (.dropBlockAsItemWithChance world-in pos state chance fortune))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockPistonMoving this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn neighbor-changed
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  from-pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockPistonMoving this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^net.minecraft.util.math.BlockPos from-pos]
    (-> this (.neighborChanged state world-in pos block-in from-pos))))

(defn with-mirror
  "state - `net.minecraft.block.state.IBlockState`
  mirror-in - `net.minecraft.util.Mirror`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockPistonMoving this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Mirror mirror-in]
    (-> this (.withMirror state mirror-in))))

(defn create-new-tile-entity
  "world-in - `net.minecraft.world.World`
  meta - `int`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^BlockPistonMoving this ^net.minecraft.world.World world-in ^Integer meta]
    (-> this (.createNewTileEntity world-in meta))))

(defn collision-ray-trace
  "block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  start - `net.minecraft.util.math.Vec3d`
  end - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraft.util.math.RayTraceResult`"
  (^net.minecraft.util.math.RayTraceResult [^BlockPistonMoving this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.math.Vec3d start ^net.minecraft.util.math.Vec3d end]
    (-> this (.collisionRayTrace block-state world-in pos start end))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockPistonMoving this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockPistonMoving this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn on-block-destroyed-by-player
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockPistonMoving this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.onBlockDestroyedByPlayer world-in pos state))))

(defn on-block-activated
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `boolean`"
  (^Boolean [^BlockPistonMoving this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onBlockActivated world-in pos state player-in hand facing hit-x hit-y hit-z))))

(defn get-collision-bounding-box
  "block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockPistonMoving this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getCollisionBoundingBox block-state world-in pos))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockPistonMoving this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockPistonMoving this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

(defn get-drops
  "Description copied from class: Block

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  state - Current state - `net.minecraft.block.state.IBlockState`
  fortune - Breakers fortune level - `int`

  returns: A ArrayList containing all items this block drops - `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^BlockPistonMoving this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Integer fortune]
    (-> this (.getDrops world pos state fortune))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockPistonMoving this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn break-block
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockPistonMoving this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.breakBlock world-in pos state))))

(defn with-rotation
  "state - `net.minecraft.block.state.IBlockState`
  rot - `net.minecraft.util.Rotation`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockPistonMoving this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Rotation rot]
    (-> this (.withRotation state rot))))

(defn can-place-block-on-side?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^BlockPistonMoving this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.canPlaceBlockOnSide world-in pos side))))

(defn add-collision-box-to-list
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-box - `net.minecraft.util.math.AxisAlignedBB`
  colliding-boxes - `java.util.List`
  entity-in - `net.minecraft.entity.Entity`
  p-185477-7 - `boolean`"
  ([^BlockPistonMoving this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.math.AxisAlignedBB entity-box ^java.util.List colliding-boxes ^net.minecraft.entity.Entity entity-in ^Boolean p-185477-7]
    (-> this (.addCollisionBoxToList state world-in pos entity-box colliding-boxes entity-in p-185477-7))))

