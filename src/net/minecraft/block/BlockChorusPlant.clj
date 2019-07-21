(ns net.minecraft.block.BlockChorusPlant
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockChorusPlant]))

(def *-north
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockChorusPlant/NORTH)

(def *-east
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockChorusPlant/EAST)

(def *-south
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockChorusPlant/SOUTH)

(def *-west
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockChorusPlant/WEST)

(def *-up
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockChorusPlant/UP)

(def *-down
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockChorusPlant/DOWN)

(defn update-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockChorusPlant this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world-in pos state rand))))

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockChorusPlant this]
    (-> this (.getBlockLayer))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockChorusPlant this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn can-place-block-at?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockChorusPlant this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canPlaceBlockAt world-in pos))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockChorusPlant this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn passable?
  "world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockChorusPlant this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isPassable world-in pos))))

(defn neighbor-changed
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  from-pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockChorusPlant this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^net.minecraft.util.math.BlockPos from-pos]
    (-> this (.neighborChanged state world-in pos block-in from-pos))))

(defn can-survive-at?
  "word-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockChorusPlant this ^net.minecraft.world.World word-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canSurviveAt word-in pos))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockChorusPlant this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn should-side-be-rendered?
  "block-state - `net.minecraft.block.state.IBlockState`
  block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^BlockChorusPlant this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.shouldSideBeRendered block-state block-access pos side))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockChorusPlant this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn get-actual-state
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockChorusPlant this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getActualState state world-in pos))))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockChorusPlant this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockChorusPlant this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn add-collision-box-to-list
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-box - `net.minecraft.util.math.AxisAlignedBB`
  colliding-boxes - `java.util.List`
  entity-in - `net.minecraft.entity.Entity`
  p-185477-7 - `boolean`"
  ([^BlockChorusPlant this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.math.AxisAlignedBB entity-box ^java.util.List colliding-boxes ^net.minecraft.entity.Entity entity-in ^Boolean p-185477-7]
    (-> this (.addCollisionBoxToList state world-in pos entity-box colliding-boxes entity-in p-185477-7))))

