(ns net.minecraft.client.resources.data.MetadataSerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources.data MetadataSerializer]))

(defn ->metadata-serializer
  "Constructor."
  (^MetadataSerializer []
    (new MetadataSerializer )))

(defn register-metadata-section-type
  "metadata-section-serializer - `net.minecraft.client.resources.data.IMetadataSectionSerializer`
  clazz - `java.lang.Class`

  returns: `<T extends net.minecraft.client.resources.data.IMetadataSection> void`"
  ([^MetadataSerializer this ^net.minecraft.client.resources.data.IMetadataSectionSerializer metadata-section-serializer ^java.lang.Class clazz]
    (-> this (.registerMetadataSectionType metadata-section-serializer clazz))))

(defn parse-metadata-section
  "section-name - `java.lang.String`
  json - `com.google.gson.JsonObject`

  returns: `<T extends net.minecraft.client.resources.data.IMetadataSection> T`"
  ([^MetadataSerializer this ^java.lang.String section-name ^com.google.gson.JsonObject json]
    (-> this (.parseMetadataSection section-name json))))

