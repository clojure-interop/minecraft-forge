(ns net.minecraft.util.datafix.fixes.HorseSplit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes HorseSplit]))

(defn ->horse-split
  "Constructor."
  (^HorseSplit []
    (new HorseSplit )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^HorseSplit this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^HorseSplit this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

