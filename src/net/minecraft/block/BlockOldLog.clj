(ns net.minecraft.block.BlockOldLog
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockOldLog]))

(defn ->block-old-log
  "Constructor."
  (^BlockOldLog []
    (new BlockOldLog )))

(def *-variant
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockPlanks$EnumType>"
  BlockOldLog/VARIANT)

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockOldLog this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn get-sub-blocks
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  list - `net.minecraft.util.NonNullList`"
  ([^BlockOldLog this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList list]
    (-> this (.getSubBlocks item-in tab list))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockOldLog this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockOldLog this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockOldLog this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

