(ns net.minecraftforge.fluids.FluidStack
  "ItemStack substitute for Fluids.

  NOTE: Equality is based on the Fluid, not the amount. Use
  isFluidStackIdentical(FluidStack) to determine if FluidID, Amount and NBT Tag are all
  equal."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids FluidStack]))

(defn ->fluid-stack
  "Constructor.

  fluid - `net.minecraftforge.fluids.Fluid`
  amount - `int`
  nbt - `net.minecraft.nbt.NBTTagCompound`"
  (^FluidStack [^net.minecraftforge.fluids.Fluid fluid ^Integer amount ^net.minecraft.nbt.NBTTagCompound nbt]
    (new FluidStack fluid amount nbt))
  (^FluidStack [^net.minecraftforge.fluids.Fluid fluid ^Integer amount]
    (new FluidStack fluid amount)))

(defn amount
  "Instance Field.

  type: int"
  (^Integer [^FluidStack this]
    (-> this .-amount)))

(defn tag
  "Instance Field.

  type: net.minecraft.nbt.NBTTagCompound"
  (^net.minecraft.nbt.NBTTagCompound [^FluidStack this]
    (-> this .-tag)))

(defn *load-fluid-stack-from-nbt
  "This provides a safe method for retrieving a FluidStack - if the Fluid is invalid, the stack
   will return as null.

  nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^net.minecraft.nbt.NBTTagCompound nbt]
    (FluidStack/loadFluidStackFromNBT nbt)))

(defn *are-fluid-stack-tags-equal
  "Determines if the NBT Tags are equal. Useful if the FluidIDs are known to be equal.

  stack-1 - `net.minecraftforge.fluids.FluidStack`
  stack-2 - `net.minecraftforge.fluids.FluidStack`

  returns: `boolean`"
  (^Boolean [^net.minecraftforge.fluids.FluidStack stack-1 ^net.minecraftforge.fluids.FluidStack stack-2]
    (FluidStack/areFluidStackTagsEqual stack-1 stack-2)))

(defn write-to-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^FluidStack this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.writeToNBT nbt))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^FluidStack this]
    (-> this (.getUnlocalizedName))))

(defn copy
  "returns: A copy of this FluidStack - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^FluidStack this]
    (-> this (.copy))))

(defn fluid-equal?
  "Determines if the FluidIDs and NBT Tags are equal. This does not check amounts.

  other - The FluidStack for comparison - `net.minecraftforge.fluids.FluidStack`

  returns: true if the Fluids (IDs and NBT Tags) are the same - `boolean`"
  (^Boolean [^FluidStack this ^net.minecraftforge.fluids.FluidStack other]
    (-> this (.isFluidEqual other))))

(defn get-localized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^FluidStack this]
    (-> this (.getLocalizedName))))

(defn contains-fluid
  "Determines if the Fluids are equal and this stack is larger.

  other - `net.minecraftforge.fluids.FluidStack`

  returns: true if this FluidStack contains the other FluidStack (same fluid and >= amount) - `boolean`"
  (^Boolean [^FluidStack this ^net.minecraftforge.fluids.FluidStack other]
    (-> this (.containsFluid other))))

(defn fluid-stack-identical?
  "Determines if the FluidIDs, Amounts, and NBT Tags are all equal.

  other - - the FluidStack for comparison - `net.minecraftforge.fluids.FluidStack`

  returns: true if the two FluidStacks are exactly the same - `boolean`"
  (^Boolean [^FluidStack this ^net.minecraftforge.fluids.FluidStack other]
    (-> this (.isFluidStackIdentical other))))

(defn get-fluid
  "returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^FluidStack this]
    (-> this (.getFluid))))

(defn hash-code
  "returns: `int`"
  (^Integer [^FluidStack this]
    (-> this (.hashCode))))

(defn equals
  "Default equality comparison for a FluidStack. Same functionality as isFluidEqual().

   This is included for use in data structures.

  o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^FluidStack this ^java.lang.Object o]
    (-> this (.equals o))))

