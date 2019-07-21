(ns net.minecraft.world.storage.loot.properties.EntityOnFire$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.properties EntityOnFire$Serializer]))

(defn serialize
  "property - `net.minecraft.world.storage.loot.properties.EntityOnFire`
  serialization-context - `com.google.gson.JsonSerializationContext`

  returns: `com.google.gson.JsonElement`"
  (^com.google.gson.JsonElement [^EntityOnFire$Serializer this ^net.minecraft.world.storage.loot.properties.EntityOnFire property ^com.google.gson.JsonSerializationContext serialization-context]
    (-> this (.serialize property serialization-context))))

(defn deserialize
  "element - `com.google.gson.JsonElement`
  deserialization-context - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraft.world.storage.loot.properties.EntityOnFire`"
  (^net.minecraft.world.storage.loot.properties.EntityOnFire [^EntityOnFire$Serializer this ^com.google.gson.JsonElement element ^com.google.gson.JsonDeserializationContext deserialization-context]
    (-> this (.deserialize element deserialization-context))))

