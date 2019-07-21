(ns net.minecraft.util.datafix.fixes.SkeletonSplit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes SkeletonSplit]))

(defn ->skeleton-split
  "Constructor."
  (^SkeletonSplit []
    (new SkeletonSplit )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^SkeletonSplit this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^SkeletonSplit this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

