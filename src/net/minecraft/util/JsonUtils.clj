(ns net.minecraft.util.JsonUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util JsonUtils]))

(defn ->json-utils
  "Constructor."
  (^JsonUtils []
    (new JsonUtils )))

(defn *number?
  "json - `com.google.gson.JsonElement`

  returns: `boolean`"
  (^Boolean [^com.google.gson.JsonElement json]
    (JsonUtils/isNumber json)))

(defn *get-item
  "json - `com.google.gson.JsonElement`
  member-name - `java.lang.String`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^com.google.gson.JsonElement json ^java.lang.String member-name]
    (JsonUtils/getItem json member-name)))

(defn *get-json-array
  "json - `com.google.gson.JsonObject`
  member-name - `java.lang.String`
  fallback - `com.google.gson.JsonArray`

  returns: `com.google.gson.JsonArray`"
  (^com.google.gson.JsonArray [^com.google.gson.JsonObject json ^java.lang.String member-name ^com.google.gson.JsonArray fallback]
    (JsonUtils/getJsonArray json member-name fallback))
  (^com.google.gson.JsonArray [^com.google.gson.JsonElement json ^java.lang.String member-name]
    (JsonUtils/getJsonArray json member-name)))

(defn *gson-deserialize
  "gson-in - `com.google.gson.Gson`
  reader-in - `java.io.Reader`
  adapter - `java.lang.Class`
  lenient - `boolean`

  returns: `<T> T`"
  ([^com.google.gson.Gson gson-in ^java.io.Reader reader-in ^java.lang.Class adapter ^Boolean lenient]
    (JsonUtils/gsonDeserialize gson-in reader-in adapter lenient))
  ([^com.google.gson.Gson gson-in ^java.lang.String json ^java.lang.Class adapter]
    (JsonUtils/gsonDeserialize gson-in json adapter)))

(defn *get-json-object
  "json - `com.google.gson.JsonObject`
  member-name - `java.lang.String`
  fallback - `com.google.gson.JsonObject`

  returns: `com.google.gson.JsonObject`"
  (^com.google.gson.JsonObject [^com.google.gson.JsonObject json ^java.lang.String member-name ^com.google.gson.JsonObject fallback]
    (JsonUtils/getJsonObject json member-name fallback))
  (^com.google.gson.JsonObject [^com.google.gson.JsonElement json ^java.lang.String member-name]
    (JsonUtils/getJsonObject json member-name)))

(defn *get-string
  "json - `com.google.gson.JsonObject`
  member-name - `java.lang.String`
  fallback - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^com.google.gson.JsonObject json ^java.lang.String member-name ^java.lang.String fallback]
    (JsonUtils/getString json member-name fallback))
  (^java.lang.String [^com.google.gson.JsonElement json ^java.lang.String member-name]
    (JsonUtils/getString json member-name)))

(defn *to-string
  "json - `com.google.gson.JsonElement`

  returns: `java.lang.String`"
  (^java.lang.String [^com.google.gson.JsonElement json]
    (JsonUtils/toString json)))

(defn *get-int
  "json - `com.google.gson.JsonObject`
  member-name - `java.lang.String`
  fallback - `int`

  returns: `int`"
  (^Integer [^com.google.gson.JsonObject json ^java.lang.String member-name ^Integer fallback]
    (JsonUtils/getInt json member-name fallback))
  (^Integer [^com.google.gson.JsonElement json ^java.lang.String member-name]
    (JsonUtils/getInt json member-name)))

(defn *has-field?
  "json - `com.google.gson.JsonObject`
  member-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^com.google.gson.JsonObject json ^java.lang.String member-name]
    (JsonUtils/hasField json member-name)))

(defn *json-primitive?
  "json - `com.google.gson.JsonObject`
  member-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^com.google.gson.JsonObject json ^java.lang.String member-name]
    (JsonUtils/isJsonPrimitive json member-name)))

(defn *get-boolean?
  "json - `com.google.gson.JsonObject`
  member-name - `java.lang.String`
  fallback - `boolean`

  returns: `boolean`"
  (^Boolean [^com.google.gson.JsonObject json ^java.lang.String member-name ^Boolean fallback]
    (JsonUtils/getBoolean json member-name fallback))
  (^Boolean [^com.google.gson.JsonElement json ^java.lang.String member-name]
    (JsonUtils/getBoolean json member-name)))

(defn *json-array?
  "json - `com.google.gson.JsonObject`
  member-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^com.google.gson.JsonObject json ^java.lang.String member-name]
    (JsonUtils/isJsonArray json member-name)))

(defn *get-float
  "json - `com.google.gson.JsonObject`
  member-name - `java.lang.String`
  fallback - `float`

  returns: `float`"
  (^Float [^com.google.gson.JsonObject json ^java.lang.String member-name ^Float fallback]
    (JsonUtils/getFloat json member-name fallback))
  (^Float [^com.google.gson.JsonElement json ^java.lang.String member-name]
    (JsonUtils/getFloat json member-name)))

(defn *deserialize-class
  "json - `com.google.gson.JsonObject`
  member-name - `java.lang.String`
  fallback - `T`
  context - `com.google.gson.JsonDeserializationContext`
  adapter - `java.lang.Class`

  returns: `<T> T`"
  ([^com.google.gson.JsonObject json ^java.lang.String member-name fallback ^com.google.gson.JsonDeserializationContext context ^java.lang.Class adapter]
    (JsonUtils/deserializeClass json member-name fallback context adapter))
  ([^com.google.gson.JsonElement json ^java.lang.String member-name ^com.google.gson.JsonDeserializationContext context ^java.lang.Class adapter]
    (JsonUtils/deserializeClass json member-name context adapter)))

(defn *boolean?
  "json - `com.google.gson.JsonObject`
  member-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^com.google.gson.JsonObject json ^java.lang.String member-name]
    (JsonUtils/isBoolean json member-name)))

(defn *string?
  "json - `com.google.gson.JsonObject`
  member-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^com.google.gson.JsonObject json ^java.lang.String member-name]
    (JsonUtils/isString json member-name))
  (^Boolean [^com.google.gson.JsonElement json]
    (JsonUtils/isString json)))

