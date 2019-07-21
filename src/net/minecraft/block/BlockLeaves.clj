(ns net.minecraft.block.BlockLeaves
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockLeaves]))

(defn ->block-leaves
  "Constructor."
  (^BlockLeaves []
    (new BlockLeaves )))

(def *-decayable
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockLeaves/DECAYABLE)

(def *-check-decay
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockLeaves/CHECK_DECAY)

(defn update-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockLeaves this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world-in pos state rand))))

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockLeaves this]
    (-> this (.getBlockLayer))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockLeaves this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn set-graphics-level
  "fancy - `boolean`"
  ([^BlockLeaves this ^Boolean fancy]
    (-> this (.setGraphicsLevel fancy))))

(defn drop-block-as-item-with-chance
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  chance - `float`
  fortune - `int`"
  ([^BlockLeaves this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Float chance ^Integer fortune]
    (-> this (.dropBlockAsItemWithChance world-in pos state chance fortune))))

(defn begin-leaves-decay
  "Description copied from class: Block

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.World`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`"
  ([^BlockLeaves this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.beginLeavesDecay state world pos))))

(defn get-wood-type
  "meta - `int`

  returns: `net.minecraft.block.BlockPlanks$EnumType`"
  (^net.minecraft.block.BlockPlanks$EnumType [^BlockLeaves this ^Integer meta]
    (-> this (.getWoodType meta))))

(defn should-side-be-rendered?
  "block-state - `net.minecraft.block.state.IBlockState`
  block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^BlockLeaves this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.shouldSideBeRendered block-state block-access pos side))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockLeaves this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn shearable?
  "Description copied from interface: IShearable

  item - The itemstack that is being used, Possible to be null - `net.minecraft.item.ItemStack`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block's position in world. - `net.minecraft.util.math.BlockPos`

  returns: If this is shearable, and onSheared should be called. - `boolean`"
  (^Boolean [^BlockLeaves this ^net.minecraft.item.ItemStack item ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isShearable item world pos))))

(defn causes-suffocation
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockLeaves this ^net.minecraft.block.state.IBlockState state]
    (-> this (.causesSuffocation state))))

(defn leaves?
  "Description copied from class: Block

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: true if this block is considered leaves. - `boolean`"
  (^Boolean [^BlockLeaves this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isLeaves state world pos))))

(defn get-drops
  "Description copied from class: Block

  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`
  state - Current state - `net.minecraft.block.state.IBlockState`
  fortune - Breakers fortune level - `int`

  returns: A ArrayList containing all items this block drops - `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^BlockLeaves this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Integer fortune]
    (-> this (.getDrops world pos state fortune))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockLeaves this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn random-display-tick
  "state-in - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  rand - `java.util.Random`"
  ([^BlockLeaves this ^net.minecraft.block.state.IBlockState state-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^java.util.Random rand]
    (-> this (.randomDisplayTick state-in world-in pos rand))))

(defn break-block
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockLeaves this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.breakBlock world-in pos state))))

