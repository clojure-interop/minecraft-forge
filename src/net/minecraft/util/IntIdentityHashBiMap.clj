(ns net.minecraft.util.IntIdentityHashBiMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util IntIdentityHashBiMap]))

(defn ->int-identity-hash-bi-map
  "Constructor.

  initial-capacity - `int`"
  (^IntIdentityHashBiMap [^Integer initial-capacity]
    (new IntIdentityHashBiMap initial-capacity)))

(defn get-id
  "p-186815-1 - `K`

  returns: `int`"
  (^Integer [^IntIdentityHashBiMap this p-186815-1]
    (-> this (.getId p-186815-1))))

(defn get
  "id-in - `int`

  returns: `K`"
  ([^IntIdentityHashBiMap this ^Integer id-in]
    (-> this (.get id-in))))

(defn add
  "object-in - `K`

  returns: `int`"
  (^Integer [^IntIdentityHashBiMap this object-in]
    (-> this (.add object-in))))

(defn put
  "object-in - `K`
  int-key - `int`"
  ([^IntIdentityHashBiMap this object-in ^Integer int-key]
    (-> this (.put object-in int-key))))

(defn iterator
  "returns: `java.util.Iterator<K>`"
  (^java.util.Iterator [^IntIdentityHashBiMap this]
    (-> this (.iterator))))

(defn clear
  ""
  ([^IntIdentityHashBiMap this]
    (-> this (.clear))))

(defn size
  "returns: `int`"
  (^Integer [^IntIdentityHashBiMap this]
    (-> this (.size))))

