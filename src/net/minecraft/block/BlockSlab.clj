(ns net.minecraft.block.BlockSlab
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockSlab]))

(defn ->block-slab
  "Constructor.

  p-i-47249-1 - `net.minecraft.block.material.Material`
  p-i-47249-2 - `net.minecraft.block.material.MapColor`"
  (^BlockSlab [^net.minecraft.block.material.Material p-i-47249-1 ^net.minecraft.block.material.MapColor p-i-47249-2]
    (new BlockSlab p-i-47249-1 p-i-47249-2))
  (^BlockSlab [^net.minecraft.block.material.Material material-in]
    (new BlockSlab material-in)))

(def *-half
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockSlab$EnumBlockHalf>"
  BlockSlab/HALF)

(defn get-unlocalized-name
  "meta - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^BlockSlab this ^Integer meta]
    (-> this (.getUnlocalizedName meta))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockSlab this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn fully-opaque?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockSlab this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullyOpaque state))))

(defn double?
  "returns: `boolean`"
  (^Boolean [^BlockSlab this]
    (-> this (.isDouble))))

(defn get-state-for-placement
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`
  meta - `int`
  placer - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockSlab this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z ^Integer meta ^net.minecraft.entity.EntityLivingBase placer]
    (-> this (.getStateForPlacement world-in pos facing hit-x hit-y hit-z meta placer))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockSlab this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn does-side-block-rendering
  "Description copied from class: Block

  state - The current block state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  face - The side to check - `net.minecraft.util.EnumFacing`

  returns: True if the block is opaque on the specified side. - `boolean`"
  (^Boolean [^BlockSlab this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing face]
    (-> this (.doesSideBlockRendering state world pos face))))

(defn get-type-for-item
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.Comparable<?>`"
  (^java.lang.Comparable [^BlockSlab this ^net.minecraft.item.ItemStack stack]
    (-> this (.getTypeForItem stack))))

(defn should-side-be-rendered?
  "block-state - `net.minecraft.block.state.IBlockState`
  block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^BlockSlab this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.shouldSideBeRendered block-state block-access pos side))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockSlab this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn get-variant-property
  "returns: `net.minecraft.block.properties.IProperty<?>`"
  (^net.minecraft.block.properties.IProperty [^BlockSlab this]
    (-> this (.getVariantProperty))))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockSlab this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

