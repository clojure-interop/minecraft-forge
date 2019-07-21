(ns net.minecraft.util.datafix.fixes.RidingToPassengers
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes RidingToPassengers]))

(defn ->riding-to-passengers
  "Constructor."
  (^RidingToPassengers []
    (new RidingToPassengers )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^RidingToPassengers this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^RidingToPassengers this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

