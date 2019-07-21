(ns net.minecraft.tileentity.TileEntityLockable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityLockable]))

(defn ->tile-entity-lockable
  "Constructor."
  (^TileEntityLockable []
    (new TileEntityLockable )))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityLockable this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityLockable this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn locked?
  "returns: `boolean`"
  (^Boolean [^TileEntityLockable this]
    (-> this (.isLocked))))

(defn get-lock-code
  "returns: `net.minecraft.world.LockCode`"
  (^net.minecraft.world.LockCode [^TileEntityLockable this]
    (-> this (.getLockCode))))

(defn set-lock-code
  "code - `net.minecraft.world.LockCode`"
  ([^TileEntityLockable this ^net.minecraft.world.LockCode code]
    (-> this (.setLockCode code))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^TileEntityLockable this]
    (-> this (.getDisplayName))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^TileEntityLockable this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^TileEntityLockable this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

