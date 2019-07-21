(ns net.minecraft.world.storage.loot.LootEntryItem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot LootEntryItem]))

(defn ->loot-entry-item
  "Constructor.

  item-in - `net.minecraft.item.Item`
  weight-in - `int`
  quality-in - `int`
  functions-in - `net.minecraft.world.storage.loot.functions.LootFunction[]`
  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`
  entry-name - `java.lang.String`"
  (^LootEntryItem [^net.minecraft.item.Item item-in ^Integer weight-in ^Integer quality-in functions-in conditions-in ^java.lang.String entry-name]
    (new LootEntryItem item-in weight-in quality-in functions-in conditions-in entry-name)))

(defn *deserialize
  "object - `com.google.gson.JsonObject`
  deserialization-context - `com.google.gson.JsonDeserializationContext`
  weight-in - `int`
  quality-in - `int`
  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`

  returns: `net.minecraft.world.storage.loot.LootEntryItem`"
  (^net.minecraft.world.storage.loot.LootEntryItem [^com.google.gson.JsonObject object ^com.google.gson.JsonDeserializationContext deserialization-context ^Integer weight-in ^Integer quality-in conditions-in]
    (LootEntryItem/deserialize object deserialization-context weight-in quality-in conditions-in)))

(defn add-loot
  "stacks - `java.util.Collection`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`"
  ([^LootEntryItem this ^java.util.Collection stacks ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.addLoot stacks rand context))))

