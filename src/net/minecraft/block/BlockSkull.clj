(ns net.minecraft.block.BlockSkull
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockSkull]))

(def *-facing
  "Static Constant.

  type: net.minecraft.block.properties.PropertyDirection"
  BlockSkull/FACING)

(def *-nodrop
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockSkull/NODROP)

(defn get-item
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BlockSkull this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.getItem world-in pos state))))

(defn check-wither-spawn
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  te - `net.minecraft.tileentity.TileEntitySkull`"
  ([^BlockSkull this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.tileentity.TileEntitySkull te]
    (-> this (.checkWitherSpawn world-in pos te))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockSkull this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn has-custom-breaking-progress?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockSkull this ^net.minecraft.block.state.IBlockState state]
    (-> this (.hasCustomBreakingProgress state))))

(defn with-mirror
  "state - `net.minecraft.block.state.IBlockState`
  mirror-in - `net.minecraft.util.Mirror`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockSkull this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Mirror mirror-in]
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
  (^net.minecraft.block.state.IBlockState [^BlockSkull this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z ^Integer meta ^net.minecraft.entity.EntityLivingBase placer]
    (-> this (.getStateForPlacement world-in pos facing hit-x hit-y hit-z meta placer))))

(defn create-new-tile-entity
  "world-in - `net.minecraft.world.World`
  meta - `int`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^BlockSkull this ^net.minecraft.world.World world-in ^Integer meta]
    (-> this (.createNewTileEntity world-in meta))))

(defn get-localized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockSkull this]
    (-> this (.getLocalizedName))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockSkull this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockSkull this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn can-dispenser-place?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^BlockSkull this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.item.ItemStack stack]
    (-> this (.canDispenserPlace world-in pos stack))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockSkull this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn on-block-harvested
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  player - `net.minecraft.entity.player.EntityPlayer`"
  ([^BlockSkull this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.onBlockHarvested world-in pos state player))))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockSkull this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

(defn get-drops
  "Description copied from class: Block

  world-in - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  state - Current state - `net.minecraft.block.state.IBlockState`
  fortune - Breakers fortune level - `int`

  returns: A ArrayList containing all items this block drops - `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^BlockSkull this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Integer fortune]
    (-> this (.getDrops world-in pos state fortune))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockSkull this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn break-block
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockSkull this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.breakBlock world-in pos state))))

(defn with-rotation
  "state - `net.minecraft.block.state.IBlockState`
  rot - `net.minecraft.util.Rotation`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockSkull this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Rotation rot]
    (-> this (.withRotation state rot))))

