(ns net.minecraft.world.storage.loot.functions.Smelt$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions Smelt$Serializer]))

(defn serialize
  "object - `com.google.gson.JsonObject`
  function-clazz - `net.minecraft.world.storage.loot.functions.Smelt`
  serialization-context - `com.google.gson.JsonSerializationContext`"
  ([^Smelt$Serializer this ^com.google.gson.JsonObject object ^net.minecraft.world.storage.loot.functions.Smelt function-clazz ^com.google.gson.JsonSerializationContext serialization-context]
    (-> this (.serialize object function-clazz serialization-context))))

(defn deserialize
  "object - `com.google.gson.JsonObject`
  deserialization-context - `com.google.gson.JsonDeserializationContext`
  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`

  returns: `net.minecraft.world.storage.loot.functions.Smelt`"
  (^net.minecraft.world.storage.loot.functions.Smelt [^Smelt$Serializer this ^com.google.gson.JsonObject object ^com.google.gson.JsonDeserializationContext deserialization-context conditions-in]
    (-> this (.deserialize object deserialization-context conditions-in))))

