(ns net.minecraft.world.storage.loot.LootEntryEmpty
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot LootEntryEmpty]))

(defn ->loot-entry-empty
  "Constructor.

  weight-in - `int`
  quality-in - `int`
  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`
  entry-name - `java.lang.String`"
  (^LootEntryEmpty [^Integer weight-in ^Integer quality-in conditions-in ^java.lang.String entry-name]
    (new LootEntryEmpty weight-in quality-in conditions-in entry-name)))

(defn *deserialize
  "object - `com.google.gson.JsonObject`
  deserialization-context - `com.google.gson.JsonDeserializationContext`
  weight-in - `int`
  quality-in - `int`
  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`

  returns: `net.minecraft.world.storage.loot.LootEntryEmpty`"
  (^net.minecraft.world.storage.loot.LootEntryEmpty [^com.google.gson.JsonObject object ^com.google.gson.JsonDeserializationContext deserialization-context ^Integer weight-in ^Integer quality-in conditions-in]
    (LootEntryEmpty/deserialize object deserialization-context weight-in quality-in conditions-in)))

(defn add-loot
  "stacks - `java.util.Collection`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`"
  ([^LootEntryEmpty this ^java.util.Collection stacks ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.addLoot stacks rand context))))

