(ns net.minecraft.block.BlockPrismarine
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPrismarine]))

(defn ->block-prismarine
  "Constructor."
  (^BlockPrismarine []
    (new BlockPrismarine )))

(def *-variant
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockPrismarine$EnumType>"
  BlockPrismarine/VARIANT)

(def *-rough-meta
  "Static Constant.

  type: int"
  BlockPrismarine/ROUGH_META)

(def *-bricks-meta
  "Static Constant.

  type: int"
  BlockPrismarine/BRICKS_META)

(def *-dark-meta
  "Static Constant.

  type: int"
  BlockPrismarine/DARK_META)

(defn get-localized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockPrismarine this]
    (-> this (.getLocalizedName))))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockPrismarine this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockPrismarine this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockPrismarine this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockPrismarine this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-sub-blocks
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  list - `net.minecraft.util.NonNullList`"
  ([^BlockPrismarine this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList list]
    (-> this (.getSubBlocks item-in tab list))))

