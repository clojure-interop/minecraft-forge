(ns net.minecraft.block.BlockBeacon
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockBeacon]))

(defn ->block-beacon
  "Constructor."
  (^BlockBeacon []
    (new BlockBeacon )))

(defn *update-color-async
  "world-in - `net.minecraft.world.World`
  glass-pos - `net.minecraft.util.math.BlockPos`"
  ([^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos glass-pos]
    (BlockBeacon/updateColorAsync world-in glass-pos)))

(defn create-new-tile-entity
  "world-in - `net.minecraft.world.World`
  meta - `int`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^BlockBeacon this ^net.minecraft.world.World world-in ^Integer meta]
    (-> this (.createNewTileEntity world-in meta))))

(defn on-block-activated
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `boolean`"
  (^Boolean [^BlockBeacon this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onBlockActivated world-in pos state player-in hand facing hit-x hit-y hit-z))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockBeacon this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockBeacon this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn get-render-type
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.util.EnumBlockRenderType`"
  (^net.minecraft.util.EnumBlockRenderType [^BlockBeacon this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getRenderType state))))

(defn on-block-placed-by
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  placer - `net.minecraft.entity.EntityLivingBase`
  stack - `net.minecraft.item.ItemStack`"
  ([^BlockBeacon this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.EntityLivingBase placer ^net.minecraft.item.ItemStack stack]
    (-> this (.onBlockPlacedBy world-in pos state placer stack))))

(defn neighbor-changed
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  from-pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockBeacon this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^net.minecraft.util.math.BlockPos from-pos]
    (-> this (.neighborChanged state world-in pos block-in from-pos))))

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockBeacon this]
    (-> this (.getBlockLayer))))

