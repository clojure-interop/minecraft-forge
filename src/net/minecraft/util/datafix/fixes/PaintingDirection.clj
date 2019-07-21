(ns net.minecraft.util.datafix.fixes.PaintingDirection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes PaintingDirection]))

(defn ->painting-direction
  "Constructor."
  (^PaintingDirection []
    (new PaintingDirection )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^PaintingDirection this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^PaintingDirection this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

