(ns net.minecraft.block.BlockStoneBrick
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockStoneBrick]))

(defn ->block-stone-brick
  "Constructor."
  (^BlockStoneBrick []
    (new BlockStoneBrick )))

(def *-variant
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockStoneBrick$EnumType>"
  BlockStoneBrick/VARIANT)

(def *-default-meta
  "Static Constant.

  type: int"
  BlockStoneBrick/DEFAULT_META)

(def *-mossy-meta
  "Static Constant.

  type: int"
  BlockStoneBrick/MOSSY_META)

(def *-cracked-meta
  "Static Constant.

  type: int"
  BlockStoneBrick/CRACKED_META)

(def *-chiseled-meta
  "Static Constant.

  type: int"
  BlockStoneBrick/CHISELED_META)

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockStoneBrick this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

(defn get-sub-blocks
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  list - `net.minecraft.util.NonNullList`"
  ([^BlockStoneBrick this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList list]
    (-> this (.getSubBlocks item-in tab list))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockStoneBrick this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockStoneBrick this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

