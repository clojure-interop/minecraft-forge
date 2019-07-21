(ns net.minecraft.block.BlockDoublePlant
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockDoublePlant]))

(defn ->block-double-plant
  "Constructor."
  (^BlockDoublePlant []
    (new BlockDoublePlant )))

(def *-variant
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockDoublePlant$EnumPlantType>"
  BlockDoublePlant/VARIANT)

(def *-half
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockDoublePlant$EnumBlockHalf>"
  BlockDoublePlant/HALF)

(def *-facing
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.util.EnumFacing>"
  BlockDoublePlant/FACING)

(defn place-at
  "world-in - `net.minecraft.world.World`
  lower-pos - `net.minecraft.util.math.BlockPos`
  variant - `net.minecraft.block.BlockDoublePlant$EnumPlantType`
  flags - `int`"
  ([^BlockDoublePlant this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos lower-pos ^net.minecraft.block.BlockDoublePlant$EnumPlantType variant ^Integer flags]
    (-> this (.placeAt world-in lower-pos variant flags))))

(defn get-item
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BlockDoublePlant this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.getItem world-in pos state))))

(defn can-place-block-at?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockDoublePlant this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canPlaceBlockAt world-in pos))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockDoublePlant this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn on-sheared
  "Description copied from interface: IShearable

  item - The itemstack that is being used, Possible to be null - `net.minecraft.item.ItemStack`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - If this is a block, the block's position in world. - `net.minecraft.util.math.BlockPos`
  fortune - The fortune level of the shears being used - `int`

  returns: A ArrayList containing all items from this shearing. Possible to be null. - `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^BlockDoublePlant this ^net.minecraft.item.ItemStack item ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^Integer fortune]
    (-> this (.onSheared item world pos fortune))))

(defn can-block-stay?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockDoublePlant this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.canBlockStay world-in pos state))))

(defn can-grow?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  is-client - `boolean`

  returns: `boolean`"
  (^Boolean [^BlockDoublePlant this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Boolean is-client]
    (-> this (.canGrow world-in pos state is-client))))

(defn shearable?
  "Description copied from interface: IShearable

  item - The itemstack that is being used, Possible to be null - `net.minecraft.item.ItemStack`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block's position in world. - `net.minecraft.util.math.BlockPos`

  returns: If this is shearable, and onSheared should be called. - `boolean`"
  (^Boolean [^BlockDoublePlant this ^net.minecraft.item.ItemStack item ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isShearable item world pos))))

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockDoublePlant this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

(defn can-use-bonemeal?
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockDoublePlant this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.canUseBonemeal world-in rand pos state))))

(defn on-block-placed-by
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  placer - `net.minecraft.entity.EntityLivingBase`
  stack - `net.minecraft.item.ItemStack`"
  ([^BlockDoublePlant this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.EntityLivingBase placer ^net.minecraft.item.ItemStack stack]
    (-> this (.onBlockPlacedBy world-in pos state placer stack))))

(defn get-offset-type
  "returns: `net.minecraft.block.Block$EnumOffsetType`"
  (^net.minecraft.block.Block$EnumOffsetType [^BlockDoublePlant this]
    (-> this (.getOffsetType))))

(defn get-actual-state
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockDoublePlant this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getActualState state world-in pos))))

(defn get-sub-blocks
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  list - `net.minecraft.util.NonNullList`"
  ([^BlockDoublePlant this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList list]
    (-> this (.getSubBlocks item-in tab list))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockDoublePlant this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn replaceable?
  "world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockDoublePlant this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isReplaceable world-in pos))))

(defn on-block-harvested
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  player - `net.minecraft.entity.player.EntityPlayer`"
  ([^BlockDoublePlant this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.onBlockHarvested world-in pos state player))))

(defn removed-by-player
  "Description copied from class: Block

  state - The current state. - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  player - The player damaging the block, may be null - `net.minecraft.entity.player.EntityPlayer`
  will-harvest - True if Block.harvestBlock will be called after this, if the return in true. Can be useful to delay the destruction of tile entities till after harvestBlock - `boolean`

  returns: True if the block is actually destroyed. - `boolean`"
  (^Boolean [^BlockDoublePlant this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.player.EntityPlayer player ^Boolean will-harvest]
    (-> this (.removedByPlayer state world pos player will-harvest))))

(defn harvest-block
  "world-in - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  te - `net.minecraft.tileentity.TileEntity`
  stack - `net.minecraft.item.ItemStack`"
  ([^BlockDoublePlant this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.tileentity.TileEntity te ^net.minecraft.item.ItemStack stack]
    (-> this (.harvestBlock world-in player pos state te stack))))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockDoublePlant this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockDoublePlant this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn grow
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockDoublePlant this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.grow world-in rand pos state))))

