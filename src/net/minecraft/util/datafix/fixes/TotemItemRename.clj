(ns net.minecraft.util.datafix.fixes.TotemItemRename
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes TotemItemRename]))

(defn ->totem-item-rename
  "Constructor."
  (^TotemItemRename []
    (new TotemItemRename )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^TotemItemRename this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TotemItemRename this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

