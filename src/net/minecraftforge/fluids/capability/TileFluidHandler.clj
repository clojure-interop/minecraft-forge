(ns net.minecraftforge.fluids.capability.TileFluidHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability TileFluidHandler]))

(defn ->tile-fluid-handler
  "Constructor."
  (^TileFluidHandler []
    (new TileFluidHandler )))

(defn read-from-nbt
  "tag - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileFluidHandler this ^net.minecraft.nbt.NBTTagCompound tag]
    (-> this (.readFromNBT tag))))

(defn write-to-nbt
  "tag - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileFluidHandler this ^net.minecraft.nbt.NBTTagCompound tag]
    (-> this (.writeToNBT tag))))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^TileFluidHandler this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^TileFluidHandler this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

