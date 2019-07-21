(ns net.minecraft.util.datafix.fixes.TileEntityId
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes TileEntityId]))

(defn ->tile-entity-id
  "Constructor."
  (^TileEntityId []
    (new TileEntityId )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^TileEntityId this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityId this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

