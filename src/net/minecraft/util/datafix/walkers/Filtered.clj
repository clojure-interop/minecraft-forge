(ns net.minecraft.util.datafix.walkers.Filtered
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.walkers Filtered]))

(defn ->filtered
  "Constructor.

  p-i-47309-1 - `java.lang.Class`"
  (^Filtered [^java.lang.Class p-i-47309-1]
    (new Filtered p-i-47309-1)))

(defn process
  "fixer - `net.minecraft.util.datafix.IDataFixer`
  compound - `net.minecraft.nbt.NBTTagCompound`
  version-in - `int`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^Filtered this ^net.minecraft.util.datafix.IDataFixer fixer ^net.minecraft.nbt.NBTTagCompound compound ^Integer version-in]
    (-> this (.process fixer compound version-in))))

