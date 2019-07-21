(ns net.minecraft.block.BlockWeb
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockWeb]))

(defn ->block-web
  "Constructor."
  (^BlockWeb []
    (new BlockWeb )))

(defn on-entity-collided-with-block
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  entity-in - `net.minecraft.entity.Entity`"
  ([^BlockWeb this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityCollidedWithBlock world-in pos state entity-in))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockWeb this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn get-collision-bounding-box
  "block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockWeb this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getCollisionBoundingBox block-state world-in pos))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockWeb this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockWeb this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockWeb this]
    (-> this (.getBlockLayer))))

(defn harvest-block
  "world-in - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  te - `net.minecraft.tileentity.TileEntity`
  stack - `net.minecraft.item.ItemStack`"
  ([^BlockWeb this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.tileentity.TileEntity te ^net.minecraft.item.ItemStack stack]
    (-> this (.harvestBlock world-in player pos state te stack))))

