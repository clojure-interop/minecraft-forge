(ns net.minecraft.world.storage.loot.functions.LootingEnchantBonus$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions LootingEnchantBonus$Serializer]))

(defn serialize
  "object - `com.google.gson.JsonObject`
  function-clazz - `net.minecraft.world.storage.loot.functions.LootingEnchantBonus`
  serialization-context - `com.google.gson.JsonSerializationContext`"
  ([^LootingEnchantBonus$Serializer this ^com.google.gson.JsonObject object ^net.minecraft.world.storage.loot.functions.LootingEnchantBonus function-clazz ^com.google.gson.JsonSerializationContext serialization-context]
    (-> this (.serialize object function-clazz serialization-context))))

(defn deserialize
  "object - `com.google.gson.JsonObject`
  deserialization-context - `com.google.gson.JsonDeserializationContext`
  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`

  returns: `net.minecraft.world.storage.loot.functions.LootingEnchantBonus`"
  (^net.minecraft.world.storage.loot.functions.LootingEnchantBonus [^LootingEnchantBonus$Serializer this ^com.google.gson.JsonObject object ^com.google.gson.JsonDeserializationContext deserialization-context conditions-in]
    (-> this (.deserialize object deserialization-context conditions-in))))

