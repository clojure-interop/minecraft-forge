(ns net.minecraft.util.datafix.fixes.ZombieSplit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes ZombieSplit]))

(defn ->zombie-split
  "Constructor."
  (^ZombieSplit []
    (new ZombieSplit )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^ZombieSplit this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ZombieSplit this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

