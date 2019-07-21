(ns net.minecraft.world.storage.loot.functions.EnchantRandomly
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions EnchantRandomly]))

(defn ->enchant-randomly
  "Constructor.

  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`
  enchantments-in - `java.util.List`"
  (^EnchantRandomly [conditions-in ^java.util.List enchantments-in]
    (new EnchantRandomly conditions-in enchantments-in)))

(defn apply
  "stack - `net.minecraft.item.ItemStack`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EnchantRandomly this ^net.minecraft.item.ItemStack stack ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.apply stack rand context))))

