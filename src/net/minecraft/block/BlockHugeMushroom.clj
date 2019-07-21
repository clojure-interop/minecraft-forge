(ns net.minecraft.block.BlockHugeMushroom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockHugeMushroom]))

(defn ->block-huge-mushroom
  "Constructor.

  material-in - `net.minecraft.block.material.Material`
  color - `net.minecraft.block.material.MapColor`
  small-block-in - `net.minecraft.block.Block`"
  (^BlockHugeMushroom [^net.minecraft.block.material.Material material-in ^net.minecraft.block.material.MapColor color ^net.minecraft.block.Block small-block-in]
    (new BlockHugeMushroom material-in color small-block-in)))

(def *-variant
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockHugeMushroom$EnumType>"
  BlockHugeMushroom/VARIANT)

(defn get-item
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BlockHugeMushroom this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.getItem world-in pos state))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockHugeMushroom this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn rotate-block
  "Description copied from class: Block

  world - The world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  axis - The axis to rotate around - `net.minecraft.util.EnumFacing`

  returns: True if the rotation was successful, False if the rotation failed, or is not possible - `boolean`"
  (^Boolean [^BlockHugeMushroom this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing axis]
    (-> this (.rotateBlock world pos axis))))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockHugeMushroom this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockHugeMushroom this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn with-mirror
  "state - `net.minecraft.block.state.IBlockState`
  mirror-in - `net.minecraft.util.Mirror`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockHugeMushroom this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Mirror mirror-in]
    (-> this (.withMirror state mirror-in))))

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
  (^net.minecraft.block.state.IBlockState [^BlockHugeMushroom this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z ^Integer meta ^net.minecraft.entity.EntityLivingBase placer]
    (-> this (.getStateForPlacement world-in pos facing hit-x hit-y hit-z meta placer))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockHugeMushroom this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockHugeMushroom this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn with-rotation
  "state - `net.minecraft.block.state.IBlockState`
  rot - `net.minecraft.util.Rotation`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockHugeMushroom this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Rotation rot]
    (-> this (.withRotation state rot))))

