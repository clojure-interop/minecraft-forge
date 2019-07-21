(ns net.minecraft.world.storage.loot.functions.Smelt
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions Smelt]))

(defn ->smelt
  "Constructor.

  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`"
  (^Smelt [conditions-in]
    (new Smelt conditions-in)))

(defn apply
  "stack - `net.minecraft.item.ItemStack`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Smelt this ^net.minecraft.item.ItemStack stack ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.apply stack rand context))))

