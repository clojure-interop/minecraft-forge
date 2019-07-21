(ns net.minecraft.util.datafix.fixes.ArmorStandSilent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes ArmorStandSilent]))

(defn ->armor-stand-silent
  "Constructor."
  (^ArmorStandSilent []
    (new ArmorStandSilent )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^ArmorStandSilent this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ArmorStandSilent this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

