(ns net.minecraft.client.resources.data.LanguageMetadataSectionSerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources.data LanguageMetadataSectionSerializer]))

(defn ->language-metadata-section-serializer
  "Constructor."
  (^LanguageMetadataSectionSerializer []
    (new LanguageMetadataSectionSerializer )))

(defn deserialize
  "p-deserialize-1 - `com.google.gson.JsonElement`
  p-deserialize-2 - `java.lang.reflect.Type`
  p-deserialize-3 - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraft.client.resources.data.LanguageMetadataSection`

  throws: com.google.gson.JsonParseException"
  (^net.minecraft.client.resources.data.LanguageMetadataSection [^LanguageMetadataSectionSerializer this ^com.google.gson.JsonElement p-deserialize-1 ^java.lang.reflect.Type p-deserialize-2 ^com.google.gson.JsonDeserializationContext p-deserialize-3]
    (-> this (.deserialize p-deserialize-1 p-deserialize-2 p-deserialize-3))))

(defn get-section-name
  "returns: `java.lang.String`"
  (^java.lang.String [^LanguageMetadataSectionSerializer this]
    (-> this (.getSectionName))))

