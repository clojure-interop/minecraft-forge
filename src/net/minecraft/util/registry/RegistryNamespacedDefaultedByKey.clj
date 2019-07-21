(ns net.minecraft.util.registry.RegistryNamespacedDefaultedByKey
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.registry RegistryNamespacedDefaultedByKey]))

(defn ->registry-namespaced-defaulted-by-key
  "Constructor.

  default-value-key-in - `K`"
  (^RegistryNamespacedDefaultedByKey [default-value-key-in]
    (new RegistryNamespacedDefaultedByKey default-value-key-in)))

(defn get-name-for-object
  "value - `V`

  returns: `K`"
  ([^RegistryNamespacedDefaultedByKey this value]
    (-> this (.getNameForObject value))))

(defn get-random-object
  "random - `java.util.Random`

  returns: `V`"
  ([^RegistryNamespacedDefaultedByKey this ^java.util.Random random]
    (-> this (.getRandomObject random))))

(defn get-object
  "name - `K`

  returns: `V`"
  ([^RegistryNamespacedDefaultedByKey this name]
    (-> this (.getObject name))))

(defn validate-key
  ""
  ([^RegistryNamespacedDefaultedByKey this]
    (-> this (.validateKey))))

(defn get-object-by-id-bypass
  "id - `int`

  returns: `V`"
  ([^RegistryNamespacedDefaultedByKey this ^Integer id]
    (-> this (.getObjectByIdBypass id))))

(defn get-name-for-object-bypass
  "value - `V`

  returns: `K`"
  ([^RegistryNamespacedDefaultedByKey this value]
    (-> this (.getNameForObjectBypass value))))

(defn register
  "id - `int`
  key - `K`
  value - `V`"
  ([^RegistryNamespacedDefaultedByKey this ^Integer id key value]
    (-> this (.register id key value))))

(defn get-object-bypass
  "name - `K`

  returns: `V`"
  ([^RegistryNamespacedDefaultedByKey this name]
    (-> this (.getObjectBypass name))))

(defn get-id-for-object-bypass
  "bypass - `V`

  returns: `int`"
  (^Integer [^RegistryNamespacedDefaultedByKey this bypass]
    (-> this (.getIDForObjectBypass bypass))))

(defn get-object-by-id
  "id - `int`

  returns: `V`"
  ([^RegistryNamespacedDefaultedByKey this ^Integer id]
    (-> this (.getObjectById id))))

(defn get-id-for-object
  "value - `V`

  returns: `int`"
  (^Integer [^RegistryNamespacedDefaultedByKey this value]
    (-> this (.getIDForObject value))))

