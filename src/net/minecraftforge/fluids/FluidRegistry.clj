(ns net.minecraftforge.fluids.FluidRegistry
  "Handles Fluid registrations. Fluids MUST be registered in order to function."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids FluidRegistry]))

(def *-water
  "Static Constant.

  type: net.minecraftforge.fluids.Fluid"
  FluidRegistry/WATER)

(def *-lava
  "Static Constant.

  type: net.minecraftforge.fluids.Fluid"
  FluidRegistry/LAVA)

(defn *get-default-fluid-name
  "key - `net.minecraftforge.fluids.Fluid`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraftforge.fluids.Fluid key]
    (FluidRegistry/getDefaultFluidName key)))

(defn *add-bucket-for-fluid
  "Registers a fluid with the universal bucket.
   This only has an effect if the universal bucket is enabled.

  fluid - The fluid that the bucket shall be able to hold - `net.minecraftforge.fluids.Fluid`

  returns: True if the fluid was added successfully, false if it already was registered or couldn't be registered with the bucket. - `boolean`"
  (^Boolean [^net.minecraftforge.fluids.Fluid fluid]
    (FluidRegistry/addBucketForFluid fluid)))

(defn *get-max-id
  "returns: `int`"
  (^Integer []
    (FluidRegistry/getMaxID )))

(defn *enable-universal-bucket
  "Enables the universal bucket in forge.
   Has to be called before pre-initialization.
   Actually just call it statically in your mod class."
  ([]
    (FluidRegistry/enableUniversalBucket )))

(defn *fluid-default?
  "Is the supplied fluid the current default fluid for it's name

  fluid - the fluid we're testing - `net.minecraftforge.fluids.Fluid`

  returns: if the fluid is default - `boolean`"
  (^Boolean [^net.minecraftforge.fluids.Fluid fluid]
    (FluidRegistry/isFluidDefault fluid)))

(defn *register-fluid
  "Register a new Fluid. If a fluid with the same name already exists, registration the alternative fluid is tracked
   in case it is the default in another place

  fluid - The fluid to register. - `net.minecraftforge.fluids.Fluid`

  returns: True if the fluid was registered as the current default fluid, false if it was only registered as an alternative - `boolean`"
  (^Boolean [^net.minecraftforge.fluids.Fluid fluid]
    (FluidRegistry/registerFluid fluid)))

(defn *write-default-fluid-list
  "forge-data - `net.minecraft.nbt.NBTTagCompound`"
  ([^net.minecraft.nbt.NBTTagCompound forge-data]
    (FluidRegistry/writeDefaultFluidList forge-data)))

(defn *init-fluid-i-ds
  "Called by Forge to prepare the ID map for server -> client sync.
   Modders, DO NOT call this.

  newfluid-i-ds - `com.google.common.collect.BiMap`
  default-names - `java.util.Set`"
  ([^com.google.common.collect.BiMap newfluid-i-ds ^java.util.Set default-names]
    (FluidRegistry/initFluidIDs newfluid-i-ds default-names)))

(defn *get-fluid-stack
  "fluid-name - `java.lang.String`
  amount - `int`

  returns: `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^java.lang.String fluid-name ^Integer amount]
    (FluidRegistry/getFluidStack fluid-name amount)))

(defn *lookup-fluid-for-block
  "block - `net.minecraft.block.Block`

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^net.minecraft.block.Block block]
    (FluidRegistry/lookupFluidForBlock block)))

(defn *validate-fluid-registry
  ""
  ([]
    (FluidRegistry/validateFluidRegistry )))

(defn *fluid-registered?
  "Does the supplied fluid have an entry for it's name (whether or not the fluid itself is default)

  fluid - the fluid we're testing - `net.minecraftforge.fluids.Fluid`

  returns: if the fluid's name has a registration entry - `boolean`"
  (^Boolean [^net.minecraftforge.fluids.Fluid fluid]
    (FluidRegistry/isFluidRegistered fluid)))

(defn *get-registered-fluid-i-ds
  "Deprecated.

  returns: `java.util.Map<net.minecraftforge.fluids.Fluid,java.lang.Integer>`"
  (^java.util.Map []
    (FluidRegistry/getRegisteredFluidIDs )))

(defn *get-fluid
  "fluid-name - `java.lang.String`

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^java.lang.String fluid-name]
    (FluidRegistry/getFluid fluid-name)))

(defn *universal-bucket-enabled?
  "returns: `boolean`"
  (^Boolean []
    (FluidRegistry/isUniversalBucketEnabled )))

(defn *get-fluid-name
  "fluid - `net.minecraftforge.fluids.Fluid`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraftforge.fluids.Fluid fluid]
    (FluidRegistry/getFluidName fluid)))

(defn *get-registered-fluids
  "Returns a read-only map containing Fluid Names and their associated Fluids.

  returns: `java.util.Map<java.lang.String,net.minecraftforge.fluids.Fluid>`"
  (^java.util.Map []
    (FluidRegistry/getRegisteredFluids )))

(defn *load-fluid-defaults
  "tag - `net.minecraft.nbt.NBTTagCompound`"
  ([^net.minecraft.nbt.NBTTagCompound tag]
    (FluidRegistry/loadFluidDefaults tag)))

(defn *get-bucket-fluids
  "All fluids registered with the universal bucket

  returns: An immutable set containing the fluids - `java.util.Set<net.minecraftforge.fluids.Fluid>`"
  (^java.util.Set []
    (FluidRegistry/getBucketFluids )))

