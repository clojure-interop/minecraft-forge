(ns net.minecraftforge.common.capabilities.ICapabilityProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.capabilities ICapabilityProvider]))

(defn has-capability?
  "Determines if this object has support for the capability in question on the specific side.
   The return value of this MIGHT change during runtime if this object gains or looses support
   for a capability.

   Example:
     A Pipe getting a cover placed on one side causing it loose the Inventory attachment function for that side.

   This is a light weight version of getCapability, intended for metadata uses.

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^ICapabilityProvider this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn get-capability
  "Retrieves the handler for the capability requested on the specific side.
   The return value CAN be null if the object does not support the capability.
   The return value CAN be the same for multiple faces.

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^ICapabilityProvider this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

