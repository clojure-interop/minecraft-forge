(ns net.minecraft.block.BlockCommandBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockCommandBlock]))

(defn ->block-command-block
  "Constructor.

  color - `net.minecraft.block.material.MapColor`"
  (^BlockCommandBlock [^net.minecraft.block.material.MapColor color]
    (new BlockCommandBlock color)))

(def *-facing
  "Static Constant.

  type: net.minecraft.block.properties.PropertyDirection"
  BlockCommandBlock/FACING)

(def *-conditional
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockCommandBlock/CONDITIONAL)

(defn propagate-update
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockCommandBlock this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.propagateUpdate world-in pos))))

(defn update-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockCommandBlock this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world-in pos state rand))))

(defn get-render-type
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.util.EnumBlockRenderType`"
  (^net.minecraft.util.EnumBlockRenderType [^BlockCommandBlock this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getRenderType state))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockCommandBlock this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockCommandBlock this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn has-comparator-input-override?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockCommandBlock this ^net.minecraft.block.state.IBlockState state]
    (-> this (.hasComparatorInputOverride state))))

(defn neighbor-changed
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  from-pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockCommandBlock this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^net.minecraft.util.math.BlockPos from-pos]
    (-> this (.neighborChanged state world-in pos block-in from-pos))))

(defn with-mirror
  "state - `net.minecraft.block.state.IBlockState`
  mirror-in - `net.minecraft.util.Mirror`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockCommandBlock this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Mirror mirror-in]
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
  (^net.minecraft.block.state.IBlockState [^BlockCommandBlock this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z ^Integer meta ^net.minecraft.entity.EntityLivingBase placer]
    (-> this (.getStateForPlacement world-in pos facing hit-x hit-y hit-z meta placer))))

(defn tick-rate
  "world-in - `net.minecraft.world.World`

  returns: `int`"
  (^Integer [^BlockCommandBlock this ^net.minecraft.world.World world-in]
    (-> this (.tickRate world-in))))

(defn create-new-tile-entity
  "world-in - `net.minecraft.world.World`
  meta - `int`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^BlockCommandBlock this ^net.minecraft.world.World world-in ^Integer meta]
    (-> this (.createNewTileEntity world-in meta))))

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
  (^Boolean [^BlockCommandBlock this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onBlockActivated world-in pos state player-in hand facing hit-x hit-y hit-z))))

(defn on-block-placed-by
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  placer - `net.minecraft.entity.EntityLivingBase`
  stack - `net.minecraft.item.ItemStack`"
  ([^BlockCommandBlock this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.EntityLivingBase placer ^net.minecraft.item.ItemStack stack]
    (-> this (.onBlockPlacedBy world-in pos state placer stack))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockCommandBlock this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn next-to-successful-command-block?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockCommandBlock this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.isNextToSuccessfulCommandBlock world-in pos state))))

(defn with-rotation
  "state - `net.minecraft.block.state.IBlockState`
  rot - `net.minecraft.util.Rotation`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockCommandBlock this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Rotation rot]
    (-> this (.withRotation state rot))))

(defn get-comparator-input-override
  "block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^BlockCommandBlock this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getComparatorInputOverride block-state world-in pos))))

