(ns net.minecraft.world.storage.loot.conditions.LootCondition$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.conditions LootCondition$Serializer]))

(defn get-loot-table-location
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^LootCondition$Serializer this]
    (-> this (.getLootTableLocation))))

(defn get-condition-class
  "returns: `java.lang.Class<T>`"
  (^java.lang.Class [^LootCondition$Serializer this]
    (-> this (.getConditionClass))))

(defn serialize
  "json - `com.google.gson.JsonObject`
  value - `T`
  context - `com.google.gson.JsonSerializationContext`"
  ([^LootCondition$Serializer this ^com.google.gson.JsonObject json value ^com.google.gson.JsonSerializationContext context]
    (-> this (.serialize json value context))))

(defn deserialize
  "json - `com.google.gson.JsonObject`
  context - `com.google.gson.JsonDeserializationContext`

  returns: `T`"
  ([^LootCondition$Serializer this ^com.google.gson.JsonObject json ^com.google.gson.JsonDeserializationContext context]
    (-> this (.deserialize json context))))

