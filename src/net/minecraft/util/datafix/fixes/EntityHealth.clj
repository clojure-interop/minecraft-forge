(ns net.minecraft.util.datafix.fixes.EntityHealth
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes EntityHealth]))

(defn ->entity-health
  "Constructor."
  (^EntityHealth []
    (new EntityHealth )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^EntityHealth this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^EntityHealth this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

