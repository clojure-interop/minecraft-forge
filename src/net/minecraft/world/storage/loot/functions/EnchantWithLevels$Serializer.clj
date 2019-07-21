(ns net.minecraft.world.storage.loot.functions.EnchantWithLevels$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions EnchantWithLevels$Serializer]))

(defn ->serializer
  "Constructor."
  (^EnchantWithLevels$Serializer []
    (new EnchantWithLevels$Serializer )))

(defn serialize
  "object - `com.google.gson.JsonObject`
  function-clazz - `net.minecraft.world.storage.loot.functions.EnchantWithLevels`
  serialization-context - `com.google.gson.JsonSerializationContext`"
  ([^EnchantWithLevels$Serializer this ^com.google.gson.JsonObject object ^net.minecraft.world.storage.loot.functions.EnchantWithLevels function-clazz ^com.google.gson.JsonSerializationContext serialization-context]
    (-> this (.serialize object function-clazz serialization-context))))

(defn deserialize
  "object - `com.google.gson.JsonObject`
  deserialization-context - `com.google.gson.JsonDeserializationContext`
  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`

  returns: `net.minecraft.world.storage.loot.functions.EnchantWithLevels`"
  (^net.minecraft.world.storage.loot.functions.EnchantWithLevels [^EnchantWithLevels$Serializer this ^com.google.gson.JsonObject object ^com.google.gson.JsonDeserializationContext deserialization-context conditions-in]
    (-> this (.deserialize object deserialization-context conditions-in))))

