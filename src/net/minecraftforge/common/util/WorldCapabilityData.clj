(ns net.minecraftforge.common.util.WorldCapabilityData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.util WorldCapabilityData]))

(defn ->world-capability-data
  "Constructor.

  name - `java.lang.String`"
  (^WorldCapabilityData [^java.lang.String name]
    (new WorldCapabilityData name)))

(def *-id
  "Static Constant.

  type: java.lang.String"
  WorldCapabilityData/ID)

(defn read-from-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^WorldCapabilityData this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.readFromNBT nbt))))

(defn write-to-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^WorldCapabilityData this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.writeToNBT nbt))))

(defn dirty?
  "returns: `boolean`"
  (^Boolean [^WorldCapabilityData this]
    (-> this (.isDirty))))

(defn set-capabilities
  "provider - `net.minecraft.world.WorldProvider`
  capabilities - `net.minecraftforge.common.util.INBTSerializable`"
  ([^WorldCapabilityData this ^net.minecraft.world.WorldProvider provider ^net.minecraftforge.common.util.INBTSerializable capabilities]
    (-> this (.setCapabilities provider capabilities))))

