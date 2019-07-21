(ns net.minecraft.util.datafix.fixes.MinecartEntityTypes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes MinecartEntityTypes]))

(defn ->minecart-entity-types
  "Constructor."
  (^MinecartEntityTypes []
    (new MinecartEntityTypes )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^MinecartEntityTypes this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^MinecartEntityTypes this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

