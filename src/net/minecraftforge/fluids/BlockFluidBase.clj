(ns net.minecraftforge.fluids.BlockFluidBase
  "This is a base implementation for Fluid blocks.

  It is highly recommended that you extend this class or one of the Forge-provided child classes."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids BlockFluidBase]))

(defn ->block-fluid-base
  "Constructor.

  fluid - `net.minecraftforge.fluids.Fluid`
  material - `net.minecraft.block.material.Material`"
  (^BlockFluidBase [^net.minecraftforge.fluids.Fluid fluid ^net.minecraft.block.material.Material material]
    (new BlockFluidBase fluid material)))

(def *-level
  "Static Constant.

  type: net.minecraft.block.properties.PropertyInteger"
  BlockFluidBase/LEVEL)

(def *-level-corners
  "Static Constant.

  type: net.minecraftforge.common.property.PropertyFloat[]"
  BlockFluidBase/LEVEL_CORNERS)

(def *-flow-direction
  "Static Constant.

  type: net.minecraftforge.common.property.PropertyFloat"
  BlockFluidBase/FLOW_DIRECTION)

(def *-fluid-render-props
  "Static Constant.

  type: com.google.common.collect.ImmutableList<net.minecraftforge.common.property.IUnlistedProperty<java.lang.Float>>"
  BlockFluidBase/FLUID_RENDER_PROPS)

(defn *get-density
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (BlockFluidBase/getDensity world pos)))

(defn *get-temperature
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (BlockFluidBase/getTemperature world pos)))

(defn *get-flow-direction
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `double`"
  (^Double [^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (BlockFluidBase/getFlowDirection world pos)))

(defn get-fluid-height-average
  "flow - `float`

  returns: `float`"
  (^Float [^BlockFluidBase this ^Float flow]
    (-> this (.getFluidHeightAverage flow))))

(defn get-block-layer
  "returns: `net.minecraft.util.BlockRenderLayer`"
  (^net.minecraft.util.BlockRenderLayer [^BlockFluidBase this]
    (-> this (.getBlockLayer))))

(defn modify-acceleration
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity - `net.minecraft.entity.Entity`
  vec - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^BlockFluidBase this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.Entity entity ^net.minecraft.util.math.Vec3d vec]
    (-> this (.modifyAcceleration world pos entity vec))))

(defn set-density
  "density - `int`

  returns: `net.minecraftforge.fluids.BlockFluidBase`"
  (^net.minecraftforge.fluids.BlockFluidBase [^BlockFluidBase this ^Integer density]
    (-> this (.setDensity density))))

(defn quantity-dropped
  "par-1-random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockFluidBase this ^java.util.Random par-1-random]
    (-> this (.quantityDropped par-1-random))))

(defn get-fluid-height-for-render
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^BlockFluidBase this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getFluidHeightForRender world pos))))

(defn get-quanta-value-below
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  below-this - `int`

  returns: `int`"
  (^Integer [^BlockFluidBase this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^Integer below-this]
    (-> this (.getQuantaValueBelow world pos below-this))))

(defn get-quanta-value
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^BlockFluidBase this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getQuantaValue world pos))))

(defn set-max-scaled-light
  "max-scaled-light - `int`

  returns: `net.minecraftforge.fluids.BlockFluidBase`"
  (^net.minecraftforge.fluids.BlockFluidBase [^BlockFluidBase this ^Integer max-scaled-light]
    (-> this (.setMaxScaledLight max-scaled-light))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockFluidBase this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn set-temperature
  "temperature - `int`

  returns: `net.minecraftforge.fluids.BlockFluidBase`"
  (^net.minecraftforge.fluids.BlockFluidBase [^BlockFluidBase this ^Integer temperature]
    (-> this (.setTemperature temperature))))

(defn passable?
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockFluidBase this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isPassable world pos))))

(defn neighbor-changed
  "state - `net.minecraft.block.state.IBlockState`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  neighbor-block - `net.minecraft.block.Block`
  neighbour-pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockFluidBase this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block neighbor-block ^net.minecraft.util.math.BlockPos neighbour-pos]
    (-> this (.neighborChanged state world pos neighbor-block neighbour-pos))))

(defn can-displace?
  "Returns true if the block at (pos) is displaceable. Does not displace the block.

  world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockFluidBase this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canDisplace world pos))))

(defn tick-rate
  "world - `net.minecraft.world.World`

  returns: `int`"
  (^Integer [^BlockFluidBase this ^net.minecraft.world.World world]
    (-> this (.tickRate world))))

(defn get-filled-percentage
  "Description copied from interface: IFluidBlock

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^BlockFluidBase this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getFilledPercentage world pos))))

(defn get-quanta-percentage
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^BlockFluidBase this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getQuantaPercentage world pos))))

(defn get-light-value
  "Description copied from class: Block

  state - Block state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: The light value - `int`"
  (^Integer [^BlockFluidBase this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLightValue state world pos))))

(defn full-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockFluidBase this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isFullCube state))))

(defn requires-updates
  "returns: `boolean`"
  (^Boolean [^BlockFluidBase this]
    (-> this (.requiresUpdates))))

(defn get-extended-state
  "Description copied from class: Block

  old-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockFluidBase this ^net.minecraft.block.state.IBlockState old-state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getExtendedState old-state world-in pos))))

(defn should-side-be-rendered?
  "state - `net.minecraft.block.state.IBlockState`
  world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^BlockFluidBase this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.shouldSideBeRendered state world pos side))))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockFluidBase this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn on-block-added
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockFluidBase this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.onBlockAdded world pos state))))

(defn displace-if-possible
  "Attempt to displace the block at (pos), return true if it was displaced.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockFluidBase this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.displaceIfPossible world pos))))

(defn get-fluid
  "Description copied from interface: IFluidBlock

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^BlockFluidBase this]
    (-> this (.getFluid))))

(defn get-quanta-value-above
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  above-this - `int`

  returns: `int`"
  (^Integer [^BlockFluidBase this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^Integer above-this]
    (-> this (.getQuantaValueAbove world pos above-this))))

(defn get-flow-vector
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^BlockFluidBase this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getFlowVector world pos))))

(defn can-collide-check?
  "state - `net.minecraft.block.state.IBlockState`
  full-hit - `boolean`

  returns: `boolean`"
  (^Boolean [^BlockFluidBase this ^net.minecraft.block.state.IBlockState state ^Boolean full-hit]
    (-> this (.canCollideCheck state full-hit))))

(defn get-packed-lightmap-coords
  "state - `net.minecraft.block.state.IBlockState`
  world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^BlockFluidBase this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPackedLightmapCoords state world pos))))

(defn set-tick-rate
  "tick-rate - `int`

  returns: `net.minecraftforge.fluids.BlockFluidBase`"
  (^net.minecraftforge.fluids.BlockFluidBase [^BlockFluidBase this ^Integer tick-rate]
    (-> this (.setTickRate tick-rate))))

(defn set-render-layer
  "render-layer - `net.minecraft.util.BlockRenderLayer`

  returns: `net.minecraftforge.fluids.BlockFluidBase`"
  (^net.minecraftforge.fluids.BlockFluidBase [^BlockFluidBase this ^net.minecraft.util.BlockRenderLayer render-layer]
    (-> this (.setRenderLayer render-layer))))

(defn get-collision-bounding-box
  "block-state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockFluidBase this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getCollisionBoundingBox block-state world-in pos))))

(defn get-state-from-meta
  "Deprecated.

  meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockFluidBase this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn set-quanta-per-block
  "quanta-per-block - `int`

  returns: `net.minecraftforge.fluids.BlockFluidBase`"
  (^net.minecraftforge.fluids.BlockFluidBase [^BlockFluidBase this ^Integer quanta-per-block]
    (-> this (.setQuantaPerBlock quanta-per-block))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockFluidBase this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn get-max-render-height-meta
  "returns: `int`"
  (^Integer [^BlockFluidBase this]
    (-> this (.getMaxRenderHeightMeta))))

