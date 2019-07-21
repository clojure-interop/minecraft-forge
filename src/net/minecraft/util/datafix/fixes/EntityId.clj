(ns net.minecraft.util.datafix.fixes.EntityId
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes EntityId]))

(defn ->entity-id
  "Constructor."
  (^EntityId []
    (new EntityId )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^EntityId this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^EntityId this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

