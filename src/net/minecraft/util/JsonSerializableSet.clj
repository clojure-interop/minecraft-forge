(ns net.minecraft.util.JsonSerializableSet
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util JsonSerializableSet]))

(defn ->json-serializable-set
  "Constructor."
  (^JsonSerializableSet []
    (new JsonSerializableSet )))

(defn from-json
  "json - `com.google.gson.JsonElement`"
  ([^JsonSerializableSet this ^com.google.gson.JsonElement json]
    (-> this (.fromJson json))))

(defn get-serializable-element
  "returns: `com.google.gson.JsonElement`"
  (^com.google.gson.JsonElement [^JsonSerializableSet this]
    (-> this (.getSerializableElement))))

