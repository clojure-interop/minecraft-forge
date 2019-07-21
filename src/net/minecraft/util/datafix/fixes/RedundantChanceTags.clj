(ns net.minecraft.util.datafix.fixes.RedundantChanceTags
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes RedundantChanceTags]))

(defn ->redundant-chance-tags
  "Constructor."
  (^RedundantChanceTags []
    (new RedundantChanceTags )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^RedundantChanceTags this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^RedundantChanceTags this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

