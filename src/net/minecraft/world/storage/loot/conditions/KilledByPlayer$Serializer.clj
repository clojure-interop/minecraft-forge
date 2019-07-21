(ns net.minecraft.world.storage.loot.conditions.KilledByPlayer$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.conditions KilledByPlayer$Serializer]))

(defn serialize
  "json - `com.google.gson.JsonObject`
  value - `net.minecraft.world.storage.loot.conditions.KilledByPlayer`
  context - `com.google.gson.JsonSerializationContext`"
  ([^KilledByPlayer$Serializer this ^com.google.gson.JsonObject json ^net.minecraft.world.storage.loot.conditions.KilledByPlayer value ^com.google.gson.JsonSerializationContext context]
    (-> this (.serialize json value context))))

(defn deserialize
  "json - `com.google.gson.JsonObject`
  context - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraft.world.storage.loot.conditions.KilledByPlayer`"
  (^net.minecraft.world.storage.loot.conditions.KilledByPlayer [^KilledByPlayer$Serializer this ^com.google.gson.JsonObject json ^com.google.gson.JsonDeserializationContext context]
    (-> this (.deserialize json context))))

