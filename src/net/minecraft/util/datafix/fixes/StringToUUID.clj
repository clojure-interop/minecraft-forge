(ns net.minecraft.util.datafix.fixes.StringToUUID
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes StringToUUID]))

(defn ->string-to-uuid
  "Constructor."
  (^StringToUUID []
    (new StringToUUID )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^StringToUUID this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^StringToUUID this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

