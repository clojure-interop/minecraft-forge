(ns net.minecraft.command.CommandBase$CoordinateArg
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandBase$CoordinateArg]))

(defn get-result
  "returns: `double`"
  (^Double [^CommandBase$CoordinateArg this]
    (-> this (.getResult))))

(defn get-amount
  "returns: `double`"
  (^Double [^CommandBase$CoordinateArg this]
    (-> this (.getAmount))))

(defn relative?
  "returns: `boolean`"
  (^Boolean [^CommandBase$CoordinateArg this]
    (-> this (.isRelative))))

