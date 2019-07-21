(ns net.minecraft.world.storage.loot.LootEntryTable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot LootEntryTable]))

(defn ->loot-entry-table
  "Constructor.

  table-in - `net.minecraft.util.ResourceLocation`
  weight-in - `int`
  quality-in - `int`
  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`
  entry-name - `java.lang.String`"
  (^LootEntryTable [^net.minecraft.util.ResourceLocation table-in ^Integer weight-in ^Integer quality-in conditions-in ^java.lang.String entry-name]
    (new LootEntryTable table-in weight-in quality-in conditions-in entry-name)))

(defn *deserialize
  "object - `com.google.gson.JsonObject`
  deserialization-context - `com.google.gson.JsonDeserializationContext`
  weight-in - `int`
  quality-in - `int`
  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`

  returns: `net.minecraft.world.storage.loot.LootEntryTable`"
  (^net.minecraft.world.storage.loot.LootEntryTable [^com.google.gson.JsonObject object ^com.google.gson.JsonDeserializationContext deserialization-context ^Integer weight-in ^Integer quality-in conditions-in]
    (LootEntryTable/deserialize object deserialization-context weight-in quality-in conditions-in)))

(defn add-loot
  "stacks - `java.util.Collection`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`"
  ([^LootEntryTable this ^java.util.Collection stacks ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.addLoot stacks rand context))))

