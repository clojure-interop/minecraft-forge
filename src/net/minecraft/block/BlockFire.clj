(ns net.minecraft.block.BlockFire
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockFire]))

(def *-age
  "Static Constant.

  type: net.minecraft.block.properties.PropertyInteger"
  BlockFire/AGE)

(def *-north
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockFire/NORTH)

(def *-east
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockFire/EAST)

(def *-south
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockFire/SOUTH)

(def *-west
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockFire/WEST)

(def *-upper
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockFire/UPPER)

(defn *init
  ""
  ([]
    (BlockFire/init )))

(defn can-catch-fire?
  "Side sensitive version that calls the block function.

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position - `net.minecraft.util.math.BlockPos`
  face - The side the fire is coming from - `net.minecraft.util.EnumFacing`

  returns: True if the face can catch fire. - `boolean`"
  (^Boolean [^BlockFire this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing face]
    (-> this (.canCatchFire world pos face)))
  (^Boolean [^BlockFire this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canCatchFire world-in pos))))

(defn set-fire-info
  "block-in - `net.minecraft.block.Block`
  encouragement - `int`
  flammability - `int`"
  ([^BlockFire this ^net.minecraft.block.Block block-in ^Integer encouragement ^Integer flammability]
    (-> this (.setFireInfo block-in encouragement flammability))))

(defn update-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockFire this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world-in pos state rand))))

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockFire this]
    (-> this (.getBlockLayer))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockFire this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn can-place-block-at?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockFire this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canPlaceBlockAt world-in pos))))

(defn get-encouragement
  "Deprecated.

  block-in - `net.minecraft.block.Block`

  returns: `int`"
  (^Integer [^BlockFire this ^net.minecraft.block.Block block-in]
    (-> this (.getEncouragement block-in))))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockFire this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockFire this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn neighbor-changed
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  from-pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockFire this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^net.minecraft.util.math.BlockPos from-pos]
    (-> this (.neighborChanged state world-in pos block-in from-pos))))

(defn tick-rate
  "world-in - `net.minecraft.world.World`

  returns: `int`"
  (^Integer [^BlockFire this ^net.minecraft.world.World world-in]
    (-> this (.tickRate world-in))))

(defn collidable?
  "returns: `boolean`"
  (^Boolean [^BlockFire this]
    (-> this (.isCollidable))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockFire this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn requires-updates
  "returns: `boolean`"
  (^Boolean [^BlockFire this]
    (-> this (.requiresUpdates))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockFire this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn on-block-added
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockFire this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.onBlockAdded world-in pos state))))

(defn get-collision-bounding-box
  "block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockFire this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getCollisionBoundingBox block-state world-in pos))))

(defn get-actual-state
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockFire this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getActualState state world-in pos))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockFire this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-flammability
  "Deprecated.

  block-in - `net.minecraft.block.Block`

  returns: `int`"
  (^Integer [^BlockFire this ^net.minecraft.block.Block block-in]
    (-> this (.getFlammability block-in))))

(defn random-display-tick
  "state-in - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  rand - `java.util.Random`"
  ([^BlockFire this ^net.minecraft.block.state.IBlockState state-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^java.util.Random rand]
    (-> this (.randomDisplayTick state-in world-in pos rand))))

