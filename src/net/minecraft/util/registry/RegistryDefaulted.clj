(ns net.minecraft.util.registry.RegistryDefaulted
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.registry RegistryDefaulted]))

(defn ->registry-defaulted
  "Constructor.

  default-object-in - `V`"
  (^RegistryDefaulted [default-object-in]
    (new RegistryDefaulted default-object-in)))

(defn get-object
  "name - `K`

  returns: `V`"
  ([^RegistryDefaulted this name]
    (-> this (.getObject name))))

