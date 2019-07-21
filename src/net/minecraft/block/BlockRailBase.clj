(ns net.minecraft.block.BlockRailBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockRailBase]))

(defn *rail-block?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (BlockRailBase/isRailBlock world-in pos))
  (^Boolean [^net.minecraft.block.state.IBlockState state]
    (BlockRailBase/isRailBlock state)))

(defn on-minecart-pass
  "This function is called by any minecart that passes over this rail.
   It is called once per update tick that the minecart is on the rail.

  world - The world. - `net.minecraft.world.World`
  cart - The cart on the rail. - `net.minecraft.entity.item.EntityMinecart`
  pos - Block's position in world - `net.minecraft.util.math.BlockPos`"
  ([^BlockRailBase this ^net.minecraft.world.World world ^net.minecraft.entity.item.EntityMinecart cart ^net.minecraft.util.math.BlockPos pos]
    (-> this (.onMinecartPass world cart pos))))

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockRailBase this]
    (-> this (.getBlockLayer))))

(defn can-place-block-at?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockRailBase this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canPlaceBlockAt world-in pos))))

(defn rotate-block
  "Rotate the block. For vanilla blocks this rotates around the axis passed in (generally, it should be the \"face\" that was hit).
   Note: for mod blocks, this is up to the block and modder to decide. It is not mandated that it be a rotation around the
   face, but could be a rotation to orient *to* that face, or a visiting of possible rotations.
   The method should return true if the rotation was successful though.

  world - The world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  axis - The axis to rotate around - `net.minecraft.util.EnumFacing`

  returns: True if the rotation was successful, False if the rotation failed, or is not possible - `boolean`"
  (^Boolean [^BlockRailBase this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing axis]
    (-> this (.rotateBlock world pos axis))))

(defn neighbor-changed
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  from-pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockRailBase this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^net.minecraft.util.math.BlockPos from-pos]
    (-> this (.neighborChanged state world-in pos block-in from-pos))))

(defn get-rail-max-speed
  "Returns the max speed of the rail at the specified position.

  world - The world. - `net.minecraft.world.World`
  cart - The cart on the rail, may be null. - `net.minecraft.entity.item.EntityMinecart`
  pos - Block's position in world - `net.minecraft.util.math.BlockPos`

  returns: The max speed of the current rail. - `float`"
  (^Float [^BlockRailBase this ^net.minecraft.world.World world ^net.minecraft.entity.item.EntityMinecart cart ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getRailMaxSpeed world cart pos))))

(defn get-mobility-flag
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.EnumPushReaction`"
  (^net.minecraft.block.material.EnumPushReaction [^BlockRailBase this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMobilityFlag state))))

(defn get-rail-direction
  "Return the rail's direction.
   Can be used to make the cart think the rail is a different shape,
   for example when making diamond junctions or switches.
   The cart parameter will often be null unless it it called from EntityMinecart.

  world - The world. - `net.minecraft.world.IBlockAccess`
  pos - Block's position in world - `net.minecraft.util.math.BlockPos`
  state - The BlockState - `net.minecraft.block.state.IBlockState`
  cart - The cart asking for the metadata, null if it is not called by EntityMinecart. - `net.minecraft.entity.item.EntityMinecart`

  returns: The direction. - `net.minecraft.block.BlockRailBase$EnumRailDirection`"
  (^net.minecraft.block.BlockRailBase$EnumRailDirection [^BlockRailBase this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.item.EntityMinecart cart]
    (-> this (.getRailDirection world pos state cart))))

(defn can-make-slopes?
  "Returns true if the rail can make up and down slopes.
   Used by placement logic.

  world - The world. - `net.minecraft.world.IBlockAccess`
  pos - Block's position in world - `net.minecraft.util.math.BlockPos`

  returns: True if the rail can make slopes. - `boolean`"
  (^Boolean [^BlockRailBase this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canMakeSlopes world pos))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockRailBase this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockRailBase this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn on-block-added
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockRailBase this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.onBlockAdded world-in pos state))))

(defn get-shape-property
  "returns: `net.minecraft.block.properties.IProperty<net.minecraft.block.BlockRailBase$EnumRailDirection>`"
  (^net.minecraft.block.properties.IProperty [^BlockRailBase this]
    (-> this (.getShapeProperty))))

(defn flexible-rail?
  "Return true if the rail can make corners.
   Used by placement logic.

  world - The world. - `net.minecraft.world.IBlockAccess`
  pos - Block's position in world - `net.minecraft.util.math.BlockPos`

  returns: True if the rail can make corners. - `boolean`"
  (^Boolean [^BlockRailBase this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isFlexibleRail world pos))))

(defn get-collision-bounding-box
  "block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockRailBase this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getCollisionBoundingBox block-state world-in pos))))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockRailBase this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

(defn break-block
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockRailBase this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.breakBlock world-in pos state))))

