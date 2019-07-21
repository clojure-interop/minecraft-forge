(ns net.minecraft.util.datafix.fixes.ZombieProfToType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes ZombieProfToType]))

(defn ->zombie-prof-to-type
  "Constructor."
  (^ZombieProfToType []
    (new ZombieProfToType )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^ZombieProfToType this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ZombieProfToType this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

