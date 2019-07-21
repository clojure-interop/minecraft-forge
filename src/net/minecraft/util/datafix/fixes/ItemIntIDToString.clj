(ns net.minecraft.util.datafix.fixes.ItemIntIDToString
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes ItemIntIDToString]))

(defn ->item-int-id-to-string
  "Constructor."
  (^ItemIntIDToString []
    (new ItemIntIDToString )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^ItemIntIDToString this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ItemIntIDToString this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

