(ns net.minecraft.world.storage.loot.functions.SetCount
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions SetCount]))

(defn ->set-count
  "Constructor.

  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`
  count-range-in - `net.minecraft.world.storage.loot.RandomValueRange`"
  (^SetCount [conditions-in ^net.minecraft.world.storage.loot.RandomValueRange count-range-in]
    (new SetCount conditions-in count-range-in)))

(defn apply
  "stack - `net.minecraft.item.ItemStack`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SetCount this ^net.minecraft.item.ItemStack stack ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.apply stack rand context))))

