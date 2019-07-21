(ns net.minecraft.block.BlockStainedGlassPane
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockStainedGlassPane]))

(defn ->block-stained-glass-pane
  "Constructor."
  (^BlockStainedGlassPane []
    (new BlockStainedGlassPane )))

(def *-color
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.item.EnumDyeColor>"
  BlockStainedGlassPane/COLOR)

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockStainedGlassPane this]
    (-> this (.getBlockLayer))))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockStainedGlassPane this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockStainedGlassPane this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn with-mirror
  "state - `net.minecraft.block.state.IBlockState`
  mirror-in - `net.minecraft.util.Mirror`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockStainedGlassPane this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Mirror mirror-in]
    (-> this (.withMirror state mirror-in))))

(defn on-block-added
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockStainedGlassPane this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.onBlockAdded world-in pos state))))

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockStainedGlassPane this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

(defn get-sub-blocks
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  list - `net.minecraft.util.NonNullList`"
  ([^BlockStainedGlassPane this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList list]
    (-> this (.getSubBlocks item-in tab list))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockStainedGlassPane this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn break-block
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockStainedGlassPane this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.breakBlock world-in pos state))))

(defn with-rotation
  "state - `net.minecraft.block.state.IBlockState`
  rot - `net.minecraft.util.Rotation`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockStainedGlassPane this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Rotation rot]
    (-> this (.withRotation state rot))))

