(ns net.minecraft.util.ObjectIntIdentityMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util ObjectIntIdentityMap]))

(defn ->object-int-identity-map
  "Constructor.

  expected-size - `int`"
  (^ObjectIntIdentityMap [^Integer expected-size]
    (new ObjectIntIdentityMap expected-size))
  (^ObjectIntIdentityMap []
    (new ObjectIntIdentityMap )))

(defn put
  "key - `T`
  value - `int`"
  ([^ObjectIntIdentityMap this key ^Integer value]
    (-> this (.put key value))))

(defn get
  "key - `T`

  returns: `int`"
  (^Integer [^ObjectIntIdentityMap this key]
    (-> this (.get key))))

(defn get-by-value
  "value - `int`

  returns: `T`"
  ([^ObjectIntIdentityMap this ^Integer value]
    (-> this (.getByValue value))))

(defn iterator
  "returns: `java.util.Iterator<T>`"
  (^java.util.Iterator [^ObjectIntIdentityMap this]
    (-> this (.iterator))))

(defn size
  "returns: `int`"
  (^Integer [^ObjectIntIdentityMap this]
    (-> this (.size))))

