(ns net.minecraft.util.math.Rotations
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.math Rotations]))

(defn ->rotations
  "Constructor.

  x - `float`
  y - `float`
  z - `float`"
  (^Rotations [^Float x ^Float y ^Float z]
    (new Rotations x y z))
  (^Rotations [^net.minecraft.nbt.NBTTagList nbt]
    (new Rotations nbt)))

(defn write-to-nbt
  "returns: `net.minecraft.nbt.NBTTagList`"
  (^net.minecraft.nbt.NBTTagList [^Rotations this]
    (-> this (.writeToNBT))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Rotations this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn get-x
  "returns: `float`"
  (^Float [^Rotations this]
    (-> this (.getX))))

(defn get-y
  "returns: `float`"
  (^Float [^Rotations this]
    (-> this (.getY))))

(defn get-z
  "returns: `float`"
  (^Float [^Rotations this]
    (-> this (.getZ))))

