(ns net.minecraft.client.util.JsonException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.util JsonException]))

(defn ->json-exception
  "Constructor.

  message-in - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^JsonException [^java.lang.String message-in ^java.lang.Throwable cause]
    (new JsonException message-in cause))
  (^JsonException [^java.lang.String message-in]
    (new JsonException message-in)))

(defn *for-exception
  "p-151379-0 - `java.lang.Exception`

  returns: `net.minecraft.client.util.JsonException`"
  (^net.minecraft.client.util.JsonException [^java.lang.Exception p-151379-0]
    (JsonException/forException p-151379-0)))

(defn prepend-json-key
  "p-151380-1 - `java.lang.String`"
  ([^JsonException this ^java.lang.String p-151380-1]
    (-> this (.prependJsonKey p-151380-1))))

(defn set-filename-and-flush
  "p-151381-1 - `java.lang.String`"
  ([^JsonException this ^java.lang.String p-151381-1]
    (-> this (.setFilenameAndFlush p-151381-1))))

(defn get-message
  "returns: `java.lang.String`"
  (^java.lang.String [^JsonException this]
    (-> this (.getMessage))))

