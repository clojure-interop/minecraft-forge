(ns net.minecraft.world.storage.loot.properties.EntityProperty$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.properties EntityProperty$Serializer]))

(defn get-name
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^EntityProperty$Serializer this]
    (-> this (.getName))))

(defn get-property-class
  "returns: `java.lang.Class<T>`"
  (^java.lang.Class [^EntityProperty$Serializer this]
    (-> this (.getPropertyClass))))

(defn serialize
  "property - `T`
  serialization-context - `com.google.gson.JsonSerializationContext`

  returns: `com.google.gson.JsonElement`"
  (^com.google.gson.JsonElement [^EntityProperty$Serializer this property ^com.google.gson.JsonSerializationContext serialization-context]
    (-> this (.serialize property serialization-context))))

(defn deserialize
  "element - `com.google.gson.JsonElement`
  deserialization-context - `com.google.gson.JsonDeserializationContext`

  returns: `T`"
  ([^EntityProperty$Serializer this ^com.google.gson.JsonElement element ^com.google.gson.JsonDeserializationContext deserialization-context]
    (-> this (.deserialize element deserialization-context))))

