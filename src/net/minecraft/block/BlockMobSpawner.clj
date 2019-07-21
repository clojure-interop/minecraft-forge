(ns net.minecraft.block.BlockMobSpawner
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockMobSpawner]))

(defn get-render-type
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.util.EnumBlockRenderType`"
  (^net.minecraft.util.EnumBlockRenderType [^BlockMobSpawner this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getRenderType state))))

(defn get-item
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BlockMobSpawner this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.getItem world-in pos state))))

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockMobSpawner this]
    (-> this (.getBlockLayer))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockMobSpawner this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn drop-block-as-item-with-chance
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  chance - `float`
  fortune - `int`"
  ([^BlockMobSpawner this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Float chance ^Integer fortune]
    (-> this (.dropBlockAsItemWithChance world-in pos state chance fortune))))

(defn create-new-tile-entity
  "world-in - `net.minecraft.world.World`
  meta - `int`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^BlockMobSpawner this ^net.minecraft.world.World world-in ^Integer meta]
    (-> this (.createNewTileEntity world-in meta))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockMobSpawner this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn get-exp-drop
  "Description copied from class: Block

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The world - `net.minecraft.world.IBlockAccess`
  pos - Block position - `net.minecraft.util.math.BlockPos`
  fortune - `int`

  returns: Amount of XP from breaking this block. - `int`"
  (^Integer [^BlockMobSpawner this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^Integer fortune]
    (-> this (.getExpDrop state world pos fortune))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockMobSpawner this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

