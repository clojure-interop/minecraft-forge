(ns net.minecraft.util.datafix.fixes.ElderGuardianSplit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes ElderGuardianSplit]))

(defn ->elder-guardian-split
  "Constructor."
  (^ElderGuardianSplit []
    (new ElderGuardianSplit )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^ElderGuardianSplit this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ElderGuardianSplit this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

