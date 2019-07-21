(ns net.minecraft.world.LockCode
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world LockCode]))

(defn ->lock-code
  "Constructor.

  code - `java.lang.String`"
  (^LockCode [^java.lang.String code]
    (new LockCode code)))

(def *-empty-code
  "Static Constant.

  type: net.minecraft.world.LockCode"
  LockCode/EMPTY_CODE)

(defn *from-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.world.LockCode`"
  (^net.minecraft.world.LockCode [^net.minecraft.nbt.NBTTagCompound nbt]
    (LockCode/fromNBT nbt)))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^LockCode this]
    (-> this (.isEmpty))))

(defn get-lock
  "returns: `java.lang.String`"
  (^java.lang.String [^LockCode this]
    (-> this (.getLock))))

(defn to-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^LockCode this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.toNBT nbt))))

