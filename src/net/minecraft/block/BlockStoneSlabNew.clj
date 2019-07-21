(ns net.minecraft.block.BlockStoneSlabNew
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockStoneSlabNew]))

(defn ->block-stone-slab-new
  "Constructor."
  (^BlockStoneSlabNew []
    (new BlockStoneSlabNew )))

(def *-seamless
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockStoneSlabNew/SEAMLESS)

(def *-variant
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockStoneSlabNew$EnumType>"
  BlockStoneSlabNew/VARIANT)

(defn get-unlocalized-name
  "meta - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^BlockStoneSlabNew this ^Integer meta]
    (-> this (.getUnlocalizedName meta))))

(defn get-item
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BlockStoneSlabNew this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.getItem world-in pos state))))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockStoneSlabNew this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockStoneSlabNew this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn get-localized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockStoneSlabNew this]
    (-> this (.getLocalizedName))))

(defn get-type-for-item
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.Comparable<?>`"
  (^java.lang.Comparable [^BlockStoneSlabNew this ^net.minecraft.item.ItemStack stack]
    (-> this (.getTypeForItem stack))))

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockStoneSlabNew this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

(defn get-variant-property
  "returns: `net.minecraft.block.properties.IProperty<?>`"
  (^net.minecraft.block.properties.IProperty [^BlockStoneSlabNew this]
    (-> this (.getVariantProperty))))

(defn get-sub-blocks
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  list - `net.minecraft.util.NonNullList`"
  ([^BlockStoneSlabNew this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList list]
    (-> this (.getSubBlocks item-in tab list))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockStoneSlabNew this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockStoneSlabNew this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

