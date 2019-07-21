(ns net.minecraftforge.fml.common.network.NetworkRegistry$TargetPoint
  "Represents a target point for the ALLROUNDPOINT target."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network NetworkRegistry$TargetPoint]))

(defn ->target-point
  "Constructor.

  A target point

  dimension - The dimension to target - `int`
  x - The X coordinate - `double`
  y - The Y coordinate - `double`
  z - The Z coordinate - `double`
  range - The range - `double`"
  (^NetworkRegistry$TargetPoint [^Integer dimension ^Double x ^Double y ^Double z ^Double range]
    (new NetworkRegistry$TargetPoint dimension x y z range)))

(defn x
  "Instance Constant.

  type: double"
  (^Double [^NetworkRegistry$TargetPoint this]
    (-> this .-x)))

(defn y
  "Instance Constant.

  type: double"
  (^Double [^NetworkRegistry$TargetPoint this]
    (-> this .-y)))

(defn z
  "Instance Constant.

  type: double"
  (^Double [^NetworkRegistry$TargetPoint this]
    (-> this .-z)))

(defn range
  "Instance Constant.

  type: double"
  (^Double [^NetworkRegistry$TargetPoint this]
    (-> this .-range)))

(defn dimension
  "Instance Constant.

  type: int"
  (^Integer [^NetworkRegistry$TargetPoint this]
    (-> this .-dimension)))

