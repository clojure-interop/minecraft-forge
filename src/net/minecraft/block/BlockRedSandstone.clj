(ns net.minecraft.block.BlockRedSandstone
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockRedSandstone]))

(defn ->block-red-sandstone
  "Constructor."
  (^BlockRedSandstone []
    (new BlockRedSandstone )))

(def *-type
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockRedSandstone$EnumType>"
  BlockRedSandstone/TYPE)

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockRedSandstone this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

(defn get-sub-blocks
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  list - `net.minecraft.util.NonNullList`"
  ([^BlockRedSandstone this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList list]
    (-> this (.getSubBlocks item-in tab list))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockRedSandstone this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockRedSandstone this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

