(ns net.minecraft.util.datafix.walkers.EntityTag
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.walkers EntityTag]))

(defn ->entity-tag
  "Constructor."
  (^EntityTag []
    (new EntityTag )))

(defn process
  "fixer - `net.minecraft.util.datafix.IDataFixer`
  compound - `net.minecraft.nbt.NBTTagCompound`
  version-in - `int`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^EntityTag this ^net.minecraft.util.datafix.IDataFixer fixer ^net.minecraft.nbt.NBTTagCompound compound ^Integer version-in]
    (-> this (.process fixer compound version-in))))

