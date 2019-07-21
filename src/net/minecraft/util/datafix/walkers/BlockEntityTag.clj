(ns net.minecraft.util.datafix.walkers.BlockEntityTag
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.walkers BlockEntityTag]))

(defn ->block-entity-tag
  "Constructor."
  (^BlockEntityTag []
    (new BlockEntityTag )))

(defn process
  "fixer - `net.minecraft.util.datafix.IDataFixer`
  compound - `net.minecraft.nbt.NBTTagCompound`
  version-in - `int`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^BlockEntityTag this ^net.minecraft.util.datafix.IDataFixer fixer ^net.minecraft.nbt.NBTTagCompound compound ^Integer version-in]
    (-> this (.process fixer compound version-in))))

