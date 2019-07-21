(ns net.minecraft.block.BlockNewLog
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockNewLog]))

(defn ->block-new-log
  "Constructor."
  (^BlockNewLog []
    (new BlockNewLog )))

(def *-variant
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockPlanks$EnumType>"
  BlockNewLog/VARIANT)

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockNewLog this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn get-sub-blocks
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  list - `net.minecraft.util.NonNullList`"
  ([^BlockNewLog this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList list]
    (-> this (.getSubBlocks item-in tab list))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockNewLog this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockNewLog this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockNewLog this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

