(ns net.minecraft.util.registry.RegistryNamespaced
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.registry RegistryNamespaced]))

(defn ->registry-namespaced
  "Constructor."
  (^RegistryNamespaced []
    (new RegistryNamespaced )))

(defn register
  "id - `int`
  key - `K`
  value - `V`"
  ([^RegistryNamespaced this ^Integer id key value]
    (-> this (.register id key value))))

(defn get-object
  "name - `K`

  returns: `V`"
  ([^RegistryNamespaced this name]
    (-> this (.getObject name))))

(defn get-name-for-object
  "value - `V`

  returns: `K`"
  ([^RegistryNamespaced this value]
    (-> this (.getNameForObject value))))

(defn contains-key
  "key - `K`

  returns: `boolean`"
  (^Boolean [^RegistryNamespaced this key]
    (-> this (.containsKey key))))

(defn get-id-for-object
  "value - `V`

  returns: `int`"
  (^Integer [^RegistryNamespaced this value]
    (-> this (.getIDForObject value))))

(defn get-object-by-id
  "id - `int`

  returns: `V`"
  ([^RegistryNamespaced this ^Integer id]
    (-> this (.getObjectById id))))

(defn iterator
  "returns: `java.util.Iterator<V>`"
  (^java.util.Iterator [^RegistryNamespaced this]
    (-> this (.iterator))))

