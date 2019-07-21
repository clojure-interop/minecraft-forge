(ns net.minecraft.client.util.JsonBlendingMode
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.util JsonBlendingMode]))

(defn ->json-blending-mode
  "Constructor.

  p-i-45086-1 - `int`
  p-i-45086-2 - `int`
  p-i-45086-3 - `int`
  p-i-45086-4 - `int`
  p-i-45086-5 - `int`"
  (^JsonBlendingMode [^Integer p-i-45086-1 ^Integer p-i-45086-2 ^Integer p-i-45086-3 ^Integer p-i-45086-4 ^Integer p-i-45086-5]
    (new JsonBlendingMode p-i-45086-1 p-i-45086-2 p-i-45086-3 p-i-45086-4 p-i-45086-5))
  (^JsonBlendingMode [^Integer src-factor ^Integer dst-factor ^Integer blend-function-in]
    (new JsonBlendingMode src-factor dst-factor blend-function-in))
  (^JsonBlendingMode []
    (new JsonBlendingMode )))

(defn *parse-blend-node
  "json - `com.google.gson.JsonObject`

  returns: `net.minecraft.client.util.JsonBlendingMode`"
  (^net.minecraft.client.util.JsonBlendingMode [^com.google.gson.JsonObject json]
    (JsonBlendingMode/parseBlendNode json)))

(defn apply
  ""
  ([^JsonBlendingMode this]
    (-> this (.apply))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^JsonBlendingMode this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^JsonBlendingMode this]
    (-> this (.hashCode))))

(defn opaque?
  "returns: `boolean`"
  (^Boolean [^JsonBlendingMode this]
    (-> this (.isOpaque))))

