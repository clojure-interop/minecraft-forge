(ns net.minecraft.world.storage.loot.functions.SetNBT$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions SetNBT$Serializer]))

(defn ->serializer
  "Constructor."
  (^SetNBT$Serializer []
    (new SetNBT$Serializer )))

(defn serialize
  "object - `com.google.gson.JsonObject`
  function-clazz - `net.minecraft.world.storage.loot.functions.SetNBT`
  serialization-context - `com.google.gson.JsonSerializationContext`"
  ([^SetNBT$Serializer this ^com.google.gson.JsonObject object ^net.minecraft.world.storage.loot.functions.SetNBT function-clazz ^com.google.gson.JsonSerializationContext serialization-context]
    (-> this (.serialize object function-clazz serialization-context))))

(defn deserialize
  "object - `com.google.gson.JsonObject`
  deserialization-context - `com.google.gson.JsonDeserializationContext`
  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`

  returns: `net.minecraft.world.storage.loot.functions.SetNBT`"
  (^net.minecraft.world.storage.loot.functions.SetNBT [^SetNBT$Serializer this ^com.google.gson.JsonObject object ^com.google.gson.JsonDeserializationContext deserialization-context conditions-in]
    (-> this (.deserialize object deserialization-context conditions-in))))

