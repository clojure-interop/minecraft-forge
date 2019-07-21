(ns net.minecraft.util.registry.RegistrySimple
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.registry RegistrySimple]))

(defn ->registry-simple
  "Constructor."
  (^RegistrySimple []
    (new RegistrySimple )))

(defn get-object
  "name - `K`

  returns: `V`"
  ([^RegistrySimple this name]
    (-> this (.getObject name))))

(defn put-object
  "key - `K`
  value - `V`"
  ([^RegistrySimple this key value]
    (-> this (.putObject key value))))

(defn get-keys
  "returns: `java.util.Set<K>`"
  (^java.util.Set [^RegistrySimple this]
    (-> this (.getKeys))))

(defn get-random-object
  "random - `java.util.Random`

  returns: `V`"
  ([^RegistrySimple this ^java.util.Random random]
    (-> this (.getRandomObject random))))

(defn contains-key
  "key - `K`

  returns: `boolean`"
  (^Boolean [^RegistrySimple this key]
    (-> this (.containsKey key))))

(defn iterator
  "returns: `java.util.Iterator<V>`"
  (^java.util.Iterator [^RegistrySimple this]
    (-> this (.iterator))))

