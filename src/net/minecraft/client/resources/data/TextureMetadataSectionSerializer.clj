(ns net.minecraft.client.resources.data.TextureMetadataSectionSerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources.data TextureMetadataSectionSerializer]))

(defn ->texture-metadata-section-serializer
  "Constructor."
  (^TextureMetadataSectionSerializer []
    (new TextureMetadataSectionSerializer )))

(defn deserialize
  "p-deserialize-1 - `com.google.gson.JsonElement`
  p-deserialize-2 - `java.lang.reflect.Type`
  p-deserialize-3 - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraft.client.resources.data.TextureMetadataSection`

  throws: com.google.gson.JsonParseException"
  (^net.minecraft.client.resources.data.TextureMetadataSection [^TextureMetadataSectionSerializer this ^com.google.gson.JsonElement p-deserialize-1 ^java.lang.reflect.Type p-deserialize-2 ^com.google.gson.JsonDeserializationContext p-deserialize-3]
    (-> this (.deserialize p-deserialize-1 p-deserialize-2 p-deserialize-3))))

(defn get-section-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TextureMetadataSectionSerializer this]
    (-> this (.getSectionName))))

