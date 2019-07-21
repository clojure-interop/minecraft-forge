(ns net.minecraft.util.TupleIntJsonSerializable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util TupleIntJsonSerializable]))

(defn ->tuple-int-json-serializable
  "Constructor."
  (^TupleIntJsonSerializable []
    (new TupleIntJsonSerializable )))

(defn get-integer-value
  "returns: `int`"
  (^Integer [^TupleIntJsonSerializable this]
    (-> this (.getIntegerValue))))

(defn set-integer-value
  "integer-value-in - `int`"
  ([^TupleIntJsonSerializable this ^Integer integer-value-in]
    (-> this (.setIntegerValue integer-value-in))))

(defn get-json-serializable-value
  "returns: `<T extends net.minecraft.util.IJsonSerializable> T`"
  ([^TupleIntJsonSerializable this]
    (-> this (.getJsonSerializableValue))))

(defn set-json-serializable-value
  "json-serializable-value-in - `net.minecraft.util.IJsonSerializable`"
  ([^TupleIntJsonSerializable this ^net.minecraft.util.IJsonSerializable json-serializable-value-in]
    (-> this (.setJsonSerializableValue json-serializable-value-in))))

