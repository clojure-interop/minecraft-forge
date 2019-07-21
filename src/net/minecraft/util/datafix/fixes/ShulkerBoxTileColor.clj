(ns net.minecraft.util.datafix.fixes.ShulkerBoxTileColor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes ShulkerBoxTileColor]))

(defn ->shulker-box-tile-color
  "Constructor."
  (^ShulkerBoxTileColor []
    (new ShulkerBoxTileColor )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^ShulkerBoxTileColor this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ShulkerBoxTileColor this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

