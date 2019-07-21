(ns net.minecraft.world.ILockableContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world ILockableContainer]))

(defn locked?
  "returns: `boolean`"
  (^Boolean [^ILockableContainer this]
    (-> this (.isLocked))))

(defn set-lock-code
  "code - `net.minecraft.world.LockCode`"
  ([^ILockableContainer this ^net.minecraft.world.LockCode code]
    (-> this (.setLockCode code))))

(defn get-lock-code
  "returns: `net.minecraft.world.LockCode`"
  (^net.minecraft.world.LockCode [^ILockableContainer this]
    (-> this (.getLockCode))))

