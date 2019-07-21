(ns net.minecraft.world.storage.loot.functions.SetAttributes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions SetAttributes]))

(defn ->set-attributes
  "Constructor.

  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`
  modifiers-in - `net.minecraft.world.storage.loot.functions.SetAttributes.Modifier[]`"
  (^SetAttributes [conditions-in modifiers-in]
    (new SetAttributes conditions-in modifiers-in)))

(defn apply
  "stack - `net.minecraft.item.ItemStack`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SetAttributes this ^net.minecraft.item.ItemStack stack ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.apply stack rand context))))

