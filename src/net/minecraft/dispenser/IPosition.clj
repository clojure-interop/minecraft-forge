(ns net.minecraft.dispenser.IPosition
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.dispenser IPosition]))

(defn get-x
  "returns: `double`"
  (^Double [^IPosition this]
    (-> this (.getX))))

(defn get-y
  "returns: `double`"
  (^Double [^IPosition this]
    (-> this (.getY))))

(defn get-z
  "returns: `double`"
  (^Double [^IPosition this]
    (-> this (.getZ))))

