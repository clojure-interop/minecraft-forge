(ns net.minecraft.util.datafix.IDataFixer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix IDataFixer]))

(defn process
  "type - `net.minecraft.util.datafix.IFixType`
  compound - `net.minecraft.nbt.NBTTagCompound`
  version-in - `int`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^IDataFixer this ^net.minecraft.util.datafix.IFixType type ^net.minecraft.nbt.NBTTagCompound compound ^Integer version-in]
    (-> this (.process type compound version-in))))

