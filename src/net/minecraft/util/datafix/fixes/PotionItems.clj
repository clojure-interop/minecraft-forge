(ns net.minecraft.util.datafix.fixes.PotionItems
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes PotionItems]))

(defn ->potion-items
  "Constructor."
  (^PotionItems []
    (new PotionItems )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^PotionItems this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^PotionItems this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

