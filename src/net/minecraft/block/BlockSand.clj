(ns net.minecraft.block.BlockSand
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockSand]))

(defn ->block-sand
  "Constructor."
  (^BlockSand []
    (new BlockSand )))

(def *-variant
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockSand$EnumType>"
  BlockSand/VARIANT)

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockSand this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

(defn get-sub-blocks
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  list - `net.minecraft.util.NonNullList`"
  ([^BlockSand this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList list]
    (-> this (.getSubBlocks item-in tab list))))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockSand this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockSand this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockSand this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn get-dust-color
  "p-189876-1 - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockSand this ^net.minecraft.block.state.IBlockState p-189876-1]
    (-> this (.getDustColor p-189876-1))))

