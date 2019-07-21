(ns net.minecraft.util.datafix.DataFixesManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix DataFixesManager]))

(defn ->data-fixes-manager
  "Constructor."
  (^DataFixesManager []
    (new DataFixesManager )))

(defn *create-fixer
  "returns: `net.minecraft.util.datafix.DataFixer`"
  (^net.minecraft.util.datafix.DataFixer []
    (DataFixesManager/createFixer )))

(defn *process-item-stack
  "fixer - `net.minecraft.util.datafix.IDataFixer`
  compound - `net.minecraft.nbt.NBTTagCompound`
  version - `int`
  key - `java.lang.String`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^net.minecraft.util.datafix.IDataFixer fixer ^net.minecraft.nbt.NBTTagCompound compound ^Integer version ^java.lang.String key]
    (DataFixesManager/processItemStack fixer compound version key)))

(defn *process-inventory
  "fixer - `net.minecraft.util.datafix.IDataFixer`
  compound - `net.minecraft.nbt.NBTTagCompound`
  version - `int`
  key - `java.lang.String`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^net.minecraft.util.datafix.IDataFixer fixer ^net.minecraft.nbt.NBTTagCompound compound ^Integer version ^java.lang.String key]
    (DataFixesManager/processInventory fixer compound version key)))

