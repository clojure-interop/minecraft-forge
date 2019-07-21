(ns net.minecraft.util.LowerStringMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util LowerStringMap]))

(defn ->lower-string-map
  "Constructor."
  (^LowerStringMap []
    (new LowerStringMap )))

(defn values
  "returns: `java.util.Collection<V>`"
  (^java.util.Collection [^LowerStringMap this]
    (-> this (.values))))

(defn put-all
  "p-put-all-1 - `java.util.Map`"
  ([^LowerStringMap this ^java.util.Map p-put-all-1]
    (-> this (.putAll p-put-all-1))))

(defn put
  "p-put-1 - `java.lang.String`
  p-put-2 - `V`

  returns: `V`"
  ([^LowerStringMap this ^java.lang.String p-put-1 p-put-2]
    (-> this (.put p-put-1 p-put-2))))

(defn entry-set
  "returns: `java.util.Set<java.util.Map.Entry<java.lang.String,V>>`"
  (^java.util.Set [^LowerStringMap this]
    (-> this (.entrySet))))

(defn contains-value
  "p-contains-value-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LowerStringMap this ^java.lang.Object p-contains-value-1]
    (-> this (.containsValue p-contains-value-1))))

(defn remove
  "p-remove-1 - `java.lang.Object`

  returns: `V`"
  ([^LowerStringMap this ^java.lang.Object p-remove-1]
    (-> this (.remove p-remove-1))))

(defn key-set
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^LowerStringMap this]
    (-> this (.keySet))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^LowerStringMap this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^LowerStringMap this]
    (-> this (.size))))

(defn clear
  ""
  ([^LowerStringMap this]
    (-> this (.clear))))

(defn contains-key
  "p-contains-key-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LowerStringMap this ^java.lang.Object p-contains-key-1]
    (-> this (.containsKey p-contains-key-1))))

(defn get
  "p-get-1 - `java.lang.Object`

  returns: `V`"
  ([^LowerStringMap this ^java.lang.Object p-get-1]
    (-> this (.get p-get-1))))

