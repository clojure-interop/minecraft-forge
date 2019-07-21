(ns net.minecraft.world.storage.loot.functions.LootFunction$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions LootFunction$Serializer]))

(defn get-function-name
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^LootFunction$Serializer this]
    (-> this (.getFunctionName))))

(defn get-function-class
  "returns: `java.lang.Class<T>`"
  (^java.lang.Class [^LootFunction$Serializer this]
    (-> this (.getFunctionClass))))

(defn serialize
  "object - `com.google.gson.JsonObject`
  function-clazz - `T`
  serialization-context - `com.google.gson.JsonSerializationContext`"
  ([^LootFunction$Serializer this ^com.google.gson.JsonObject object function-clazz ^com.google.gson.JsonSerializationContext serialization-context]
    (-> this (.serialize object function-clazz serialization-context))))

(defn deserialize
  "object - `com.google.gson.JsonObject`
  deserialization-context - `com.google.gson.JsonDeserializationContext`
  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`

  returns: `T`"
  ([^LootFunction$Serializer this ^com.google.gson.JsonObject object ^com.google.gson.JsonDeserializationContext deserialization-context conditions-in]
    (-> this (.deserialize object deserialization-context conditions-in))))

