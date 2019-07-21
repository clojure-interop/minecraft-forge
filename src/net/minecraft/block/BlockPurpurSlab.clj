(ns net.minecraft.block.BlockPurpurSlab
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPurpurSlab]))

(defn ->block-purpur-slab
  "Constructor."
  (^BlockPurpurSlab []
    (new BlockPurpurSlab )))

(def *-variant
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockPurpurSlab$Variant>"
  BlockPurpurSlab/VARIANT)

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockPurpurSlab this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn get-item
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BlockPurpurSlab this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.getItem world-in pos state))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockPurpurSlab this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockPurpurSlab this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn get-unlocalized-name
  "meta - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^BlockPurpurSlab this ^Integer meta]
    (-> this (.getUnlocalizedName meta))))

(defn get-variant-property
  "returns: `net.minecraft.block.properties.IProperty<?>`"
  (^net.minecraft.block.properties.IProperty [^BlockPurpurSlab this]
    (-> this (.getVariantProperty))))

(defn get-type-for-item
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.Comparable<?>`"
  (^java.lang.Comparable [^BlockPurpurSlab this ^net.minecraft.item.ItemStack stack]
    (-> this (.getTypeForItem stack))))

