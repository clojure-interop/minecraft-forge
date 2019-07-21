(ns net.minecraft.block.BlockVine
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockVine]))

(defn ->block-vine
  "Constructor."
  (^BlockVine []
    (new BlockVine )))

(def *-up
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockVine/UP)

(def *-north
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockVine/NORTH)

(def *-east
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockVine/EAST)

(def *-south
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockVine/SOUTH)

(def *-west
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockVine/WEST)

(def *-all-faces
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool[]"
  BlockVine/ALL_FACES)

(defn *get-property-for
  "side - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.block.properties.PropertyBool`"
  (^net.minecraft.block.properties.PropertyBool [^net.minecraft.util.EnumFacing side]
    (BlockVine/getPropertyFor side)))

(defn *get-num-grown-faces
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^net.minecraft.block.state.IBlockState state]
    (BlockVine/getNumGrownFaces state)))

(defn update-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockVine this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world-in pos state rand))))

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockVine this]
    (-> this (.getBlockLayer))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockVine this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockVine this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn neighbor-changed
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  from-pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockVine this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^net.minecraft.util.math.BlockPos from-pos]
    (-> this (.neighborChanged state world-in pos block-in from-pos))))

(defn with-mirror
  "state - `net.minecraft.block.state.IBlockState`
  mirror-in - `net.minecraft.util.Mirror`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockVine this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Mirror mirror-in]
    (-> this (.withMirror state mirror-in))))

(defn on-sheared
  "Description copied from interface: IShearable

  item - The itemstack that is being used, Possible to be null - `net.minecraft.item.ItemStack`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - If this is a block, the block's position in world. - `net.minecraft.util.math.BlockPos`
  fortune - The fortune level of the shears being used - `int`

  returns: A ArrayList containing all items from this shearing. Possible to be null. - `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^BlockVine this ^net.minecraft.item.ItemStack item ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^Integer fortune]
    (-> this (.onSheared item world pos fortune))))

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
  (^net.minecraft.block.state.IBlockState [^BlockVine this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z ^Integer meta ^net.minecraft.entity.EntityLivingBase placer]
    (-> this (.getStateForPlacement world-in pos facing hit-x hit-y hit-z meta placer))))

(defn ladder?
  "FORGE START

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  entity - The entity trying to use the ladder, CAN be null. - `net.minecraft.entity.EntityLivingBase`

  returns: True if the block should act like a ladder - `boolean`"
  (^Boolean [^BlockVine this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.EntityLivingBase entity]
    (-> this (.isLadder state world pos entity))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockVine this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockVine this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn shearable?
  "Description copied from interface: IShearable

  item - The itemstack that is being used, Possible to be null - `net.minecraft.item.ItemStack`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block's position in world. - `net.minecraft.util.math.BlockPos`

  returns: If this is shearable, and onSheared should be called. - `boolean`"
  (^Boolean [^BlockVine this ^net.minecraft.item.ItemStack item ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isShearable item world pos))))

(defn get-collision-bounding-box
  "block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockVine this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getCollisionBoundingBox block-state world-in pos))))

(defn get-actual-state
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockVine this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getActualState state world-in pos))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockVine this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn replaceable?
  "world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockVine this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isReplaceable world-in pos))))

(defn harvest-block
  "world-in - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  te - `net.minecraft.tileentity.TileEntity`
  stack - `net.minecraft.item.ItemStack`"
  ([^BlockVine this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.tileentity.TileEntity te ^net.minecraft.item.ItemStack stack]
    (-> this (.harvestBlock world-in player pos state te stack))))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockVine this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockVine this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn with-rotation
  "state - `net.minecraft.block.state.IBlockState`
  rot - `net.minecraft.util.Rotation`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockVine this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Rotation rot]
    (-> this (.withRotation state rot))))

(defn can-place-block-on-side?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^BlockVine this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.canPlaceBlockOnSide world-in pos side))))

