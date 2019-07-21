(ns net.minecraftforge.fluids.capability.IFluidTankProperties
  "Simplified Read-only Information about the internals of an IFluidHandler.
  This is useful for displaying information, and as hints for interacting with it.
  These properties are constant and do not depend on the fluid contents (except the contents themselves, of course).

  The information here may not tell the full story of how the tank actually works,
  for real fluid transactions you must use IFluidHandler to simulate, check, and then interact.
  None of the information in these properties is required to successfully interact using a IFluidHandler."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability IFluidTankProperties]))

(defn get-contents
  "returns: A copy of the fluid contents of this tank. May be null.
   To modify the contents, use IFluidHandler. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^IFluidTankProperties this]
    (-> this (.getContents))))

(defn get-capacity
  "returns: The maximum amount of fluid this tank can hold, in millibuckets. - `int`"
  (^Integer [^IFluidTankProperties this]
    (-> this (.getCapacity))))

(defn can-fill?
  "Returns true if the tank can be filled at any time (even if it is currently full).
   It does not consider the contents or capacity of the tank.

   This value is constant. If the tank behavior is more complicated, returns true.

  returns: `boolean`"
  (^Boolean [^IFluidTankProperties this]
    (-> this (.canFill))))

(defn can-drain?
  "Returns true if the tank can be drained at any time (even if it is currently empty).
   It does not consider the contents or capacity of the tank.

   This value is constant. If the tank behavior is more complicated, returns true.

  returns: `boolean`"
  (^Boolean [^IFluidTankProperties this]
    (-> this (.canDrain))))

(defn can-fill-fluid-type?
  "Returns true if the tank can be filled with a specific type of fluid.
   Used as a filter for fluid types.

   Does not consider the current contents or capacity of the tank,
   only whether it could ever fill with this type of fluid.
   FluidStack is used here because fluid properties can depend on NBT, the amount is ignored.

  fluid-stack - `net.minecraftforge.fluids.FluidStack`

  returns: `boolean`"
  (^Boolean [^IFluidTankProperties this ^net.minecraftforge.fluids.FluidStack fluid-stack]
    (-> this (.canFillFluidType fluid-stack))))

(defn can-drain-fluid-type?
  "Returns true if the tank can drain out this a specific of fluid.
   Used as a filter for fluid types.

   Does not consider the current contents or capacity of the tank,
   only whether it could ever drain out this type of fluid.
   FluidStack is used here because fluid properties can depend on NBT, the amount is ignored.

  fluid-stack - `net.minecraftforge.fluids.FluidStack`

  returns: `boolean`"
  (^Boolean [^IFluidTankProperties this ^net.minecraftforge.fluids.FluidStack fluid-stack]
    (-> this (.canDrainFluidType fluid-stack))))

