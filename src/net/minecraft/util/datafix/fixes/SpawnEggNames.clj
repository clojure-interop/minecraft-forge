(ns net.minecraft.util.datafix.fixes.SpawnEggNames
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes SpawnEggNames]))

(defn ->spawn-egg-names
  "Constructor."
  (^SpawnEggNames []
    (new SpawnEggNames )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^SpawnEggNames this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^SpawnEggNames this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

