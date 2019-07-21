(ns net.minecraft.block.BlockBanner
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockBanner]))

(def *-facing
  "Static Constant.

  type: net.minecraft.block.properties.PropertyDirection"
  BlockBanner/FACING)

(def *-rotation
  "Static Constant.

  type: net.minecraft.block.properties.PropertyInteger"
  BlockBanner/ROTATION)

(defn get-item
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BlockBanner this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.getItem world-in pos state))))

(defn can-place-block-at?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockBanner this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canPlaceBlockAt world-in pos))))

(defn drop-block-as-item-with-chance
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  chance - `float`
  fortune - `int`"
  ([^BlockBanner this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Float chance ^Integer fortune]
    (-> this (.dropBlockAsItemWithChance world-in pos state chance fortune))))

(defn passable?
  "world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockBanner this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isPassable world-in pos))))

(defn create-new-tile-entity
  "world-in - `net.minecraft.world.World`
  meta - `int`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^BlockBanner this ^net.minecraft.world.World world-in ^Integer meta]
    (-> this (.createNewTileEntity world-in meta))))

(defn get-localized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockBanner this]
    (-> this (.getLocalizedName))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockBanner this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockBanner this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn get-collision-bounding-box
  "block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockBanner this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getCollisionBoundingBox block-state world-in pos))))

(defn can-spawn-in-block?
  "returns: `boolean`"
  (^Boolean [^BlockBanner this]
    (-> this (.canSpawnInBlock))))

(defn harvest-block
  "world-in - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  te - `net.minecraft.tileentity.TileEntity`
  stack - `net.minecraft.item.ItemStack`"
  ([^BlockBanner this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.tileentity.TileEntity te ^net.minecraft.item.ItemStack stack]
    (-> this (.harvestBlock world-in player pos state te stack))))

(defn get-drops
  "Description copied from class: Block

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  state - Current state - `net.minecraft.block.state.IBlockState`
  fortune - Breakers fortune level - `int`

  returns: A ArrayList containing all items this block drops - `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^BlockBanner this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Integer fortune]
    (-> this (.getDrops world pos state fortune))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockBanner this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

