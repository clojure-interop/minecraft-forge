(ns net.minecraft.util.datafix.fixes.ShulkerBoxEntityColor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes ShulkerBoxEntityColor]))

(defn ->shulker-box-entity-color
  "Constructor."
  (^ShulkerBoxEntityColor []
    (new ShulkerBoxEntityColor )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^ShulkerBoxEntityColor this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ShulkerBoxEntityColor this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

