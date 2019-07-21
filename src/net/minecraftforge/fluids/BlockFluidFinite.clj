(ns net.minecraftforge.fluids.BlockFluidFinite
  "This is a cellular-automata based finite fluid block implementation.

  It is highly recommended that you use/extend this class for finite fluid blocks."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids BlockFluidFinite]))

(defn ->block-fluid-finite
  "Constructor.

  fluid - `net.minecraftforge.fluids.Fluid`
  material - `net.minecraft.block.material.Material`"
  (^BlockFluidFinite [^net.minecraftforge.fluids.Fluid fluid ^net.minecraft.block.material.Material material]
    (new BlockFluidFinite fluid material)))

(defn get-quanta-value
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^BlockFluidFinite this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getQuantaValue world pos))))

(defn can-collide-check?
  "state - `net.minecraft.block.state.IBlockState`
  full-hit - `boolean`

  returns: `boolean`"
  (^Boolean [^BlockFluidFinite this ^net.minecraft.block.state.IBlockState state ^Boolean full-hit]
    (-> this (.canCollideCheck state full-hit))))

(defn get-max-render-height-meta
  "returns: `int`"
  (^Integer [^BlockFluidFinite this]
    (-> this (.getMaxRenderHeightMeta))))

(defn update-tick
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockFluidFinite this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world pos state rand))))

(defn try-to-flow-vertically-into
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  amt-to-input - `int`

  returns: `int`"
  (^Integer [^BlockFluidFinite this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^Integer amt-to-input]
    (-> this (.tryToFlowVerticallyInto world pos amt-to-input))))

(defn place
  "Description copied from interface: IFluidBlock

  world - the world to place the block in - `net.minecraft.world.World`
  pos - the position to place the block at - `net.minecraft.util.math.BlockPos`
  fluid-stack - the fluid stack to get the required data from - `net.minecraftforge.fluids.FluidStack`
  do-place - if false, the placement will only be simulated - `boolean`

  returns: the amount of fluid extracted from the provided stack to achieve some fluid level - `int`"
  (^Integer [^BlockFluidFinite this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraftforge.fluids.FluidStack fluid-stack ^Boolean do-place]
    (-> this (.place world pos fluid-stack do-place))))

(defn drain
  "Description copied from interface: IFluidBlock

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  do-drain - `boolean`

  returns: `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^BlockFluidFinite this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^Boolean do-drain]
    (-> this (.drain world pos do-drain))))

(defn can-drain?
  "Description copied from interface: IFluidBlock

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockFluidFinite this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canDrain world pos))))

