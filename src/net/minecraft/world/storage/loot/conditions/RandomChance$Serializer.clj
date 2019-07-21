(ns net.minecraft.world.storage.loot.conditions.RandomChance$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.conditions RandomChance$Serializer]))

(defn serialize
  "json - `com.google.gson.JsonObject`
  value - `net.minecraft.world.storage.loot.conditions.RandomChance`
  context - `com.google.gson.JsonSerializationContext`"
  ([^RandomChance$Serializer this ^com.google.gson.JsonObject json ^net.minecraft.world.storage.loot.conditions.RandomChance value ^com.google.gson.JsonSerializationContext context]
    (-> this (.serialize json value context))))

(defn deserialize
  "json - `com.google.gson.JsonObject`
  context - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraft.world.storage.loot.conditions.RandomChance`"
  (^net.minecraft.world.storage.loot.conditions.RandomChance [^RandomChance$Serializer this ^com.google.gson.JsonObject json ^com.google.gson.JsonDeserializationContext context]
    (-> this (.deserialize json context))))

