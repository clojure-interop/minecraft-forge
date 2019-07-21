(ns net.minecraft.block.BlockDeadBush
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockDeadBush]))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockDeadBush this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockDeadBush this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn replaceable?
  "world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockDeadBush this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isReplaceable world-in pos))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockDeadBush this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockDeadBush this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn harvest-block
  "world-in - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  te - `net.minecraft.tileentity.TileEntity`
  stack - `net.minecraft.item.ItemStack`"
  ([^BlockDeadBush this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.tileentity.TileEntity te ^net.minecraft.item.ItemStack stack]
    (-> this (.harvestBlock world-in player pos state te stack))))

(defn shearable?
  "Description copied from interface: IShearable

  item - The itemstack that is being used, Possible to be null - `net.minecraft.item.ItemStack`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block's position in world. - `net.minecraft.util.math.BlockPos`

  returns: If this is shearable, and onSheared should be called. - `boolean`"
  (^Boolean [^BlockDeadBush this ^net.minecraft.item.ItemStack item ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isShearable item world pos))))

(defn on-sheared
  "Description copied from interface: IShearable

  item - The itemstack that is being used, Possible to be null - `net.minecraft.item.ItemStack`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - If this is a block, the block's position in world. - `net.minecraft.util.math.BlockPos`
  fortune - The fortune level of the shears being used - `int`

  returns: A ArrayList containing all items from this shearing. Possible to be null. - `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^BlockDeadBush this ^net.minecraft.item.ItemStack item ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^Integer fortune]
    (-> this (.onSheared item world pos fortune))))

