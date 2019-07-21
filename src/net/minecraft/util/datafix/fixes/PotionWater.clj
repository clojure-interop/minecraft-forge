(ns net.minecraft.util.datafix.fixes.PotionWater
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes PotionWater]))

(defn ->potion-water
  "Constructor."
  (^PotionWater []
    (new PotionWater )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^PotionWater this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^PotionWater this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

