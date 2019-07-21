(ns net.minecraft.network.datasync.DataParameter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.datasync DataParameter]))

(defn ->data-parameter
  "Constructor.

  id-in - `int`
  serializer-in - `net.minecraft.network.datasync.DataSerializer`"
  (^DataParameter [^Integer id-in ^net.minecraft.network.datasync.DataSerializer serializer-in]
    (new DataParameter id-in serializer-in)))

(defn get-id
  "returns: `int`"
  (^Integer [^DataParameter this]
    (-> this (.getId))))

(defn get-serializer
  "returns: `net.minecraft.network.datasync.DataSerializer<T>`"
  (^net.minecraft.network.datasync.DataSerializer [^DataParameter this]
    (-> this (.getSerializer))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DataParameter this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DataParameter this]
    (-> this (.hashCode))))

