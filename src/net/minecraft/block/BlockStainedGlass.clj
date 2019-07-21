(ns net.minecraft.block.BlockStainedGlass
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockStainedGlass]))

(defn ->block-stained-glass
  "Constructor.

  material-in - `net.minecraft.block.material.Material`"
  (^BlockStainedGlass [^net.minecraft.block.material.Material material-in]
    (new BlockStainedGlass material-in)))

(def *-color
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.item.EnumDyeColor>"
  BlockStainedGlass/COLOR)

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockStainedGlass this]
    (-> this (.getBlockLayer))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockStainedGlass this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockStainedGlass this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockStainedGlass this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockStainedGlass this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn on-block-added
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockStainedGlass this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.onBlockAdded world-in pos state))))

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockStainedGlass this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

(defn get-sub-blocks
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  list - `net.minecraft.util.NonNullList`"
  ([^BlockStainedGlass this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList list]
    (-> this (.getSubBlocks item-in tab list))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockStainedGlass this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn break-block
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockStainedGlass this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.breakBlock world-in pos state))))

