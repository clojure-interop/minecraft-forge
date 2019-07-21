(ns net.minecraft.util.datafix.fixes.ForceVBOOn
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes ForceVBOOn]))

(defn ->force-vbo-on
  "Constructor."
  (^ForceVBOOn []
    (new ForceVBOOn )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^ForceVBOOn this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ForceVBOOn this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

