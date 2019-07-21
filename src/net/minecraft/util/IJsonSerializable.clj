(ns net.minecraft.util.IJsonSerializable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util IJsonSerializable]))

(defn from-json
  "json - `com.google.gson.JsonElement`"
  ([^IJsonSerializable this ^com.google.gson.JsonElement json]
    (-> this (.fromJson json))))

(defn get-serializable-element
  "returns: `com.google.gson.JsonElement`"
  (^com.google.gson.JsonElement [^IJsonSerializable this]
    (-> this (.getSerializableElement))))

