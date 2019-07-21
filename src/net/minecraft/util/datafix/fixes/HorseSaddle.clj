(ns net.minecraft.util.datafix.fixes.HorseSaddle
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes HorseSaddle]))

(defn ->horse-saddle
  "Constructor."
  (^HorseSaddle []
    (new HorseSaddle )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^HorseSaddle this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^HorseSaddle this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

