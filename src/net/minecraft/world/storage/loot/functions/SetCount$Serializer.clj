(ns net.minecraft.world.storage.loot.functions.SetCount$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions SetCount$Serializer]))

(defn serialize
  "object - `com.google.gson.JsonObject`
  function-clazz - `net.minecraft.world.storage.loot.functions.SetCount`
  serialization-context - `com.google.gson.JsonSerializationContext`"
  ([^SetCount$Serializer this ^com.google.gson.JsonObject object ^net.minecraft.world.storage.loot.functions.SetCount function-clazz ^com.google.gson.JsonSerializationContext serialization-context]
    (-> this (.serialize object function-clazz serialization-context))))

(defn deserialize
  "object - `com.google.gson.JsonObject`
  deserialization-context - `com.google.gson.JsonDeserializationContext`
  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`

  returns: `net.minecraft.world.storage.loot.functions.SetCount`"
  (^net.minecraft.world.storage.loot.functions.SetCount [^SetCount$Serializer this ^com.google.gson.JsonObject object ^com.google.gson.JsonDeserializationContext deserialization-context conditions-in]
    (-> this (.deserialize object deserialization-context conditions-in))))

