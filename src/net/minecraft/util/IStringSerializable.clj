(ns net.minecraft.util.IStringSerializable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util IStringSerializable]))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^IStringSerializable this]
    (-> this (.getName))))

