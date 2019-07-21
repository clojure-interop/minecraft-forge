(ns net.minecraft.util.datafix.IFixableData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix IFixableData]))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^IFixableData this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^IFixableData this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

