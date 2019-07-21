(ns net.minecraftforge.fluids.IFluidBlock
  "Implement this interface on Block classes which represent world-placeable Fluids.

  NOTE: Using/extending the reference implementations BlockFluidBase is encouraged."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids IFluidBlock]))

(defn get-fluid
  "Returns the Fluid associated with this Block.

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^IFluidBlock this]
    (-> this (.getFluid))))

(defn place
  "Attempts to place the block at a given position. The placed block's level will correspond
   to the provided fluid amount.
   This method should be called by fluid containers such as buckets, but it is recommended
   to use FluidUtil.

  world - the world to place the block in - `net.minecraft.world.World`
  pos - the position to place the block at - `net.minecraft.util.math.BlockPos`
  fluid-stack - the fluid stack to get the required data from - `net.minecraftforge.fluids.FluidStack`
  do-place - if false, the placement will only be simulated - `boolean`

  returns: the amount of fluid extracted from the provided stack to achieve some fluid level - `int`"
  (^Integer [^IFluidBlock this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraftforge.fluids.FluidStack fluid-stack ^Boolean do-place]
    (-> this (.place world pos fluid-stack do-place))))

(defn drain
  "Attempt to drain the block. This method should be called by devices such as pumps.

   NOTE: The block is intended to handle its own state changes.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  do-drain - If false, the drain will only be simulated. - `boolean`

  returns: `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^IFluidBlock this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^Boolean do-drain]
    (-> this (.drain world pos do-drain))))

(defn can-drain?
  "Check to see if a block can be drained. This method should be called by devices such as
   pumps.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^IFluidBlock this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canDrain world pos))))

(defn get-filled-percentage
  "Returns the amount of a single block is filled. Value between 0 and 1.
   1 meaning the entire 1x1x1 cube is full, 0 meaning completely empty.

   If the return value is negative. It will be treated as filling the block
   from the top down instead of bottom up.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^IFluidBlock this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getFilledPercentage world pos))))

