(ns net.minecraft.world.WorldSavedData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world WorldSavedData]))

(defn ->world-saved-data
  "Constructor.

  name - `java.lang.String`"
  (^WorldSavedData [^java.lang.String name]
    (new WorldSavedData name)))

(defn map-name
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^WorldSavedData this]
    (-> this .-mapName)))

(defn read-from-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^WorldSavedData this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.readFromNBT nbt))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^WorldSavedData this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn mark-dirty
  ""
  ([^WorldSavedData this]
    (-> this (.markDirty))))

(defn set-dirty
  "is-dirty - `boolean`"
  ([^WorldSavedData this ^Boolean is-dirty]
    (-> this (.setDirty is-dirty))))

(defn dirty?
  "returns: `boolean`"
  (^Boolean [^WorldSavedData this]
    (-> this (.isDirty))))

(defn deserialize-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^WorldSavedData this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.deserializeNBT nbt))))

(defn serialize-nbt
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^WorldSavedData this]
    (-> this (.serializeNBT))))

