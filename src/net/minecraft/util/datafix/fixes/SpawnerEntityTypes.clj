(ns net.minecraft.util.datafix.fixes.SpawnerEntityTypes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes SpawnerEntityTypes]))

(defn ->spawner-entity-types
  "Constructor."
  (^SpawnerEntityTypes []
    (new SpawnerEntityTypes )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^SpawnerEntityTypes this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^SpawnerEntityTypes this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

