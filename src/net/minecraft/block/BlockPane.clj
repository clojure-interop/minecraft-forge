(ns net.minecraft.block.BlockPane
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPane]))

(def *-north
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockPane/NORTH)

(def *-east
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockPane/EAST)

(def *-south
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockPane/SOUTH)

(def *-west
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockPane/WEST)

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockPane this]
    (-> this (.getBlockLayer))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockPane this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn with-mirror
  "state - `net.minecraft.block.state.IBlockState`
  mirror-in - `net.minecraft.util.Mirror`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockPane this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Mirror mirror-in]
    (-> this (.withMirror state mirror-in))))

(defn can-pane-connect-to-block?
  "block-in - `net.minecraft.block.Block`

  returns: `boolean`"
  (^Boolean [^BlockPane this ^net.minecraft.block.Block block-in]
    (-> this (.canPaneConnectToBlock block-in))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockPane this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn should-side-be-rendered?
  "block-state - `net.minecraft.block.state.IBlockState`
  block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^BlockPane this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.shouldSideBeRendered block-state block-access pos side))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockPane this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn can-pane-connect-to?
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  dir - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^BlockPane this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing dir]
    (-> this (.canPaneConnectTo world pos dir))))

(defn can-be-connected-to?
  "Description copied from class: Block

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - The position of this block - `net.minecraft.util.math.BlockPos`
  facing - The side the connecting block is on - `net.minecraft.util.EnumFacing`

  returns: True to allow another block to connect to this block - `boolean`"
  (^Boolean [^BlockPane this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing]
    (-> this (.canBeConnectedTo world pos facing))))

(defn get-actual-state
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockPane this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getActualState state world-in pos))))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockPane this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockPane this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn with-rotation
  "state - `net.minecraft.block.state.IBlockState`
  rot - `net.minecraft.util.Rotation`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockPane this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Rotation rot]
    (-> this (.withRotation state rot))))

(defn add-collision-box-to-list
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-box - `net.minecraft.util.math.AxisAlignedBB`
  colliding-boxes - `java.util.List`
  entity-in - `net.minecraft.entity.Entity`
  p-185477-7 - `boolean`"
  ([^BlockPane this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.math.AxisAlignedBB entity-box ^java.util.List colliding-boxes ^net.minecraft.entity.Entity entity-in ^Boolean p-185477-7]
    (-> this (.addCollisionBoxToList state world-in pos entity-box colliding-boxes entity-in p-185477-7))))

