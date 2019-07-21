(ns net.minecraft.client.resources.data.FontMetadataSectionSerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources.data FontMetadataSectionSerializer]))

(defn ->font-metadata-section-serializer
  "Constructor."
  (^FontMetadataSectionSerializer []
    (new FontMetadataSectionSerializer )))

(defn deserialize
  "p-deserialize-1 - `com.google.gson.JsonElement`
  p-deserialize-2 - `java.lang.reflect.Type`
  p-deserialize-3 - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraft.client.resources.data.FontMetadataSection`

  throws: com.google.gson.JsonParseException"
  (^net.minecraft.client.resources.data.FontMetadataSection [^FontMetadataSectionSerializer this ^com.google.gson.JsonElement p-deserialize-1 ^java.lang.reflect.Type p-deserialize-2 ^com.google.gson.JsonDeserializationContext p-deserialize-3]
    (-> this (.deserialize p-deserialize-1 p-deserialize-2 p-deserialize-3))))

(defn get-section-name
  "returns: `java.lang.String`"
  (^java.lang.String [^FontMetadataSectionSerializer this]
    (-> this (.getSectionName))))

