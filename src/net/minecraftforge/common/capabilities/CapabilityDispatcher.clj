(ns net.minecraftforge.common.capabilities.CapabilityDispatcher
  "A high-speed implementation of a capability delegator.
  This is used to wrap the results of the AttachCapabilitiesEvent.
  It is HIGHLY recommended that you DO NOT use this approach unless
  you MUST delegate to multiple providers instead just implement y
  our handlers using normal if statements.

  Internally the handlers are baked into arrays for fast iteration.
  The ResourceLocations will be used for the NBT Key when serializing."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.capabilities CapabilityDispatcher]))

(defn ->capability-dispatcher
  "Constructor.

  list - `java.util.Map`
  parent - `net.minecraftforge.common.capabilities.ICapabilityProvider`"
  (^CapabilityDispatcher [^java.util.Map list ^net.minecraftforge.common.capabilities.ICapabilityProvider parent]
    (new CapabilityDispatcher list parent))
  (^CapabilityDispatcher [^java.util.Map list]
    (new CapabilityDispatcher list)))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^CapabilityDispatcher this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^CapabilityDispatcher this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn serialize-nbt
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^CapabilityDispatcher this]
    (-> this (.serializeNBT))))

(defn deserialize-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^CapabilityDispatcher this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.deserializeNBT nbt))))

(defn are-compatible
  "other - `net.minecraftforge.common.capabilities.CapabilityDispatcher`

  returns: `boolean`"
  (^Boolean [^CapabilityDispatcher this ^net.minecraftforge.common.capabilities.CapabilityDispatcher other]
    (-> this (.areCompatible other))))

