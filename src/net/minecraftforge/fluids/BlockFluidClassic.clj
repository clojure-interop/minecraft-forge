(ns net.minecraftforge.fluids.BlockFluidClassic
  "This is a fluid block implementation which emulates vanilla Minecraft fluid behavior.

  It is highly recommended that you use/extend this class for \"classic\" fluid blocks."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids BlockFluidClassic]))

(defn ->block-fluid-classic
  "Constructor.

  fluid - `net.minecraftforge.fluids.Fluid`
  material - `net.minecraft.block.material.Material`"
  (^BlockFluidClassic [^net.minecraftforge.fluids.Fluid fluid ^net.minecraft.block.material.Material material]
    (new BlockFluidClassic fluid material)))

(defn drain
  "Description copied from interface: IFluidBlock

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  do-drain - `boolean`

  returns: `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^BlockFluidClassic this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^Boolean do-drain]
    (-> this (.drain world pos do-drain))))

(defn update-tick
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockFluidClassic this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world pos state rand))))

(defn set-fluid-stack-amount
  "amount - `int`

  returns: `net.minecraftforge.fluids.BlockFluidClassic`"
  (^net.minecraftforge.fluids.BlockFluidClassic [^BlockFluidClassic this ^Integer amount]
    (-> this (.setFluidStackAmount amount))))

(defn get-quanta-value
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^BlockFluidClassic this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getQuantaValue world pos))))

(defn place
  "Description copied from interface: IFluidBlock

  world - the world to place the block in - `net.minecraft.world.World`
  pos - the position to place the block at - `net.minecraft.util.math.BlockPos`
  fluid-stack - the fluid stack to get the required data from - `net.minecraftforge.fluids.FluidStack`
  do-place - if false, the placement will only be simulated - `boolean`

  returns: the amount of fluid extracted from the provided stack to achieve some fluid level - `int`"
  (^Integer [^BlockFluidClassic this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraftforge.fluids.FluidStack fluid-stack ^Boolean do-place]
    (-> this (.place world pos fluid-stack do-place))))

(defn source-block?
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockFluidClassic this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isSourceBlock world pos))))

(defn get-light-value
  "Description copied from class: Block

  state - Block state - `net.minecraft.block.state.IBlockState`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block position in world - `net.minecraft.util.math.BlockPos`

  returns: The light value - `int`"
  (^Integer [^BlockFluidClassic this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLightValue state world pos))))

(defn flowing-vertically?
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockFluidClassic this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isFlowingVertically world pos))))

(defn can-drain?
  "Description copied from interface: IFluidBlock

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^BlockFluidClassic this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canDrain world pos))))

(defn set-fluid-stack
  "stack - `net.minecraftforge.fluids.FluidStack`

  returns: `net.minecraftforge.fluids.BlockFluidClassic`"
  (^net.minecraftforge.fluids.BlockFluidClassic [^BlockFluidClassic this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.setFluidStack stack))))

(defn can-collide-check?
  "state - `net.minecraft.block.state.IBlockState`
  full-hit - `boolean`

  returns: `boolean`"
  (^Boolean [^BlockFluidClassic this ^net.minecraft.block.state.IBlockState state ^Boolean full-hit]
    (-> this (.canCollideCheck state full-hit))))

(defn get-max-render-height-meta
  "returns: `int`"
  (^Integer [^BlockFluidClassic this]
    (-> this (.getMaxRenderHeightMeta))))

