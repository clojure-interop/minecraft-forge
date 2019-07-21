(ns net.minecraft.client.resources.data.AnimationMetadataSectionSerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources.data AnimationMetadataSectionSerializer]))

(defn ->animation-metadata-section-serializer
  "Constructor."
  (^AnimationMetadataSectionSerializer []
    (new AnimationMetadataSectionSerializer )))

(defn deserialize
  "p-deserialize-1 - `com.google.gson.JsonElement`
  p-deserialize-2 - `java.lang.reflect.Type`
  p-deserialize-3 - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraft.client.resources.data.AnimationMetadataSection`

  throws: com.google.gson.JsonParseException"
  (^net.minecraft.client.resources.data.AnimationMetadataSection [^AnimationMetadataSectionSerializer this ^com.google.gson.JsonElement p-deserialize-1 ^java.lang.reflect.Type p-deserialize-2 ^com.google.gson.JsonDeserializationContext p-deserialize-3]
    (-> this (.deserialize p-deserialize-1 p-deserialize-2 p-deserialize-3))))

(defn serialize
  "p-serialize-1 - `net.minecraft.client.resources.data.AnimationMetadataSection`
  p-serialize-2 - `java.lang.reflect.Type`
  p-serialize-3 - `com.google.gson.JsonSerializationContext`

  returns: `com.google.gson.JsonElement`"
  (^com.google.gson.JsonElement [^AnimationMetadataSectionSerializer this ^net.minecraft.client.resources.data.AnimationMetadataSection p-serialize-1 ^java.lang.reflect.Type p-serialize-2 ^com.google.gson.JsonSerializationContext p-serialize-3]
    (-> this (.serialize p-serialize-1 p-serialize-2 p-serialize-3))))

(defn get-section-name
  "returns: `java.lang.String`"
  (^java.lang.String [^AnimationMetadataSectionSerializer this]
    (-> this (.getSectionName))))

