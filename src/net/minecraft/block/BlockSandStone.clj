(ns net.minecraft.block.BlockSandStone
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockSandStone]))

(defn ->block-sand-stone
  "Constructor."
  (^BlockSandStone []
    (new BlockSandStone )))

(def *-type
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockSandStone$EnumType>"
  BlockSandStone/TYPE)

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockSandStone this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

(defn get-sub-blocks
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  list - `net.minecraft.util.NonNullList`"
  ([^BlockSandStone this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList list]
    (-> this (.getSubBlocks item-in tab list))))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockSandStone this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockSandStone this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockSandStone this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

