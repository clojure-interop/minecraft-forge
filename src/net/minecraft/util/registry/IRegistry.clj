(ns net.minecraft.util.registry.IRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.registry IRegistry]))

(defn get-object
  "name - `K`

  returns: `V`"
  ([^IRegistry this name]
    (-> this (.getObject name))))

(defn put-object
  "key - `K`
  value - `V`"
  ([^IRegistry this key value]
    (-> this (.putObject key value))))

(defn get-keys
  "returns: `java.util.Set<K>`"
  (^java.util.Set [^IRegistry this]
    (-> this (.getKeys))))

