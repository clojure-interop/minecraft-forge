(ns net.minecraftforge.common.model.animation.CapabilityAnimation$DefaultItemAnimationCapabilityProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation CapabilityAnimation$DefaultItemAnimationCapabilityProvider]))

(defn ->default-item-animation-capability-provider
  "Constructor.

  asm - `net.minecraftforge.common.model.animation.IAnimationStateMachine`"
  (^CapabilityAnimation$DefaultItemAnimationCapabilityProvider [^net.minecraftforge.common.model.animation.IAnimationStateMachine asm]
    (new CapabilityAnimation$DefaultItemAnimationCapabilityProvider asm)))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^CapabilityAnimation$DefaultItemAnimationCapabilityProvider this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^CapabilityAnimation$DefaultItemAnimationCapabilityProvider this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

