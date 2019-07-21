(ns net.minecraft.util.datafix.fixes.CookedFishIDTypo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes CookedFishIDTypo]))

(defn ->cooked-fish-id-typo
  "Constructor."
  (^CookedFishIDTypo []
    (new CookedFishIDTypo )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^CookedFishIDTypo this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^CookedFishIDTypo this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

