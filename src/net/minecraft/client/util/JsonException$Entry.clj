(ns net.minecraft.client.util.JsonException$Entry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.util JsonException$Entry]))

(defn get-json-keys
  "returns: `java.lang.String`"
  (^java.lang.String [^JsonException$Entry this]
    (-> this (.getJsonKeys))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^JsonException$Entry this]
    (-> this (.toString))))

