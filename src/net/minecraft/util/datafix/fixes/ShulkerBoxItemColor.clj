(ns net.minecraft.util.datafix.fixes.ShulkerBoxItemColor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes ShulkerBoxItemColor]))

(defn ->shulker-box-item-color
  "Constructor."
  (^ShulkerBoxItemColor []
    (new ShulkerBoxItemColor )))

(def *-names-by-color
  "Static Constant.

  type: java.lang.String[]"
  ShulkerBoxItemColor/NAMES_BY_COLOR)

(defn get-fix-version
  "returns: `int`"
  (^Integer [^ShulkerBoxItemColor this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ShulkerBoxItemColor this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

