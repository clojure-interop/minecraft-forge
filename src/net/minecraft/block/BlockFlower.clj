(ns net.minecraft.block.BlockFlower
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockFlower]))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockFlower this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockFlower this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

(defn get-sub-blocks
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  list - `net.minecraft.util.NonNullList`"
  ([^BlockFlower this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList list]
    (-> this (.getSubBlocks item-in tab list))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockFlower this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-block-type
  "returns: `net.minecraft.block.BlockFlower$EnumFlowerColor`"
  (^net.minecraft.block.BlockFlower$EnumFlowerColor [^BlockFlower this]
    (-> this (.getBlockType))))

(defn get-type-property
  "returns: `net.minecraft.block.properties.IProperty<net.minecraft.block.BlockFlower$EnumFlowerType>`"
  (^net.minecraft.block.properties.IProperty [^BlockFlower this]
    (-> this (.getTypeProperty))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockFlower this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn get-offset-type
  "returns: `net.minecraft.block.Block$EnumOffsetType`"
  (^net.minecraft.block.Block$EnumOffsetType [^BlockFlower this]
    (-> this (.getOffsetType))))

