(ns net.minecraft.world.storage.loot.functions.LootFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions LootFunction]))

(defn apply
  "stack - `net.minecraft.item.ItemStack`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^LootFunction this ^net.minecraft.item.ItemStack stack ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.apply stack rand context))))

(defn get-conditions
  "returns: `net.minecraft.world.storage.loot.conditions.LootCondition[]`"
  ([^LootFunction this]
    (-> this (.getConditions))))

